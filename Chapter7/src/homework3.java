import java.util.Scanner;

public class homework3 {
    public static int getReverseInt(long n){
        String num = n + "";
        StringBuilder sb = new StringBuilder(num);
        String str = sb.reverse().toString();

        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        long num = sc.nextLong();
        int reverseInt = getReverseInt(num);
        System.out.println("反向显示该整数：" + reverseInt);
    }
}
