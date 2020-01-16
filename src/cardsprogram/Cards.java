package cardsprogram;

/**
 *This class +++Insert Description Here+++
 *
 * @author Colin Holman
 */
public class Cards {
    private String number;
    private String suit;
    
    

    public Cards(String number, String suit) {
        this.number = number;
        this.suit = suit;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Cards{" + "number=" + number + ", suit=" + suit + '}';
    }
    
    

}
