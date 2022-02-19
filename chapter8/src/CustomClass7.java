public class CustomClass7 implements CustomerInterface7 {

    @Override
    public void method() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        CustomerInterface7 instance = new CustomClass7();
        instance.method();
    }
}

interface CustomerInterface7 {
    public abstract void method();
}
