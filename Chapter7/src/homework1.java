public class homework1 {
    public static int sumDig(long n){
      int num = (int)n;
      int sum = 0;
      while(num != 0){
            sum += num%10;
            num = num/10;
      }
      return sum;
    }

    public static void main(String[] args) {
        int a = sumDig(10235);
        System.out.println(a);
    }
}
