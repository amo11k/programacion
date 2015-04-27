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
	public final int ROWS = 22;
	public final int COLUMS = 10;
	public Shape currentShape;
	public int currentCol;
	public int currentRow;
	public Tetrominos[][] matrix = new Tetrominos[ROWS][COLUMS];
	private Timer timer;
	public MyKeyAdapter keyAdapter;
	public boolean gameOver;

	class MyKeyAdapter extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				if (tryToMove(currentShape, currentCol - 1, currentRow))
					currentCol--;
				break;
			case KeyEvent.VK_RIGHT:
				if (tryToMove(currentShape, currentCol + 1, currentRow))
					currentCol++;
				break;
			case KeyEvent.VK_UP:

				break;
			case KeyEvent.VK_DOWN:
				if (tryToMove(currentShape, currentCol, currentRow + 1))
					currentRow++;
				break;
			case KeyEvent.VK_Q:
				Shape s = currentShape.rotateRigth();
				if (tryToMove(s, currentCol, currentRow))
					currentShape = s;
				break;
			case KeyEvent.VK_E:
				Shape r = currentShape.rotateLeft();
				if (tryToMove(r, currentCol, currentRow))
					currentShape = r;
			default:
				break;
			}
			repaint();
		}
	}

	public Board() {
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMS; j++) {
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
		Color colors[] = { new Color(5, 25, 88), new Color(204, 102, 102),
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
		return this.getHeight() / ROWS;
	}

	private int squareWidth() {
		return this.getWidth() / COLUMS;
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
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMS; j++) {
				drawSquare(g, i, j, matrix[i][j]);
			}
		}

	}

	public void init() {
		keyAdapter = new MyKeyAdapter();
		addKeyListener(keyAdapter);
		gameOver = false;

		timer = new Timer(500, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (tryToMove(currentShape, currentCol, currentRow + 1)) {
					currentRow++;
				} else {
					if (currentRow == -1) {
						gameOver();
					}

					movePieceToBoard(currentShape, matrix, currentRow,
							currentCol);
					deleteLines();
					currentCol = 5;
					currentRow = -1;
					currentShape = new Shape();
					currentShape.SetRandomShape();

				}
				repaint();
			}

		});
		timer.start();
	}

	public void movePieceToBoard(Shape currentShape, Tetrominos[][] matrix,
			int row, int colum) {
		int newRow, newColum;
		for (int i = 0; i < 4; i++) {
			newRow = currentRow + currentShape.getY(i);
			newColum = currentCol + currentShape.getX(i);
			if ((newRow >= 0) && (newRow < ROWS) && (newColum >= 0)
					&& (newColum < COLUMS)) {
				matrix[newRow][newColum] = currentShape.getShape();
			}
		}
	}

	public boolean tryToMove(Shape piece, int colum, int row) {

		if (row + piece.maxY() > ROWS - 1) {
			return false;
		}
		if (colum + piece.maxX() > COLUMS - 1) {
			return false;
		}
		if (colum + piece.minX() < 0) {
			return false;
		}
		for (int i = 0; i < 4; i++) {
			if (row + piece.getY(i) >= 0 && colum + piece.getX(i) >= 0) {
				if (matrix[row + piece.getY(i)][colum + piece.getX(i)] != Tetrominos.NoShape) {
					return false;
				}
			}
		}

		return true;
	}

	public void gameOver() {
		timer.stop();
		Dialog gameOver = new Dialog();
		gameOver.setVisible(true);
	}

	public void checkLines() {
		int row = 0;
		int count = 0;
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMS; j++) {
				if (matrix[i][j] != Tetrominos.NoShape) {
					count++;
				}
			}
			if (count == COLUMS) {
				for (int j = 0; j < COLUMS; j++) {
					matrix[i][j] = Tetrominos.NoShape;
				}
			}
		}
	}

	public void deleteLines() {
		// for (i)
	}
}
