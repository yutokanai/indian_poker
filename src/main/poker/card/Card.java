package main.poker.card;

import java.util.Arrays;

/**
 * カード。
 * スートとランクの組み合わせで、強さが決まる。
 */
public class Card {
    
    private Rank rank;
    private Suit suit;
    private final String splitter = "-";

    public Card(String s) {
        this.suit = new Suit(Arrays.asList(s.split(this.splitter)).get(0));
        this.rank = new Rank(Arrays.asList(s.split(this.splitter)).get(1));
    }

    public Rank getRank() {
        return this.rank;
    }

    public Suit getSuit() {
        return this.suit;
    }
}
