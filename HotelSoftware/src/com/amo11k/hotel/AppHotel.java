package com.amo11k.hotel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppHotel extends JFrame {

	private JPanel pane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Habitacion hotelShhh = new Habitacion();
					AppHotel frame = new AppHotel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AppHotel() {
		setForeground(Color.RED);
		setTitle("Hotel SHHH");
		setFont(new Font("Andalus", Font.PLAIN, 16));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		pane = new JPanel();
		pane.setBackground(new Color(205, 133, 63));
		pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pane);
		pane.setLayout(null);
		
		JLabel ttlPane = new JLabel("Hotel SHHH");
		ttlPane.setFont(new Font("Andalus", Font.ITALIC, 18));
		ttlPane.setHorizontalAlignment(SwingConstants.CENTER);
		ttlPane.setBounds(140, 11, 131, 71);
		pane.add(ttlPane);
		
		JButton btnReservar = new JButton("RESERVAR");
		btnReservar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Reserva frameReserva = new Reserva();
				frameReserva.setVisible(true);
			}
		});
		btnReservar.setBounds(10, 106, 150, 80);
		pane.add(btnReservar);
		
		JButton btnVisor = new JButton("VISUALIZAR");
		btnVisor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Visualizador visu = new Visualizador();
				visu.setVisible(true);
			}
		});
		btnVisor.setBounds(262, 106, 162, 80);
		pane.add(btnVisor);
	}
}
