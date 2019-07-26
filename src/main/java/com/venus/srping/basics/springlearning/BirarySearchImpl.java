package com.venus.srping.basics.springlearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BirarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	 //right click -> source
	public BirarySearchImpl(com.venus.srping.basics.springlearning.SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}


	public int binarySearch(int[] numbers, int numberToSearchFor){
		
		int[] sortedNumber = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		// Implementing Sorting Logic
		// Bubble Sort Algorithm
		// Quick Sort Algorithm 
		//Search the array
		
		return 3;
	}
}
