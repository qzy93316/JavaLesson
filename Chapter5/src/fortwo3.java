public class fortwo3 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int a = 0;
        while(a <= 10) {
            System.out.println("a=" + a);
            a++;
        }

        int sum=0;
        int i =0;
        while(sum <=30) {
            i++;
            sum+=i;
            if (sum > 30) {
                break;
            }
            System.out.println("当前i为:" + i);

        }
    }


}
