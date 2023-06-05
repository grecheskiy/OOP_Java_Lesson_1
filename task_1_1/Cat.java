package Lesson_1;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void greet() {     
            System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет).");
        }
    
        void setName(String name){
            this.name = name;
        }
    
        void setAge(Integer age){
            this.age = age;
        }
    
        String getName(){
            return name;
        }
    
        Integer getAge(){
            return age;
        }
}