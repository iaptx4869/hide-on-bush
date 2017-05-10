abstract class Animal {
    abstract void cry();
}

class Cat extends Animal {

    @Override
    void cry() {
        System.out.println("喵...");
    }
}

class Dog extends Animal {

    @Override
    void cry() {
        System.out.println("汪...");
    }

}

class testAbstract {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        Animal a2 = new Dog();

        a1.cry();
        a2.cry();
    }
}