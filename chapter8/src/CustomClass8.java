public class CustomClass8 implements CustomInterface8{
    @Override
    public void method1() {
        System.out.println("abstract method");
    }

    public static void main(String[] args) {
        CustomInterface8 instance = new CustomClass8();
        instance.method1();
        instance.method2();
        CustomInterface8.method3();
    }
}
interface CustomInterface8 {
    public abstract void method1();
    public default void method2(){
        System.out.println("default method");
//        method4();  private interface and private static interface is allowed in Java9
//        method5();  & could only be visited in this interface
    }
    public static void method3(){
        System.out.println("static method");
//        method5();
    }
//    private void method4(){
//        System.out.println("private method");
//    }
//    private static void method5(){
//        System.out.println("private static method");
//    }
}
