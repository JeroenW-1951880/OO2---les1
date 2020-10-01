package com.jetbrains;

/** Program that checks numbers for being prime
 * @author Jeroen Weltens
 */
public class Primedetector {

    /** the main contains all functionality
     *
     * it checks the first 100 numbers for being prime
     */
    public static void main(String[] args) {
        for (int i = 2; i < 101; ++i) {
            boolean prime = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0)
                    prime = false;
            }
            if (prime)
                System.out.println(i);
        }
    }
}
