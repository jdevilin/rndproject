package org.com.number;

public class MissingNumber {
	
    private static int getMissingNumber(int[] numbers, int totalCount) {
        int expectedSum = 0;
        for(int i=1;i<= totalCount;i++) {
        	expectedSum = expectedSum+i;
        	
        }
        
        System.out.println("expectedSum ----> "+expectedSum);
        int actualSum = 0;
        for (int i : numbers) {
            actualSum += i;
        }
 
        return expectedSum - actualSum;
    }
 
    
    public static void main(String[] args) {
		int[] numbers = new int[] {1,2,3,4,6};
		
		int misingnmber =getMissingNumber(numbers, 6);
		System.out.println("misingnmber ---->>>"+misingnmber);
	}
}

