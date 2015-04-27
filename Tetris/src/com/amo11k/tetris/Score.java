package com.amo11k.tetris;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Score extends JPanel {
	public static int score;
	

	public Score() {
		score=0;
		
	}
	
	public static String incrementScore(){
		String s=null;
		score=score+100;
		s=Integer.toString(score);
		return s;
	}
	
	public static String fallPoint(){
		String s=null;
		score=score+50;
		s=Integer.toString(score);
		return s;
	}
	
	

}
