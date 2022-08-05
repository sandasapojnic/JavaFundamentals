package md.fundamentals.overloadmethod;

import java.sql.SQLOutput;

public class Book {
    private int year;
    private String name;

    public void addBook(){
        System.out.println("New book");
        this.check();
        this.removeBook();
    }
    public void check(){
        System.out.println("The book is in stock");
    }
    public void removeBook(){
        System.out.println("The book was removed");
    }
    public static void  main(String args[]){
     Book bk1= new Book();
     bk1.addBook();
    }

}
