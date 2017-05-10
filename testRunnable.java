class RunnableDemo implements Runnable {
    private String name;

    public RunnableDemo(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行  :  " + i);
            try {
                Thread.sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}

class testRunnable {

    public static void main(String[] args) {
        new Thread(new RunnableDemo("C")).start();
        new Thread(new RunnableDemo("D")).start();
    }

}