package wc;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ccwc {
    public static void main(String[] args) throws IOException {
        int n = args.length;

        if(n == 0){//no Input
            System.out.println("No file found");
            return;
        }
        Path path;
        if(args[0].charAt(0) == '-'){//first element contains command
             path = Paths.get(args[1]);//path of the Input file
        }
        else{//first element contains only the file
            path = Paths.get(args[0]);
        }


        switch(args[0]){
            case "-b":
                System.out.println("Number of bytes: "+ getBytes(path) + " " + path);
                break;

            case "-l":
                System.out.println("Number of lines: "+ getLines(path) + " " + path);
                break;

            case "-w":
                System.out.println("Number of words: "+ getWords(path) + " " + path);
                break;

            case "-c":
                System.out.println("Number of character: "+ getCharacters(path) + " " + path);
                break;

            default:
                System.out.println("Number of bytes: "+ getBytes(path) + " " + path);
                System.out.println("Number of lines: "+ getLines(path) + " " + path);
                System.out.println("Number of words: "+ getWords(path) + " " + path);
                System.out.println("Number of characters: "+ getCharacters(path) + " " + path);
        }
    }

    public static long getBytes(Path path) throws IOException{
        return Files.size(path);
    }

    public static long getLines(Path path) throws IOException {
        BufferedReader br = Files.newBufferedReader(path);

        long lines = 0;

        while(br.readLine() != null){
            lines++;
        }
        return lines;
    }

    public static long getWords(Path path) throws IOException {

        long words = 0;

        try(BufferedReader br = Files.newBufferedReader(path)){
            String line;

            while((line = br.readLine()) != null){
                line = line.trim();

                if(line.isEmpty()){
                    continue;
                }

                String[] arr = line.split("\\s+");
                words += arr.length;
            }
        }
        return words;
    }

    public static long getCharacters(Path path) throws IOException {
        long characters = 0;

        try(BufferedReader br = Files.newBufferedReader(path)){

            int ch;

            while((ch = br.read()) != (-1)){
                characters++;
            }
        }
        return characters;
    }
}