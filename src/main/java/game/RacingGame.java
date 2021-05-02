package game;

import car.Car;
import game.GameProgressNumber;
import game.Names;
import utils.RacingGameUtils;

public class RacingGame {
    private Names names;
    private GameProgressNumber gameProgressNumber;

    public void playGame() {
        RacingGameUtils gameUtils = new RacingGameUtils();
        String names = gameUtils.inputNames();
        String gameProgressNumber = gameUtils.inputGameProgressNumber();
        setNamesAndGameProgressNumber(names, gameProgressNumber);
        initGameSetting();
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

    public void initGameSetting() {
        String[] names = this.names.splitNameToArray();
        Car[] cars = new Car[names.length];
        for (int i = 0; i < names.length; i++) {
            cars[i] = new Car(names[i], 1);
        }
    }

}
