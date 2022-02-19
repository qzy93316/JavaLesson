public class person {
    int age;
    String name;
    void speak(){
        System.out.println("My name is " + name);
    }

    public static void main(String[] args) {
        person Tom = new person();
        Tom.age = 27;
        Tom.name = "TOM";
        Tom.speak();
    }
}
