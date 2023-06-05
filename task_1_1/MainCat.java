package Lesson_1;

public class MainCat {
    public static void main(String[] args) {
        Cat c1 = new Cat("Murzik", 2);
        Cat c2 = new Cat("Alisa", 7);
        
        c1.greet();
        c2.greet();

        Owner c3 = new Owner("Murzik", 2, "Alex");
        Owner c4 = new Owner("Alisa", 7, "Maxim");

        c3.ShowOwner();
        c4.ShowOwner();

        
        
    }
}        