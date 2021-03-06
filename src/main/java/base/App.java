package base;
import java.util.Scanner;

/*
UCF COP3330 Summer 2021 Assignment 1 Solution
Copyright 2021 Cristiam Enciso

Exercise 20 - Multistate Sales Tax Calculator
More complex programs may have decisions nested in other decisions, so that when one decision is made, additional decisions must be made.

Create a tax calculator that handles multiple states and multiple counties within each state. The program prompts the user for the order amount and the state where the order will be shipped.

Wisconsin residents must be changed 5% sales tax with an additional county-level charge. For Wisconsin residents, prompt for the county of residence.
For Eau Claire county residents, add an additional 0.005 tax.
For Dunn county residents, add an additional 0.004 tax.
Illinois residents must be charged 8% sales tax with no additional county-level charge.
All other states are not charged tax.
The program then displays the tax and the total for Wisconsin and Illinois residents but just the total for everyone else.

Example Output
What is the order amount? 10
What state do you live in? Wisconsin
What county do you live in? Dane
The tax is $0.50.
The total is $10.50.
Constraints
Ensure that all money is rounded up to the nearest cent.
Use a single output statement at the end of the program to display the program results.
Challenges
Add support for your state and county.
Allow the user to enter a state abbreviation and county name in upper, lower, or mixed case.
Allow the user to also enter the state’s full name in upper, lower, or mixed case.
Implement the program using data structures to avoid nested if statements.


 */

public class App {
    public static void main(String[] args) {
        String wis = "Wisconsin";
        String il = "Illinois";
        String cnty1 = "Eau Claire";
        String cnty2 = "Dunn";
        Scanner in = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        String og_amount = in.nextLine();
        System.out.print("What state do you live in? ");
        String state = in.nextLine();
        //System.out.print("What county do you live in? ");
        //String county = in.nextLine();
        double original = Double.parseDouble(og_amount);
        if((state.equals(wis) == true)) {
            System.out.print("What county do you live in? ");
            String county = in.nextLine();
            double new_amount = (original * .005) + original;
            if(county.equals(cnty1) == true) {
                new_amount = (original * .005) + original;
            }
            else if(county.equals(cnty2) == true) {
                new_amount = (original * .004) + original;
            }
        System.out.printf("the tax is $%.2f\nThe total is $%.2f",(new_amount - original) ,new_amount);
        }
        else if(state.equals(il) == true) {
            double new_amount = (original * .008) + original;
            System.out.printf("the tax is $%f\nThe total is $%.2f", (new_amount - original) ,new_amount);

        }
        else {
            System.out.printf("the total is $%f", original);
        }


    }
}
