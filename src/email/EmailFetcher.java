package email;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import java.util.ArrayList;
import java.util.List;
import model.ApplicationUpdate;
import java.time.LocalDate;

public class EmailFetcher {

    // For demo purposes, returns mock emails
    public static List<ApplicationUpdate> fetchEmails() {
        List<ApplicationUpdate> emails = new ArrayList<>();
        // Replace with real IMAP / Gmail API fetching logic
        emails.add(new ApplicationUpdate(LocalDate.now(),
                "XYZ Corp Interview Invitation",
                "hr@xyzcorp.com"));
        emails.add(new ApplicationUpdate(LocalDate.now(),
                "ABC Corp Rejection",
                "hr@abccorp.com"));
        return emails;
    }
}
