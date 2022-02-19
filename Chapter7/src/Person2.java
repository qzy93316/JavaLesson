public class Person2 {
    public String name;
    public int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person2 p = new Person2("小明",12);
        System.out.println(p.name);
        System.out.println(p.age);
    }
}
