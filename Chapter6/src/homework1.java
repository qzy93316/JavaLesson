public class homework1 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};

        String[] arr2 = new String[]{"a","b","c"};

        double[] arr3 = new double[3];
        for (int i=0; i<arr3.length; i++) {
            arr3[i] = i;
        }
        for(double d : arr3) {
            System.out.println(d);
        }

        int[][] arr4 = new int[][]{{2,3},{4,5}};
    }
}
