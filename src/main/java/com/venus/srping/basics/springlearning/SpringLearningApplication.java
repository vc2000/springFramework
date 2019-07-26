package com.venus.srping.basics.springlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearningApplication {
	
	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for beans?

	public static void main(String[] args) {
		
		BirarySearchImpl binarySearch = new BirarySearchImpl( new BubbleSortAlgorithm());
		
		int result = binarySearch.binarySearch(new int[] {124,4,6}, 3);
		String stringResult = Integer.toString(result);
		
		System.out.println("result " +  stringResult);
		
		SpringApplication.run(SpringLearningApplication.class, args);
	}

}
