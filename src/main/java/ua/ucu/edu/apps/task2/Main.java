package ua.ucu.edu.apps.task2;
import ua.ucu.edu.apps.task2.mails.*;


public class Main
{
    public static void main(String[] args)
    {
        MailBox mailBox = new MailBox();

        Client client = new Client("Anastasiia", 18, Gender.FEMALE);
        Client client0 = new Client("Liza", 20, Gender.FEMALE);

        MailInfo mailInfoBirthday = new MailInfo(client, new BirthdayMail());
        MailInfo mailInfoGift = new MailInfo(client, new GiftMail());

        MailInfo mailInfoBirthday0 = new MailInfo(client0, new BirthdayMail());
        MailInfo mailInfoGift0 = new MailInfo(client0, new GiftMail());

        System.out.println("First pack:\n");
        mailBox.addMailInfo(mailInfoBirthday);
        mailBox.addMailInfo(mailInfoBirthday0);
        mailBox.sendAll();

        System.out.println("Second pack:\n");
        mailBox.addMailInfo(mailInfoGift);
        mailBox.addMailInfo(mailInfoGift0);
        mailBox.sendAll();

    }
}