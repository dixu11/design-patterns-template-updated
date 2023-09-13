package creational.builder;

import lombok.Builder;

import java.time.LocalDate;
import java.util.Objects;

//@Builder
public class Person {

    private String fullName;
    private LocalDate birthDate;
    private int phone;
    private String mail;
    private String address;


    private Person() { // sabotuje lomboka!

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return fullName.equals(person.fullName) &&
                mail.equals(person.mail) &&
                address.equals(person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, mail, address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", birthDate=" + birthDate +
                ", tel=" + phone +
                ", mail='" + mail + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static PersonBuilder builder(){
        return new PersonBuilder();
    }

    public static Person buildDummyPerson() {
        return builder()
                .bornIn(LocalDate.now().minusYears(18))
                .withFullName("Anna Markowska")
                .withMail("markowska123@gmail.com")
                .build();
    }


    //1. wewnetrzna klasa - dostęp do prywatnych pól
    //2. statyczna bo chcemy zrobić jej obiekt bez tworzenia obiektu klasy zewnętrznej (Person)
    public static class PersonBuilder{
        //3. wytwarza obiekt Person
        private Person person = new Person();

        //4. metody uzupełniające dane

        public PersonBuilder withFullName(String fullName) {
            person.fullName = fullName;
            return this;
        }

        public PersonBuilder bornIn(LocalDate birthDate) {
            person.birthDate = birthDate;
            return this;
        }

        public PersonBuilder withMail(String mail) {
            person.mail = mail;
            return this;
        }

        public Person build() {
            return person;
        }

    }


}
