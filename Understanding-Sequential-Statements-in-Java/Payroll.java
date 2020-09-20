// This program calculates an employee's take home pay. 
import java.util.Scanner;

public class Payroll
{
	public static void main(String args[])
	{
        Scanner s = new Scanner(System.in);
		double salary = 1250.00;
		double stateTax;
		double federalTax;
		double numDependents = 2;
		double dependentDeduction;
		double totalWithholding;
		double takeHomePay;

        //creating and printing out new salary. worker submits
        System.out.println("Enter salary: ");
        Scanner console = new Scanner(System.in);
        double newSalary = console.nextInt();
        System.out.println("Your salary " + newSalary);

        //creating and printing out new dependent amount, worker submits
        System.out.println("Enter new dependent amount: ");
        double newDependent = console.nextInt();
        System.out.println("Your new dependent amount " + newDependent);

		// Calculate state tax here.
        stateTax = newSalary * 0.065;
		System.out.println("State Tax: $" + stateTax);

		// Calculate federal tax here. 
        federalTax = newSalary * 0.28;
		System.out.println("Federal Tax: $" + federalTax);

		// Calculate dependant deduction here.
        dependentDeduction = newSalary * newDependent * 0.025;
		System.out.println("Dependents: $" + dependentDeduction);

		// Calculate total withholding here.
        totalWithholding = stateTax + federalTax + dependentDeduction;

		// Calculate take home pay here.
        takeHomePay = newSalary - totalWithholding;
		System.out.println("Salary: $" + newSalary);
		System.out.println("Take-Home Pay: $" + takeHomePay);
		System.exit(0);
	}
}
