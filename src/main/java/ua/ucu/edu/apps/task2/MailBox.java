package ua.ucu.edu.apps.task2;

import java.util.ArrayList;
import java.util.List;

public class MailBox
{
    private List<MailInfo> info = new ArrayList<>();
    private final MailSender mailSender = new MailSender();

    public void addMailInfo(MailInfo mailInfo) { info.add(mailInfo); }

    public void sendAll()
    {
        for(MailInfo mailInfo : info) { mailSender.sendMail(mailInfo); }
        info = new ArrayList<>();
    }
}