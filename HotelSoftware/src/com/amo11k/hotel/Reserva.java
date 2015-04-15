package com.amo11k.hotel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;
import com.toedter.components.JSpinField;
import java.awt.BorderLayout;

public class Reserva extends JFrame {

	private JPanel pane;
	protected JComboBox comboBox;
	protected JDateChooser dateChooser;
	protected FileWriter out;
	protected static File hist = new File("Historial Reservas");
	protected BufferedReader in;

	// private JCalendar calendar;
	private JSpinField spinInit;
	private JSpinField spinFin;
	public int c;
	public double precio;
	public final double TARIFA = 9.34;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reserva frame = new Reserva();
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
	public Reserva() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		pane = new JPanel();
		pane.setBackground(new Color(205, 133, 63));
		pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pane);
		pane.setLayout(null);

		JLabel ttlReserva = new JLabel("REALIZE SU RESERVA");
		ttlReserva.setFont(new Font("Andalus", Font.PLAIN, 18));
		ttlReserva.setHorizontalAlignment(SwingConstants.CENTER);
		ttlReserva.setBounds(105, 11, 203, 38);
		pane.add(ttlReserva);

		comboBox = new JComboBox();
		comboBox.setToolTipText("Elija tipo");
		comboBox.setMaximumRowCount(3);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Standar",
				"Lujo", "Lujo shhh" }));
		comboBox.setBounds(269, 74, 121, 25);
		pane.add(comboBox);

		dateChooser = new JDateChooser();
		dateChooser.setBounds(269, 105, 121, 25);
		pane.add(dateChooser);

		JLabel lblHabt = new JLabel("Tipo de habitación:");
		lblHabt.setBounds(39, 79, 183, 14);
		pane.add(lblHabt);

		JLabel lblFecha = new JLabel("Fecha de reserva:");
		lblFecha.setBounds(39, 116, 138, 14);
		pane.add(lblFecha);

		JButton btnConfirm = new JButton("CONFIRMAR");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					rent();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					System.out.println(hist);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnConfirm.setBounds(84, 228, 107, 23);
		pane.add(btnConfirm);

		JButton btnCancel = new JButton("Cancelar");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setBounds(283, 228, 107, 23);
		pane.add(btnCancel);
		
		JLabel horaInit = new JLabel("Hora de reserva:");
		horaInit.setToolTipText("Escoga la hora de inicio de su reserva");
		horaInit.setBounds(41, 156, 136, 15);
		pane.add(horaInit);
		
		spinInit = new JSpinField();
		spinInit.setBounds(331, 152, 59, 19);
		spinInit.setMinimum(0);
		spinInit.setMaximum(24);
		pane.add(spinInit);
		
		spinFin = new JSpinField();
		spinFin.setBounds(331, 183, 59, 19);
		spinFin.setMinimum(0);
		spinFin.setMaximum(24);
		pane.add(spinFin);
		
		JLabel horaFIn = new JLabel("Hora de fin:");
		horaFIn.setBounds(39, 187, 70, 15);
		pane.add(horaFIn);
	}

	public void rent() throws IOException {
		c = comboBox.getSelectedIndex();
		java.util.Date date = dateChooser.getDate();
		precio= (spinInit.getValue()-spinFin.getValue())*TARIFA*(c+1);
		
		
		if (Habitacion.list.contains(c) == true) {
			Habitacion.list.remove(c);
			System.out.println("DONE");
		}

		try {
			out = new FileWriter(hist, true);
			in = new BufferedReader(new FileReader(hist));
			int n = 0;			
			n = ((int) (Math.random() * 9999));
			out.write(n + ";");
			out.write("TYPE " + c + ";");
			out.write(date.toString() + ";");
			out.write("Hora de inicio " +spinInit.getValue()+":00;");
			out.write("Hora fin "+spinFin.getValue()+":00;");
			out.write("Precio "+precio+"€;");
			out.write("\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ERRO ARCHIVO");
		} finally {
			out.close();
		}
	}
}

