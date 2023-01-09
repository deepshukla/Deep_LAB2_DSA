package com.gl.denomination;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		 Scanner userInput=new Scanner(System.in);
	        
	        System.out.println("Enter the size of currency denominations:");
	        
	        int denominationsSize=userInput.nextInt();
	        
	        int[] denominationsArray=new int[denominationsSize];
	        
	        for(int i=0;i<denominationsArray.length;i++) {
	        System.out.println("Enter the currency denominations value:");
	        denominationsArray[i]=userInput.nextInt();
	        }
	        
	        System.out.println("Enter the amount you want to pay:");
	        int payAmount=userInput.nextInt();
	        DenominationCalculator denominationCalculatorObj=new DenominationCalculator(denominationsArray,payAmount);
	        
	        denominationCalculatorObj.calculateDenomination();

		
	}
	

}
