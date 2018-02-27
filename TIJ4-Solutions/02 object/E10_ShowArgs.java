//练习10：（2）编写一个程序，打印出从命令行获得的三个参数。为此，需要确认命令行数组中String的下标。
public class E10_ShowArgs {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}