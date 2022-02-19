public class homework2 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3},{4,5,6}};
        int columns = arr.length;
        int rows = arr[0].length;
        int[][] arr2 = new int[rows][columns];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                arr2[i][j] = arr[j][i];
                System.out.print(arr2[i][j] +"\t");
            }
            System.out.println();
        }
    }
}
