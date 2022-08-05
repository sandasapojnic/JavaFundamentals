package md.fundamentals.overloadconstructor;

public class Student1 {
    private long id;
    private String name;
    private int age;

    public Student1(long id,int age){
        this.id=id;
        this.age=age;
    }
    public Student1(String name){
      this.name=name;
    }
    public Student1(long id){
        this.id=id;
    }
    public Student1(long id, int age,String name){
        this(id,age);
        this.name=name;
    }
    public Student1(String name,long id, int age){
        this(name);
        this.id=id;
        this.age=age;
    }
    public Student1(long id,String name, int age){
        this(id);
        this.name=name;
        this.age=age;
    }
    public static void main(String args[]){
        Student1 student1=new Student1(23456L,24,"Lana");
        System.out.println(student1.id);
        System.out.println(student1.age);
        System.out.println(student1.name);
    }

}
