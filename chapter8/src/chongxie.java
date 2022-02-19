public class chongxie {
    void print() {
        System.out.println("父类的方法");
    }

    public static void main(String[] args) {
        chongxie one = new chongxieone();
        one.print();
    }
}

class chongxieone extends chongxie
{
    @Override
    void print() {
        System.out.println("子类，重写了父类的方法");
    }
}
