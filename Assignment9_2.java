package com.vogella.java.collections.list;
import java.util.ArrayList;

public class Assignment9_2 {
	
	public static void main(String[] args) {
	
		ArrayList<String> lst = new ArrayList<String>();
	    lst.add("HELLO"); //Create array list
	    lst.add("HELLO");
	    lst.add("ABCD");
	    lst.add("ABCD");
	    lst.add("XYZ");

	    System.out.println("Duplicates List "+lst); //Print initial array list

	    Object[] st = lst.toArray();
	      for (Object s : st) {
	        if (lst.indexOf(s) != lst.lastIndexOf(s)) { //Check duplicate
	            lst.remove(lst.lastIndexOf(s)); //Remove duplicate
	         }
	      }

	    System.out.println("Distinct List "+lst); //Print list after removing duplicate
	
	}
}
