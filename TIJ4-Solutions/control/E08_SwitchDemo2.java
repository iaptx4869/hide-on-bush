//练习8：（2）写一个switch开关语句，为每个case打印一个消息。然后把这个switch放进for循环来测试每个case。先让每个case后面都有break，测试一下会怎样；然后把break删了，看看会怎样。
public class E08_SwitchDemo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++)
            switch (i) {
            case 1:
                System.out.println("case 1");
            case 2:
                System.out.println("case 2");
            case 3:
                System.out.println("case 3");
            case 4:
                System.out.println("case 4");
            case 5:
                System.out.println("case 5");
            default:
                System.out.println("default");
            }
    }
}