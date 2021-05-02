package car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class NameTest {
    @DisplayName("이름 1이상 5이하일 경우 확인")
    @ParameterizedTest
    @CsvSource({"a" , "abcde"})
    void validateNameLengthTrue(String name) {
        Name carName = new Name(name);
        assertThat(carName.getName()).isEqualTo(name);
    }

    @DisplayName("이름 1이상 5이하 아닐 경우 예외 확인")
    @ParameterizedTest
    @CsvSource({"''" , "abcdef"})
    void validateNameLengthFalse(String name) {
        assertThatThrownBy(() -> {
            new Name(name);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("이름은 1이상 5이하 자릿수입니다.");

    }
}