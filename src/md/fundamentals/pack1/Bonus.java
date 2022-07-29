package md.fundamentals.pack1;

public class Bonus {
    private int age;
    private String name;

    public void setAge(int ageV) {
        age = ageV;
    }

    public void setName(String nameV) {
        name = nameV;
    }

    public void value(){
        System.out.println("--------Bonus class----------");
        System.out.println("Age : "+age);
        System.out.println("Name "+name);
    }
}
