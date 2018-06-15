package com.company;

public class Person {

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

    public void setEducation(String degree, String institutionName, int gradYear) {
       education.setEducationList(degree, institutionName, gradYear);
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String title, String organizationName, String datesAttended, String duties) {
        workExperience.setWorkExperienceList(title, organizationName, datesAttended, duties);
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(String skill) {
        skills.setSkillsList(skill);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
   

    @Override
    public String toString() {

        return name + "\n" + emailAddress + "\n\nEducation:\n" + education
        		+ "\n\nExperience:\n" + workExperience; //+ "\n\nSkills:\n" + skills;
    }

}
