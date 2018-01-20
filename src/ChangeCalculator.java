//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nik = JOptionPane.showInputDialog("How many nickles do u have");
int nk = Integer.parseInt(nik);
String dim = JOptionPane.showInputDialog("How many dimes do you have");
int di =Integer.parseInt(dim);
String quar =JOptionPane.showInputDialog("How many quarters do you have");
int qu = Integer.parseInt(quar);
double n = nk*5.0/100;
double d = di*10.0/100;
double q = qu*25.0/100;
double money = n+d+q;
JOptionPane.showMessageDialog(null, "You have" + money);

		// Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have

	}
}

