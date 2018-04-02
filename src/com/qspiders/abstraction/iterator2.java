package com.qspiders.abstraction;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator2 {

	public static void main(String[] args) {
		//ArrayList<String> arr=new ArrayList<String>();
		ArrayList arr=new ArrayList();
		arr.add("Rupom");
		arr.add("Victor");
		arr.add("xyz");
		
		Iterator<String> a = arr.iterator();
		System.out.println(a.hasNext());
		while(a.hasNext()) //it will check whether the next element is present or not. If it is present it will return true or else it will return false. While loop checks for the condition is true or false
		{
			System.out.println(a.next());
		}

	}
}
