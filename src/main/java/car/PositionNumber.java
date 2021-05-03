package car;

import exception.ExceptionMessage;

public class PositionNumber {

    private static final int MIN_LENGTH = 1;

    private int position;

    public PositionNumber(int position) {
        setPosition(position);
    }

    public int getPosition() {
        return this.position;
    }

    public void setPosition(int position) {
        if (position < MIN_LENGTH) {
            throw new IllegalArgumentException(ExceptionMessage.POSITION_START_NUMBER);
        }
        this.position = position;
    }
}
