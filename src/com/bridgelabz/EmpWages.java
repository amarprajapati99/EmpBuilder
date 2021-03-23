package com.bridgelabz;

public class EmpWages {
	public static void main(String[] args) {
		System.out.println("Welcome employee builder");
		int IS_FULL_TIME = 1;
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if (empcheck == IS_FULL_TIME) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}
	}

}
