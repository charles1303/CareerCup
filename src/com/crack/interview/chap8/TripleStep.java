package com.crack.interview.chap8;

import java.util.Arrays;

public class TripleStep {
	
	public static void main(String[] args){
		int n = 37;
		//System.out.println(countWays(7));
		int[] arr = new int[n + 1];
		Arrays.fill(arr, -1);
		System.out.println(countWays(n, arr));
	}
	
	static int countWays(int n){
		if(n < 0){
			return 0;
		}else if(n == 0){
			return 1;
		}else{
			return countWays(n-1) + countWays(n-2) + countWays(n-3);
		}
		
	}
	
	static int countWays(int n, int[] arr){
		
		if(n < 0){
			return 0;
		}else if(n == 0){
			return 1;}
		else if(arr[n] > -1){
			return arr[n];
		}else{
			arr[n] = countWays(n-1,arr) + countWays(n-2,arr) + countWays(n-3,arr);
			return arr[n];
		}
	}

}
