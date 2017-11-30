package com.crack.interview.chap1;

public class Unique{
	 public static void main(String[] args){
		 String str = "qq";

		 checkUnique(str);
	}
	 public static void checkUnique(String str){
	  
	  char[] arrayChar = str.toCharArray();
	  java.util.Arrays.sort(arrayChar);
	  for(int i =0; i < arrayChar.length - 1; i++){
	    if(arrayChar[i] == arrayChar[i+1]){
	    	System.out.println("Not Unique");
	    	return;
	    }
	     
	  }
	  System.out.println("Unique");
	}
	}
