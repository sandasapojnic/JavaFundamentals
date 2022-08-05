package md.fundamentals.overloadconstructor;


public class Student {
    private long id;
   private String name;
    private int age;
    public Student(long id){
        this.id=id;
    }
    public Student(String name){
        this.name=name;
    }
    public Student(int age){
        this.age=age;
    }
    public Student(long id,int age,String name){
        this.id=id;
        this.age=age;
        this.name=name;
    }
    public static void main (String args[]){
        Student s1=new Student(34567l,22,"Ana");
        System.out.println(s1.id);
        System.out.println(s1.age);
        System.out.println(s1.name);
    }
}
