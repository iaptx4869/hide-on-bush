//练习2：（2）创建一个类，它包含一个在定义时就被初始化了的String域，以及另一个通过构造器初始化的String域。
public class E02_StringInitialization {
    String s1 = "Initialized at definition";
    String s2;

    public E02_StringInitialization(String s2i) {
        s2 = s2i;
    }

    public static void main(String args[]) {
        E02_StringInitialization si = new E02_StringInitialization("Initialized at construction");
        System.out.println("si.s1 = " + si.s1);
        System.out.println("si.s2 = " + si.s2);
    }
}