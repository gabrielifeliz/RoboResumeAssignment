package com.company;

import java.util.ArrayList;

public class Skills {

	private ArrayList<String> skillsList = new ArrayList<>();

    public Skills() {

    }

    public ArrayList<String> getSkillsList() {
		return skillsList;
	}

	public void setSkillsList(String skill) {
		skillsList.add(skill);
	}

    @Override
    public String toString() {
    	StringBuilder skillsInfo = new StringBuilder();
    	
    	for (String s : skillsList) {
			skillsInfo.append("- " + s + "\n");
    	}
    	
        return skillsInfo.toString();
    }
}
