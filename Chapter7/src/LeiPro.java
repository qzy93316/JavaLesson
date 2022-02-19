public class LeiPro {
    protected static class LeiMax{
        protected LeiMax(){}
        protected int a;
        protected void print(){
            System.out.println("a=" + a);
        }
    }


    public static void main(String[] args) {
        LeiMax a1 = new LeiMax();
        a1.a = 2019;
        a1.print();
        LeiMax a2 = new LeiMax();
        a2.a = 2020;
        a2.print();
    }
}
