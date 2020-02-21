package com.company;



import java.util.Scanner;

        class UserInput {
            Scanner scanner = new Scanner(System.in);

            public int promptInt(String message) {
                System.out.println(message);
                String userInput = scanner.nextLine();

                int userInt = 0;
                boolean isInt = false;
                while (!isInt) {
                    try {
                        userInt = Integer.parseInt(userInput);
                        isInt = true;
                    }
                    catch (NumberFormatException e) {
                        System.out.println(userInput + " is not a valid integer. " + message);
                        userInput = scanner.nextLine();
                    }
                }

                return userInt;
            }



            public String promptString() {
                System.out.println("Enter a String");

                String userString = "";

                boolean isString = false;
                while (!isString) {
                    try {
                        userString = scanner.nextLine();
                        int userInput = Integer.parseInt(userString);
                        System.out.println("enter a String");

                    } catch (Exception e) {

                        isString = true;

                    }

                }return userString;


            }
            public double promptDouble(String message) {
                System.out.println(message);
                String userInput = scanner.nextLine();

                double userDouble = 0.0;
                boolean isDouble = false;
                while (!isDouble) {
                    try {
                        userDouble = Integer.parseInt(userInput);
                        isDouble = true;
                    } catch (NumberFormatException e) {
                        System.out.println(userInput + " is not a valid double. " + message);
                        userInput = scanner.nextLine();
                    }
                }

                return userDouble;
            }
        }


        public class Main {
            public static void main(String[] args) {
                UserInput input = new UserInput();
                int aNumber = input.promptInt("Enter an integer.");
                System.out.println("Your number is " + aNumber);

                double number = input.promptDouble("Enter a Double");
                System.out.println("Your double is " + number);

                String word =input.promptString();
                System.out.println("Your word is "+word);
            }
        }

