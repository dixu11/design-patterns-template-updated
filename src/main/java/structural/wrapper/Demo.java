package structural.wrapper;

class Demo {
    public static void main(String[] args) {
        PersonImpl personImpl = new PersonImpl("Jan");
        Person personImplWrapper = new PersonImplWrapper(personImpl);
        System.out.println(personImplWrapper.getName()); //"Jan"
        Employee employee = new PersonToEmployeeAdapter(personImpl);
        System.out.println(employee.getFullName());
    }
}

interface Person {
    String getName();
}


interface Employee {
    String getFullName();
}

class PersonImpl implements Person {
    private String name;

    public PersonImpl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class PersonImplWrapper implements Person {

    private Person person;

    public PersonImplWrapper(Person person) {
        this.person = person;
    }

    @Override
    public String getName() {
        return person.getName();
    }
}


class PersonToEmployeeAdapter implements Employee{

    private Person person;

    public PersonToEmployeeAdapter(Person person) {
        this.person = person;
    }

    @Override
    public String getFullName() {
        return person.getName();
    }
}

