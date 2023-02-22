import javax.swing.JOptionPane;

public class GUIapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * GUI --- Graphical User Interface
		 * 
		 * convert input to intage, because it willl read input as a string
		 * */

		String name = JOptionPane.showInputDialog("Enter your name ");
		JOptionPane.showMessageDialog(null, "Hello "+ name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:" ));
		JOptionPane.showMessageDialog(null, "Your age is "+ age);
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height:" ));
		JOptionPane.showMessageDialog(null, "Your height is "+ height);
	}

}
