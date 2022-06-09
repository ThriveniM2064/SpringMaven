package com.xworkz.institute.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class CourseDTO implements Serializable {
	private int id;
	private String name;
	private int duration;
	private int fees;
	private LocalDate startdate;
	private boolean free;

	public CourseDTO(int id, String name, int duration, int fees, LocalDate startdate, boolean free) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.fees = fees;
		this.startdate = startdate;
		this.free = free;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public LocalDate getStartdate() {
		return startdate;
	}

	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

}
