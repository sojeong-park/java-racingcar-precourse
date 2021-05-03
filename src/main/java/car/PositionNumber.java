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

    public int getPosition() {
        return this.position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void checkIncreasePosition(int randomNumber) {
        if (randomNumber >= 4) {
            setPosition(this.position + 1);
        }
    }

    public StringBuilder changePositionNumberToHyphen() {
        StringBuilder hyphen = new StringBuilder("");
        for (int i = 0; i < getPosition(); i++) {
            hyphen.append("-");
        }
        return hyphen;
    }
}
