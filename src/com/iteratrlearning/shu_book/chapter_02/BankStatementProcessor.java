package com.iteratrlearning.shu_book.chapter_02;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class BankStatementProcessor {

	private final List<BankTransaction> bankTransactions;

	public BankStatementProcessor(List<BankTransaction> bankTransactions) {
		this.bankTransactions = bankTransactions;
	} 
	public double calculateTotalAmount() {
		double total =0d;
			for (BankTransaction bt : bankTransactions) {
			total += bt.getAmount();
		}
		return total;
	}
		public List<BankTransaction> selectInMonth(final Month month){
			final List<BankTransaction> bankTransactionsInMonth = new ArrayList<>();
			for (BankTransaction bankTransaction : bankTransactions) {
				if(bankTransaction.getDate().getMonth() ==month ) {
					bankTransactionsInMonth.add(bankTransaction);
				}
			}
			return bankTransactionsInMonth;
		}
		public double calculateTotalForCategory(final String category){
			double total = 0d;
			for (BankTransaction bankTransaction : bankTransactions) {
				if(bankTransaction.getDescription().equals(category)) {
					total += bankTransaction.getAmount();
				}
			}
			return total;
			
		}
}
