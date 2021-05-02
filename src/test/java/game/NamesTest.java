package game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class NamesTest {
    @Test
    @DisplayName("이름 문자열이 0 이상인지 확인")
    void validateNamesLength() {
        String names = "";
        assertThatThrownBy(() -> {
            new Names(names);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("한개 이상의 이름을 입력해주세요.");
    }

    @DisplayName("이름 문자열이 쉼표로 구분할수 없는 형태로 주어질 경우 예외 확인")
    @ParameterizedTest
    @CsvSource({"'aaa.bbb.ccc'"
                , "'aaa,,aa'"
                , "',aaa,bbb,ccc,'"})
    void validateNamesSplitComma(String names) {
        assertThatThrownBy(() -> {
            new Names(names);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("이름은 쉼표로 구분되어야합니다.");
    }

    @DisplayName("이름 문자열에 중복된 이름이 있는지 확인")
    @ParameterizedTest
    @CsvSource({"'aaa,bbb,bbb'"
                , "'a,a,a'"})
    void validateNamesDuplication(String names) {
        assertThatThrownBy(() -> {
            new Names(names).splitNameToArray();
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("중복된 이름이 있습니다.");
    }
}