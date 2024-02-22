package creational.builder;

import java.time.LocalDate;
import java.util.Objects;

 class Person {

    private String fullName;
    private LocalDate birthDate;
    private int phone;
    private String mail;
    private String address;


    private Person() {
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

     public static Builder builder(String fullName) {
         return new Builder()
                 .withFullName(fullName);
     }

     public static Person createDummyPerson() {
         return builder("Jan Kowalski")
                 .build();
     }

    static class Builder {

        private final Person person = new Person();

        private Builder() {
        }

        public Builder withFullName(String fullName) {
            person.fullName = fullName;
            return this;
        }

        public Builder withMail(String mail) {
            person.mail = mail;
            return this;
        }

        public Builder withPhone(int phone) {
            person.phone = phone;
            return this;
        }

        public Person build() {
            return person;
        }

    }


}
