package main.poker;

import java.util.Arrays;
import java.util.List;

import main.poker.exception.NoSuchRankException;
import main.poker.exception.NoSuchSuitException;
import main.poker.exception.TooFewPlayersException;
import main.poker.player.Players;

public class App {
    public static void main(String[] args) throws Exception {

        List<String> argList = Arrays.asList(args);
       
        try {
            String in = argList.size() == 0 ? "player1:S-K player2:H-Q player3:D-3" : argList.get(0);
            // FIXME: パース不能な文字列が入ってきたときの例外のハンドリング。
            // FIXME: カードの重複チェックがない。
            System.out.println(new Players(in).getStrongestPlayerName());
        } catch (NoSuchRankException | NoSuchSuitException | TooFewPlayersException e) {
            System.err.println(e.getMessage());
        }
    }
}
