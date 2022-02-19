interface newjie {
    void print();
    public void print1();
    abstract void print2();
    public abstract void print3();
    abstract public void print4();
}

class newjie1 implements newjie{

    @Override
    public void print() {
        System.out.println("newjie接口里第一个方法没有修饰符");
    }

    @Override
    public void print1() {
        System.out.println("newjie接口里第二个方法有public修饰符");
    }

    @Override
    public void print2() {
        System.out.println("newjie接口里第三年个方法有abstract修饰符");
    }

    @Override
    public void print3() {
        System.out.println("newjie接口里第四个方法有public abstract修饰符");
    }

    @Override
    public void print4() {
        System.out.println("newjie接口里第五个方法有abstract public修饰符");
    }
}
public class cuofang {
    public static void main(String[] args) {
        newjie1 nj = new newjie1();
        nj.print();
        nj.print1();
        nj.print2();
        nj.print3();
        nj.print4();
    }
}
