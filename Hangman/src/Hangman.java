import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(List.of("banana", "pineapple", "apple", "orange", "watermelon", "blueberry"));

        Random random = new Random();

        String word = words.get(random.nextInt(words.size()));
    }
}
