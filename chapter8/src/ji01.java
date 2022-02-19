class Person {
    public void eat() {
        System.out.println("eat");
    }
    static void show(Person p) {
        p.eat();
    }
}
public class ji01 extends Person{
    public static void main(String[] args) {
        ji01 j1 = new ji01();
        Person.show(j1);
    }
}
