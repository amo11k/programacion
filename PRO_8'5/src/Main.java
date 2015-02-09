import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		int num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first number",
				"Adding1", JOptionPane.QUESTION_MESSAGE));
		int num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second number",
				"Adding", JOptionPane.QUESTION_MESSAGE));
		
		int resultado=num1+num2;
		JOptionPane.showMessageDialog(null, "Total is: "+resultado, 
				"Adding", JOptionPane.INFORMATION_MESSAGE);

	}

}
