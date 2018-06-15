package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class RoboResumeAssignment {

    public static void main(String[] args) {


        Scanner keyboard =  new Scanner(System.in);
        String name, email, degree, institution,
                title, organization, dates, duty, skills;
        String addEducation = "y", addExperience = "y",
                addDuties = "y", addSkills = "y";
        int gradYear, dutyNum = 1, skillNum = 1;

        Person person = new Person();
        ArrayList<String> workExperienceList = new ArrayList<>();
        ArrayList<String> dutiesList = new ArrayList<>();
        ArrayList<String> skillsList = new ArrayList<>();


        System.out.println("Enter a name:");
        name = keyboard.nextLine();
        person.setName(name);

        System.out.println("\nEnter an email address:");
        email = keyboard.nextLine();
        person.setEmailAddress(email);

        System.out.println("\nEnter one to ten educational achievements:");
        while (addEducation.equalsIgnoreCase("y")) {
            System.out.print("Degree > "); degree = keyboard.nextLine();
            System.out.print("Institution Name > "); institution = keyboard.nextLine();
            System.out.print("Graduation Year > "); gradYear = keyboard.nextInt();
            keyboard.nextLine();

            person.setEducation(degree, institution, gradYear);

            System.out.print("Add more education (\"y\" or \"n\")? ");
            addEducation = keyboard.nextLine();
        }

        System.out.println("\nEnter zero to ten work experiences:");
        System.out.print("Add experiences (\"y\" or \"n\")? ");
        addExperience = keyboard.nextLine();
        
        if (addExperience.equalsIgnoreCase("n")) {
            person.setWorkExperience("No experience", null, null, null);
        }
        
        while (addExperience.equalsIgnoreCase("y")) {
            System.out.print("Title > "); title = keyboard.nextLine();
            System.out.print("Organization Name > "); organization = keyboard.nextLine();
            System.out.println("Dates Attended (Month Year -  Month Year format) > ");
            dates = keyboard.nextLine();

            addDuties = "y";
            dutyNum = 1;
            StringBuilder duties = new StringBuilder();
            while (addDuties.equalsIgnoreCase("y")) {
                System.out.println("Duty " + dutyNum  + " > ");
                duty = keyboard.nextLine();
                duties.append("- Duty " + dutyNum + ", " + duty + "\n");
                
                dutyNum++;
                System.out.print("Add more duties (\"y\" or \"n\")? ");
                addDuties = keyboard.nextLine();
            }

            person.setWorkExperience(title, organization, dates, duties.toString());

            System.out.print("Add more experiences (\"y\" or \"n\")? ");
            addExperience = keyboard.nextLine();
        }


        System.out.println("\nEnter one to twenty skills with rating:");
        while (addSkills.equalsIgnoreCase("y")) {
            System.out.print("Skill " + skillNum + " > ");
            skills = keyboard.nextLine();

            person.setSkills(skills);
            
            System.out.print("Add more skills (\"y\" or \"n\")? ");
            addSkills = keyboard.nextLine();
            skillNum++;
        }

        System.out.println("\n\n");
        System.out.println(person);

        keyboard.close();
    }
}


/*
* Due at 4:59pm Friday. This is a solo project.


Robo Resume Assignment

Write a program that will allow a user to enter in:
- a name,
- an email address,
- anywhere from 1 to 10 educational achievements,
- anywhere from 0 to 10 work experiences,
- anywhere from 1 to 20 skills with rating

What's New?
The main method of the program should handle all user interaction.

The program must validate the user's data as it is inputted.
The data must be kept in a database or ArrayList.
The program must use classes and composition.




When the user is done entering the information, the program should output the information
to look something like the following:

=============================================================
John J Jingleheimer-Schmidt
jjjschmidt@gmail.com

Education
BS in Psychology,
UMaryland, 2002

MS in Software Engineering,
Johns Hopkins U, 2005

Experience
Software Developer II
Amtrak, June 2015 - Present
- Duty 1, Lorem ipsum
- Duty 2, Gaudeamos Igitur Iuvenes Dum Somos

Software Developer I
Amtrak, June 2014 - June 2015
- Duty 1, Lorem ipsum
- Duty 2, Gaudeamos Igitur Iuvenes Dum Somos

Business Analyst
DCPS, August 2005 - May 2014
- Duty 1, Lorem ipsum
- Duty 2, Gaudeamos Igitur Iuvenes Dum Somos

Skills
PHP, highly skilled
Ruby on Rails, proficient
Perl, familiar



Bonus:

Write to a file. See the repository for ArrayList of Books for how to write to a file.
* */