package tracker;

import model.Internship;
import model.ApplicationUpdate;

import java.util.ArrayList;
import java.util.List;

public class InternshipManager {
    private List<Internship> internships;

    public InternshipManager() {
        this.internships = new ArrayList<>();
    }

    public void addInternship(Internship internship) {
        internships.add(internship);
    }

    public void processEmailUpdate(Internship internship, ApplicationUpdate update) {
        internship.addUpdate(update);
    }

    public List<Internship> getInternships() { return internships; }

    // Filtering examples
    public List<Internship> filterByStatus(String status) {
        List<Internship> results = new ArrayList<>();
        for(Internship i : internships) {
            if(i.getStatus().equalsIgnoreCase(status)) results.add(i);
        }
        return results;
    }
}
