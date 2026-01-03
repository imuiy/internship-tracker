package email;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

import model.ApplicationUpdate;

public class EmailFetcher {
    public static List<ApplicationUpdate> fetchEmails() {
        List<ApplicationUpdate> emails = new ArrayList<>();
        emails.add(new ApplicationUpdate(LocalDate.now(),
                "XYZ Corp Interview Invitation",
                "hr@xyzcorp.com"));
        emails.add(new ApplicationUpdate(LocalDate.now(),
                "ABC Corp Rejection",
                "hr@abccorp.com"));
        return emails;
    }
}
