interface ccc {
    int a = 100;
    int b = 200;
    int c = 300;
    int d = 400;
    int e = 500;
    void print();
    void print1();
}

class Jiedo implements ccc {

    @Override
    public void print() {
        System.out.println(a+b);
    }

    @Override
    public void print1() {
        System.out.println(c+d+e);
    }
}

public class Jie {
    public static void main(String[] args) {
        Jiedo jd = new Jiedo();
        jd.print();
        jd.print1();
    }
}
