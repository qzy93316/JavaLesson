public class chuyin {
    public String name;
    public int count;
    // 提供自定义的构造器，该构造器包含两个参数
    public chuyin(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args) {
        chuyin cy = new chuyin("Java书销量",70000);
        System.out.println(cy.name);
        System.out.println(cy.count + "册");
    }
}
