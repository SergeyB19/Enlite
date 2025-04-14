package com.example.Training.idea;

import java.util.Scanner;

public class CoffeeMachineSecond {

    //espresso
    public static final int ONE_ESPRESSO_WATER = 250;
    public static final int ONE_ESPRESSO_COFFEE_BEANS = 16;
    public static final int ONE_ESPRESSO_COSTS_$ = 4;

    //latte
    public static final int ONE_LATTE_WATER = 350;
    public static final int ONE_LATTE_MILK = 75;
    public static final int ONE_LATTE_COFFEE = 20;
    public static final int ONE_LATTE_COSTS_$ = 7;


    //cappuccino
    public static final int ONE_CAPPUCCINO_WATER = 200;
    public static final int ONE_CAPPUCCINO_MILK = 100;
    public static final int ONE_CAPPUCCINO_COFFEE = 20;
    public static final int ONE_CAPPUCCINO_COSTS_$ = 7;

    //coffeeMachine
    public static int COFFEE_MACHINE_WATER = 0;
    public static int COFFEE_MACHINE_MILK = 0;
    public static int COFFEE_MACHINE_COFFEE_BEANS = 0;
    public static int COFFEE_MACHINE_DISPOSABLE_CUPS = 0;
    public static int COFFEE_MACHINE_MONEY_$ = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInputWater = 0;
        int userInputMilk = 0;
        int userInputCoffeeBeans = 0;
        int userInputDisposable = 0;
        int resultMoney = 0;
        int countClean = 0;

        int resUserInCMWater = COFFEE_MACHINE_WATER + userInputWater;
        int resUserInCMMilk = COFFEE_MACHINE_MILK + userInputMilk;
        int resUserInCMCoffeeBeans = COFFEE_MACHINE_COFFEE_BEANS + userInputCoffeeBeans;
        int resUserInCMDisposable = COFFEE_MACHINE_DISPOSABLE_CUPS + userInputDisposable;

        System.out.println("The coffee machine has:");
        System.out.println(resUserInCMWater + " ml of water");
        System.out.println(resUserInCMMilk + " ml of milk");
        System.out.println(resUserInCMCoffeeBeans + " g of coffee beans");
        System.out.println(resUserInCMDisposable + " disposable cups");
        System.out.println("$" + resultMoney + " of money");

        System.out.println("Write action (buy, fill, take, clean, remaining, exit):");

