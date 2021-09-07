/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Doyon
 */
package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        String weight = "", height = "";
        double HeightN = 0, WeightN = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your height in inches: ");
        height = inp.nextLine();
        try
        {
            HeightN = Double.parseDouble(height);
        }

        catch(Exception e)
        {
            System.out.print("Invalid input, please enter a numeric value.");
            return;
        }

        System.out.print("Enter your weight in pounds: ");
        weight = inp.nextLine();

        try
        {
            WeightN = Double.parseDouble(weight);
        }

        catch (Exception e)
        {
            System.out.print("Invalid input, please enter a numeric value.");
            return;
        }

        double bmi = (WeightN / (HeightN * HeightN)) * 703;

        if (bmi >= 18.5 && bmi < 25 )
        {
            System.out.print("Your BMI is " + String.format("%.1f", bmi) + ".\n" + "You are within the ideal weight range.");
        }

        else
        {
            System.out.print("Your BMI is " + String.format("%.1f", bmi) + ".\n" + "You are overweight. You should see your doctor.");
        }
    }
}
