import java.util.ArrayList;

/*
The stack from which the player draws cards from.
 */

public class Stock extends ArrayList<Card> {
    //Removes the card from the top of the deck and returns it.
    public Card draw() {
        return this.remove(this.size() - 1);
    }
}
