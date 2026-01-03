package ai;

import model.ApplicationUpdate;

public class AIProcessor {

    // This simulates AI classification & summarization
    public static void analyzeEmail(ApplicationUpdate update) {
        String subject = update.getEmailSubject().toLowerCase();

        if(subject.contains("interview")) {
            update.setType("Interview");
            update.setSummary("Virtual interview scheduled at " + subject);
            update.setAction("Prepare for interview; research company");
            update.setConfidence(0.95);
        } else if(subject.contains("offer")) {
            update.setType("Offer");
            update.setSummary("Offer received for internship");
            update.setAction("Review offer and respond");
            update.setConfidence(0.98);
        } else if(subject.contains("rejection")) {
            update.setType("Rejection");
            update.setSummary("Application rejected");
            update.setAction("No action required");
            update.setConfidence(0.99);
        } else {
            update.setType("General");
            update.setSummary("General internship update");
            update.setAction("Review if relevant");
            update.setConfidence(0.80);
        }
    }
}
