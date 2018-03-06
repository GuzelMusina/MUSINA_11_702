package ru.itis;

/**
 * 06.03.2018
 * SyntaxException
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class SyntaxException extends RuntimeException {
    public SyntaxException() {
        super("Not correct syntax");
    }
}
