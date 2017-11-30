package com.crack.interview.chap8;

import java.util.ArrayList;

public class GetSubsetOfSet {
	
	
	public static void main(String[] args){
		
		/*ArrayList<Integer> set = new ArrayList<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		//System.out.println(Integer.toString(set.size(),2));
		
		//int max = 1 << set.size();
		
		
		//getSubsets2(set);
		
		System.out.println(8 << 2);*/
		System.out.println(1 << 3);
		System.out.println(1 << 5);
		System.out.println(1 >> 5);
		//System.out.println(2 << 5);
		//System.out.println(3 << 5);
		System.out.println(5 >> 1);
		System.out.println(5 << 1);
		
	}

	static ArrayList<ArrayList<Integer>> getSubsets2(ArrayList<Integer> set) {

		ArrayList<ArrayList<Integer>> allsubsets = new ArrayList<ArrayList<Integer>>();

		int max = 1 << set.size(); /* Compute 2 A n */
		
		System.out.println(max);
		
		for (int k = 0; k < max; k++) {

			ArrayList<Integer> subset = convertlntToSet(k, set);
			allsubsets.add(subset);

		}
		return allsubsets;

	}

	static ArrayList<Integer> convertlntToSet(int x, ArrayList<Integer> set) {

		ArrayList<Integer> subset = new ArrayList<Integer>();

		int index = 0;

		for (int k = x; k > 0; k >>= 1) {
			System.out.println("k===="+k);
			if ((k & 1) == 1) {
				System.out.println(k+" & 1 == 1");
				subset.add(set.get(index));

			}else{
				System.out.println(k+" & 1 != 1");
			}

			index++;

		}
		return subset;
	}
}
