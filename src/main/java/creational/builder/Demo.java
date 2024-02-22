package creational.builder;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Test");
        Person person = Person.builder("Daniel Szlicht")
                .withMail("mail@gmail.com")
                .withPhone(123)
                .build();

        System.out.println(person);

        Person person2 = Person.createDummyPerson();

        /*Person person = new Person("Anna Markowska",
                "a.markowska22",
                "Wojska Polskiego 2");*/
        //wykonaj polecenie z ar

    }
}
