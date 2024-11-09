package main.poker.exception;

/**
 * 存在しないランクであることを示す例外。
 */
public class NoSuchRankException extends RuntimeException {


	public NoSuchRankException(String s) {
		super("no such rank. rank=" + s);
	}
}
