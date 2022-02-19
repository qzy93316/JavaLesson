/**
 * 多重继承
 */
class Duolei {
    String bname;
    int bid;
    int bprice;
    Duolei() {
        bname = "羊肉串";
        bid = 14002;
        bprice = 45;
    }
    Duolei(Duolei a) {
        bname = a.bname;
        bid = a.bid;
        bprice = a.bprice;
    }
    Duolei(String name, int id, int price) {
        bname = name;
        bid = id;
        bprice = price;
    }
    void print() {
        System.out.println("小吃名：" + bname + "，序号：" + bid + "，价格：" + bprice);
    }
}

class Badder extends Duolei {
    String badder;
    Badder() {
        super();
        badder = "沙县小吃";
    }
    Badder(Badder b) {
        super(b);
        badder = b.badder;
    }
    Badder(String x, int y, int z, String a) {
        super(x,y,z);
        badder = a;
    }
}

class Factory extends Badder {
    String factory;
    Factory() {
        super();
        factory = "成都小吃";
    }
    Factory(Factory fc) {
        super(fc);
        factory = fc.factory;
    }
    Factory(String x, int y, int z, String a, String b) {
        super(x,y,z,a);
        factory = b;
    }
}

public class zero {
    public static void main(String[] args) {
        Factory a1 = new Factory();
        Factory a2 = new Factory("希望火腿",92099,25,"沙县蒸饺","金华小吃");
        Factory a3 = new Factory(a2);
        System.out.println(a1.badder);
        System.out.println(a1.factory);
        a1.print();
        System.out.println(a2.badder);
        System.out.println(a2.factory);
        a2.print();
        a3.print();
    }
}