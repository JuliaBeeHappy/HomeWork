package lesson6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileGame {

public enum Type {
            SOCCER,
            HOCKEY,
            RUGBY

        }

        public static void writeNumOfPlayersPerTeam(Type type) {


            switch (type) {
                case SOCCER:
                    fileGame.createFile("Soccer.txt");
                    fileGame.writeToFile("Soccer.txt", "11");
                    break;

                case HOCKEY:
                    fileGame.createFile("Hockey.txt");
                    fileGame.writeToFile("Hockey.txt", "6");
                    break;

                case RUGBY:
                    fileGame.createFile("Rugby.txt");
                    fileGame.writeToFile("Rugby.txt", "15");
                    break;
            }


        }

        static FileGame fileGame = new FileGame();

    public void createFile(String fileName){
    File file = new File(fileName);

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void writeToFile(String fileName, String text){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
