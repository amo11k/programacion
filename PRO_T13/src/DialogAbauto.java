import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class DialogAbauto extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public DialogAbauto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAutoramok = new JLabel("Autor: @amo11k");
		lblAutoramok.setBounds(43, 12, 124, 15);
		contentPane.add(lblAutoramok);
		
		JLabel lblVersion = new JLabel("Version: 0.1");
		lblVersion.setBounds(43, 36, 124, 15);
		contentPane.add(lblVersion);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		btnOk.setBounds(92, 88, 100, 27);
		contentPane.add(btnOk);
	}
}
