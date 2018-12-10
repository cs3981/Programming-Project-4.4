/**
 * @(#)PairOfDice.java
 * @Katie Steeb 
 * @version 1.00 2018/12/6
 */

import java.util.Random;
public class PairOfDice
{
    private final int MIN_FACES = 6;
    
    private static Random generator = new Random();
    private int numFaces1;
    private int numFaces2;
    public int faceValue1;
    public int faceValue2;
    //----------------------------------------------------------
    public PairOfDice ()
    {
    	numFaces1 = 6;
    	numFaces2 = 6;
    	faceValue1 = 1;
    	faceValue2 = 1;
    } 
    //----------------------------------------------------------
    public PairOfDice (int faces)
    {
    	if(faces!=MIN_FACES)
    	{
    		numFaces1 = 6;
    		numFaces2 = 6;
    	}
    	else
    	{
    		numFaces1 = faces;
    		numFaces2 = faces;
    	}
    	
    	faceValue1 = 1;
    	faceValue2 = 1;
    }
    //----------------------------------------------------------
    public int roll ()
    {
    	faceValue1 = generator.nextInt(numFaces1) + 1;
    	return faceValue1;
    }
    public int roll2 ()
    {
    	faceValue2 = generator.nextInt(numFaces2) + 1;
    	return faceValue2;
    }
    //----------------------------------------------------------
    public int getFaceValue ()
    {
    	return faceValue1;
    }
    public int getFaceValue2 ()
    {
    	return faceValue2;
    }
}