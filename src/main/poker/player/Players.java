package main.poker.player;

import java.util.List;
import java.util.stream.Stream;

import main.poker.exception.DuplicateCardException;
import main.poker.exception.TooFewPlayersException;

public class Players {

    private List<Player> players;
    private final String splitter = " ";

    /**
     * 入力文字列から、弱い順にソートされたプレイヤーを返す。
     * 最も強いプレイヤーを取得する際は、最後の要素を取得すること。
     * プレイヤーが1人以下になってしまう場合は、例外をスローする。
     * 
     * @param s 入力文字列
     * @return ソート済みのプレイヤー
     */
    public Players(String s) throws DuplicateCardException {
        
        List<Player> players = Stream.of(s.split(splitter)).map(str -> new Player(str)).toList();
        
        // FIXME: orElseThrowみたいな感じにしたい
        if (players.size() <= 1) {
            throw new TooFewPlayersException();
        }

        if (existDuplicateCard(players)) {
            throw new DuplicateCardException();
        };
        
        this.players = players.stream()
        .sorted(
            (o1 , o2) -> o1.getCard().getSuit() - o2.getCard().getSuit()
        ).sorted(
            (o1, o2) -> o1.getCard().getRank() - o2.getCard().getRank()
        ).toList();
    };

    /**
     * 最も強いカードを持つプレイヤーの名前を返す。
     * @return 最も強いカードを持つプレイヤーの名前
     */
    public String getStrongestPlayerName() {
        return this.players.get(this.players.size() - 1).getPlayerName();
    }

    /**
     * プレイヤーの持つカードでランク/スートが重複するものが存在するかを返す。
     * @param players プレイヤーのリスト
     * @return 重複するカードが存在すればtrue
     */
    private boolean existDuplicateCard(List<Player> players) {
        return players.size() != players.stream().map(p -> p.getCard().getSuit()).distinct().toList().size()
        && players.size() != players.stream().map(p -> p.getCard().getRank()).distinct().toList().size();
    }
}
