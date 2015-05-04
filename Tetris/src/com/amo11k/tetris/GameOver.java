package com.amo11k.tetris;

public class GameOver implements Runnable {

	public void run() {
		Shape s = new Shape();
		s.SetRandomShape();
		for (int i = Board.ROWS; i < 0; i--) {
			for (int j = 0; j < Board.COLUMS; j++) {
				Board.matrix[i][j] = s.getShape();
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
