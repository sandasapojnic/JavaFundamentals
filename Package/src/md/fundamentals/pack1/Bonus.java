package md.fundamentals.pack1;

public class Bonus {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void value(){
        System.out.println("--------Bonus class----------");
        System.out.println("Age : "+age);
        System.out.println("Name "+name);
    }
}
