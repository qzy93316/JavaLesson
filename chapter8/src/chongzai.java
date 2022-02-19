public class chongzai {
    int max(int a, int b) {
        System.out.println("调用的是int max(int a, int b方法)");
        return a > b ? a : b;
    }
    short max(short a, short b) {
        System.out.println("调用的是short max(short a, short b)方法");
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        chongzai cz = new chongzai();
        cz.max(3,5);
        short a = 4;
        short b = 7;
        cz.max(a,b);
    }
}
