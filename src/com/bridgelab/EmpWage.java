package com.bridgelab;

public class EmpWage{

    public static void main(String args[]) {

        // constant
        final int PART_TIME = 1;
        final int FULL_TIME = 2;
        final int WAGE_PER_HR = 20;
        final int WORKING_DAYS = 20;

        int totalWage = 0;
        /*
              using for loop for calculate monthly wage
         */
        for (int day = 1; day <= WORKING_DAYS; day++) {
            int empType = (int) (Math.random() * 100) % 3;
            int workingHours =0;
            
            /*
            using switch case 
             */
            switch (empType)
            {
                case FULL_TIME:
                    workingHours = 8;
                    break;
                case PART_TIME:
                    workingHours = 4;
                    break;
                default:
            }
            //calculate daily empwage
            int wage = workingHours * WAGE_PER_HR;
            System.out.println("Day " + day + " wage is:" + wage);
            totalWage += wage; //monthly wage
        }
        System.out.println("Total wage for a month is " + totalWage);
    }
}
