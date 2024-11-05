package com.iteratrlearning.shu_book.chapter_02;

import java.time.LocalDate;
import java.util.Objects;

public class BankTransaction {

	private LocalDate date;
	private double amount;
	private String description;
	public BankTransaction(final LocalDate date,final double amount,final String description) {
	this.date  = date;
	this.amount = amount;
	this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "BankTransaction{" +
		"date=" + date + ", amount= " +amount + ", description= " + description + '\'' + '}'; 
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
	BankTransaction that = (BankTransaction) obj;
	return Double.compare(that.amount, amount) == 0 
		&& date.equals(that.date) 
		&& description.equals(that.description);
	}
	@Override
	public int hashCode() {
		return Objects.hash(date, amount, description);
	}
}
