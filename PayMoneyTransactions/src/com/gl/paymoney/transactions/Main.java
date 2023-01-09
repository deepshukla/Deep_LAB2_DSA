package com.gl.paymoney.transactions;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	       
	       
	        Scanner userInput=new Scanner(System.in);
	        
	        System.out.println("Enter the size of transaction array :");
	        int transactionArraySize = userInput.nextInt();
	        int[] transaction = new int[transactionArraySize];
	       
	 
	        System.out.println("Enter the values of array:");    
	        for (int index = 0; index < transactionArraySize; index ++) {
	            transaction[index] = userInput.nextInt();
	        }              
	       
	        System.out.print("Enter the total no of targets that needs to be achieved:");
	        int targetInstanceSize = userInput.nextInt();
	       
	        for (int count = 1; count <= targetInstanceSize; count ++) {
	 
	            System.out.println();
	            System.out.print("Enter the value of target:");
	            int dailyTargets = userInput.nextInt();
	 
	          
	            TargetDeterminator determinator =
	                    new TargetDeterminator(transaction, dailyTargets,false);
	           
	            determinator.determine();
	           
	        }
	       
	        if(userInput !=null) {
	        	userInput.close();
	        }
	        
	        
	    }
	 
	 

}
