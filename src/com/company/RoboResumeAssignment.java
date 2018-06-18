package com.company;

// Import necessary classes
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RoboResumeAssignment {

    public static void main(String[] args) {

        // Create Scanner class to read user input
        Scanner keyboard =  new Scanner(System.in);
        // Declare String variables that will contain resume information
        String name, email, degree, institution,
                title, organization, dates, duty, skills;
        // Declare String variables that will allow the user to add new information
        String addEducation = "y", addExperience,
                addDuties, addSkills = "y";
        /* Declare int variables that hold the graduation year, the skill number,
        * and the controls of how many education, experience, and skill
        * the user wants to add*/
        int gradYear, dutyNum, skillNum = 1, educationControl = 0,
                experienceControl = 0, skillsControl = 0;

        // Create Person object
        Person person = new Person();

        // Prompt the user for the name of the person the resume talks about
        // and receive the name
        System.out.println("Enter a name:");
        name = keyboard.nextLine();
        // Set the name of the person on the resume
        person.setName(name);

        // Prompt the user for the email address of
        // the person the resume talks about
        // and receive the email address
        System.out.println("\nEnter an email address:");
        email = keyboard.nextLine();
        // Set the email address of the person on the resume
        person.setEmailAddress(email);

        // Prompt the user for the education of the person
        // and receive the education
        System.out.println("\nEnter one to ten educational achievements:");
        // The user will be asked to enter education until the user decides not to
        while (addEducation.equalsIgnoreCase("y")) {
            // Prompt the user for the degree obtained and receive it
            System.out.print("Degree > "); degree = keyboard.nextLine();
            // Prompt the user for the institution's name and receive it
            System.out.print("Institution Name > "); institution = keyboard.nextLine();
            // Prompt the user for the graduation year and receive it
            System.out.print("Graduation Year > "); gradYear = keyboard.nextInt();
            keyboard.nextLine();

            // Add education to the person's resume
            person.setEducation(degree, institution, gradYear);
            // Increase number of education info entered
            educationControl++;

            // Stop adding more education if the user has entered ten institutions
            if (educationControl == 10) {
                break;
            }
            // Ask the user whether he/she wants to continue adding education
            // and receive the answer
            System.out.print("Add more education (\"y\" or \"n\")? ");
            addEducation = keyboard.nextLine();
        }

        // Prompt the user for the work experience of the person
        // and receive the work experience
        System.out.println("\nEnter zero to ten work experiences:");
        System.out.print("Add experiences (\"y\" or \"n\")? ");
        addExperience = keyboard.nextLine();

        // If the user does not enter any work experience,
        // pass these values to the setWorkExperience method
        if (addExperience.equalsIgnoreCase("n")) {
            person.setWorkExperience("No experience", null,
                    null, null);
        }

        // The user will be asked to enter work experience until the user decides not to
        while (addExperience.equalsIgnoreCase("y")) {
            // Prompt the user for the title and receive it
            System.out.print("Title > "); title = keyboard.nextLine();
            // Prompt the user for the organization obtained and receive it
            System.out.print("Organization Name > "); organization = keyboard.nextLine();
            // Prompt the user for the dates attended and receive it
            System.out.println("Dates Attended (Month Year -  Month Year format) > ");
            dates = keyboard.nextLine();

            // Set addDuties equals to "y" and dutyNum to 1
            addDuties = "y"; dutyNum = 1;
            // Create a StringBuilder object to build a more readable view of duties
            StringBuilder duties = new StringBuilder();
            while (addDuties.equalsIgnoreCase("y")) {

                // Prompt user to enter duty and receive it
                System.out.println("Duty " + dutyNum  + " > ");
                duty = keyboard.nextLine();
                // Append duty to the StringBuilder object
                duties.append("- Duty " + dutyNum + ", " + duty + "\n");
                // Increase duty number
                dutyNum++;

                // Ask the user if he/she wants to add more duties and receive the answer
                System.out.print("Add more duties (\"y\" or \"n\")? ");
                addDuties = keyboard.nextLine();
            }

            // Add work experience to the person's resume
            person.setWorkExperience(title, organization, dates, duties.toString());
            // Increase number of work experiences info entered
            experienceControl++;

            // Stop adding more work experience if there are 10 work experiences entered
            if (experienceControl == 10) {
                break;
            }

            // Ask the user if he/she wants to add more work experiences and receive the answer
            System.out.print("Add more experiences (\"y\" or \"n\")? ");
            addExperience = keyboard.nextLine();
        }

        // Prompt the user for the skills of the person
        // and receive the skills
        System.out.println("\nEnter one to twenty skills with rating:");
        // The user will be asked to enter skills until the user decides not to
        while (addSkills.equalsIgnoreCase("y")) {
            // Prompt the user to enter skill and receive it
            System.out.print("Skill " + skillNum + " > ");
            skills = keyboard.nextLine();

            // Add skills to the person's resume
            person.setSkills(skills);
            // Increase number of skills info entered
            skillsControl++;

            // Stop adding more skills if there are 20 skills entered
            if (skillsControl == 20) {
                break;
            }

            // Ask the user if he/she wants to add more skills and receive the answer
            System.out.print("Add more skills (\"y\" or \"n\")? ");
            addSkills = keyboard.nextLine();
            // Increase skill number
            skillNum++;
        }

        System.out.println("\n=============================================================");
        // Display the person's resume
        System.out.println(person);

        try {
            // Create PrintWriter object to write to a file
            PrintWriter writeOnFile = new PrintWriter("resume.txt");
            // Write content in myMap to the resume.txt file using an enhanced for loop
            writeOnFile.println(person);
            // Close PrintWriter object to stop writing to resume.txt
            writeOnFile.close();

            // Let the usr know the resume was successfully written on a file
            System.out.println("Resume successfully written on file");

        } catch (FileNotFoundException e) {
            // If the file does not exist, display a message to let the user know about it
            System.out.println("File not found...");
        }

        // Close Scanner object to stop receiving user input
        keyboard.close();
    }
}