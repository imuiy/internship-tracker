package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Internship {
    private String company;
    private String role;
    private LocalDate deadline;
    private String status; // Applied, Interview, Offer, Rejected
    private List<ApplicationUpdate> updates;

    public Internship(String company, String role, LocalDate deadline) {
        this.company = company;
        this.role = role;
        this.deadline = deadline;
        this.status = "Applied";
        this.updates = new ArrayList<>();
    }

    public void addUpdate(ApplicationUpdate update) {
        updates.add(update);
        if(update.getType() != null){
            switch(update.getType()){
                case "Offer": status = "Offer"; break;
                case "Interview": status = "Interview Scheduled"; break;
                case "Rejection": status = "Rejected"; break;
            }
        }
    }

    public String getCompany() { return company; }
    public String getRole() { return role; }
    public LocalDate getDeadline() { return deadline; }
    public String getStatus() { return status; }
    public List<ApplicationUpdate> getUpdates() { return updates; }
}
