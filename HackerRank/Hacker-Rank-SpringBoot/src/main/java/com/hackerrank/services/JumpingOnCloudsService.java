package com.hackerrank.services;

import org.springframework.stereotype.Component;

@Component
public class JumpingOnCloudsService {
	
	public String run(int numberOfClouds, String cloudSequenceInput) {
		
		return Integer.toString(calculateMatchingSockCount(numberOfClouds, cloudSequenceInput));
	}
	
	private int calculateMatchingSockCount(int numberOfClouds, String cloudSequenceInput) {
		
		
		//convert cloudSequenceInput to integer array for processing
		String[] cloudStringArray = cloudSequenceInput.split(" ");
		int[] cloudSequenceArray = new int[numberOfClouds];
		
		for (int i=0; i<cloudSequenceArray.length; i++) {
			cloudSequenceArray[i] = Integer.parseInt(cloudStringArray[i]);
		}
		
		// 4
		//0 0 1 0 1 0 '0'
		int jumpCount = 0;
		
		for (int c=0; c<cloudSequenceArray.length; c++) {
			
			if(c+2 < cloudSequenceArray.length) {
				if(cloudSequenceArray[c+2] == 0) {
					c = c+1;
				} 
			}

			//only count the jump if not the last cloud in the sequence
			if(c+1 < cloudSequenceArray.length) {
				jumpCount++;
			}

		}
		
		return jumpCount;
	}

}