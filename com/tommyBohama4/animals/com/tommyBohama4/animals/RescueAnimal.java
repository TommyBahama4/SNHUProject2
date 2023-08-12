package com.tommyBohama4.animals;

import java.lang.String;

public class RescueAnimal extends animal {

	// Instance variables
	private String name;
	private String acquisitionDate;
	private String acquisitionCountry;
	private String trainingStatus;
	private boolean reserved;
	private String inServiceCountry;

	// Constructor
	protected RescueAnimal(String name, String animalType, String gender, String age,
			String weight, String acquisitionDate, String acquisitionCountry,
			String trainingStatus, boolean reserved, String inServiceCountry) {
		super(animalType, gender, age, weight);
		this.name = name;
		this.acquisitionDate = acquisitionDate;
		this.acquisitionCountry = acquisitionCountry;
		this.trainingStatus = trainingStatus;
		this.reserved = reserved;
		this.inServiceCountry = inServiceCountry;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcquisitionDate() {
		return acquisitionDate;
	}

	public void setAcquisitionDate(String acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}

	public String getAcquisitionCountry() {
		return acquisitionCountry;
	}

	public void setAcquisitionCountry(String acquisitionCountry) {
		this.acquisitionCountry = acquisitionCountry;
	}

	public boolean getReserved() {
		return reserved;
	}

	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}

	public String getInServiceLocation() {
		return inServiceCountry;
	}

	public void setInServiceCountry(String inServiceCountry) {
		this.inServiceCountry = inServiceCountry;
	}

	public String getTrainingStatus() {
		return trainingStatus;
	}

	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}
}
