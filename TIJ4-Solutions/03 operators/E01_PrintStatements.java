//练习1：（1）使用“简短的”和正常的打印语句来编写一个程序。
import java.util.Date;
import static net.mindview.util.Print.*;

public class E01_PrintStatements {
    public static void main(String[] args) {
        Date currDate = new Date();
        System.out.println("Hello, it's: " + currDate);
        print("Hello, it's: " + currDate);
    }
}