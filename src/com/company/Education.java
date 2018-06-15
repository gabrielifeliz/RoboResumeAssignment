package com.company;

import java.util.ArrayList;

public class Education {

    private ArrayList<String> educationList = new ArrayList<>();

    public Education() {

    }

    public ArrayList<String> getEducationList() {
		return educationList;
	}

	public void setEducationList(String degree, String institutionName, int gradYear) {
        educationList.add(degree + ",\n" + institutionName + ", " + gradYear);
	}

    @Override
    public String toString() {
    	StringBuilder educationInfo = new StringBuilder();
    	
    	for (String s : educationList) {
    		educationInfo.append(s + "\n\n");
    	}
    	
        return educationInfo.toString();
    }

}
