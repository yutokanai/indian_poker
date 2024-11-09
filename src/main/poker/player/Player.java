package main.poker.player;

import java.util.Arrays;

import main.poker.card.Card;

public class Player {
    private Card card;
    private String playerName;
    private final String splitter = ":";

    Player(String s) {
        this.playerName = Arrays.asList(s.split(this.splitter)).get(0);
        this.card = new Card(Arrays.asList(s.split(this.splitter)).get(1));
    };

    Card getCard() {
        return this.card;
    }

    String getPlayerName() {
        return this.playerName;
    }
}
