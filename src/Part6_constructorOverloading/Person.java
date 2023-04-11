package Part6_constructorOverloading;
public class Person {

    private String name;
    private String surname;
    private int birthYear;

    public static final int COMING_OF_AGE = 18;

    public Person() {

    }

    public Person(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void printPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Birth year: " + birthYear);
    }

    public boolean isAdult() {
        int age = 2023 - birthYear;
        return age >= COMING_OF_AGE;
    }

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Taylor");
        person1.setSurname("Swift");
        person1.setBirthYear(1989);
        System.out.println("Person 1 details:");
        person1.printPersonInfo();

        Person person2 = new Person("Karl", "Smith", 2007);
        System.out.println("Person 2 details:");
        person2.printPersonInfo();

        System.out.println(person1.getName() + " is an adult: " + person1.isAdult());
        System.out.println(person2.getName() + " is an adult: " + person2.isAdult());
    }
}