        try {
            while (scanner.hasNextLine()) {


                String userActionInput = scanner.nextLine();
                if (userActionInput.equals("buy")) {
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");

                    int userInput = scanner.nextInt();
                    if (countClean >= 10) {
                        System.out.println("I need cleaning!");
                    }
                    if (userInput == 1) {
                        countClean++;
                        if (resUserInCMWater < ONE_ESPRESSO_WATER) {
                            System.out.println("Sorry, not enough water!");
                        }
                        if (resUserInCMCoffeeBeans < ONE_ESPRESSO_COFFEE_BEANS) {
                            System.out.println("Sorry, not enough beans!");
                        } else {
                            System.out.println("The coffee machine has: ");
                            System.out.println(ONE_ESPRESSO_WATER + " ml of water");
                            System.out.println(ONE_ESPRESSO_COFFEE_BEANS + " g of coffee beans");
                            System.out.println(resUserInCMDisposable + " disposable cups");
                            System.out.println("$" + resultMoney + " of money");
                        }

                    }
                    if (userInput == 2) {
                        countClean++;
                        if (resUserInCMWater < ONE_LATTE_WATER) {
                            System.out.println("Sorry, not enough water!");
                        } else if (resUserInCMMilk < ONE_LATTE_MILK) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (resUserInCMCoffeeBeans < ONE_LATTE_COFFEE) {
                            System.out.println("Sorry, not enough beans!");
                        } else {
                            System.out.println("I have enough resources, making you a coffee!");
//                        System.out.println("The coffee machine has: ");
//                        System.out.println(ONE_LATTE_WATER + " ml of water");
//                        System.out.println(ONE_LATTE_MILK + " ml of milk");
//                        System.out.println(ONE_LATTE_COFFEE + " g of coffee beans");
//                        System.out.println(resUserInCMDisposable + " disposable cups");
//                        System.out.println("$" + resultMoney + " of money");
                        }
                    }
                    if (userInput == 3) {
                        countClean++;
                        if (resUserInCMWater < ONE_CAPPUCCINO_WATER) {
                            System.out.println("Sorry, not enough water!");
                        }
                        if (resUserInCMMilk < ONE_CAPPUCCINO_MILK) {
                            System.out.println("Sorry, not enough milk!");
                        }
                        if (resUserInCMCoffeeBeans < ONE_CAPPUCCINO_COFFEE) {
                            System.out.println("Sorry, not enough beans!");
                        } else {
                            System.out.println("I have enough resources, making you a coffee!");
                            System.out.println("The coffee machine has: ");
                            System.out.println(ONE_CAPPUCCINO_WATER + " ml of water");
                            System.out.println(ONE_CAPPUCCINO_MILK + " ml of milk");
                            System.out.println(ONE_CAPPUCCINO_COFFEE + " g of coffee beans");
                            System.out.println(resUserInCMDisposable + " disposable cups");
                            System.out.println("$" + resultMoney + " of money");

                        }
                    }
                }


                if (userActionInput.equals("fill")) {
                    System.out.println("Write how many ml of water you want to add: ");
                    userInputWater = scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add: ");
                    userInputMilk = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add: ");
                    userInputCoffeeBeans = scanner.nextInt();
                    System.out.println("Write how many disposable cups you want to add: ");
                    userInputDisposable = scanner.nextInt();

                    System.out.println("The coffee machine has:");
                    System.out.println(resUserInCMWater + " ml of water");
                    System.out.println(resUserInCMMilk + userInputMilk + " ml of milk");
                    System.out.println(resUserInCMCoffeeBeans + userInputCoffeeBeans + " g of coffee beans");
                    System.out.println(resUserInCMDisposable + userInputDisposable + " disposable cups");
                    System.out.println("$" + resultMoney + " of money");

                }


               else if (userActionInput.equals("take")) {
                    int moneyUserInput = scanner.nextInt();
                    System.out.println("I gave you $" + moneyUserInput);
                    resultMoney = COFFEE_MACHINE_MONEY_$ + moneyUserInput;
                    if (resultMoney < 0) {
                        resultMoney = 0;
                    }
                    System.out.println("The coffee machine has:");
                    System.out.println(resUserInCMWater + " ml of water");
                    System.out.println(resUserInCMMilk + userInputMilk + " ml of milk");
                    System.out.println(resUserInCMCoffeeBeans + userInputCoffeeBeans + " g of coffee beans");
                    System.out.println(resUserInCMDisposable + userInputDisposable + " disposable cups");
//                    System.out.println("$" + COFFEE_MACHINE_MONEY_$ + " of money");
                   /* System.out.println(COFFEE_MACHINE_WATER + " ml of water");
                    System.out.println(COFFEE_MACHINE_MILK + " ml of milk");
                    System.out.println(COFFEE_MACHINE_COFFEE_BEANS + " g of coffee beans");
                    System.out.println(COFFEE_MACHINE_DISPOSABLE_CUPS + " disposable cups");*/
//                        System.out.println("$" + (resultMoney) + " of money");


                }
               else if (userActionInput.equals("clean")) {
                    System.out.println("I have been cleaned!");
                }


               else if (userActionInput.equals("remaining")) {
                    System.out.println("The coffee machine has:");
                    System.out.println(resUserInCMWater + " ml of water");
                    System.out.println(resUserInCMMilk + userInputMilk + " ml of milk");
                    System.out.println(resUserInCMCoffeeBeans + userInputCoffeeBeans + " g of coffee beans");
                    System.out.println(resUserInCMDisposable + userInputDisposable + " disposable cups");
                    System.out.println("$" + (resultMoney) + " of money");

                }


               else if (userActionInput.equals("exit")) {
                    break;
                }
                System.out.println("Write action (buy, fill, take, clean, remaining, exit):");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            scanner.close();
        }
    }
}



