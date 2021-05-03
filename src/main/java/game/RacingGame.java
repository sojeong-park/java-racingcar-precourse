package game;

import car.Car;
import utils.RacingGameUtils;

import java.util.Arrays;

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

    public Car[] initGameSetting() {
        String[] names = this.names.splitNameToArray();
        Car[] cars = new Car[names.length];
        for (int i = 0; i < names.length; i++) {
            cars[i] = new Car(names[i], 1);
        }
        return cars;
    }

    public void insertCarsPosition(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            cars[i].insertRandomNumber(utils.createRandomNumber());
        }
    }

    public void startRacingGame() {
        Car[] cars = initGameSetting();
        utils.printCarInfo(cars);
        for (int i = 1; i < gameProgressNumber.getGameProgressNumber(); i++) {
            insertCarsPosition(cars);
            utils.printCarInfo(cars);
        }
    }
}
