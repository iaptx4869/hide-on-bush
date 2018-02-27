//练习5：（4）重复第3章中的练习10，不要用Integer.toBinaryString()方法，而是用三元操作符和按位操作符来显示二进制的1和0。
import static net.mindview.util.Print.*;

public class E05_BitwiseOperators2 {
    private static void toBinaryString(int i) {
        char[] buffer = new char[32];
        int bufferPosition = 32;
        do {
            buffer[--bufferPosition] = ((i & 0x01) != 0) ? '1' : '0';
            i >>>= 1;
        } while (i != 0);
        for (int j = bufferPosition; j < 32; j++)
            printnb(buffer[j]);
        print();
    }

    public static void main(String[] args) {
        int i1 = 0xaaaaaaaa;
        int i2 = 0x55555555;
        printnb("i1 = ");
        toBinaryString(i1);
        printnb("i2 = ");
        toBinaryString(i2);
        printnb("~i1 = ");
        toBinaryString(~i1);
        printnb("~i2 = ");
        toBinaryString(~i2);
        printnb("i1 & i1 = ");
        toBinaryString(i1 & i1);
        printnb("i1 | i1 = ");
        toBinaryString(i1 | i1);
        printnb("i1 ^ i1 = ");
        toBinaryString(i1 ^ i1);
        printnb("i1 & i2 = ");
        toBinaryString(i1 & i2);
        printnb("i1 | i2 = ");
        toBinaryString(i1 | i2);
        printnb("i1 ^ i2 = ");
        toBinaryString(i1 ^ i2);
    }
}