package game;

import exception.ExceptionMessage;
import java.util.HashSet;
import java.util.Set;

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

    public String[] splitNameToArray() {
        String[] nameList = names.split(",");
        Set<String> set = new HashSet<>();

        for (int i = 0; i < nameList.length; i++) {
            set.add(nameList[i]);
        }

        if (nameList.length != set.size()) {
            throw new IllegalArgumentException(ExceptionMessage.NAMES_DUPLICATE);
        }
        return nameList;
    }

}
