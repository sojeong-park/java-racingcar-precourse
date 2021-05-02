package car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class PositionNumberTest {
    @DisplayName("초기 위치값이 1 이하 경우 예외 확인")
    @ParameterizedTest
    @CsvSource({"-1", "0"})
    void validateNameLengthFalse(int position) {
        assertThatThrownBy(() -> {
            new PositionNumber(position);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("초기 위치값은 1부터 시작입니다.");

    }
}