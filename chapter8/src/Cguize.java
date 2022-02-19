class aaa {
    String sname;
    int sid;
    int snumber;
    private void print() {
        System.out.println("公司名：" +sname+ " 序号：" + sid + " 公司人数：" + snumber);
    }
    aaa (String name, int id, int number){
        sname = name;
        sid = id;
        snumber = number;
    }
}

class CguizeOne extends aaa {
    String sadder;
    CguizeOne(String name, int id, int number,String address) {
        super(name, id, number);
        sadder = address;
    }
    private void print() {
        System.out.println("公司名：" +sname+ " 序号：" + sid + " 公司人数：" + snumber + "公司地址" + sadder);
    }
}

public class Cguize {
    public static void main(String[] args) {
        CguizeOne a1 = new CguizeOne("重庆金区公司",72221,7001,"渝南大道");
    }
}
