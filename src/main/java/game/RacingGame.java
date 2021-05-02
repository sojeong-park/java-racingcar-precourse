package game;

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
        setNames(names);
        setGameProgressNumber(gameProgressNumber);
    }

    private void setNames(String names) {
        this.names = new Names(names);
    }

    private void setGameProgressNumber(String gameProgressNumber) {
        this.gameProgressNumber =  new GameProgressNumber(gameProgressNumber);
    }

}
