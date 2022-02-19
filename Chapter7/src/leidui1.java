public class leidui1 {
    int x = 12;
    int y = 23;
    public void printFoo() {
        System.out.println("x=" + x + ",y=" + y);
    }

    public static void main(String[] args) {
        leidui1 l1 = new leidui1();
        l1.x = 41;
        l1.y = 75;
        l1.printFoo();

        leidui1 l2 = new leidui1();
        l2.x = 23;
        l2.y = 38;
        l2.printFoo();
    }
}
