//练习10：（5）吸血鬼数字是指位数为偶数的数字，可以由一对数字相乘而得到，而这对数字各包含成绩的一半位数的数字，其中从最初的数字中选取的数字可以任意排序。已两个0结尾的数字是不允许的，例如，下列数字都是“吸血鬼”数字：
//1260=21*60
//1827=21*87
//2187=27*81
//写一个程序，找出四位数的所有吸血鬼数字。
public class E10_Vampire {
    public static void main(String[] args) {
        int[] startDigit = new int[4];
        int[] productDigit = new int[4];
        for (int num1 = 10; num1 <= 99; num1++)
            for (int num2 = num1; num2 <= 99; num2++) {
                // Pete Hartley's theoretical result:
                // If x·y is a vampire number then
                // x·y == x+y (mod 9)
                if ((num1 * num2) % 9 != (num1 + num2) % 9)
                    continue;
                int product = num1 * num2;
                startDigit[0] = num1 / 10;
                startDigit[1] = num1 % 10;
                startDigit[2] = num2 / 10;
                startDigit[3] = num2 % 10;
                productDigit[0] = product / 1000;
                productDigit[1] = (product % 1000) / 100;
                productDigit[2] = product % 1000 % 100 / 10;
                productDigit[3] = product % 1000 % 100 % 10;
                int count = 0;
                for (int x = 0; x < 4; x++)
                    for (int y = 0; y < 4; y++) {
                        if (productDigit[x] == startDigit[y]) {
                            count++;
                            productDigit[x] = -1;
                            startDigit[y] = -2;
                            if (count == 4)
                                System.out.println(num1 + " * " + num2 + " : " + product);
                        }
                    }
            }
    }
}