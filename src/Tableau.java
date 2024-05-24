import java.util.ArrayList;

/*
The stack onto which cards are placed by the player.
 */

public class Tableau extends ArrayList<Card> {

    public Card getTopCard() {
        return this.get(this.size() - 1);
    }
}
