import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        // 统计1到某个整数的奇数和
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于1的正整数");
        int num = sc.nextInt();
        int count = 0;
        if (num > 1) {
            for (int i=0; i<=num; i++) {
                if (i%2 != 0) {
                    System.out.println("i=" + i);
                    count += i;
                }
            }
            System.out.println("count=" + count);
        }
    }
}
