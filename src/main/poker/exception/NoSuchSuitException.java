package main.poker.exception;

/**
 * 存在しないスートであることを示す例外。
 */
public class NoSuchSuitException extends RuntimeException {

	public NoSuchSuitException(String s) {
		super("no such suit. suit=" + s);
	}
}
