package main.poker.exception;

/**
 * プレイヤーの数が1以下であることを示す例外。
*/
public class TooFewPlayersException extends RuntimeException {

	public TooFewPlayersException() {
		super("required 2 or more players.");
	}
}
