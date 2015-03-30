import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Search extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnOk;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Search(NoteBlock note) {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTypeYouSearch = new JLabel("Type you search");
		lblTypeYouSearch.setBounds(30, 1, 140, 37);
		contentPane.add(lblTypeYouSearch);
		
		textField = new JTextField();
		textField.setBounds(158, 6, 114, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String regex = textField.getText();
				//String text = note.getTextArea();
				dispose();
				
			}
		});
		btnOk.setBounds(172, 46, 100, 27);
		contentPane.add(btnOk);
	}
}
