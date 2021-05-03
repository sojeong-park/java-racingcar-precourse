package utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RacingGameUtilsTest {
    private RacingGameUtils racingGameUtils;
    @BeforeEach
    void setUp() {
        racingGameUtils = new RacingGameUtils();
    }

    @DisplayName("랜덤으로 생성시 0~9사이의 정수 확인")
    @ParameterizedTest
    @CsvSource({"0, true"
            , "10, false"
            , "9, true"})
    void validRandomNumber(int number, boolean result) {
        assertThat(racingGameUtils.validRandomNumber(number)).isEqualTo(result);
    }
}