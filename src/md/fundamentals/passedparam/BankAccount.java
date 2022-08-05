package md.fundamentals.passedparam;

public class BankAccount {

    void createUser(BankAccount bk){
        System.out.println("New User");
    }
    void access(){
        this.createUser(this);
        System.out.println(this);
    }
    public static void main (String args[]){
        BankAccount account=new BankAccount();
        account.access();
    }
}
