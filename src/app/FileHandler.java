package app;

import java.io.*;

public class FileHandler {

    private final static String BASE_PATH = "files/";

    public void createFolder(String path) {
        File file = new File("/"+ path);
        file.mkdir();
    }

    public String writeFile(String fileName, String fileContent) {
        try (FileWriter fw = new FileWriter(BASE_PATH + fileName+ ".txt")){
            fw.write(fileContent);
            return "Success.";
        } catch (IOException e) {
            return "Exception: " + e.getMessage();
        }
    }

    public String readFile(String path) {
        StringBuilder stringBuilder = new StringBuilder();
        File file = new File(path);
        try (FileReader reader = new FileReader(file)) {
            int sym;
            while ((sym = reader.read()) != -1) {
                stringBuilder.append((char) sym);
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        catch (IOException e) {
            return e.getMessage();
        }
        return stringBuilder.toString();
    }
}
