/*
    调用父类中的构造器
 */
class Base {
    public double size;
    public String name;
    public Base(double size, String name) {
        this.size = size;
        this.name = name;
    }
}
public class fugou extends Base {
    public String color;
    public fugou(double size, String name, String color) {
        super(size, name);
        this.color = color;
    }

    public static void main(String[] args) {
        fugou fg = new fugou(100.1, "测试", "红色");
        System.out.println(fg.size + "--" + fg.name + "--" + fg.color);
    }
}
