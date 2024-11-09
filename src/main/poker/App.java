package main.poker;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import main.poker.player.Players;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> argList = Arrays.asList(args);
        String in = argList.size() == 0 ? "player1:S-J player2:H-3 player3:D-333" : argList.get(0);
        System.out.println(new Players(in).getStrongestPlayerName());
    }
}
