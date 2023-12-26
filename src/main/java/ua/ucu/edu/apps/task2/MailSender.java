package ua.ucu.edu.apps.task2;

public class MailSender
{
    public void sendMail(MailInfo mailInfo)
    {
        System.out.println("User " + mailInfo.getClient().getId() +
                " sent a message:\nTopic:\n" +
                mailInfo.getMailCode().getTopic() + "\n" +
                "Text:\n" + mailInfo.getMailCode().getMail() + "\n");
    }
}