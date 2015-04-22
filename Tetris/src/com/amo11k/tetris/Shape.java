package com.amo11k.tetris;

public class Shape {
	protected Tetrominos pieceShape;
	protected int coords[][];
	public static boolean can = true;

	// coords[index][coor]
	// index is a number from 0 to 3 that represents each square block of the
	// tetrominoe (which has 4 square blocks)
	// coor is a number from 0 to 1: 0 to store the x coordinate and 1 to store
	// the y coordinate.

	private static int[][][] coordsTable = new int[][][] {
			{ { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 0 } },
			{ { 0, -1 }, { 0, 0 }, { -1, 0 }, { -1, 1 } },
			{ { 0, -1 }, { 0, 0 }, { 1, 0 }, { 1, 1 } },
			{ { 0, -1 }, { 0, 0 }, { 0, 1 }, { 0, 2 } },
			{ { -1, 0 }, { 0, 0 }, { 1, 0 }, { 0, 1 } },
			{ { 0, 0 }, { 1, 0 }, { 0, 1 }, { 1, 1 } },
			{ { -1, -1 }, { 0, -1 }, { 0, 0 }, { 0, 1 } },
			{ { 1, -1 }, { 0, -1 }, { 0, 0 }, { 0, 1 } } };

	public Shape() {
		coords = new int[4][2];
	}

	public void setShape(Tetrominos shapeType) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				coords[i][j] = coordsTable[shapeType.ordinal()][i][j];
			}
		}
		pieceShape = shapeType;
	}

	private void setX(int index, int x) {
		coords[index][0] = x;

	}

	private void setY(int index, int y) {
		coords[index][1] = y;
	}

	public int getX(int index) {
		int x = coords[index][0];
		return x;
	}

	public int getY(int index) {
		int y = coords[index][1];
		return y;
	}

	public int minX() {
		int c = 5;
		for (int i = 0; i < 4; i++) {
			if (c > getX(i)) {
				c = getX(i);
			}
		}
		return c;
	}

	public int minY() {
		int c = 5;
		for (int i = 0; i < 4; i++) {
			if (c > getY(i)) {
				c = getY(i);
			}
		}
		return c;
	}

	public int maxY() {
		int c = -5;
		for (int i = 0; i < 4; i++) {
			if (c < getY(i)) {
				c = getY(i);
			}
		}
		return c;
	}

	public int maxX() {
		int c = -5;
		for (int i = 0; i < 4; i++) {
			if (c < getX(i)) {
				c = getX(i);
			}
		}
		return c;
	}

	public Tetrominos getShape() {
		return pieceShape;
	}

	public void SetRandomShape() {
		int random = (int) (Math.random() * 7) + 1;
		Tetrominos[] array = Tetrominos.values();
		setShape(array[random]);
	}

	public Shape rotateLeft() {
		Shape s = new Shape();
		s.setShape(pieceShape);
		for (int i = 0; i < 4; i++) {
			int x = -1 * getY(i);
			int y = getX(i);
			s.coords[i][0] = x;
			s.coords[i][1] = y;
		}
		return s;
	}

	public Shape rotateRigth() {
		Shape s = new Shape();
		s.setShape(pieceShape);
		for (int i = 0; i < 4; i++) {
			int x = getY(i);
			int y = -1 * getX(i);
			s.coords[i][0] = x;
			s.coords[i][1] = y;
		}
		return s;
	}

	public static boolean tryToMove(Shape piece, int colum, int row) {

		if (row + piece.maxY() > Board.ROWS - 1) {
			return false;
		}
		if (colum + piece.maxX() > Board.COLUMS - 1) {
			return false;
		}
		if (colum + piece.minX() < 0) {
			return false;
		}
		return true;

	}

}
