package creational.builder;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    private String fullName;
    private LocalDate birthDate;
    private int phone;
    private String mail;
    private String address;

    public Person(String fullName, String mail, String address) {
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
}
