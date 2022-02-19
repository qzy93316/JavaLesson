public class leijing1 {
    static int x;
    static int y;
    public void printJingTai() {
        System.out.println("x=" + x + ",y=" + y);
    }

    public static void main(String[] args) {
        leijing1 l1 = new leijing1();
        l1.x = 10;
        l1.y = 20;
        leijing1.x = 114;
        leijing1.y = 229;
        l1.printJingTai();

        leijing1 l2 = new leijing1();
        l2.x = 30;
        l2.y = 40;
//        leijing1.x = 335;
//        leijing1.y = 410;
        l2.printJingTai();
    }
}
