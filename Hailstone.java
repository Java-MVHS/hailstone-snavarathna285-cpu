// Sudhouth Navarathna
// 11/7/2025
// Hailstone.java
// Prints the Hailstone sequence proposed by Lothar Collatz and if the number is
// an even number it divedes it by two and if it is odd, it multiplies it by
// 3 and adds 1, and repeats until the number is one
// Working on: do-while and while loops
/// Testing: try -1, -4, 19, 100, and 99999.

import java.util.Scanner;

public class Hailstone
{
	// this is to be able to use the amount of times the numbers printed in all 
	// methods
	private int count;
	private int userNum; // this is to acces user number in all methods
	
	// default constructor
	public Hailstone()
	{
		count = 0;
		userNum = -1;
	}
	
	/*
	 * This is main where an instance of Hailstone is made using the object
	 * hstn and this is used to call the method 'findIt ()'
	 */
	public static void main(String[] args)
	{
		Hailstone hstn = new Hailstone();
		hstn.findIt();
	}
	
	/* This is the method findIt (), where the whole loop happens, first it
	 * prints the three blank lines and prints the welcome message so that it 
	 * will print only once then uses a do while loop to make the
	 * value of 0 and calls acceptInput () and if the user number is higher than
	 * 0 and lower than 10000 then it calls printSequence(), then it calls 
	 * printCount(). Then checks if the user number is not -1.
	 */
	public void findIt()
	{
		System.out.println("\n\n\n");
		System.out.println("Welcome to Hailstone, this will take any number " +
			"and just by seeing if it is divisible by 2 or not it can make the" +
			" number 1\n");
		do
		{
			count = 0;
			acceptInput();
			if(userNum > 0 && userNum < 10000)
				printSequence();
			printCount();
		}while(userNum != -1);
	}
	
	/* This method is to accept user input by D&Iing the Scanner to keyboard
	 * then printing the prompt, finally 
	 * it saves it to the FV userNum and prints a blank line.
	 */
	public void acceptInput()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a positive integer (1 - 10000). To quit, " +
			"enter -1:   ");
		userNum = keyboard.nextInt();
		System.out.println();
	}
	
	/* This method is to print the count and any errors, if the user number was
	 * more than 10000 or not equal to -1 and less than 0 then it will print
	 * the error message, and if it is -1 then it prints the thank you message
	 * and if its neither than it prints the amount of times the loop was 
	 * executed
	 */
	public void printCount()
	{
		if(userNum > 10000 || userNum != -1 && userNum < 0)
			System.out.println("\nEnter a value within range, please!\n\n");
		else if(userNum == -1)
			System.out.println("Thank you for playing Hailstone\n\n\n\n");
		else
			System.out.printf("\n\nThe loop executed %d times\n\n\n", count);
	}
	
	/* This method is to print the sequence, first it prints the initial user
	 * number, then it increments count by 1, then in the while loop it 
	 * incriments count by 1 and if he user number was divisible by 2 it divides
	 * it and if not it multiplies it by 3 and adds 1, then it prints the number
	 * then it goes to the next line after 10 loops.
	 */
	public void printSequence()
	{
		System.out.printf("%7d", userNum);
		count += 1;
		while(userNum != 1)
		{
			count++;
			if(userNum%2 == 0)
				userNum = userNum/2;
			else
				userNum = userNum*3 + 1;
			System.out.printf("%7d", userNum);
			if(count%10 == 0)
				System.out.println();
		}
	}
}
