package com.bridgelab;

public class EmpWage {
    public static void calculateTotalWage() {
        //constant
        final int PART_TIME = 1;
        final int FULL_TIME = 2;
        final int WAGE_PER_HR = 20;
        final int MAX_WORKING_DAYS = 20;
        final int MAX_WORKING_HRS = 100;

        int totalWage = 0;
        int workingHrs = 0;
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");
        /*
        using for loop check condition and print days ,workinghrs, wage ,totaal working hrs in month.
         */
        for (int day = 1, totalWorkingHrs = 0; day <= MAX_WORKING_DAYS
                && totalWorkingHrs < MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs)
        {

            int empType = (int) (Math.random() * 100) % 3;

            /*
            using switch case
             */
            switch (empType)
            {
                case FULL_TIME:
                    workingHrs = 8;
                    break;
                case PART_TIME:
                    workingHrs = 4;
                    break;
                default:
                    workingHrs = 0;
                    break;
            }
            //calculate daily wage
            int wage = workingHrs * WAGE_PER_HR;
            totalWage += wage;// monthly wage
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);

        }
        System.out.println("Total wage for a month is " + totalWage);
    }

    public static void main(String args[])
    {
        calculateTotalWage();
    }
}
