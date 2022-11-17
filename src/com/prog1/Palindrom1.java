package com.prog1;

import java.util.Arrays;

interface Check{
	    void print();
	}



	public class Palindrom1 {


	   public static void main(String[] args) {


System.out.println("Hello Git");
	       String number = "12321";
	        char ch[] = number.toCharArray();
	        char temp[] = new char[number.length()];



	       Check c = () -> {
	            int j = 0;
	            for (int i = ch.length - 1; i >= 0; i--) {
	                temp[j++] = ch[i];
	            }
	            if (Arrays.equals(ch, temp)) {
	                System.out.println(number+"  a is palindrom number");
	            } else {
	                System.out.println(number+"  a is not palindrom number");
	            }
	        };
	        c.print();



	   }



	}


