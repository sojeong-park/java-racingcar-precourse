package rank;

import car.Car;
import car.CarList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

class RankTest {
    private Rank rank;

    @BeforeEach
    void setUp() {
        String names = "pobi,crong,honux";
        String[] nameList = names.split(",");
        CarList carList = new CarList(nameList);
        rank = new Rank(carList);
    }

    @DisplayName("최대값 비교")
    @ParameterizedTest
    @CsvSource({"1,4,4"
                ,"3,3,3"
                ,"4,1,4"})
    void compareMax(int max, int position, int resultMax) {
        assertThat(rank.compareMax(max, position)).isEqualTo(resultMax);
    }

    @DisplayName("우승자 비교")
    @ParameterizedTest
    @CsvSource({"7,''"
                ,"3, ''"
                ,"4, jone"})
    void compareWinner(int max, String result) {
        Car car = new Car("jone", 4);
        assertThat(rank.compareWinner(car, max)).isEqualTo(result);
    }
}