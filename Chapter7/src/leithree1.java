public class leithree1 {
    public String color = "粉红";
    public void hu(){
        String color = "咖啡";
        System.out.println("她的外套是" + color + "色的");
        System.out.println("她的外套是" + this.color + "色的");
    }

    public static void main(String[] args) {
        leithree1 bb = new leithree1();
        bb.hu();
    }
}
