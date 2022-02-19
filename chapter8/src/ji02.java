public class ji02 extends Ren{
    /*
    在子类中调用父类的构造方法
     */
    ji02() {
        super();
        prt("A chinese");
    }
    ji02(String name) {
        super(name);
        prt("his name is:" + name);
    }
    ji02(String name, int age){
        this(name);
        prt("his age is:" + age);
    }
    public static void main(String[] args) {
        ji02 p = new ji02();
        p = new ji02("kevin");
        p = new ji02("kevin",22);
    }
}

class Ren {
    public static void prt(String s) {
        System.out.println(s);
    }
    Ren() {
        prt("A Person.");
    }
    Ren(String name) {
        prt("A person name is:" + name);
    }
}
