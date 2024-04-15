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

            int Deposit_Value = DepositValueCalc(scanner);

        }
        else if(user_input.equals("3"))  {

            int Annuity_Value = AnnuityCalc(scanner);

        }
        else{
            System.out.println("Please Select a Valid Choice");
        }
        }


    public static void MortgageCalc(Scanner scanner){

        System.out.println("What is your principle amount?");
        int principle_amount = scanner.nextInt();
        System.out.println("What is your interest rate?");
        double interest_rate = scanner.nextDouble();
        System.out.println("How long is your loan for?");
        int loan_length = scanner.nextInt();
        interest_rate = interest_rate / 12;
        double monthly_payment = (principle_amount * interest_rate) / (1 - Math.pow(1 + interest_rate, -loan_length));
        double total_interest = (monthly_payment * loan_length) - principle_amount;
        System.out.println("Your monthly payment is $" + monthly_payment + " per month with a total interest of $" + total_interest);



    }

    public static int DepositValueCalc(Scanner scanner){
    System.out.println("Enter deposit amount");
    int deposit_amount = scanner.nextInt();
    System.out.println("Enter your interest rate");
    int interest_rate = scanner.nextInt();
    System.out.println("Enter ");
    return 0;
    }

    public static int AnnuityCalc(Scanner scanner){

return -1;
    }
}