package com.chalange.bmi.helper;

import java.util.HashMap;
import java.util.Map;

import com.chalange.bmi.constants.AppConstants;
import com.chalange.bmi.model.Persion;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CheckBMI {

	static Map<Double, String> cache = new HashMap<>();

	public static void main(String[] args) {

		final ObjectMapper objectMapper = new ObjectMapper();

		int totalOverWeightPeople = 0;

		try {
			Persion[] persion = objectMapper.readValue(AppConstants.json, Persion[].class);
			for (Persion p : persion) {
				double bmi = calculateBMI(p);
				
				String health = healthCondition(bmi);

				if (health.equalsIgnoreCase(AppConstants.overWeight)) {
					totalOverWeightPeople++;
				}
			}
			System.out.println(totalOverWeightPeople);

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	private static String healthCondition(double bmi) {
		if (bmi < 18.5) {
			return AppConstants.underWeight;
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			return AppConstants.normalWeight;
		} else if (bmi >= 25 && bmi <= 29.9) {
			return AppConstants.overWeight;
		} else if (bmi >= 30 && bmi <= 34.9) {
			return AppConstants.moderatelyObese;
		} else if (bmi >= 35 && bmi <= 39.9) {
			return AppConstants.severelyObese;
		} else { // 40 and above
			return AppConstants.vSeverelyObese;
		}
	}

	private static double calculateBMI(Persion p) {
		double heightInMeters = convertCmToMeters(p.getHeightCm()); // convert Cm to meters...
		return (p.getWeightKg() / (heightInMeters * heightInMeters)); // BMI = (kg/m^2)
	}

	private static double convertCmToMeters(double heightCm) {

		return (heightCm / 100.0); // formule to convert Cm to meters (cm/100)
	}

}
