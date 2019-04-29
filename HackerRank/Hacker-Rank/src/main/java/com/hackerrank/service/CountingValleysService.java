package com.hackerrank.service;

import org.springframework.stereotype.Component;

@Component
public class CountingValleysService {
	
	public String run() {
		
		int n = 8;
		String s = "DDUUUUDD";
		
		
		return Integer.toString(countingValleys(n, s));
		
	}
	
	private int countingValleys(int n, String s) {
		
        int seaLevel = 0;
        boolean valleyStartFlag = false;
        int valleyCount = 0;
        
  
        for(int i=0; i<n; i++){

            switch(s.charAt(i)){
                case 'U':   seaLevel++;
                            break;
                case 'D':   seaLevel--;
                            break;
            }

            if(seaLevel == -1 && !valleyStartFlag){
                valleyStartFlag = true;
            } else if(seaLevel == 0 && valleyStartFlag){
                valleyCount++;
                valleyStartFlag = false;
            }
        }

        return valleyCount;
		
	}
	
}
