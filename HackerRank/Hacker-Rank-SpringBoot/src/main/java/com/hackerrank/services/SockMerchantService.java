package com.hackerrank.services;

import java.util.Arrays;


import org.springframework.stereotype.Component;

@Component
public class SockMerchantService {
	
	public String run(int numberOfSocks, String sockSequenceInput) {
		
		return Integer.toString(calculateMatchingSockCount(numberOfSocks, sockSequenceInput));
	}
	
	
	private int calculateMatchingSockCount(int numberOfSocks, String sockSequenceInput) {
		
		int matchingSockCount = 0;
		int[] sortableSockSequence = new int[numberOfSocks];
		int baseSock = 0;
		int matchingSockSequence = 1;
		//convert to string array
		String[] sockSequenceArray = sockSequenceInput.trim().split(" ");
		
		//convert to int array so it can be sorted
		for(int i=0; i<sockSequenceArray.length; i++) {
			sortableSockSequence[i] = Integer.parseInt(sockSequenceArray[i]);
		}
	
		//sort int array
		Arrays.sort(sortableSockSequence);
		

		for(int i=0; i<sortableSockSequence.length; i++) {
			
			if(i==0) {
				baseSock = sortableSockSequence[0];
			} else if(baseSock == sortableSockSequence[i]) {
				matchingSockSequence++;
			}
			if(baseSock != sortableSockSequence[i] || i == numberOfSocks - 1) {
				matchingSockCount = matchingSockSequence / 2 + matchingSockCount;
				matchingSockSequence = 1;
				baseSock = sortableSockSequence[i];
			}
			
			
		}

				
		return matchingSockCount;
	}

}
