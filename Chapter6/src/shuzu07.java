import java.util.Arrays;

public class shuzu07 {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5,6,7,8,9,0};
        int[] a2 = new int[10];
        System.out.println(Arrays.equals(a1,a2));

        int[] arr = {1,4,6,333,8,2};
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++) {
            System.out.println("arr[" + i + "]= " +arr[i]);
        }
    }
}
