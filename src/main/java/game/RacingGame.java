package game;

import car.Car;
import car.CarList;
import utils.RacingGameUtils;
import java.util.ArrayList;

public class RacingGame {
    private Names names;
    private GameProgressNumber gameProgressNumber;
    private RacingGameUtils utils = new RacingGameUtils();

    public void playGame() {
        RacingGameUtils gameUtils = new RacingGameUtils();
        String names = gameUtils.inputNames();
        String gameProgressNumber = gameUtils.inputGameProgressNumber();
        setNamesAndGameProgressNumber(names, gameProgressNumber);
        startRacingGame();
    }

    public void setNamesAndGameProgressNumber(String names, String gameProgressNumber) {
        setNames(names);
        setGameProgressNumber(gameProgressNumber);
    }

    private void setNames(String names) {
        this.names = new Names(names);
    }

    private void setGameProgressNumber(String gameProgressNumber) {
        this.gameProgressNumber =  new GameProgressNumber(gameProgressNumber);
    }

    public void startRacingGame() {
        CarList carList = new CarList(this.names.splitNameToArray());
        ArrayList<Car> cars = carList.getCarList();
        utils.printCarInfo(cars);
        for (int i = 1; i < gameProgressNumber.getGameProgressNumber(); i++) {
            carList.updateCarListPosition(cars, new RacingGameUtils());
            utils.printCarInfo(cars);
        }
    }
}
