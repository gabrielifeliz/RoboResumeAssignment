package com.company;

import java.util.ArrayList;

public class WorkExperience {

    /* Create an ArrayList of String that will contain the list of work experience info */
    private ArrayList<String> workExperienceList = new ArrayList<>();

	public WorkExperience() {

	}

    /* This method is responsible for returning the list of work experience info */
    public ArrayList<String> getWorkExperienceList() {
		return workExperienceList;
	}

	/* This method is responsible for adding a list of work experience to the resume */
	public void setWorkExperienceList(String title, String organizationName, String datesAttended, String duties) {
		if (title.equalsIgnoreCase("No experience")) {
			workExperienceList.add("No experience");
		} else {
			workExperienceList.add(title + ",\n" + organizationName + ", "
					+ datesAttended + "\n" + duties);
		}
	}

    /* This method is responsible for returning complete work experience info */
    @Override
	public String toString() {
        // Create a StringBuilder object to build a more readable view of work experience
		StringBuilder experienceInfo = new StringBuilder();

		for (String s : workExperienceList) {
		    // If the person does not have work experience, only append a newline character
			if(s.equalsIgnoreCase("No experience"))
				experienceInfo.append("\n");
			else
			    // Else, append the list of work experience to the StringBuilder object
				experienceInfo.append(s + "\n");
		}

		return experienceInfo.toString();
	}
}
