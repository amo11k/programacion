package eventnlistener;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;

public class MultiplesSources extends JFrame {
	private JLabel statusbar;

	public MultiplesSources() {

		JPanel panel = new JPanel();
		statusbar = new JLabel(" ZetCode");
		ButtonListener blistener = new ButtonListener();

		statusbar.setBorder(BorderFactory
				.createEtchedBorder(EtchedBorder.RAISED));
		panel.setLayout(null);
		JButton close = new JButton("Close");
		close.setBounds(40, 30, 80, 25);
		close.addActionListener(blistener);
		JButton open = new JButton("Open");
		open.setBounds(40, 80, 80, 25);
		open.addActionListener(blistener);

		JButton find = new JButton("Find");
		find.setBounds(40, 130, 80, 25);
		find.addActionListener(blistener);
		JButton save = new JButton("Save");
		save.setBounds(40, 180, 80, 25);
		save.addActionListener(blistener);
		panel.add(close);
		panel.add(open);
		panel.add(find);
		panel.add(save);
		add(panel);
		add(statusbar, BorderLayout.SOUTH);
		setTitle("Multiple Sources");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton o = (JButton) e.getSource();
			String label = o.getText();
			statusbar.setText(" " + label + " button was clicked");
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MultiplesSources ms = new MultiplesSources();
				ms.setVisible(true);
			}
		});
	}
}
