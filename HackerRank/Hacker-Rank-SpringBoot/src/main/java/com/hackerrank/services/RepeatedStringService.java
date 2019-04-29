package com.hackerrank.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RepeatedStringService {
	
	public String run(long numberOfLetters, String stringSequenceInput) {
		
		return Long.toString(repeatedString(stringSequenceInput, numberOfLetters));
	}
	
	
    private static long repeatedString(String s, long n) {
    	
    	long answer = 0;
    	boolean restartSequence = false;
    	
    	long sequenceNumber = 0;
    	
    	
    	
    	
        //n = 100000
        //s = aaa
//
//        int length = s.length();
//        int remainderLength = (int) (n % length);
//        int divisibleBy = (int) (n / length);
//
//        String repeatedString;
//        String remainderString = s.substring(0, remainderLength);
//
//        for(int i=0; i<=divisibleBy; i++){
//            repeatedString = repeatedString + s;
//        }
//
//        repeatedString = repeatedString + remainderString;
//
//        for(int i = 0; i<= repeatedString.length(); i++){
//            if(repeatedString.charAt(i) == 'a'){
//                answer++;
//            }
//        }
//    	
    	
    	
    	
    	for(int i=0; i<=s.length(); i++) {
   		
    		if(restartSequence) {
    			i = 0;
    			restartSequence = false;
    		}
 		
    		if(sequenceNumber < n) {
    			
    			sequenceNumber++;
   			if(s.charAt(i) == 'a') {
    				answer++;
    			}
    		
    			if(i == s.length() - 1){
    				restartSequence = true;
    			}  			
    		}
    	}
    	  	
    	return answer;

    }

}
