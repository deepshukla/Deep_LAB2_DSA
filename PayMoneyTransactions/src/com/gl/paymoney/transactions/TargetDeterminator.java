package com.gl.paymoney.transactions;

import java.util.Arrays;

public class TargetDeterminator {
	
	private int[] transactions;
	private int dailyTarget;
	private boolean outcomes;
	public TargetDeterminator(int[] transactions, int dailyTarget, boolean outcomes) {
		super();
		this.transactions = transactions;
		this.dailyTarget = dailyTarget;
		this.outcomes = outcomes;
	}
	public int[] getTransactions() {
		return transactions;
	}
	public void setTransactions(int[] transactions) {
		this.transactions = transactions;
	}
	public int getDailyTarget() {
		return dailyTarget;
	}
	public void setDailyTarget(int dailyTarget) {
		this.dailyTarget = dailyTarget;
	}
	public boolean isOutcomes() {
		return outcomes;
	}
	public void setOutcomes(boolean outcomes) {
		this.outcomes = outcomes;
	}
	
	
	public void determine() {
		int sum=0;
		int transation_count=0;
		outcomes=false;
		for(int i=0;i<transactions.length;i++) {
			sum+=transactions[i];
			if(sum>=dailyTarget) {
				outcomes=true;
				transation_count=i+1;
				break;
			}
		}
		
		 if (outcomes) {
	            System.out.println(
	                String.format(
	            "Target achieved after %d transactions",
	                transation_count));
	        }else {
	            System.out.println("Given target is not achieved");
	        }
	}

}
