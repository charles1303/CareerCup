package com.crack.interview.chap3;

import java.util.*;

public class MyQueueAnimalAdopt{
	private class Queue{
		private LinkedList animals;

		private class Dog{}
		private class Cat{}
		
		//enqueue, dequeueAny, dequeueDog and dequeueCat
		public void enqueue(Object item){
			if(animals == null){
				animals = new LinkedList();
			}
			animals.add(item);
		}

		public Object dequeueAny(){
			return animals.removeFirst();
		}

		public Dog dequeueDog(){
			Iterator it = animals.listIterator(0);
			Dog d = null;
			Object obj = null;
			while(it.hasNext()){
				obj = it.next();
				if((obj != null) && (obj instanceof Dog)) {
				d = (Dog)obj;
				it.remove();
				break;
				}
			}
			return d;
		}

		public Cat dequeueCat(){
			Iterator it = animals.listIterator(0);
			Cat c = null;
			Object obj = null;
			while(it.hasNext()){
				obj = it.next();
				if(obj != null && obj instanceof Cat);
				c = (Cat)obj;
				it.remove();
				break;
			}
			return c;
		}
	}
}
