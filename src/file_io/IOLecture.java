package file_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class IOLecture {

    //This is for writing to JS example
//    public static void main(String[] args) throws IOException {
//
//        String directory = "js";
//        String filename = "madeByJava.js";
//
//        ArrayList<String> fileContents = new ArrayList<String>();
//
//        fileContents.add("const message = \"Hello World\"");
//        fileContents.add("// written by java file system");
//
//        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(directory, filename);
//
//        //Check if a directory exists
//        if (Files.notExists(dataDirectory)) {
//            // if the directory does not exist, it will create it
//            Files.createDirectories(dataDirectory);
//        }
//
//        //checking to see if a file does not exist
//        if (! Files.exists(dataFile)) {
//            // if the file does not exist we will create it
//            Files.createFile(dataFile);
//        }
//
//        //THIS will write contents to the file
//        //Files.write(dataFile,fileContents);
//
//        //This is how you will read a files contents and store it in a collection
//        List<String> contentsReadFromFile = Files.readAllLines(dataFile);
//
//        System.out.println(contentsReadFromFile);
//    }

    public static void main(String[] args) throws IOException{
        String directory = "src/file_io";
        String filename = "hello.sh";

        ArrayList<String> fileContents = new ArrayList<String>();

        fileContents.add("const message = \"Hello World\"");
        fileContents.add("// written by java file system");

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        //Check if a directory exists
        if (Files.notExists(dataDirectory)) {
            // if the directory does not exist, it will create it
            Files.createDirectories(dataDirectory);
        }

        //checking to see if a file does not exist
        if (! Files.exists(dataFile)) {
            // if the file does not exist we will create it
            Files.createFile(dataFile);
        }

        //THIS will write contents to the file
        //Files.write(dataFile,fileContents);

        //This is how you will read a files contents and store it in a collection
        List<String> contentsReadFromFile = Files.readAllLines(dataFile);

        for (String line : contentsReadFromFile) {
            System.out.println(line);
        };

        //blahblahblah
    }
}
