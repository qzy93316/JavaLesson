/*
    构造器重构
 */
public class chong {
    public String name;
    public int count;
    public chong() {

    }
    public chong(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args) {
        chong c1 = new chong();
        chong c2 = new chong("Python书销量", 18000);
        System.out.println(c1.name + ":" + c1.count);
        System.out.println(c2.name + ":" + c2.count);
    }
}
