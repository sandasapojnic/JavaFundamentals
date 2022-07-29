public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name ="Alex";
        student1.age = 23;
        student1.year = 4;
        student1.average = 9.4;

        System.out.println("Name of the student " + student1.name);
        System.out.println("Age of the student " + student1.age);
        System.out.println("Year of studies of the student " + student1.year);
        System.out.println("Average of the student " + student1.average);
        System.out.println();

        student1.test("Hello","Friday");
        int val = student1.value('A');

        System.out.println(student1.number(7));
        System.out.println(val);
        System.out.println(student1.getName());

        System.out.println("---------------------------------------");
        Student ex = new Student();
        ex.sumNum(6);
        ex.evenNum(8);
        System.out.println();
        ex.hello();
        ex.oddNum(9);

    }
}