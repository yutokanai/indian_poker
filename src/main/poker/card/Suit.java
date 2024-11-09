package main.poker.card;

import main.poker.exception.NoSuchSuitException;

/**
 * スート。
 * スペードやハートなどの、トランプのマークを表す。
 */
public class Suit {

    private int suit;

    Suit(String s) {
        switch (s) {
            case "S":
                this.suit = 4;
                break;
            case "H":
                this.suit = 3;
                break;
            case "D":
                this.suit = 2;
                break;
            case "C":
                this.suit = 1;
                break;
            default:
                throw new NoSuchSuitException(s);
        }
    }

    int getSuit() {
        return this.suit;
    }
}
