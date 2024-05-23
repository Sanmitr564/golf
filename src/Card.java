public class Card implements Comparable<Card>{
    public int rank;
    public Suit suit;
    public Card(int rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }
    @Override
    public int compareTo(Card o) {
        return rank - o.rank;
    }
}
