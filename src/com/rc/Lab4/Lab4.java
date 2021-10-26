package com.rc.Lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Lab4 {
    public static void main(String[] args) throws FileNotFoundException {

        File file1 = new File("src/com/rc/Lab4/one_expression.txt");
        Scanner input1 = new Scanner(file1);
        printResults(input1);

        File file2 = new File("src/com/rc/Lab4/three_expressions.txt");
        Scanner input2 = new Scanner(file2);
        printResults(input2);

    }

    public static void printResults(Scanner input){
        while (input.hasNextLine()) {
            String expression = input.nextLine();
            System.out.print(expression);
            if (isValid(expression))
                System.out.println(" This expression is correct");
            else
                System.out.println(" This expression is invalid");
        }
    }

    public static boolean isValid(String expression) {

        //stores parentheses
        Stack<Object> st = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char temp = expression.charAt(i);
            //if the character is an opening parentheses we push it to stack
            if (isBracketOpen(temp)) {
                st.push(temp);
            }
            //if it is a closing bracket
            else if (isBracketClosed(temp)) {
                if (st.empty())
                    return false;

                char c = (char) st.pop();
                if (c != getCorrespondingChar(temp)) {
                    return false;
                }
            }
        }
        // checks empty stack
        return st.isEmpty();
    }


    //checks if the given bracket is open or not.
    public static boolean isBracketOpen(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    public static boolean isBracketClosed(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    //method to get corresponding opening and closing bracket.
    public static char getCorrespondingChar(char c) {
        if (c == ')') {
            return '(';
        } else if (c == ']') {
            return '[';
        }
        return '{';
    }

