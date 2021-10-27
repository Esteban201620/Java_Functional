package imperative;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person(name: "John", Gender.MALE),
            new Person(name: "Maria", Gender.FEMALE),
            new Person(name: "Aisha", Gender.MALE),
            new Person(name: "Alex", Gender.MALE),
            new Person(name: "Alice", Gender.FEMALE),
        );

        // Imperative approach
        List<Person> females = List.of();

        for (Person person : people){
            if (Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }
    }

    static class Person {
        private final String name;
        private final Gender gender;


        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender {
        MALE, FEMALE
    }
}
