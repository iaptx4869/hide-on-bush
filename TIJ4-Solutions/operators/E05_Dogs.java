//练习5：（2）创建一个名为Dog的类，它包含两个String域：name和says。在main()方法中，创建两个Dog对象，一个名为spot（它的叫声为“Ruff！”），另一个名为scruffy（它的叫声为“Wurf！”）。然后显示它们的名字和叫声。
class Dog {
    String name;
    String says;
}

public class E05_Dogs {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name = "spot";
        dog1.says = "ruff!";
        dog2.name = "scruffy";
        dog2.says = "wurf!";
        System.out.println(dog1.name + " says " + dog1.says);
        System.out.println(dog2.name + " says " + dog2.says);
    }
}