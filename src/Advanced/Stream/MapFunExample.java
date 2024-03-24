package Advanced.Stream;

import java.util.stream.Stream;

public class MapFunExample {
    static class Person{
        private int age;
        private String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Stream<Person> personStream = Stream.of(
                new Person(20,"munna"),
                new Person(14,"shohan"),
                new Person(22,"rakib"),
                new Person(23,"rahim"),
                new Person(24,"rafi")
        );
        personStream.filter(MapFunExample::isOlderThan15)
                .map(Person::getName)
                .forEach(System.out::println);
    }

    public static boolean isOlderThan15(Person person){
        return 15<person.getAge();
    }
}
