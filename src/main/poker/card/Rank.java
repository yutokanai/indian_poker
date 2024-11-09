package main.poker.card;

import main.poker.exception.NoSuchRankException;

/**
 * ランク。
 * トランプの数字を表す。
 */
public class Rank {

    private int rank;

    Rank(String s) {
        switch (s) {
            case "2" :
            case "3" :
            case "4" :
            case "5" :
            case "6" :
            case "7" :
            case "8" :
            case "9" :
            case "10":
                this.rank = Integer.valueOf(s);
                break;
            case "J":
                this.rank = 11;
                break;
            case "Q":
                this.rank = 12;
                break;
            case "K":
                this.rank = 13;
                break;
            case "A":
                this.rank = 14;
                break;
            default:
                throw new NoSuchRankException(s);
        }
    }

    int getRank() {
        return this.rank;
    }
}
