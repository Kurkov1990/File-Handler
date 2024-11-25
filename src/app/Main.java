package app;

import java.util.Scanner;

public class Main {

    private final static String BASE_PATH = "files/";

    public static void main(String[] args) {
        FileHandler handler = new FileHandler();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        System.out.print("Enter text for adding to the file: ");
        String fileContent = scanner.nextLine();
        String result = handler.writeFile(fileName, fileContent);
        String content = handler.readFile(BASE_PATH + fileName + ".txt");
        getOutput("RESULT: " + result);
        getOutput("FILE CONTENT: " + content);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
