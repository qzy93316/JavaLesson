public class Homework {
    public static void main(String[] args) {
        // 统计出100以内可以被7整除的个数
        int count = 0;
        for (int i=1; i<=100; i++) {
            if (i%7 == 0) {
                System.out.println("i=" + i);
                count++;
            }
        }
        System.out.println("count=" + count);
    }
}
