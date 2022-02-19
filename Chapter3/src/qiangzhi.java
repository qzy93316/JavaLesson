public class qiangzhi {
    public static void main(String[] args) {
        int x;
        double y;
        double z;
        double a = Double.POSITIVE_INFINITY;
        double b = Double.NEGATIVE_INFINITY;
        float c = Float.NaN;
        x = (int)34.56 + (int) 11.2;
        y = (double) x + (double) 10 + 1;
        z = x * y;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
