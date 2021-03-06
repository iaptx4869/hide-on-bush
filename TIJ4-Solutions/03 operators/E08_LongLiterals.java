//练习8：（2）展示用十六进制和八进制计数法来操作long值，用Long.toBinaryString()来显示结果。
import static net.mindview.util.Print.*;

public class E08_LongLiterals {
    public static void main(String[] args) {
        long l1 = 0x2f; // Hexadecimal (lowercase)
        print("l1: " + Long.toBinaryString(l1));
        long l2 = 0X2F; // Hexadecimal (uppercase)
        print("l2: " + Long.toBinaryString(l2));
        long l3 = 0177; // Octal (leading zero)
        print("l3: " + Long.toBinaryString(l3));
    }
}