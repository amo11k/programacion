package com.amo11k.tetris;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Tetris extends JFrame {

	private JPanel contentPane;
	public static JLabel scoreLabel;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tetris frame = new Tetris();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tetris() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Tetris - Amo11k Edition ");
		setBounds(100, 100, 300, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Score score = new Score();
		contentPane.add(score, BorderLayout.SOUTH);
		score.setVisible(true);
		
		Board panel = new Board(score);
		
		scoreLabel = new JLabel("0");
		score.add(scoreLabel);
		contentPane.add(panel, BorderLayout.CENTER);
		
		
	}

}
