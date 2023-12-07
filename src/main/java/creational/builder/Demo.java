package creational.builder;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {

        Person person = Person.builder()
                .bornIn(LocalDate.of(1995, 10, 11))
                .withName("Anna")
                .withPhone(1232343456)
                .build();
        System.out.println(person);


       /* Person person = new Person("Anna Markowska",
                "a.markowska22",
                "Wojska Polskiego 2");*/


    }
}
