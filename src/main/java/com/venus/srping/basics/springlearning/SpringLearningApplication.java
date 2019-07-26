package com.venus.srping.basics.springlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLearningApplication {
	
	// What are the beans that Spring need to manage?
	// What are the dependencies of a bean?
	// Where to search for beans? => No need

	public static void main(String[] args) {
		
		// BirarySearchImpl binarySearch = new BirarySearchImpl( new BubbleSortAlgorithm());
		ApplicationContext applicationContext = SpringApplication.run(SpringLearningApplication.class, args);
		BirarySearchImpl binarySearch = applicationContext.getBean(BirarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {124,4,6}, 3);
		String stringResult = Integer.toString(result);
		
		System.out.println("result " +  stringResult);
		
		
	}

}
