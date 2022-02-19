import java.util.Random;

public class shuzu02 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = new int[rd.nextInt(5)];
        // 随机产生0～4的数作为数组的长度
        System.out.println("arr的长度为：" + arr.length);
        for (int i=0; i<arr.length; i++) {
            arr[i] = rd.nextInt(5);
            System.out.println("arr[" + i +"]=" + arr[i]);
        }
    }
}
