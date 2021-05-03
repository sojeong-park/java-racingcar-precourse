package utils;

import car.Car;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RacingGameUtils {
    private Scanner scanner;
    private Random random;

    public RacingGameUtils(){
        scanner = new Scanner(System.in);
        random = new Random();
    }
    public String inputNames(){
        System.out.println(RacingGameUtilsContent.INPUT_NAMES);
        return scanner.nextLine();
    }

    public String inputGameProgressNumber(){
        System.out.println(RacingGameUtilsContent.INPUT_GAME_PROGRESS_NUMBER);
        return scanner.nextLine();
    }

    public int createRandomNumber() {
        int randomNumber = random.nextInt(9) + 1;
        while (!validRandomNumber(randomNumber)) {
            randomNumber = random.nextInt(9) + 1;
        }
        return random.nextInt(9)+1;
    }

    public boolean validRandomNumber(int number) {
        return number >= 0 && number <= 9;
    }

    public void printCarInfo(ArrayList<Car> carList) {
        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i).printCarInfo());
        }
        System.out.println();
    }

    public void printWinnerList(ArrayList<String> winnerList) {
        for (int i = 0; i < winnerList.size() - 1; i++) {
            isNotNullWinner(winnerList.get(i),",");
        }
        isNotNullWinner(winnerList.get(winnerList.size()-1),"");
        System.out.print(RacingGameUtilsContent.WINNER_PRINT);
    }

    public void isNotNullWinner(String winner, String comma) {
        if (!winner.isEmpty()){
            System.out.print(winner+comma);
        }
    }
}
