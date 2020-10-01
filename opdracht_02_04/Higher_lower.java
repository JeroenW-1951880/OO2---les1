package com.jetbrains;
import java.util.*;

/** Program that compares 25 random numbers
 *  @author Jeroen Weltens
 */
public class Higher_lower {
    /** The main of this class generates 24 random comparisons of integers and prints the result to stdout
     *
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int prev = -1;
	    for(int i = 0; i < 25; ++i){
            int current = rand.nextInt(100);
            if (prev != -1) {
                if (prev > current)
                    System.out.println(prev + " > " + current);
                else if(prev < current)
                    System.out.println(prev + " < " + current);
                else
                    System.out.println(prev + " == " + current);
            }
            prev = current;
        }
    }
}
