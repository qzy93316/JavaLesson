public class IfDuo {
    public static void main(String[] args) {
        int score = 580;
        if (score > 610)
            System.out.println("一本");
        else if (score > 570)
            System.out.println("二本");
        else if (score > 450)
            System.out.println("三本");
        else if (score > 390)
            System.out.println("专科");
        else
            System.out.println("落榜");
        System.out.println("检查完毕");
    }
}
