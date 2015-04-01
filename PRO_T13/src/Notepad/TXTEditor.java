package Notepad;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;
import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class TXTEditor extends JFrame {

	private JPanel contentPane;
	private JTextArea txtArea;
	UndoManager undoManager = new UndoManager();
	private File file = null;
	public boolean modif;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TXTEditor frame = new TXTEditor();
					frame.setLocationRelativeTo(null); // CENTRAR VENTANA
					frame.setVisible(true); //HACER VISIBLE JFRAME
					
				} catch (Exception e) {
					System.out.println("Error when launching");
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TXTEditor() {
		setTitle(Messages.getString("NoteBlock.this.title")); //$NON-NLS-1$
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFichero = new JMenu(
				Messages.getString("NoteBlock.mnFichero.text")); //$NON-NLS-1$
		menuBar.add(mnFichero);

		JMenuItem mntmNuevo = new JMenuItem(
				Messages.getString("NoteBlock.mntmNuevo.text")); //$NON-NLS-1$
		mntmNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtArea.setText("");
				file = null;
			}
		});
		mntmNuevo.setIcon(new ImageIcon(TXTEditor.class
				.getResource("/javax/swing/plaf/metal/icons/ocean/file.gif")));
		mnFichero.add(mntmNuevo);

		JMenuItem mntmAbrir = new JMenuItem(
				Messages.getString("NoteBlock.mntmAbrir.text")); //$NON-NLS-1$
		mntmAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					txtArea.setText("");
					load();
				} catch (IOException e1) {
					System.out.print("Error when opening file");
				}
			}
		});
		mntmAbrir
				.setIcon(new ImageIcon(
						TXTEditor.class
								.getResource("/javax/swing/plaf/metal/icons/ocean/directory.gif")));
		mnFichero.add(mntmAbrir);

		JMenuItem mntmGuardar = new JMenuItem(
				Messages.getString("NoteBlock.mntmGuardar.text")); //$NON-NLS-1$
		mntmGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save2();
			}
		});
		mntmGuardar
				.setIcon(new ImageIcon(
						TXTEditor.class
								.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		mnFichero.add(mntmGuardar);

		JSeparator separator = new JSeparator();
		mnFichero.add(separator);

		JMenuItem mntmSalir = new JMenuItem(
				Messages.getString("NoteBlock.mntmSalir.text")); //$NON-NLS-1$
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secuExit();
			}
		});
		mnFichero.add(mntmSalir);

		JMenu mnEditar = new JMenu(
				Messages.getString("NoteBlock.mnEditar.text")); //$NON-NLS-1$
		menuBar.add(mnEditar);

		JMenuItem mntmCopy = new JMenuItem(
				Messages.getString("NoteBlock.mntmCopy.text")); //$NON-NLS-1$
		mntmCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,
				InputEvent.CTRL_MASK));
		mntmCopy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtArea.copy();
			}
		});

		JMenuItem mntmSelectAll = new JMenuItem(
				Messages.getString("NoteBlock.mntmSelectAll.text")); //$NON-NLS-1$
		mntmSelectAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtArea.selectAll();
			}
		});
		mntmSelectAll
				.setIcon(new ImageIcon(
						TXTEditor.class
								.getResource("/com/sun/java/swing/plaf/windows/icons/TreeLeaf.gif")));
		mntmSelectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
				InputEvent.CTRL_MASK));
		mnEditar.add(mntmSelectAll);
		mntmCopy.setIcon(new ImageIcon(
				TXTEditor.class
						.getResource("/com/sun/java/swing/plaf/windows/icons/TreeLeaf.gif")));
		mnEditar.add(mntmCopy);

		JMenuItem mntmCut = new JMenuItem(
				Messages.getString("NoteBlock.mntmCut.text")); //$NON-NLS-1$
		mntmCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,
				InputEvent.CTRL_MASK));
		mntmCut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtArea.cut();
			}
		});
		mntmCut.setIcon(new ImageIcon(
				TXTEditor.class
						.getResource("/com/sun/java/swing/plaf/windows/icons/TreeLeaf.gif")));
		mnEditar.add(mntmCut);

		JMenuItem mntmPaste = new JMenuItem(
				Messages.getString("NoteBlock.mntmPaste.text")); //$NON-NLS-1$
		mntmPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,
				InputEvent.CTRL_MASK));
		mntmPaste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtArea.paste();
			}
		});
		mntmPaste
				.setIcon(new ImageIcon(
						TXTEditor.class
								.getResource("/com/sun/java/swing/plaf/windows/icons/TreeLeaf.gif")));
		mnEditar.add(mntmPaste);

		JMenuItem mntmRedo = new JMenuItem(
				Messages.getString("NoteBlock.mntmRedo.text")); //$NON-NLS-1$
		mntmRedo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				undoManager.redo();
			}
		});
		mntmRedo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y,
				InputEvent.CTRL_MASK));
		mntmRedo.setIcon(new ImageIcon(
				TXTEditor.class
						.getResource("/com/sun/java/swing/plaf/windows/icons/TreeLeaf.gif")));
		mnEditar.add(mntmRedo);

		JMenuItem mntmUndo = new JMenuItem(
				Messages.getString("NoteBlock.mntmUndo.text")); //$NON-NLS-1$
		mntmUndo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				undoManager.undo();
			}
		});
		mntmUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,
				InputEvent.CTRL_MASK));
		mntmUndo.setIcon(new ImageIcon(
				TXTEditor.class
						.getResource("/com/sun/java/swing/plaf/windows/icons/TreeLeaf.gif")));
		mnEditar.add(mntmUndo);

		JMenuItem mntmSearch = new JMenuItem(
				Messages.getString("NoteBlock.mntmSearch.text")); //$NON-NLS-1$
		mntmSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Search search = new Search(TXTEditor.this);
				search.setVisible(true);
				search.setLocationRelativeTo(null); // CENTRAR VENTANA
				// txtArea.insert(s, 0);
			}
		});
		mntmSearch.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,
				InputEvent.CTRL_MASK));
		mntmSearch
				.setIcon(new ImageIcon(
						TXTEditor.class
								.getResource("/com/sun/java/swing/plaf/windows/icons/TreeLeaf.gif")));
		mnEditar.add(mntmSearch);

		JMenu mnAyuda = new JMenu(Messages.getString("NoteBlock.mnAyuda.text")); //$NON-NLS-1$
		menuBar.add(mnAyuda);

		JMenuItem mntmAbout = new JMenuItem(
				Messages.getString("NoteBlock.mntmAbout.text")); //$NON-NLS-1$
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DialogAbauto jframe2 = new DialogAbauto();
				jframe2.setLocationRelativeTo(null); // CENTRA EL SEGUNDO FRAME
														// EN LA PANTA
				jframe2.setVisible(true);
			}
		});
		mnAyuda.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);

		JButton btnGuardar = new JButton(
				Messages.getString("NoteBlock.btnGuardar.text")); //$NON-NLS-1$
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					save();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					System.out.println("Saving ERROR");
				}
			}
		});
		btnGuardar
				.setIcon(new ImageIcon(
						TXTEditor.class
								.getResource("/javax/swing/plaf/metal/icons/ocean/directory.gif")));
		toolBar.add(btnGuardar);

		JButton btnCargar = new JButton(
				Messages.getString("NoteBlock.btnCargar.text")); //$NON-NLS-1$
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					load();

				} catch (IOException e1) {
					System.out.println("Error when launching");
				}
			}
		});
		btnCargar
				.setIcon(new ImageIcon(
						TXTEditor.class
								.getResource("/javax/swing/plaf/metal/icons/ocean/directory.gif")));
		toolBar.add(btnCargar);

		txtArea = new JTextArea();
		txtArea.getDocument().addUndoableEditListener(undoManager);
		txtArea.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				modif = true;

			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				modif = true;
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				modif = true;
			}
		});

		txtArea.setText(Messages.getString("NoteBlock.txtArea.text")); //$NON-NLS-1$
		contentPane.add(txtArea, BorderLayout.CENTER);
	}

	public void save() throws IOException {
		if (file == null) {
			JFileChooser filechos = new JFileChooser();
			filechos.showSaveDialog(TXTEditor.this);
			file = filechos.getSelectedFile();
		}
		if (file != null) {

			PrintWriter out = new PrintWriter(file);
			String s;
			try {
				if (file != null) {
					s = txtArea.getText();
					out.println(s);
				}
			} finally {
				out.close();
				modif = false;
			}
		}
	}

	public void load() throws IOException {
		txtArea.setText("");
		JFileChooser filechos = new JFileChooser();
		filechos.showOpenDialog(TXTEditor.this);
		file = filechos.getSelectedFile();
		if (file == null) {

		} else {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String s;
			StringBuilder builder = new StringBuilder();
			try {
				while ((s = in.readLine()) != null) {
					builder.append(s + "\n");
				}
				txtArea.setText(builder.toString());

			} finally {
				in.close();
			}

		}
	}

	public void save2() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		if (JFileChooser.APPROVE_OPTION == fileChooser
				.showSaveDialog(TXTEditor.this)) {
			File archivo = fileChooser.getSelectedFile();
			FileWriter escritor = null;
			try {
				escritor = new FileWriter(archivo);
				escritor.write(txtArea.getText());
			} catch (FileNotFoundException ex) {
				Logger.getLogger(TXTEditor.class.getName()).log(Level.SEVERE,
						null, ex);
			} catch (IOException ex) {
				Logger.getLogger(TXTEditor.class.getName()).log(Level.SEVERE,
						null, ex);
			} finally {
				modif = false;
				try {
					escritor.close();
				} catch (IOException ex) {
					Logger.getLogger(TXTEditor.class.getName()).log(
							Level.SEVERE, null, ex);
				}
			}
		}
	}

	public String getTextArea() {
		String s = txtArea.getText();
		return s;
	}

	public void SetTextArea() {

	}

	public void secuExit() {
		if (modif == true) {
			Object[] options = { "YES", "NO" };

			int response = JOptionPane.showOptionDialog(null,
					"Do you want to save you changes", "Warning",
					JOptionPane.DEFAULT_OPTION,
					JOptionPane.WARNING_MESSAGE, null, options,
					options[0]);
			
			switch (response) {
			case 0:
				save2();
				break;
			case 1:
				WindowEvent wev = new WindowEvent(TXTEditor.this,
						WindowEvent.WINDOW_CLOSING);
				Toolkit.getDefaultToolkit().getSystemEventQueue()
						.postEvent(wev);
				System.exit(0);
				break;
			}

		} else {
			WindowEvent wev = new WindowEvent(TXTEditor.this,
					WindowEvent.WINDOW_CLOSING);
			Toolkit.getDefaultToolkit().getSystemEventQueue()
					.postEvent(wev);
			System.exit(0);
		}
	}
	
}
