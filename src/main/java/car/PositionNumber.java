package car;

import exception.ExceptionMessage;

public class PositionNumber {

    private static final int MIN_LENGTH = 1;

    private int position;

    public PositionNumber(int position) {
        if (position < MIN_LENGTH) {
            throw new IllegalArgumentException(ExceptionMessage.POSITION_START_NUMBER);
        }
        this.position = position;
    }
}
