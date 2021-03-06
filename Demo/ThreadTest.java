class ThreadDemo extends Thread {
    private String name;

    public ThreadDemo(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行  :  " + i);
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadTest {
    public static void main(String[] args) {
        ThreadDemo mTh1 = new ThreadDemo("A");
        ThreadDemo mTh2 = new ThreadDemo("B");
        mTh1.start();
        mTh2.start();
    }
}