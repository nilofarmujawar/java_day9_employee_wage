package com.bridgelab;

import java.util.Random;

//uc6

/*
      Calculate Wages till a condition of total working hours or days is reached for a month

 */

class utilityEmpWage {
    Random rand = new Random();
    public final int isPresent = 1;
    public final int isAbsent = 2;
    public final int isPartTime = 3;
    public int wagePerHr = 20;
    public int fullDayHr = 8;
    public int partTimeHr = 4;
    public int maxWorkingDays = 20;
    public int workingDays = 0;
    public int maxWorkingHr = 100;
    public int workingHr = 0;
    public int dailyWage;
    public int hrs = 0;

    public void present() {
        /*
        using while loop
         */
        while (workingHr < maxWorkingHr && workingDays < maxWorkingDays) {
            int check = rand.nextInt(3) + 1;

            /*
            using switch case for
             */

            switch (check) {

                case isPresent : {
                    System.out.println("Employee is present.");   //condition1
                    hrs = fullDayHr;
                }
                case isPartTime : {
                    System.out.println("Employee is present part time.");   //condition2
                    hrs = partTimeHr;
                }
                case isAbsent : hrs = 0;
            }
            workingHr = workingHr + hrs;
            workingDays = workingDays + 1;
        }
        int salary = workingHr * wagePerHr;
        System.out.println("the salary of month is : " + salary);
    }
}

public class EmpWage {

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");
        utilityEmpWage empWage = new utilityEmpWage();  //create object
        empWage.present();
    }

}