package com.crack.interview.chap1;

public class StrReplace
{
	public static void main(String[] args){
		String str = "Mr John Smith		";
		strReplace(str);
	}

	public static void strReplace(String str){	
		System.out.println(str);
		String replaceStr = "%20";
		String[] splitStr = str.split(" ");
		StringBuffer sbuf = new StringBuffer();
		sbuf.append(splitStr[0]);
		for(int i = 1; i < splitStr.length;i++){
			sbuf.append(replaceStr);
			sbuf.append(splitStr[i]);
			
		}
		System.out.println(sbuf.toString());
	}
}