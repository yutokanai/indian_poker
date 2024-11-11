package main.poker.exception;

/**
 * プレイヤーの数が1以下であることを示す例外。
*/
public class DuplicateCardException extends Exception {

	public DuplicateCardException() {
		super("Duplicate card exist.");
	}
}
