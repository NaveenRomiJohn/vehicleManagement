package com.chainsys.vehiclemanagement.pojo;

public class Bus {
	private String busNumber;
	private float kiloMeterRunned;
	private String busStatus;

	public Bus(String no, float km, String status) {
		this.busNumber = no;
		this.kiloMeterRunned = km;
		this.busStatus = status;
	}
	public Bus() {
		
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public float getKiloMeterRunned() {
		return kiloMeterRunned;
	}

	public void setKiloMeterRunned(float kiloMeterRunned) {
		this.kiloMeterRunned = kiloMeterRunned;
	}

	public String getBusStatus() {
		return busStatus;
	}

	public void setBusStatus(String busStatus) {
		this.busStatus = busStatus;
	}

	@Override
	public String toString() {
		return "Bus Details: [Bus Number=" + busNumber + ", KiloMeter Runned=" + kiloMeterRunned + ", Bus Status=" + busStatus
				+ "]";
	}
}