package util;
import java.util.*;
import java.util.Scanner;


public class Input {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        System.out.print("You have entered: " + str);
    }

    public String getString(String prompt) {
        System.out.println(prompt);

        return Scanner.nextLine();
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String yN = Scanner.next();
        Scanner.nextLine();
        if (yN.equalsIgnoreCase("yes")) {
            return true;
        }
        return false;
    }

    public int getInt(int min, int max, String prompt) {
        int input = getInt(prompt);
        if (input < min || input > max) {
            System.out.println("Try between " + min + " and " + max);
            getInt(min, max, prompt);
        }
        return input;
    }

    public int getInt(String prompt) {
        do {
            try {
                String s = getString(prompt);
                return Integer.valueOf(s);
            } catch (NumberFormatException e){
                System.out.println("Thats not what I asked for!");
            }
        } while (true);
    }


    public double getDouble(double min, double max, String prompt) {
        double inputNum = getDouble(prompt);
        if (inputNum > min && inputNum < max) {
            System.out.println("Your input is valid.");
        } else {
            System.out.println("Try another number between " + min + "and " + max);
            return getDouble(min, max, prompt);
        }
        return inputNum;
    }

    public double getDouble(String prompt) {
        do {
            try {
                String s = getString(prompt);
                return Double.valueOf(s);
            } catch (NumberFormatException e) {
                System.out.println("That's not right!");
            }
        } while (true);
    }


}
