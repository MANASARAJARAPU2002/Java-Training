package com.hcltech.javaday2;

public class TestCalculator {
	@Test
	public void testFindMax() {
		assertEquals(4,Calculation.findMax(new int[] {1,3,4,2}));
		assertEquals(4,Calculation.findMax(new int[] {-12,-1,-3,-4,-2}));
	}

	private void assertEquals(int i, Object max) {
		// TODO Auto-generated method stub
		
	}

}
