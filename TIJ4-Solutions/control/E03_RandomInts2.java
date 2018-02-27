//练习3：（1）修改练习2，把代码用一个while无限循环包括起来。然后运行它直至用键盘中断其运行（通常是通过按Ctrl-C）。
public class E03_RandomInts2 {
    public static void main(String[] args) {
        while (true)
            E02_RandomInts.compareRand();
    }
}