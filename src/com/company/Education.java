package com.company;

import java.util.ArrayList;

public class Education {

    /* Create an ArrayList of String that will contain the list of education info */
    private ArrayList<String> educationList = new ArrayList<>();

    public Education() {

    }

    /* This method is responsible for returning the list of education info */
    public ArrayList<String> getEducationList() {
		return educationList;
	}

    /* This method is responsible for adding a list of education to the resume */
    public void setEducationList(String degree, String institutionName, int gradYear) {
        educationList.add(degree + ",\n" + institutionName + ", " + gradYear);
	}

    /* This method is responsible for returning complete education info */
    @Override
    public String toString() {
        // Create a StringBuilder object to build a more readable view of education
        StringBuilder educationInfo = new StringBuilder();
    	
    	for (String s : educationList) {
    	    // Append list of education info
    		educationInfo.append(s + "\n\n");
    	}
    	
        return educationInfo.toString();
    }

}
