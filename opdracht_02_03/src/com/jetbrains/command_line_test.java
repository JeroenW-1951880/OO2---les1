package com.jetbrains;

public class command_line_test {

    public static void main(String[] args) {
	    if (args.length < 3){
	        System.out.println("not enough arguments given");
        }else{
	        for (int i = 0; i < 3; ++i){
	            System.out.println(args[i]);
            }
        }
    }
}
