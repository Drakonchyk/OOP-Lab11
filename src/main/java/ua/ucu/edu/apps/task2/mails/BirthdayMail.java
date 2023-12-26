package ua.ucu.edu.apps.task2.mails;

import lombok.Getter;

@Getter
public class BirthdayMail implements MailCode
{
    private final String topic = "Birthday greetings";
    private final String mail = "Happy birthday to you!";
}