package creational.builder;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    private String fullName;
    private LocalDate birthDate;
    private int phone;
    private String mail;
    private String address;
    //private PersonBuilder personBuilder = new PersonBuilder();

    private Person() {

    }

    public static PersonBuilder builder(){
        return new PersonBuilder();
    }

    public static Person createDefaultPerson() {
        return builder()
                .withName("Jan Kowalski")
                .build();
    }

    /*public Person(String fullName, String mail, String address) {
        this.fullName = fullName;
        this.mail = mail;
        this.address = address;
    }

    public Person(String fullName, LocalDate birthDate, int phone, String mail, String address) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.mail = mail;
        this.address = address;
    }

    public Person(String fullName, LocalDate birthDate, String mail, String address) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.mail = mail;
        this.address = address;
    }

    public Person(String fullName, int phone, String mail, String address) {
        this.fullName = fullName;
        this.phone = phone;
        this.mail = mail;
        this.address = address;
    }
*/

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

   static public class PersonBuilder{ // static - wyłączy konieczność wiązania PersonBuildera z konkretnym już istniejącym Person

       private Person person = new Person();

        public PersonBuilder() {
        }

       public PersonBuilder withName(String name) {
           person.fullName = name;
           return this;
       }

       public PersonBuilder bornIn(LocalDate birthDate) {
           person.birthDate = birthDate;
           return this;
       }

       public PersonBuilder withPhone(int phone) {
           person.phone = phone;
           return this;
       }

       public Person build() {
           return person;
       }

    }

}
