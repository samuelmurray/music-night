package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        MusicNightRunner runner = new MusicNightRunner();
        boolean continueRunning = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (continueRunning) {
            printInstructions();
            String choice = reader.readLine();
            switch (choice) {
                case "1":
                    System.out.println(runner.toString());
                    break;
                case "2":
                    runner.playOneNight();
                    break;
                case "3":
                    System.out.println("Exiting");
                    continueRunning = false;
                    break;
                default:
                    System.out.println("Choose an option 1, 2 or 3");
            }
        }
    }

    private static void printInstructions() {
        System.out.println("What do you want to do? " +
                "\n\t 1: List all bands" +
                "\n\t 2: Play one night" +
                "\n\t 3: Exit");
    }
}
