package CVIV;
class Card {
    String kind; // iv = 인스턴스 변수
    int num; // iv = 인스턴스 변수
    static int width = 100; // class 변수
    static int height = 250; // class 변수

}
public class CardTest {
    public static void main(String[] args) {
        Card[] cards = new Card[9];

        for(int i=0; i< cards.length; i++) {
            cards[i] = new Card();
            if(i<3){
                cards[i].kind = "Heart";
                cards[i].num = i+1;
            }
            else if(i<6) {
                cards[i].kind = "Spade";
                cards[i].num = i+1;
            }
            else {
                cards[i].kind = "Diamond";
                cards[i].num = i+1;
            }
        }
        for (int i = 0; i < cards.length; i++) {
            String name = cards[i].kind + cards[i].num;
            System.out.println("Card " + (i + 1) + ": " + name);
        }
    }
}
