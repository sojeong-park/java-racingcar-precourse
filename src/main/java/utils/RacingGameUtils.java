package utils;

import car.Car;

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
        int randomNumber = random.nextInt(9)+1;
        while (!validRandomNumber(randomNumber)) {
            randomNumber = random.nextInt(9)+1;
        }
        return random.nextInt(9)+1;
    }

    public boolean validRandomNumber(int number) {
        return number >= 0 && number <= 9;
    }

    public void printCarInfo(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
        System.out.println();
    }
}
