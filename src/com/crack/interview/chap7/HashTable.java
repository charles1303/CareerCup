package com.crack.interview.chap7;

public class HashTable {
	
	public static void main(String[] args){
		System.out.println(randomString(10));
	}
	
	int hashCodeKey(){
		return -1;
	}
	
	static int hash(String x, int M) {
		   char ch[];
		   ch = x.toCharArray();
		   //int xlength = x.length();

		   int i, sum;
		   for (sum=0, i=0; i < x.length(); i++)
		     sum += ch[i];
		   return sum % M;
		 }
	
	public static String randomString(int length)
	{
	    java.security.SecureRandom random = new java.security.SecureRandom();
	    char[] chars = new char[length];
	    for(int i=0;i<chars.length;i++)
	    {
	        int v = random.nextInt(10 + 26 + 26);
	        char c;
	        if (v < 10)
	        {
	            c = (char)('0' + v);
	        }
	        else if (v < 36)
	        {
	            c = (char)('a' - 10 + v);
	        }
	        else
	        {
	            c = (char)('A' - 36 + v);
	        }
	        chars[i] = c;
	    }
	    return new String(chars);
	}


}
