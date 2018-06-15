package com.company;

import java.util.ArrayList;

public class WorkExperience {

	private ArrayList<String> workExperienceList = new ArrayList<>();

	public WorkExperience() {

	}

	public ArrayList<String> getWorkExperienceList() {
		return workExperienceList;
	}

	public void setWorkExperienceList(String title, String organizationName, String datesAttended, String duties) {
		if (title.equalsIgnoreCase("No experience")) {
			workExperienceList.add("No experience");
		} else {
			workExperienceList.add(title + ",\n" + organizationName + ", "
					+ datesAttended + "\n" + duties);
		}
	}

	@Override
	public String toString() {
		StringBuilder experienceInfo = new StringBuilder();

		for (String s : workExperienceList) {
			if(s.equalsIgnoreCase("No experience"))
				experienceInfo.append("\n");
			else
				experienceInfo.append(s + "\n");
		}

		return experienceInfo.toString();
	}
}
