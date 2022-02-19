import java.text.DecimalFormat;

public class Homework2 {
    public static void main(String[] args) {
        // 计算半径为5.8的圆的面积和周长
        double r = 5.8;
        double s = Math.PI * Math.pow(r, 2.0);
        double c = 2 * Math.PI * r;
        DecimalFormat df = new DecimalFormat("#.0000");
        String s2 = df.format(s);
        String c2 = df.format(c);
        System.out.println("圆的面积为:" + s2);
        System.out.println("圆的周长为:" + c2);

    }
}
