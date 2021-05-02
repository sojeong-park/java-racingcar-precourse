package game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class GameProgressNumberTest {
    @Test
    @DisplayName("게임 진행 회수 null 입력")
    void validateGameProgressNumberNull() {
        String number = "";
        assertThatThrownBy(() -> {
            new GameProgressNumber(number);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("게임 진행 회수를 입력해주세요.");
    }

    @DisplayName("게임 진행 회수가 0보다 큰 정수인지 확인")
    @ParameterizedTest
    @CsvSource({"3.4", "-1", "0", "number"})
    void validateGameProgressNumber(String number) {
        assertThatThrownBy(() -> {
            new GameProgressNumber(number);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("게임 진행 회수는 1이상의 숫자만 입력해주세요.");
    }
}