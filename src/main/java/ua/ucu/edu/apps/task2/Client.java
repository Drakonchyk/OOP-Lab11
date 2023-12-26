package ua.ucu.edu.apps.task2;

import lombok.Getter;

@Getter
public class Client
{
    private final int id;
    private final String name;
    private final int age;
    private final Gender sex;
    private static int lastId = 0;

    public Client(String name, int age, Gender sex)
    {
        this.id = lastId++;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}