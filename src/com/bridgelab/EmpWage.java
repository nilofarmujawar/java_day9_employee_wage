package com.bridgelab;

public class EmpWage{
    public static void main(String args[]) {
        //constatnt
        final int PART_TIME = 1;
        final int FULL_TIME = 2;
        final int WAGE_PER_HR = 20;
        int empType = (int) (Math.random() * 100) % 3;
        int workingHours =0;
        
        /*
        using switch case for employee present or absent.if employee present in full tm then working hr is 8,
        if employee absent in part time then working hr is 4.
         */
        
        switch (empType) {
            case FULL_TIME:
                System.out.println("Employee is Present Full time");  //condition 1
                workingHours = 8;
                break;
            case PART_TIME:
                System.out.println("Employee is Present Part time");  //condition 2
                workingHours = 4;
                break;
                
            default:
                System.out.println("Employee is Absent");  // if case 1 and case 2 both are fail then default condition run
        }
        //calculate daily wage
        int wage = workingHours * WAGE_PER_HR;
        System.out.println("Employee Daily Wage is " + wage);
    }
}
