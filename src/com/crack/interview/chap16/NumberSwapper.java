package com.crack.interview.chap16;

import java.util.Arrays;
import java.util.HashMap;

public class NumberSwapper {
	
	public static final int YES = 1;
    public static final int NO= 2;
    public static final int OKAY= 4;
    public static final int CANCEL = 8;
 
    public static void showPopup(int buttons)
    {
        if((buttons & YES) == 1)
        {
            System.out.println("Yes");
            
        }
         
        if((buttons & NO) == 2)
        {
        	System.out.println("No");
        	
        }   
        if((buttons & OKAY) == 4)
        {
        	System.out.println("Okay");
        	
        } 
        if((buttons & CANCEL) == 8)
        {
        	System.out.println("Cancel");
        	
        } 
    }
	
	public static void main(String[] args){
		/*System.out.println("Init Binary value for YES ==="+Integer.toString(YES,2));
		System.out.println("Init Binary value for NO ==="+Integer.toString(NO,2));
		System.out.println("Init Binary value for OKAY ==="+Integer.toString(OKAY,2));
		System.out.println("Init Binary value for Cancel ==="+Integer.toString(CANCEL,2));
		int x = NumberSwapper.YES | NumberSwapper.NO | NumberSwapper.CANCEL | NumberSwapper.OKAY;
		System.out.println(x);
		System.out.println("Init Binary value for x ==="+Integer.toString(x,2));
		showPopup(x);*/
		
		/*System.out.println("Init Binary value for -x ==="+Integer.toString(-21,2));
		System.out.println("Init Binary value for x ==="+Integer.toString(21,2));
		System.out.println(~-21 + 1);
		System.out.println(~21 + 1);
		
		System.out.println(~-15);
		System.out.println(~15);
		//11110010
		System.out.println("Output: "+Integer.parseInt("11110010",2));
		*/
		
		//37 << 3 == 37 * Math.pow(2,3) == 37 * 8
		
		/*System.out.println(37 << 3);
		System.out.println(37 * Math.pow(2,3));
		System.out.println(37 * 8);*/
		//add(23,98);
		String c = "cat";
		String t = "tac";
		char[] c1 = c.toCharArray();
		char[] t1 = t.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(t1);
		System.out.println(String.valueOf(c1));
		System.out.println(t1);
		HashMap hm = new HashMap();
		hm.put("cat", "cat");
		if(String.valueOf(c1).equalsIgnoreCase(String.valueOf(t1))){
			System.out.println("They are the same");
		}else{
			
		}
		
	}
	
	static int add2(int x, int y){
	    while(y!=0){
	    	int carry = (x&y)<<1;
	        x=x^y;
	        y=carry;
	    }
	    
	    return x;
	}
	
	static int add(int x, int y){
	    while(y!=0){
	    	
	    	System.out.println("Init x===="+x);
	    	System.out.println("Init y===="+y);
	    	
	    	System.out.println("Init Binary value for x ==="+Integer.toString(x,2));
	    	
	    	System.out.println("Init Binary value for y ==="+Integer.toString(y,2));
	    	
	    	System.out.println(x&y);
	        System.out.println("Init Binary value for x&y ==="+Integer.toString(x&y,2));
	    	
	        int carry = (x&y)<<1;
	        System.out.println("Decimal carry====" + carry);
	        System.out.println("Init Binary value for carry ==="+Integer.toString(carry,2));
	        x=x^y;
	        System.out.println("Decimal x^y====" + x);
	        System.out.println("Binary value for x^y ==="+Integer.toString(x,2));
	        y=carry;
	    }
	    
	    System.out.println("Decimal 2 x====" + x);
        System.out.println("Binary value for x 2 ==="+Integer.toString(x,2));
	    
	    return x;
	}

	private static void test1() {
		int a= 9;
		int b = 4;
		System.out.println("Init Binary value for a ==="+Integer.toString(a,2));
		System.out.println("Init Binary value for b ==="+Integer.toString(b,2));
		a = a^b;
		System.out.println("First XOR a value==="+Integer.toString(a,2));
		System.out.println("After First XOR for a value ===="+a);
		b = a^b;
		System.out.println("First XOR b value==="+Integer.toString(b,2));
		System.out.println("After First XOR for b value==="+b);
		a = a^b;
		System.out.println("Second XOR a value==="+Integer.toString(a,2));
		System.out.println("After Second XOR for a value===="+a);
		
		System.out.println("Final Value====");
		System.out.println(a);
		System.out.println(b);
		System.out.println(Math.pow(3, 9));
		
		System.out.println("Output: "+Integer.parseInt("10110",2));
		System.out.println("Output: "+Integer.parseInt("00001",2));
		
		System.out.println(5&3);
	}

}
