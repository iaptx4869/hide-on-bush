class Person {
    public static String name = "Neo";

}

class ChangeTest2 {
    public static void changeName(Person p) {
        p.name = "Yix";
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        changeName(person);
        System.out.println(person.name);
    }
}