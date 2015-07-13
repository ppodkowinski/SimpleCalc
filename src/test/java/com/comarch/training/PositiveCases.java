package com.comarch.training;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveCases {
	SimpleCalculator simpleCalculator;

	@BeforeClass
	public void init(){
		simpleCalculator = new SimpleCalculator();
	}
 @DataProvider(name = "test1")	
	public Object[][] getDataAdd() {	
	        return new Object[][]{{5, 4}, {6, 8},{5,5},{8,5},{9,6},{3,12},{4,17},{1,3}};	
	    }
 @DataProvider(name = "test2")	
	public Object[][] getData() {	
	        return new Object[][]{{5}, {6},{5}};	
	    }
	@Test(groups = {"pass"}, dataProvider = "test1")
	public void AddingTest(int param1, int param2) {		
		//Given
		int x = param1;
		int y = param2;
		int result = x+y;
		//When
		int z = simpleCalculator.add(x, y);
		
		//Than
		Assert.assertEquals(z, result);				
	}
	@Test(groups = {"pass"}, dataProvider = "test1")
public void minusTest(int param1, int param2) {
		
		//Given
		int x = 5;
		int y = 10;
		int result= x-y; 
		//When
		int z = simpleCalculator.minus(x, y);
		
		//Than
		Assert.assertEquals(z, result);				
	}
	@Test(groups = {"pass"}, dataProvider = "test1")
public void multiplyTest(int param1, int param2) {
	
	//Given
	int x = 5;
	int y = 10;
	int result = x*y;
	//When
	int z = simpleCalculator.multiply(x, y);
	
	//Than
	Assert.assertEquals(z, result);				
}
	@Test(groups = {"pass"}, dataProvider = "test1")
public void divideTest(int param1, int param2) {
	
	//Given
	int x = param1;
	int y = param2;
	float result = x/y;
	//When
	float z = simpleCalculator.divide(x, y);
	
	//Than
	Assert.assertEquals(z, result);				
}
	@Test(groups = {"pass"})
public void addToMemoryTest() {
	
	//Given
	int x = 5;	
	
	//When
	simpleCalculator.addToMemory(x);
	
	//Than
	Assert.assertEquals(x, simpleCalculator.memory);				
}
	@Test(groups = {"pass"})
public void setmemoryTest() {
	
	//Given
	int x = 8;	
	
	//When
	simpleCalculator.setMemory(x);
	
	//Than
	Assert.assertEquals(x, 8);				
}
	@Test(groups = {"pass"})
public void getMemory() {
	
	//Given
	
int x=5;
	
	//When
	simpleCalculator.setMemory(x);
	int z = simpleCalculator.getMemory();
	
	//Than
	Assert.assertEquals(z, x);				
}
	
}
