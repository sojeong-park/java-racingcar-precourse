package game;

import exception.ExceptionMessage;

public class Names {
    private static final String MATCH_STRING = "^([a-zA-Z]{1,6},)*([a-zA-Z]{1,6})$";

    private String names;

    public Names(String names) {
        if (names.length() <= 0) {
            throw new IllegalArgumentException(ExceptionMessage.NAMES_NULL);
        }
        if (!names.matches(MATCH_STRING)) {
            throw new IllegalArgumentException(ExceptionMessage.NAMES_SPLIT_COMMA);
        }
        this.names = names;
    }


}
