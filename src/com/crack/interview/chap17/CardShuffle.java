package com.crack.interview.chap17;

import java.util.Arrays;

public class CardShuffle {
	
	public static void main(String[] args){
		int[] cards = {1,2,3,4,5,6,7,8,9,0};
		//System.out.println(Arrays.toString(shuffleRecursively(cards, cards.length - 1)));
		System.out.println(Arrays.toString(shuffleRecursively2(cards, 0)));
		System.out.println(Arrays.toString(shuffleIteratively(cards)));
	}
	
	static int rand(int lower, int higher){
		return lower + (int)(Math.random() * (higher - lower + 1));
	}
	
	static int[] shuffleRecursively2(int[] cards, int i){
		if(i == (cards.length - 1)) return cards;
		
		shuffleRecursively(cards, i+1);
		int k = rand(0,i);
		int temp = cards[k];
		cards[k] = cards[i];
		cards[i] = temp;
		//System.out.println(Arrays.toString(cards));
		return cards;
	}
	
	static int[] shuffleRecursively(int[] cards, int i){
		if(i == 0) return cards;
		
		shuffleRecursively(cards, i-1);
		int k = rand(0,i);
		int temp = cards[k];
		cards[k] = cards[i];
		cards[i] = temp;
		//System.out.println(Arrays.toString(cards));
		return cards;
	}
	
	static int[] shuffleIteratively(int[] cards){
		for(int i = 0; i < cards.length; i++){
			int k = rand(0,i);
			int temp = cards[k];
			cards[k] = cards[i];
			cards[i] = temp;
		}
		return cards;
	}

}
