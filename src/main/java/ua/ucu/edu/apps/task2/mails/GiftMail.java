package ua.ucu.edu.apps.task2.mails;

import lombok.Getter;

@Getter
public class GiftMail implements MailCode
{
    private final String topic = "Christmas gift";
    private final String mail = "Santa brought you a gift, check under your Christmas tree!";
}