public class LeiPub {
    private String uname;
    private int uid;
    public String getUname(){
        return uname;
    }
    public int getUid(){
        return uid;
    }
    public LeiPub(String uname, int uid){
        this.uname = uname;
        this.uid = uid;
    }

    public static void main(String[] args) {
        LeiPub PrivateUser1 = new LeiPub("Java同学",2019);
        LeiPub PrivateUser2 = new LeiPub("Python同学", 2018);
        String p1uname = PrivateUser1.getUname();
        int p1uid = PrivateUser1.getUid();
        String p2name = PrivateUser2.getUname();
        int p2uid = PrivateUser2.getUid();
        System.out.println("p1的姓名：" + p1uname + ",uid：" + p1uid);
        System.out.println("p2的姓名：" + p2name + ",uid：" + p2uid);
    }
}
