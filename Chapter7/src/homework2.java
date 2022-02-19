import java.util.Scanner;

public class homework2 {
    public static int getHuiWenNum(long n){
        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder(str);
        String huiWenStr = str + sb.reverse();
        return Integer.parseInt(huiWenStr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        long input = sc.nextLong();
        System.out.println("该整数的回文数为：" + getHuiWenNum(input));
    }
}
