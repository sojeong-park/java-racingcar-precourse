package car;

import utils.RacingGameUtils;
import java.util.ArrayList;

public class CarList {
    private ArrayList<Car> carList;

    public CarList(String[] names) {
        this.carList = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            this.carList.add(new Car(names[i], 1));
        }
    }

    public ArrayList<Car> getCarList() {
        return this.carList;
    }

    public ArrayList<Car> updateCarListPosition(ArrayList<Car> cars, RacingGameUtils utils) {
        for (int i = 0; i < cars.size(); i++) {
            cars.get(i).insertRandomNumber(utils.createRandomNumber());
        }
        return cars;
    }
}
