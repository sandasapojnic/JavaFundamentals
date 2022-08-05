package md.fundamentals.passedparam;

public class Card {
private int numCard;

    public Card getC(){
        return this;
    }
    public static void main(String args[]){
        Card c=new Card();
        System.out.println(c.getC());
    }
}
