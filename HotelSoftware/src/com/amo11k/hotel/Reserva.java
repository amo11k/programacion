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
import java.text.DecimalFormat;
import java.util.Date;

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
import java.awt.Toolkit;

public class Reserva extends JFrame {

	private JPanel pane;
	protected JComboBox comboBox;
	protected JDateChooser dateChooser;
	protected FileWriter out;
	protected static File hist = new File("Historial Reservas");
	protected BufferedReader in;
	public java.util.Date date;
	public Date hoy;
	public JSpinField spinInit;
	private JSpinField spinFin;
	public int c;
	public final int HORAS_DIA = 24;
	public static double precio;
	public final double TARIFA = 5.15;
	DecimalFormat formatPrice = new DecimalFormat("#.##");

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				Reserva.class.getResource("/com/amo11k/hotel/img/27938.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Realizar reserva");
		setBounds(100, 100, 450, 300);
		pane = new JPanel();
		pane.setBackground(new Color(233, 150, 122));
		pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pane);
		pane.setLayout(null);

		JLabel ttlReserva = new JLabel("REALIZE SU RESERVA");
		ttlReserva.setFont(new Font("Andalus", Font.PLAIN, 18));
		ttlReserva.setHorizontalAlignment(SwingConstants.CENTER);
		ttlReserva.setBounds(125, 12, 203, 38);
		pane.add(ttlReserva);

		comboBox = new JComboBox();
		comboBox.setToolTipText("Elija tipo");
		comboBox.setMaximumRowCount(3);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Standar",
				"Lujo", "LujoShh" }));
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
		btnConfirm.setFont(new Font("Dialog", Font.BOLD, 10));
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					rent();
					dispose();
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
		horaFIn.setBounds(39, 187, 138, 15);
		pane.add(horaFIn);
	}

	public void rent() throws IOException {
		Date hoy = new Date();
		date = dateChooser.getDate();
		if (date.before(hoy)) {
			Error error = new Error();
			error.setVisible(true);
			error.setLocationRelativeTo(null);
		} else {
			precio = getPrice();
			write();
			Dialog confim = new Dialog();
			confim.setVisible(true);
			confim.setLocationRelativeTo(null);
		}
	}

	public void write() {
		try {
			out = new FileWriter(hist, true);
			in = new BufferedReader(new FileReader(hist));

			int n = 0;
			n = ((int) (Math.random() * 9999));
			out.write(n + ";");
			out.write("TYPE " + c + ";");
			out.write(date.toString() + ";");
			out.write("Hora de inicio " + spinInit.getValue() + ":00;");
			out.write("Hora fin " + spinFin.getValue() + ":00;");
			out.write("Precio " + formatPrice.format(precio) + "€;");
			out.write("\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR ARCHIVO");
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public double getPrice() {
		c = comboBox.getSelectedIndex();
		int indice;
		if (spinInit.getValue() > spinFin.getValue()) {
			indice = HORAS_DIA - (spinInit.getValue() - spinFin.getValue());
			precio = indice * TARIFA * (c + 1);
		} else {
			precio = (spinFin.getValue() - spinInit.getValue()) * TARIFA
					* (c + 1);
		}
		return precio;
	}

}
