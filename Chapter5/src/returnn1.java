public class returnn1 {
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            System.out.println("i="+i);
            if (i == 4) return;
        }
    }
}
