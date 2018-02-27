//练习6：（2）修改前两个程序中的两个test()方法，让它们接受两个额外的参数begin和end，这样在测试testval时将判断它是否在begin和end之间（包括begin和end）的范围内。
public class E06_RangeTest2 {
    static boolean test(int testval, int begin, int end) {
        if (testval >= begin && testval <= end)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(test(10, 5, 15));
        System.out.println(test(5, 10, 15));
        System.out.println(test(5, 5, 5));
    }
}