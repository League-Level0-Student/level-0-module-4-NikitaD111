//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	// Initialize to zero.
	int happy = 0;
	static int pet; 
	static int task; 


	public static void main(String[] args) {
	pet	= JOptionPane.showOptionDialog(null, "What pet do you want.",
				"Make your pet happy", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Dog", "Llama", "Rock" }, null);
	task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy.",
			"Make your pet happy", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "pet it", "walk it", "Play with it" }, null);
	
	//dog
	if(pet == 0) {
		
		if(task == 0) {
			JOptionPane.showMessageDialog(null, "Your dog borks");
		}else if(task==1) {
			JOptionPane.showMessageDialog(null, "Your dog pees on your neighbors door");
		}
		else if(task == 2) {
			JOptionPane.showMessageDialog(null, "Your dog borks in excitement");
		}
	}
	
	//llama
	if(pet == 1) {
		if(task==0) {
			JOptionPane.showMessageDialog(null, "Your llama is a llama");
		}
		else if(task == 1) {
			JOptionPane.showMessageDialog(null, "Your llama attacks your neighbors");
		}
		else if(task == 2) {
			JOptionPane.showMessageDialog(null, "Your llama spits on you");
		}
		
	}
	
	//rock
	if(pet == 2) {
		if(task == 0) {
			JOptionPane.showMessageDialog(null, "Your rock stays there");
		}
		else if(task == 1) {
			JOptionPane.showMessageDialog(null, "Your rock stays there");
		}
		else if(task == 2) {
			JOptionPane.showMessageDialog(null, "Your rock stays there");
		}
	}
		// 1. Ask the user what kind of pet they want to buy, and store in variable
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		
		// 5. Use user input to call the appropriate method created in step 4.

		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.
	}
	
	static void petit() {
	
	}
}
	
	
	
	
	



	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.


