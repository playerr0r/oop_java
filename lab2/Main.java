public class Main {
    public static class Person {

        private int age;
        public String fullName;
        public Person() {

        }

        public Person(int age, String fullName) {
            this.age = age;
            this.fullName = fullName;
        }

        public void move() {
            System.out.println(this.fullName + " говорит");
        }

        public void talk() {
            System.out.println(this.fullName + " говорит");
        }


        public static void main(String[] args) {
            Person per1 = new Person();
            Person per2 = new Person(25, "Вася");
            per2.talk();
        }
    }
}
