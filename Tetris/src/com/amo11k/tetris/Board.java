package com.amo11k.tetris;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Board extends JPanel {
	public final int HEIGHT = 22;
	public final int WIDTH = 10;
	
	
	
	
	public Board(){
		
	}
	private void drawSquare(Graphics g, int row, int col, Tetrominos shape) {
		Color colors[] = { new Color(0, 0, 0), new Color(204, 102, 102),
				new Color(102, 102, 204), new Color(204, 204, 102),
				new Color(204, 102, 204), new Color(102, 204, 204),
				new Color(218, 170, 0) };
		int x = col * squareWidth();
		int y = row * squareHeight();
		Color color = colors[shape.ordinal()];
		g.setColor(color);
		g.fillRect(x + 1, y + 1, squareWidth() - 2, squareHeight()-2);
		g.setColor(color.brighter());
		g.drawLine(x, y+squareHeight()-1,x, y);
		g.drawLine(x, y+squareWidth()-1,x, y);
		g.setColor(color.darker());
		g.drawLine(x+1, y+squareHeight()-1, x+squareWidth()-1, y+squareHeight()-1);
		g.drawLine(x+squareWidth()-1, y+squareHeight()-1, x+squareWidth()-1, y+1);
	}

	private int squareHeight() {
		return this.getHeight()/HEIGHT;
	}

	private int squareWidth() {
		return this.getWidth()/WIDTH;
	}
}
