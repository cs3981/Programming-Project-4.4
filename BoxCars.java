/**
 * @(#)BoxCars.java
 * @Katie Steeb 
 * @version 1.00 2018/12/6
 */

import java.util.Scanner;
public class BoxCars
{
    public static void main(String[]args)
    {
    	int boxCars = 0, other = 0, roll = 1000, choice = 1;
    	final int NUM_ROLL = 1000;
    	Scanner input = new Scanner(System.in);
    	
    	PairOfDice myPairOfDice = new PairOfDice();
    	
    	while(choice==1)
    	{
    		for(int count=1; count<=NUM_ROLL; count++)
    		{
    			myPairOfDice.roll();
    			
    			if(myPairOfDice.faceValue1==6&&myPairOfDice.faceValue2==6)
    			{
    				boxCars++;
    			}
    			else
    			{
    				other++;
    			}
    		}
    	}
    	System.out.println("The number of rolls: " + roll);
    	System.out.println("The number of boxcars: " + boxCars);
    	System.out.println();
    	System.out.println("Would you like to flip again? (1 for yes, 2 for no");
    	choice = input.nextInt();
    }    
}