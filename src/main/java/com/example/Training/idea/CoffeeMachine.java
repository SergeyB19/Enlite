package com.example.Training.idea;

import java.util.Scanner;


public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has: ");
        int waterInput = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milkInput = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int beansInput = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int countCupsInput = scanner.nextInt();

        int waterCupStandart = 200;
        int milkCupStandart = 50;
        int coffeeBeansStandart = 15;
        int cupStandart = 1;
        int oneCoffeeCup = waterCupStandart + milkCupStandart + coffeeBeansStandart;


        int waterRes = 0;
        int milkRes = 0;
        int coffeeBeansRes = 0;
        int sumCupsRes = 0;
        int totalSumCupsRes = 0;
        if (waterRes == milkRes || waterRes == coffeeBeansRes) {
            waterRes = (int) (waterInput / waterCupStandart);//1728
            milkRes = (int) (milkInput / milkCupStandart);//868
            //int coffeeBeansRes= (int)(BeansInput/(coffeeCup*waterRes));
            coffeeBeansRes = (int) (beansInput / coffeeBeansStandart);//1548
            sumCupsRes = (int) countCupsInput;
            if (waterRes < milkRes) {
                milkRes = waterRes;
            }
            if (waterRes < coffeeBeansRes) {
                coffeeBeansRes = waterRes;
            }
            if (waterInput > milkRes) {
                waterRes = milkRes;
            }
            if (coffeeBeansRes < milkRes) {
                milkRes = coffeeBeansRes;
            }
            if (coffeeBeansRes < waterRes) {
                waterRes = coffeeBeansRes;
            }
            if (milkRes > waterRes) {
                waterRes = milkRes;
            }
            if (coffeeBeansRes > waterRes) {
                coffeeBeansRes = waterRes;
            }

         /*   coffeeBeansRes = waterRes;
            milkRes = waterRes;*/


//            coffeeBeansRes = milkRes;
//            waterRes = milkRes;



            totalSumCupsRes = (int) ((waterRes + milkRes + coffeeBeansRes) / 3); //867
        }


        System.out.println("oneCoffeeCup " + oneCoffeeCup);
        System.out.println("waterRes " + waterRes);
        System.out.println("milkRes " + milkRes);
        System.out.println("coffeeBeansRes " + coffeeBeansRes);
        System.out.println("sumCupsRes " + sumCupsRes);
        System.out.println("totalSumCupsRes " + totalSumCupsRes);

        if (waterInput >= waterCupStandart && milkInput >= milkCupStandart && beansInput >= coffeeBeansStandart && totalSumCupsRes - sumCupsRes >= 2) {
            int even = totalSumCupsRes - sumCupsRes;
            System.out.println("Yes, I can make that amount of coffee (and even " + even + " more than that)");
        }
        if ((waterInput >= cupStandart && milkInput >= cupStandart && beansInput >= cupStandart && countCupsInput > totalSumCupsRes)||
                waterInput ==0 && milkInput ==0 && beansInput ==0 && countCupsInput > totalSumCupsRes) {
//            int even = totalSumCupsRes - sumCupsRes;
            System.out.println("No, I can make only " + totalSumCupsRes + " cup(s) of coffee");
        }

        if (waterInput >= cupStandart && milkInput >= cupStandart && beansInput >= cupStandart && countCupsInput == totalSumCupsRes) {
            System.out.println("Yes, I can make that amount of coffee ");
        }
        if (waterInput == 0 && milkInput == 0 && beansInput == 0 && countCupsInput == 0) {
            System.out.println("Yes, I can make that amount of coffee ");
        }
        if (waterInput >= waterCupStandart && milkInput >= milkCupStandart && beansInput >= coffeeBeansStandart && totalSumCupsRes - sumCupsRes == 1) {
            System.out.println("Yes, I can make that amount of coffee (and even 1 more than that)");
        }
    }
}








