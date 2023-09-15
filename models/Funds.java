package models;

/*
package module04.oop.models;
import module04.oop.randompms.MyRandomPersonData;

* */

import randompms.MyRandomPersonData;

/**
 * The Funds class represents financial details, including a bank ID, salary, and current balance.
 *
 * Attributes:
 * - bankID: A unique identifier associated with a bank.
 * - salary: The salary amount.
 * - currentBalance: The current balance in the account.
 *
 * Methods:
 * - Funds(): Default constructor that initializes a Funds object with random values for bank ID, salary, and current balance sourced from MyRandomPersonData.
 * - Funds(Long bankID, Float salary, Float currentBalance): Parameterized constructor that initializes a Funds object with the provided values.
 * - getBankID(), setBankID(Long bankID): Getter and setter methods for the bank ID.
 * - getSalary(), setSalary(Float salary): Getter and setter methods for the salary.
 * - getCurrentBalance(), setCurrentBalance(Float currentBalance): Getter and setter methods for the current balance.
 * - currencies(Float c): Formats the input value 'c' as a currency, prints, and returns the formatted value.
 * - showCurrentBalance(): Returns the current balance formatted as a currency string.
 * - showSalary(): Returns the salary formatted as a currency string.
 * - toString(): Overrides the default toString() method to provide a string representation of the Funds object.
 *
 * This class provides a model for financial details, allowing for the creation, modification, and representation of financial data.
 */

public class Funds {

	// Instance variables representing a bank ID, salary, and the current balance of an account.
	private Long bankID;
	private Float salary;
	private Float currentBalance;

	// Default constructor initializes the Funds object with random values for bank ID, salary, and current balance.
	public Funds() {
		super();
		this.bankID =Math.abs( MyRandomPersonData.random(955_111_111, 956_999_999));
		this.salary = (float) Math.abs( MyRandomPersonData.random(55_000, 175_000));
		this.currentBalance =(float) Math.abs( MyRandomPersonData.random(0_001, 1_244));
	}

	// Parameterized constructor initializes the Funds object with provided values.
	public Funds(Long bankID, Float salary, Float currentBalance) {
		super();
		this.bankID = bankID;
		this.salary = salary;
		this.currentBalance = currentBalance;
	}

	// Getter and Setter methods for the bank ID, salary, and current balance.
	public Long getBankID() {
		return bankID;
	}
	public void setBankID(Long bankID) {
		this.bankID = bankID;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	public Float getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(Float currentBalance) {
		this.currentBalance = currentBalance;
	}

	// The method formats the input value 'c' as a currency, then prints and returns the formatted value.
	public String currencies(Float c) {
		String x="";
		x= String.format("$ %.2f", c);
		if(c>999)
		x= String.format("$%,.2f", Float.parseFloat(x)); 
		System.out.println(x);
		return x;
	}
	// The method returns the current balance formatted as a currency string.
	public String showCurrentBalance() {
		String x="";
		x = String.format("$ %.2f", currentBalance);
		if(currentBalance>999) 
			x = String.format("$ %,.2f", currentBalance);
		return x;
	}
	// The method returns the salary formatted as a currency string.
	private String showSalary() { 
		return String.format("$ %,.2f", salary);
	}

	// Overrides the default toString() method to provide a string representation of the Funds object.
	@Override
	public String toString() {
		return " Funds [bankID = (" + bankID + "), salary = (" +showSalary()+ "), currentBalance = (" + showCurrentBalance()   + ") ] ";
	}
	
	

}
