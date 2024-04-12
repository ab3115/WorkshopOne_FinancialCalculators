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

            double Mortgage = MortgageCalc(scanner);

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


    public static double MortgageCalc(Scanner scanner){

        System.out.println("What is your principle rate?");
        int principle_rate = scanner.nextInt();
        System.out.println("What is your interest rate?");
        int interest_rate = scanner.nextInt();
        System.out.println("How long is your loan for?");
        int loan_length = scanner.nextInt();
        double answer = ((principle_rate * (interest_rate * (Math.pow((1 + interest_rate), loan_length)))) / (Math.pow((1 + interest_rate), loan_length) - 1));
        return -1;


    }

    public static int DepositValueCalc(Scanner scanner){

    return -1;
    }

    public static int AnnuityCalc(Scanner scanner){

return -1;
    }
}