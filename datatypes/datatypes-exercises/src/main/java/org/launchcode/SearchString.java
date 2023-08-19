package org.launchcode;
import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {

        String aliceSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a term to search for: ");
        String searchTerm = scanner.nextLine();


        boolean found = aliceSentence.toLowerCase().contains(searchTerm.toLowerCase());


        if (found) {
            System.out.println("Search term found.");
        } else {
            System.out.println("Search term not found.");
        }
    }
}
