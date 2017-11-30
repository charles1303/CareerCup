package com.crack.interview.chap1;

import java.util.Arrays;

public class Permutate
{

 public static void main(String[] args){

	 String str1 = "bacde";
	 String str2 = "edabf";
	 checkPermutations(str1,str2);
 }
 public static void checkPermutations(String str1, String str2){
  if(str1.length() != str2.length()){
   System.out.println("No Permutations");
   return;
  }
  char[] a = str1.toCharArray();
  char[] b = str2.toCharArray();
  java.util.Arrays.sort(a);
  java.util.Arrays.sort(b);
  
  if(Arrays.equals(a, b)){
      System.out.println("Permutations");
 }else{
	   System.out.println("No Permutations 2");
 }
 } 
}
