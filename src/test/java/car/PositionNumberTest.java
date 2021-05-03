package car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class PositionNumberTest {
    private PositionNumber positionNumber;
    @BeforeEach
    void setUp() {
        positionNumber = new PositionNumber(1);
    }

    @DisplayName("초기 위치값이 1 이하 경우 예외 확인")
    @ParameterizedTest
    @CsvSource({"-1", "0"})
    void validateNameLengthFalse(int position) {
        assertThatThrownBy(() -> {
            new PositionNumber(position);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("초기 위치값은 1부터 시작입니다.");

    }
    @DisplayName("전진 멈춤 로직 체크")
    @ParameterizedTest
    @CsvSource({"4, 2", "0, 1", "9, 2"})
    void checkIncreasePosition(int randomNumber, int resultPosition) {
        positionNumber.checkIncreasePosition(randomNumber);
        assertThat(positionNumber.getPosition()).isEqualTo(resultPosition);
    }

    @DisplayName("position 숫자 하이픈 변경 확인")
    @ParameterizedTest
    @CsvSource({"4, '----'", "1, '-'", "6, '------'"})
    void changePositionNumberToHyphen(int position, String result) {
        positionNumber.setPosition(position);
        String hyphen = positionNumber.changePositionNumberToHyphen().toString();
        assertThat(hyphen).isEqualTo(result);
    }
}