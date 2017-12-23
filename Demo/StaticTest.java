class Super {
    static String greeting() {
        return "Hello";
    }

    String name() {
        return "Yix";
    }
}

class Sub extends Super {
    static String greeting() {
        return "Hi";
    }

    String name() {
        return "Neo";
    }
}

class StaticTest {
    public static void main(String[] args) {
        Super s = new Sub();
        System.out.println(s.greeting() + "," + s.name());
    }
}
// 实例方法被覆盖，静态方法被隐藏