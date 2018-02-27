//练习9：（4）一个斐波那契数列是由数字1、1、2、3、5、8、13、21、34等等组成的，其中每一个数字（从第三个数字起）都是前两个数字的和。创建一个方法，接受一个整数参数，并显示从第一个元素开始总共由该参数指定的个数所构成的所有斐波那契数字。例如，如果运行java Fibonacci 5（其中fibonacci是类名），那么输出就应该是1、1、2、3、5.
public class E09_Fibonacci {
    static int fib(int n) {
        if (n <= 2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        // Get the max value from the command line:
        int n = Integer.parseInt(args[0]);
        if (n < 0) {
            System.out.println("Cannot use negative numbers");
            return;
        }
        for (int i = 1; i <= n; i++)
            System.out.print(fib(i) + ", ");
    }
}