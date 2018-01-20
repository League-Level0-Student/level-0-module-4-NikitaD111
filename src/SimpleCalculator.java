

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
for (int i = 0; i < 5; i++) {
	

		// 1. Get 2 numbers from the user and convert them to integer.
String a =JOptionPane.showInputDialog("Pick a number");
int e =Integer.parseInt(a);
String b =JOptionPane.showInputDialog("Pick another number");
int z =Integer.parseInt(b);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What do you choose.", "Calculator 444.0", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "multiply", "divide" },
				null);
	if (operation == 0) {
		addi(e,z);
	}
	else if (operation == 1) {
		subtract(e,z);
	}
	else if (operation == 2) {
		multiply(e,z);
	}
	else if (operation == 3) {
		divide(e,z);
	}
		
}

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	
}
	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static void addi(int e , int z) {
	int r = e + z;
	JOptionPane.showMessageDialog(null, r );
}
static void subtract(int e , int z) {
	int f = e - z;
	JOptionPane.showMessageDialog(null, f);
}
static void multiply(int e , int z) {
	int v = e*z;
	JOptionPane.showMessageDialog(null, v );
}
static void divide(int e , int z) {
	int y = e/z;
	JOptionPane.showMessageDialog(null, y );
}



	// 4. Create similar methods for subtraction, multiplication and division.

}