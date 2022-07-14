package com.chainsys.vehiclemanagement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class VehicleUI {
	public static void busList() {
		Map<Integer, Bus> busList = new HashMap<Integer, Bus>();
		Bus b1 = new Bus("TN57CG1234", 100, "Available");
		Bus b2 = new Bus("TN57CG1235", 50, "Not Available");
		Bus b3 = new Bus("TN57CG1236", 150, "Available");
		Bus b4 = new Bus("TN57CG1237", 500, "Not Available");
		Bus b5 = new Bus("TN57CG1238", 40, "Available");
		busList.put(1, b1);
		busList.put(2, b2);
		busList.put(3, b3);
		busList.put(4, b4);
		busList.put(5, b5);
		Bus bus1 = new Bus();
		Set<Map.Entry<Integer, Bus>> setofMapEntry = busList.entrySet();
		Iterator<Map.Entry<Integer, Bus>> mapIterator = setofMapEntry.iterator();
		int count = 0;
		float min = 65776;
		while (mapIterator.hasNext()) {
			Map.Entry<Integer, Bus> mapEntry = (Map.Entry<Integer, Bus>) mapIterator.next();
			Bus bus = mapEntry.getValue();

			if (bus.getBusStatus().equals("Available")) {
				count++;
				if (bus.getKiloMeterRunned() < min) {

					min = (float) bus.getKiloMeterRunned();
					bus1 = bus;
				}
			}
		}
		if (count == 0) {
			System.out.println("Bus not available");
		} else {
			System.out.println("Bus available");
//			Set<Map.Entry<Integer, Bus>> setofMapEntrys = busList.entrySet();
//			Iterator<Map.Entry<Integer, Bus>> mapIterators = setofMapEntrys.iterator();
//			while (mapIterators.hasNext()) {
//				Map.Entry<Integer, Bus> mapEntry = (Map.Entry<Integer, Bus>) mapIterators.next();
//				Bus bus = mapEntry.getValue();
//				if(bus.getKiloMeterRunned() == min) {
//					System.out.println("BusNo: "+bus.getBusNumber());
//				}
			System.out.println("BusNo: " + bus1.getBusNumber());
			userDetails();
		}
	}

	public static void userDetails() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name :");
		String name = sc.nextLine();
		try {
			Validator.checkNameContainsOnlyString(name);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}

		System.out.println("Enter Phone Number");
		String phone = sc.nextLine();
		try {
			Validator.checkPhone(phone);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
			return;
		}

		System.out.println("Enter Address :");
		String address = sc.nextLine();
		try {
			Validator.checkNameContainsOnlyString(address);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		User user = new User(name, Long.parseLong(phone), address);
		System.out.println(user.toString());
		System.out.println("Bus Booked");
	}
}
