package com.company;

import java.util.ArrayList;

public class Skills {

	/* Create an ArrayList of String that will contain the list of skills info */
	private ArrayList<String> skillsList = new ArrayList<>();

    public Skills() {

    }

    public ArrayList<String> getSkillsList() {
		return skillsList;
	}

	/* This method is responsible for adding a list of skills to the resume */
	public void setSkillsList(String skill) {
		skillsList.add(skill);
	}

    @Override
    public String toString() {
		// Create a StringBuilder object to build a more readable view of skills
		StringBuilder skillsInfo = new StringBuilder();
    	
    	for (String s : skillsList) {
			// Append the list of skills to the StringBuilder object
			skillsInfo.append("- " + s + "\n");
    	}
    	
        return skillsInfo.toString();
    }
}
