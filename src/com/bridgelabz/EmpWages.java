package com.bridgelabz;

public class EmpWages {
	public static void main(String[] args) {
		System.out.println("Welcome employee builder");
		int IS_FULL_TIME = 1;
		final int emp_per_rate = 20;
		int empHr = 0;
		int empWage = 0;
		// find random  number
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if (empcheck == IS_FULL_TIME) {
			System.out.println("Employee is present");
			empHr = 8;
		} else {
			System.out.println("Employee is absent");
			empHr = 0;
		}
		// calculate Employee Wage
		empWage = empHr * emp_per_rate;
		System.out.println("EmpWage :" + " " + empWage);
	}

}
