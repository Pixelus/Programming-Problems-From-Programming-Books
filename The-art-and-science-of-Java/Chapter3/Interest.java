// This program reads two numbers, an account balance and
// an annual interest rate expressed as a percentage, and 
// display the new balance after a year.

import acm.program.*;

public class Interest extends ConsoleProgram {
	public void run() {
		println("Interest calculation program");
		int account_balance = readInt("Enter starting balance: ");
		double annual_interest_rate = readDouble("Enter annual interest rate: ");
		double interest = account_balance * annual_interest_rate;
		double new_balance = account_balance + interest;
		println("Balance after one year = " + new_balance);
		double interest_two_years = new_balance * annual_interest_rate;
		double new_balance_two_years = new_balance + interest_two_years;
		println("Balance after two years = " + new_balance_two_years);
	}
}
