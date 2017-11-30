package com.crack.interview.chap1;

import java.util.*;
public class CompressXter{
	public static void main(String[] args){
		String str = "aabcccccaaa";
		compressXter(str);
	}

	public static void compressXter(String str){
	StringBuffer sbuf = new StringBuffer();
	char[] a = str.toCharArray();
	Arrays.sort(a);
	char curr = a[0];
	int cnt = 1;
		for(int i = 0; i < a.length - 1;i++){
			if(a[i] == a[i+1]){
				curr = a[i];
			 cnt++;
			}else{
				sbuf.append(String.valueOf(a[i]));
				sbuf.append(cnt);
				cnt = 1;
			}
			
			
		}
		sbuf.append(String.valueOf(curr));
		sbuf.append(cnt);
		if(str.length() > sbuf.toString().length()){
			System.out.println(sbuf.toString());
		}else{
			System.out.println(str);
		}	
	}

	public static void compressXter2(String str){
		HashMap<String, Integer> charMapCnt = new HashMap<>();
		char[] strChar = str.toCharArray();
		for(int i = 0; i < strChar.length; i++){
			if(charMapCnt.containsKey(String.valueOf(strChar[i]))){
				charMapCnt.put(String.valueOf(strChar[i]),charMapCnt.get(String.valueOf(strChar[i])) + 1);
			}else{
				charMapCnt.put(String.valueOf(strChar[i]),1);
			}
		}

		StringBuffer strBuf = new StringBuffer();
		Set<String> s = charMapCnt.keySet();
		for(String key : s){
			strBuf.append(key);
			strBuf.append(charMapCnt.get(key));
		}
		
		if(str.length() > strBuf.toString().length()){
			System.out.println(strBuf.toString());
		}else{
			System.out.println(str);
		}
	}
	
}
