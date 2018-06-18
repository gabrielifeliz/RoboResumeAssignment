package com.company;

public class Person {

    /* Create Education, WorkExperience, and Skills objects to access their methods
    * Define String variables to store the person's name and email address */
    private Education education = new Education();
    private WorkExperience workExperience = new WorkExperience();
    private Skills skills = new Skills();
    private String name;
    private String emailAddress;

    public Person() {

    }

    public Education getEducation() {
        return education;
    }

    /* This method is responsible for adding education to the resume */
    public void setEducation(String degree, String institutionName, int gradYear) {
       education.setEducationList(degree, institutionName, gradYear);
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    /* This method is responsible for adding work experience to the resume */
    public void setWorkExperience(String title, String organizationName, String datesAttended, String duties) {
        workExperience.setWorkExperienceList(title, organizationName, datesAttended, duties);
    }

    public Skills getSkills() {
        return skills;
    }

    /* This method is responsible for adding skills to the resume */
    public void setSkills(String skill) {
        skills.setSkillsList(skill);
    }

    public String getName() {
        return name;
    }

    /* This method is responsible for adding the person's name to the resume */
    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    /* This method is responsible for adding the person's email address to the resume */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
   

    /* This method is responsible for displaying the person's resume */
    @Override
    public String toString() {
        return name + "\n" + emailAddress + "\n\nEducation:\n" + education
        		+ "Experience:\n" + workExperience + "Skills:\n" + skills;
    }

}
