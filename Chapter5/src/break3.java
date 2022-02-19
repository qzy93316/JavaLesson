public class break3 {
    public static void main(String[] args) {
        out: for (int i=0; i<10 ;i++) {
            System.out.println("i=" + i);
            for (int j=0; j<10; j++) {
                if (j == 7) {
                    break out;
                }
                System.out.println("j=" + j);
            }
        }
    }
}
