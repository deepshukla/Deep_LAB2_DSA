package com.gl.denomination;

import com.gl.util.MargeSort;

public class DenominationCalculator {
	
	private int[] denominations;
    private int paymentAmount;
    private boolean outcome;
	public DenominationCalculator(int[] denominations, int paymentAmount) {
		super();
		this.denominations = denominations;
		this.paymentAmount = paymentAmount;
	}
	public int[] getDenominations() {
		return denominations;
	}
	public void setDenominations(int[] denominations) {
		this.denominations = denominations;
	}
	public int getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(int paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public boolean isOutcome() {
		return outcome;
	}
	public void setOutcome(boolean outcome) {
		this.outcome = outcome;
	}
	

	void calculateDenomination() {
		
		
		doFirstSorting();
		
		 System.out.println("Your payment approach in order to give min no of notes will be");
		 
        int tempAmount = paymentAmount;
       
        try {
       
            for (int index=0; index < denominations.length; index++) {
               
                int denominationValue = denominations[index];
 
                int quotient = tempAmount / denominationValue;
                int remainder = tempAmount % denominationValue;        
               
                if (quotient == 0) {
                   
                    // This denomination cannot be considered for the final outcome
                   
                }else {
                               
                        
                        System.out.println(String.format(
                                "%d : %d",
                                denominationValue, quotient));
                        System.out.println();
                    tempAmount = remainder;
                }
               
                if (remainder == 0) {
                    this.outcome = true;
                    break;
                }
            }  
           
        } catch (ArithmeticException arithmeticException) {
            arithmeticException.printStackTrace();
        }
       
        if (outcome) {
           
            System.out.println("Success");
           
            
           
        }else {
            System.out.println("Failure");
        
        }
		
		
	}
	
	void doFirstSorting() {
		MargeSort margeSortObj=new MargeSort();
		margeSortObj.performMargeSort(denominations,0,denominations.length-1);
	}
	
}
