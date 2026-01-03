package model;

import java.time.LocalDate;

public class ApplicationUpdate {
    private LocalDate date;
    private String emailSubject;
    private String emailSender;
    private String type; // Interview, Offer, Rejection, Reminder, General
    private String summary; // AI-generated
    private String action; // AI suggestion
    private double confidence; // optional AI confidence score

    public ApplicationUpdate(LocalDate date, String subject, String sender) {
        this.date = date;
        this.emailSubject = subject;
        this.emailSender = sender;
    }

    // Getters and setters
    public void setType(String type) { this.type = type; }
    public void setSummary(String summary) { this.summary = summary; }
    public void setAction(String action) { this.action = action; }
    public void setConfidence(double confidence) { this.confidence = confidence; }

    public String getType() { return type; }
    public String getSummary() { return summary; }
    public String getAction() { return action; }
}
