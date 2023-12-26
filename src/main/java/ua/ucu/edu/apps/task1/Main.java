package ua.ucu.edu.apps.task1;

public class Main {
    public static void main(String[] args) {
        User user1 = User
                .builder()
                .name("Anastasiia")
                .age(18)
                .gender(Gender.FEMALE)
                .height(167)
                .course("CS")
                .build();

        System.out.println(user1);

        User user2 = User
                .builder()
                .name("Liza")
                .age(20)
                .gender(Gender.FEMALE)
                .height(164)
                .course("SE")
                .build();

        System.out.println(user2);

    }
}