package ua.ucu.edu.apps.task2;

import lombok.Getter;
import ua.ucu.edu.apps.task2.mails.MailCode;

@Getter
public class MailInfo {
    private final Client client;
    private final MailCode mailCode;

    public MailInfo(Client client, MailCode mailCode) {
        this.client = client;
        this.mailCode = mailCode;
    }
}
