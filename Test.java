package com.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    	 public static void main(String[] args) {
			 List<Integer> list=new ArrayList<>();
			 list.add(4);
			 list.add(5);
			 list.add(1);
			 list.add(4);
			 Collections.sort(list, Comparator.reverseOrder());
			 list.forEach(System.out::println);
		 }
	
}
