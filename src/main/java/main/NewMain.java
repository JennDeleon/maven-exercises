package main;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;
import util.Input;

public class NewMain {
    public static void main(String[] args){
        Input input = new Input();
        String userInput = input.toString("Enter a word");
        System.out.printf("You said  \"%s\"\n ", userInput);
        System.out.printf("\"%s\" ", userInput);
        if(StringUtils.isNumeric(userInput)) {
            System.out.printf("is a number!");
        } else {
            System.out.printf("is not a number!");
        }
        System.out.printf("flipped case: %s\n", StringUtils.swapCase(userInput));
        System.out.printf("Reversed %s\n", StringUtils.reverse(userInput));
    }
}
//        StringUtils


