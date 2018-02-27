//练习7：（1）修改本章练习1，通过使用break关键词，使得程序在打印到99时退出。然后尝试使用return来达到相同的目的。
public class E07_To98 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 99)
                break;
            System.out.print(i + " ");
        }
    }
}