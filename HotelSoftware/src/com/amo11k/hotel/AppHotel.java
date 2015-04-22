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
import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Toolkit;

public class AppHotel extends JFrame {

	private JPanel pane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		/*Habitacion hab = new Habitacion();
		hab.printRooms();*/
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Habitacion hotelShhh = new Habitacion();
					AppHotel frame = new AppHotel();
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
	public AppHotel() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("/home/alumnes/1CFSL/alu53381650f/git/programacion/HotelSoftware/src/27938.png"));
		setForeground(Color.RED);
		setTitle("Amo11k Hotel");
		setFont(new Font("Andalus", Font.PLAIN, 16));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		pane = new JPanel();
		pane.setBackground(new Color(205, 133, 63));
		pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pane);
		pane.setLayout(null);
		
		JButton btnReservar = new JButton("RESERVAR");
		btnReservar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Reserva frameReserva = new Reserva();
				frameReserva.setVisible(true);
				frameReserva.setLocationRelativeTo(null);
			}
		});
		btnReservar.setBounds(177, 430, 150, 80);
		pane.add(btnReservar);
		
		JButton btnVisor = new JButton("VISUALIZAR");
		btnVisor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Visualizador visu = new Visualizador();
				visu.setVisible(true);
				visu.setLocationRelativeTo(null);
			}
		});
		btnVisor.setBounds(500, 430, 162, 80);
		pane.add(btnVisor);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(24, 0, 762, 21);
		pane.add(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		mnArchivo.add(mntmSalir);
		
		JMenu mnAbout = new JMenu("About");
		menuBar.add(mnAbout);
		
		JMenuItem mntmAmokHotel = new JMenuItem("Amo11k Hotel");
		mnAbout.add(mntmAmokHotel);
		
		JMenuItem mntmTarifas = new JMenuItem("Tarifas");
		menuBar.add(mntmTarifas);
		
		JLabel ttlPane = new JLabel("Hotel SHHH");
		ttlPane.setIcon(new ImageIcon("/home/alumnes/1CFSL/alu53381650f/git/programacion/HotelSoftware/src/16-hotel-las-palmas-sercotel-cristina-las-palmas-habitacion.jpg"));
		ttlPane.setFont(new Font("Andalus", Font.ITALIC, 18));
		ttlPane.setHorizontalAlignment(SwingConstants.CENTER);
		ttlPane.setBounds(0, 0, 866, 589);
		pane.add(ttlPane);
	}
}
