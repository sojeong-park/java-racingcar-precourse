package car;

import exception.ExceptionMessage;

public class Name {
    private static final int MIN_LENGTH = 0;
    private static final int MAX_LENGTH = 5;

    private String name;

    public Name(String name) {
        if (name.length() <= MIN_LENGTH || name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException(ExceptionMessage.NAME_LENGTH_LIMIT);
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
