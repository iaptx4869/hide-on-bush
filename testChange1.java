class testChange1 {
    static void changeValue(int x) {
        x = x * 2;
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println(num);
        changeValue(num);
        System.out.println(num);
    }
}