package com.amo11k.hotel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JScrollBar;

public class Visualizador extends JFrame {

	private JPanel pane;

	/**
	 * Create the frame.
	 */
	public Visualizador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		pane = new JPanel();
		pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pane);
		pane.setLayout(null);
		
		JTextArea txtVisu = new JTextArea();
		txtVisu.setEditable(false);
		txtVisu.setBounds(22, 11, 284, 240);
		pane.add(txtVisu);
		
		JButton btnLeer = new JButton("LEER");
		btnLeer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BufferedReader in = null;
				try {
					in = new BufferedReader(new FileReader("Historial Reservas"));
				} catch (FileNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				String s;
				StringBuilder builder = new StringBuilder();
				try {
					in = new BufferedReader(new FileReader("Historial Reservas"));
					while ((s = in.readLine()) != null) {
						builder.append(s + "\n");
					}
					txtVisu.setText(builder.toString());

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} finally {
					try {
						in.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btnLeer.setBounds(335, 29, 89, 23);
		pane.add(btnLeer);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnSalir.setBounds(335, 186, 89, 23);
		pane.add(btnSalir);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(308, 11, 17, 240);
		pane.add(scrollBar);
	}
}
