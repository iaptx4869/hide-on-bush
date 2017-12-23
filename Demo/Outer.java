//下面的代码哪些地方会产生编译错误？
class Outer {

    class Inner {
    }

    public static void foo() {
        new Inner();//new Outer().new Inner();
    }

    public void bar() {
        new Inner();
    }

    public static void main(String[] args) {
        new Inner();//new Outer().new Inner();
    }
}
/*
Java中非静态内部类对象的创建要依赖其外部类对象，上面的面试题中foo和main方法都是静态方法，静态方法中没有this，也就是说没有所谓的外部类对象，因此无法创建内部类对象，如果要在静态方法中创建内部类对象，可以这样做：
new Outer().new Inner();
*/