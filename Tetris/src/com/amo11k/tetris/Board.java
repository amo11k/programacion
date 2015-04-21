package com.amo11k.tetris;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel {
	public final int HEIGHT = 22;
	public final int WIDTH = 10;
	public Shape currentShape;
	public int currentCol;
	public int currentRow;
	public Tetrominos[][] matrix = new Tetrominos[HEIGHT][WIDTH];
	private Timer timer;
	public MyKeyAdapter keyAdapter;

	class MyKeyAdapter extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				currentCol--;
				break;
			case KeyEvent.VK_RIGHT:
				currentCol++;
				break;
			case KeyEvent.VK_UP:
				currentShape = currentShape.rotateLeft();
				repaint();
				break;
			case KeyEvent.VK_DOWN:
				currentRow++;
				break;
			default:
				break;
			}
			repaint();
		}
	}

	public Board() {
		for (int i = 0; i < HEIGHT; i++) {
			for (int j = 0; j < WIDTH; j++) {
				matrix[i][j] = Tetrominos.NoShape;
			}
		}
		currentCol = 5;
		currentRow = 1;
		currentShape = new Shape();
		currentShape.SetRandomShape();
		setFocusable(true);
		init();
		repaint();
	}

	private void drawSquare(Graphics g, int row, int col, Tetrominos shape) {
		Color colors[] = { new Color(0, 0, 0), new Color(204, 102, 102),
				new Color(102, 204, 102), new Color(102, 102, 204),
				new Color(204, 204, 102), new Color(204, 102, 204),
				new Color(102, 204, 204), new Color(218, 170, 0) };
		int x = col * squareWidth();
		int y = row * squareHeight();
		Color color = colors[shape.ordinal()];
		g.setColor(color);
		g.fillRect(x + 1, y + 1, squareWidth() - 2, squareHeight() - 2);
		g.setColor(color.brighter());
		g.drawLine(x, y + squareHeight() - 1, x, y);
		g.drawLine(x, y, x + squareWidth() - 1, y);
		g.setColor(color.darker());
		g.drawLine(x + 1, y + squareHeight() - 1, x + squareWidth() - 1, y
				+ squareHeight() - 1);
		g.drawLine(x + squareWidth() - 1, y + squareHeight() - 1, x
				+ squareWidth() - 1, y + 1);
	}

	private int squareHeight() {
		return this.getHeight() / HEIGHT;
	}

	private int squareWidth() {
		return this.getWidth() / WIDTH;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawBoard(g);
		drawCurrentShape(g);
	}

	private void drawCurrentShape(Graphics g) {
		for (int i = 0; i < 4; i++) {
			this.drawSquare(g, currentRow + currentShape.getY(i), currentCol
					+ currentShape.getX(i), currentShape.getShape());
		}

	}

	private void drawBoard(Graphics g) {
		for (int i = 0; i < HEIGHT; i++) {
			for (int j = 0; j < WIDTH; j++) {
				drawSquare(g, i, j, matrix[i][j]);
			}
		}

	}

	public void init() {
		keyAdapter = new MyKeyAdapter();
		addKeyListener(keyAdapter);
		// gameOver = false;

		timer = new Timer(500, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				currentRow++;
				repaint();
			}

		});
		timer.start();
	}

}
