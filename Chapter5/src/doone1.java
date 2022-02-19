public class doone1 {
    public static void main(String[] args) {
        int x = 0;
        do {
            System.out.println("x=" + x);
            x++;
        }while (x<5);

        int i = 1;
        int sum = 0;
        do {
            sum += i;
            i++;
        }
        while (i <= 100);
        System.out.println(sum);
    }


}
