//********************************************************************
//  Card_driver.java
//  A card prgram for playing card
//********************************************************************
public class Card_driver
{
    public static void main(String[] args) {
        //creates five random cards
        Card card1 = new Card();
        Card card2 = new Card();
        Card card3 = new Card();
        Card card4 = new Card();
        Card card5 = new Card();
        //create specific five cards
        //(1,1), (13,4),(11,2),(6,3) & (15,5)
        Card card6 = new Card(1,1);
        Card card7 = new Card(13,4);
        Card card8 = new Card(11,2);
        Card card9 = new Card(6,3);
        Card card10 = new Card(15,5);

        //print cards using getter
        System.out.println("card1 : "+card1);
        System.out.println("card2 : "+card2);
        System.out.println("card3 : "+card3);
        System.out.println("card4 : "+card4);
        System.out.println("card5 : "+card5);
        System.out.println("card6 : "+card6);
        System.out.println("card7 : "+card7);
        System.out.println("card8 : "+card8);
        System.out.println("card9 : "+card9);
        System.out.println("card10 : "+card10);

        //exmaple of invoking setter
        Card card11 = new Card();
        //Passing the "Queen" into the card object
        card11.setFace(12);
        //Passing the "Diamonds" into the card object
        card11.setSuit(2);
        System.out.println("card11 : "+card11);

    }
}
