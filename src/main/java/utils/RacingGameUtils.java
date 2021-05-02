package utils;

import java.util.Scanner;

public class RacingGameUtils {
    private Scanner scanner;

    public RacingGameUtils(){
        scanner = new Scanner(System.in);
    }
    public String inputNames(){
        System.out.println(RacingGameUtilsContent.INPUT_NAMES);
        return scanner.nextLine();
    }

    public String inputGameProgressNumber(){
        System.out.println(RacingGameUtilsContent.INPUT_GAME_PROGRESS_NUMBER);
        return scanner.nextLine();
    }
}
