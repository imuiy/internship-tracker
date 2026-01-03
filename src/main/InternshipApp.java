package main;

import tracker.InternshipManager;
import model.Internship;
import model.ApplicationUpdate;
import email.EmailFetcher;
import ai.AIProcessor;

import java.time.LocalDate;
import java.util.List;

public class InternshipApp {

    public static void main(String[] args) {
        InternshipManager manager = new InternshipManager();

        // Add some internships
        Internship xyz = new Internship("XYZ Corp", "Software Intern", LocalDate.of(2026,1,12));
        Internship abc = new Internship("ABC Corp", "Data Science Intern", LocalDate.of(2026,2,1));

        manager.addInternship(xyz);
        manager.addInternship(abc);

        // Fetch emails
        List<ApplicationUpdate> emails = EmailFetcher.fetchEmails();

        // Process emails and AI analysis
        for(ApplicationUpdate email : emails) {
            AIProcessor.analyzeEmail(email);

            // Determine which internship it belongs to (simplified matching by company in subject)
            for(Internship i : manager.getInternships()) {
                if(email.getEmailSubject().toLowerCase().contains(i.getCompany().toLowerCase())) {
                    manager.processEmailUpdate(i, email);
                }
            }
        }

        // Display results
        for(Internship i : manager.getInternships()) {
            System.out.println("Company: " + i.getCompany() + " | Role: " + i.getRole() + " | Status: " + i.getStatus());
            for(ApplicationUpdate update : i.getUpdates()) {
                System.out.println("  - [" + update.getType() + "] " + update.getSummary() + " | Action: " + update.getAction());
            }
        }
    }
}
