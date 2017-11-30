package com.crack.interview.chap8;

import java.util.ArrayList;

public class UniqueStrPermutation {

	static ArrayList<String> getPerms(String s) {
		if (s == null)
			return null;

		ArrayList<String> perms = new ArrayList<>();
		if (s.length() == 0) {
			perms.add("");
			return perms;
		}

		char firstChar = s.charAt(0);
		String rem = s.substring(1);
		ArrayList<String> words = getPerms(rem);
		for (String word : words) {
			for (int i = 0; i <= word.length(); i++) {
				String ss = insertCharAt(word, firstChar, i);
				perms.add(ss);
			}
		}
		System.out.println("****"+perms);
		return perms;

	}

	static String insertCharAt(String word, char c, int i) {

		String start = word.substring(0, i);

		String end = word.substring(i);
		return start + c + end;

	}
	
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println("prefix===="+prefix);
	    else {
	        for (int i = 0; i < n; i++){
	        	System.out.println("incoming prefix===="+prefix);
	        	System.out.println("i===="+i);
	        	//System.out.println("prefix + str.charAt(i)===="+prefix + str.charAt(i));
	        	System.out.println("str.substring(0, i)===="+str.substring(0, i));
	        	System.out.println("str.substring(i+1, n)===="+str.substring(i+1, n));
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	        }
	    }
	}
	
	public static void main(String[] args){
		//getPerms("ABC");
		permutation("ABC");
	}
}
