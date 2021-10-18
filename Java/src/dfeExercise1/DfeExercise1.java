package dfeExercise1;

public class DfeExercise1 {

	public static void main(String[] args) {
boolean amIHappy = false;
		
		int weight = 20; //create an integer variable and assign a value
		String name = "Billy Bob"; //create a string variable and assign a word(s)
		Dog goodboy = new Dog(name, weight); //call and initialise a class constructor
		int x = weight - 10; //declare a variable and assign it the value of another variable
		if(x < 15) goodboy.bark(); //creating a branching statement that if true actions the function
		
		while(x < 3) {		//create a loop that runs if the value is true
			goodboy.play();
		}
		
		int[] numList = {1,2,3,4,5,5,6}; //Create and initialise a list 
		System.out.println("How are you? "); //Print out the value in the brackets
		System.out.println("My " + name + " is doing great " + "How's yours? "); //same as above but concatenates variables
		String num = "305"; //assign a value to the variable num
		int z = Integer.parseInt(num); //pass a string value into the variable z after converting it from a string (type cast)
		System.out.println(amIHappy);
		System.out.println(z);
		
		//Exercise for Data Types
		int num0 = 0;
		long num3 = 3;
		float deci5 = 5.0f;
		
		System.out.println("H"+num3+"LL"+num0+" W"+num0+"rld "+deci5+" "+amIHappy);

	}

}
