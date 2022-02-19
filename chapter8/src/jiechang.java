interface bbb {
    int a=100;
    int b=200;
    int c=323;
    int d=234;
    int e=523;
    void print();
    void print1();
}

class JieDo implements bbb {

    @Override
    public void print() {
        System.out.println(a+b);
    }

    @Override
    public void print1() {
        System.out.println(c+d+e);
    }
}

public class jiechang
{
    public static void main(String[] args) {
        JieDo jd = new JieDo();
        jd.print();
        jd.print1();
    }
}
