package creational.builder;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        //builder - wygodniejszy, elastyczniejszy sposób tworzenia obiektu
        //przy wielu polach lub opcjonalnych polach

        //lombok
     /*   Person personL = Person.builder()
                .phone(123)
                .mail("abc")
                .build();

        System.out.println(personL);*/


      /*  Person person = new Person("Anna Markowska",
                "a.markowska22",
                "Wojska Polskiego 2");*/
        //wykonaj polecenie z ar

        Person person = Person.builder()
                .bornIn(LocalDate.now().minusYears(18))
                .withFullName("Anna Markowska")
                .withMail("markowska123@gmail.com")
                .build();
        System.out.println(person);
        System.out.println(Person.buildDummyPerson());


    }
}
