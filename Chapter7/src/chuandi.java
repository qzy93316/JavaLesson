public class chuandi {
    public static void swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("在swap方法里，a的值是：" + a + ",b的值是：" + b);
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 9;
        swap(a,b);
        System.out.println("交换结束后，实参a的值是：" + a + ",实参b的值是：" + b);
    }
}
