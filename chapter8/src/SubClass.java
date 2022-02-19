/**
 * 用子类访问父类的属性
 */
class BaseClass {
    public int a = 5;
}

public class SubClass extends BaseClass{
    public int a = 7;
    public void accessOwner() {
        System.out.println(this.a);
    }
    public void accessBase() {
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        SubClass sc = new SubClass();
        System.out.println(sc.a);
        sc.a = 8;
        sc.accessOwner();
        sc.accessBase();
    }
}
