package com.example.model;

import java.util.UUID;

public class Time {

	private final UUID id;
	private final double hours;
	private final String day;
	
	public Time(UUID id, double hours, String day) {
		this.id = id;
		this.hours = hours;
		this.day = day;
	}

	public UUID getId() {
		return id;
	}

	public double getHours() {
		return hours;
	}

	public String getDay() {
		return day;
	}
}
