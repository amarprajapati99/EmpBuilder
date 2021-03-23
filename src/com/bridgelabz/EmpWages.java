package com.bridgelabz;

public class EmpWages {
	public static void main(String[] args) {
		System.out.println("Welcome employee builder");
		int Is_Part_Time = 1;
		int IS_FULL_TIME = 2;
		final int emp_per_rate = 20;
		int empHr = 0;
		int empWage = 0;
		int emphrs;
		// find random number
		double empcheck = Math.floor(Math.random() * 10) % 3;
		if (empcheck == IS_FULL_TIME) {
			System.out.println("Employee is present");
			empHr = 8;
		} else if (empcheck == Is_Part_Time) {
			System.out.println("Employee is absent");
			empHr = 4;
		} else
			// calculate Employee Wage
			emphrs = 0;
		empWage = empHr * emp_per_rate;
		System.out.println("EmpWage :" + " " + empWage);
	}

}
