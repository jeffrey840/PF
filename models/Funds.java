package models;
 

import randompms.MyRandomPersonData;

/*

Explanation:

Instance Variables: The class has three private instance variables - bankID, salary, and currentBalance.

Constructors:

Default Constructor: This constructor initializes the Funds object with random values using the MyRandomPersonData class.
Parameterized Constructor: This initializes the Funds object with values provided as parameters.
Getter and Setter Methods: These are standard methods used to retrieve or modify the values of instance variables.

currencies(Float c): This method takes a float value and returns it formatted as a currency string. It will also print the formatted value. The condition if (c > 999) checks whether the amount is greater than 999 and if so, uses a different format that includes commas.

showCurrentBalance(): Returns the currentBalance instance variable formatted as a currency string.

showSalary(): This is a private method, which means it can't be accessed outside the Funds class. It returns the salary instance variable formatted as a currency string.

toString() Method: Overrides the default toString() method to provide a formatted string representation of the Funds object. This method is particularly useful for printing or logging.

Miscellaneous: The constructors have the super(); call which refers to the parent class's constructor. Since Funds doesn't explicitly extend another class (other than implicitly extending Object), this call is redundant and can be safely removed.

* */

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
