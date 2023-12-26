package ua.ucu.edu.apps.task1;

import lombok.AllArgsConstructor;
import lombok.Singular;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@AllArgsConstructor @SuperBuilder @ToString @Getter @Setter
public class User {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
    @Singular("course")
    private List<String> course;
}