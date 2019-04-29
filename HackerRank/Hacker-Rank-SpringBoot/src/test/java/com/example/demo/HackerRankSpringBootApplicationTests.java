package com.example.demo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hackerrank.HackerRankSpringBootApplication;
import com.hackerrank.validator.HackerRankValidator;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HackerRankSpringBootApplication.class)
public class HackerRankSpringBootApplicationTests {
	
	@Autowired
	HackerRankValidator hackerRankValidator;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void isValidChallengeInputTest() {
		
		String countingValleysChallengeName = "Counting Valleys";
		assertTrue(hackerRankValidator.isValidChallengeInput(countingValleysChallengeName));
		
		String sockMerchantChallengeName = "Sock Merchant";
		assertTrue(hackerRankValidator.isValidChallengeInput(sockMerchantChallengeName));
		
	}
	
	@Test
	public void isNotValidChallengeInputTest() {
		
		String invalidChallengeName = "invalidname123";
		assertFalse(hackerRankValidator.isValidChallengeInput(invalidChallengeName));
	}

}
