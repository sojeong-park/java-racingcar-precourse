package car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.assertj.core.api.Assertions.assertThat;

class CarListTest {
    private CarList carList;
    private String[] nameList;
    @BeforeEach
    void setUp() {
        String names = "pobi,crong,honux";
        nameList = names.split(",");
        carList = new CarList(nameList);
    }

    @Test
    @DisplayName("자동차 리스트 확인")
    void getCarList() {
        ArrayList<Car> cars = carList.getCarList();
        for (int i = 0; i < cars.size(); i++) {
            assertThat(cars.get(i).getName()).isEqualTo(nameList[i]);
        }
    }
}