package md.fundamentals.pack1;

public class Count {

    private long id;
    private String firstName;
    private String lastName;
    public static int c;

    public Count(){
        c++;
        id=c;
    }
    public void setId(long sId){
        id=sId;
    }
    public long getId(){
        return id;
    }
}
