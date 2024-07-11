package DAY1;

public class NonPrimitive {
    public static void main(String[] args) {
        Person per1 = new Person("John Snow", 25);
        Person per2 = new Person("Samwell Tarly", 20);
        System.out.println("Objects ");
        per1.getName();
        per2.getName();
        per1.getAge();
        per1.getAge();

        // arrays
        int[] ages = { 10, 20, 30, 40 };
        System.err.println("Arrays");
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }

    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void getName() {
            System.out.println(name);
        }

        public void getAge() {
            System.out.println(age);
        }
    }
}
