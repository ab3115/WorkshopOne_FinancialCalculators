package com.ps;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Welcome to Yearup's Financial Organization App!");
        System.out.println("Which service would you like to use today?");
        System.out.println("Please select one of the following options,");
        System.out.println(" 1 - Mortgage Calculator");
        System.out.println(" 2 - Future Deposit Value Calculator");
        System.out.println(" 3 - Ordinary annuity Calculator");
        String user_input = scanner.nextLine();

        if(user_input.equals("1")) {

            MortgageCalc(scanner);


        }
        else if(user_input.equals("2")) {

           DepositValueCalc(scanner);

        }
        else if(user_input.equals("3"))  {

            AnnuityCalc(scanner);

        }
        else{
            System.out.println("Please Select a Valid Choice");
        }
        }


    public static void MortgageCalc(Scanner scanner){

        System.out.println("What is your principle amount?");
        int principle_amount = scanner.nextInt();
        System.out.println("What is your interest rate? (Decimal Form");
        double interest_rate = scanner.nextDouble();
        System.out.println("How long is your loan for? (months)");
        int loan_length = scanner.nextInt();
        interest_rate = interest_rate / 12;
        double monthly_payment = (principle_amount * interest_rate) / (1 - Math.pow(1 + interest_rate, -loan_length));
        double total_interest = (monthly_payment * loan_length) - principle_amount;
        System.out.println("Your monthly payment is $" + String.format("%.2f", monthly_payment) + " per month with a total interest of $" + String.format("%.2f", total_interest));



    }

    public static void DepositValueCalc(Scanner scanner){
    System.out.println("Enter deposit amount");
    int deposit_amount = scanner.nextInt();
    System.out.println("Enter your interest rate (Decimal Form)");
    double interest_rate = scanner.nextDouble();
    System.out.println("Enter the number of times the interest is compounded per year");
    int period_rate = scanner.nextInt();
    System.out.println("Enter the length of your deposit (years)");
    int time_length = scanner.nextInt();
    double future_value = (deposit_amount * Math.pow((1 + (interest_rate / period_rate)), (period_rate * time_length)));
    double interest_earned = (double) (future_value - deposit_amount);
    System.out.println("Your CD's ending balance will be $" + String.format("%.2f", future_value) + " and you have earned $" + String.format("%.2f", interest_earned) + " in interest");

    }

    public static void AnnuityCalc(Scanner scanner){

    System.out.println("Enter your monthly payout");
    int monthly_payout = scanner.nextInt();
    System.out.println("Enter the expected interest rate (Decimal Form)");
    double interest_rate = scanner.nextDouble();
    System.out.println("Enter the number of times the interest is compounded per year");
    int period_rate = scanner.nextInt();
    System.out.println("Enter the number of years to pay out");
    int years = scanner.nextInt();
    double amount = monthly_payout * (1-(1 / (Math.pow((1 + interest_rate),(period_rate * years))))) * (1 / interest_rate);
    System.out.println("You would need to invest $" + amount + " today");
    }
}