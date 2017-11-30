package com.crack.interview.chap2;

import java.util.*;
public class RemoveUnsortedList{
	public static void main(String[] args){
		List l = new ArrayList();
		l.add("1");
		l.add("1");
		l.add("2");
		l.add("3");
		l.add("2");
		l.add("4");
		l.add("4");
		removeUnsortedList(l);
	}

	public static void removeUnsortedList(List list){
		System.out.println(list.size());
		Collections.sort(list);
		Object curr = null;	
		Object prev = null;
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			curr = iter.next();
			if(prev == curr){
				iter.remove();
			}else{
				prev = curr;
			}
		}
		System.out.println(list.size());
	}
}
