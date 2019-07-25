package com.venus.srping.basics.springlearning;

public class BirarySearchImpl {
	
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
