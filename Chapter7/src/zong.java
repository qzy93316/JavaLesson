public class zong {
    public static void main(String[] args) {
        System.out.println("调用苹果类的harvest的方法的结果");
        pingguo pingguo = new pingguo();
        pingguo.harvest();

        System.out.println("用橘子类的harvest的方法的结果");
        juzi juzi = new juzi();
        juzi.harvest();
    }
}
