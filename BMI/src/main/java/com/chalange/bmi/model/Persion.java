package com.chalange.bmi.model;

public class Persion {

	private String gender;
	private double heightCm;
	private double weightKg;

	public Persion() {

	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getHeightCm() {
		return heightCm;
	}

	public void setHeightCm(double heightCm) {
		this.heightCm = heightCm;
	}

	public double getWeightKg() {
		return weightKg;
	}

	public void setWeightKg(double weightKg) {
		this.weightKg = weightKg;
	}

	@Override
	public String toString() {
		return "Persion [Gender=" + gender + ", heightCm=" + heightCm + ", weightKg=" + weightKg + "]";
	}

	
	
	

}
