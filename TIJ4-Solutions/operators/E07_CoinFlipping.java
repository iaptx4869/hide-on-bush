//练习7：（3）编写一个程序，模拟扔硬币的结果。
import java.util.Random;

public class E07_CoinFlipping {
    public static void main(String[] args) {
        Random rand = new Random(47);
        boolean flip = rand.nextBoolean();
        System.out.print("OUTCOME: ");
        System.out.println(flip ? "HEAD" : "TAIL");
    }
}