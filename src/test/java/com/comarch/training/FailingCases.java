package com.comarch.training;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FailingCases {
	SimpleCalculator simpleCalculator;
	@BeforeClass
	public void init(){
		simpleCalculator = new SimpleCalculator();
	}
	@Test(groups = {"failures"}, dependsOnGroups = {"important"})
public void AddingTest() {
		
		//Given
		int x = 5;
		int y = 10;
		
		//When
		int z = simpleCalculator.add(x, y);
		
		//Than
		Assert.assertEquals(z, 15);				
	}
	@Test(groups = {"failures"}, dependsOnGroups = {"important"})
public void minusTest() {
		
		//Given
		int x = 5;
		int y = 10;
		
		//When
		int z = simpleCalculator.minus(x, y);
		
		//Than
		Assert.assertEquals(z, -5);				
	}
	@Test(groups = {"important", "failure"})
	
	public void failingMinusTest(){
		//Given
				int x = 5;
				int y = 10;
				
				//When
				int z = simpleCalculator.minus(x, y);
				
				//Than
				Assert.assertEquals(z, -4);		
	}


}
