public class break2 {
    public static void main(String[] args) {
        int a = 0;
        while (a < 10) {
            if (a == 3) {
                break;
            }

            System.out.println("a=" + a);
            a++;
        }
    }
}
