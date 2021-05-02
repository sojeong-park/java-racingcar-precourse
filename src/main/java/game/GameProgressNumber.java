package game;

import exception.ExceptionMessage;

public class GameProgressNumber {
    private static final String MATCH_INTEGER_NUMBER = "^[1-9]*$";
    private int gameProgressNumber;

    public GameProgressNumber(String gameProgressNumber) {
        if (gameProgressNumber.isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessage.GAME_PROGRESS_NUMBER_NULL);
        }
        if (!gameProgressNumber.matches(MATCH_INTEGER_NUMBER)) {
            throw new IllegalArgumentException(ExceptionMessage.GAME_PROGRESS_NUMBER_INTEGER);
        }
        this. gameProgressNumber = Integer.parseInt(gameProgressNumber);
    }
}
