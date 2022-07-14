package com.chainsys.vehiclemanagement;

import java.util.Scanner;

public class Startup {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Java Travels");
		System.out.println("Do you want to book a bus");
		System.out.println("Press 1 to book");
		System.out.println("Press 2 to exit");
		try {
			int input = sc.nextInt();
			if (input == 1) {
				VehicleUI.busList();
			} else if (input == 2) {
				System.out.println("Thank You");
			}
		} finally {
			sc.close();
		}
	}
}