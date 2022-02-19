public class shuzu06 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{10,9,8,7,6,5,4,3,2,1};
        int[] arr2 = new int[arr1.length];
        System.arraycopy(arr1,0,arr2,0,arr2.length);
        for (int i=0; i<arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

}
