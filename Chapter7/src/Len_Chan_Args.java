public class Len_Chan_Args {
    protected static class Chan_Args {
        public void chan_Args(String x,String y) {
            System.out.printf("字符串值是：%s %s\n",x,y);
        }

        public double max(double ... args) { // 在参数args前有3个点，这表示长度是可变的
            double largest = Double.MIN_VALUE;
            for (double x : args) {
                if (x > largest) largest = x;
            }
            return largest;
        }
    }

    public static void main(String[] args) {
        Chan_Args chang = new Chan_Args();
        chang.chan_Args("Tom","jack");
        System.out.printf("最大值是：%f",chang.max(1,2.5,3,4.1));
    }
}
