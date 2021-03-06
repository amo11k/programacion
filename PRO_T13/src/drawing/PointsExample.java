package drawing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class DrawPanel extends JPanel {
	private void doDrawing(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.red);
		for (int i = 0; i <= 100000; i++) {
			Dimension size = getSize();
			Insets insets = getInsets();
			int w = size.width - insets.left - insets.right;
			int h = size.height - insets.top - insets.bottom;
			Random r = new Random();
			int x = Math.abs(r.nextInt()) % w;
			int y = Math.abs(r.nextInt()) % h;
			g2d.drawLine(x, y, x, y);
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		doDrawing(g);
	}
}

public class PointsExample extends JFrame {
	public PointsExample() {
		DrawPanel dpnl = new DrawPanel();
		add(dpnl);
		setSize(250, 400);
		setTitle("Points");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				PointsExample ex = new PointsExample();
				ex.setVisible(true);
			}
		});
	}
}
