//练习6：（2）编写一个程序，让它含有本章所定义的storage()方法的代码段，并调用之。
public class E06_Storage {
    String s = "Hello, World!";

    int storage(String s) {
        return s.length() * 2;
    }

    void print() {
        System.out.println("storage(s) = " + storage(s));
    }

    public static void main(String[] args) {
        E06_Storage st = new E06_Storage();
        st.print();
    }
}