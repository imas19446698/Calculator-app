import java.util.Scanner;

public class SentenceOperations {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input a sentence
        System.out.println("Please enter a sentence:");
        String sentence = scanner.nextLine();
        
        // Convert the sentence to all uppercase letters
        String upperCaseSentence = sentence.toUpperCase();
        System.out.println("Uppercase sentence: " + upperCaseSentence);
        
        // Count the number of words in the sentence
        String[] words = sentence.trim().split("\\s+");
        int wordCount = words.length;
        System.out.println("Number of words: " + wordCount);
        
        // Reverse the entire sentence
        String reversedSentence = new StringBuilder(sentence).reverse().toString();
        System.out.println("Reversed sentence: " + reversedSentence);
        
        // Check if the sentence contains the word "Java" (case-insensitive)
        boolean containsJava = sentence.toLowerCase().contains("java");
        System.out.println("Contains 'Java' (case-insensitive): " + containsJava);
        
        // Replace all spaces in the sentence with underscores ("_")
        String sentenceWithUnderscores = sentence.replace(" ", "_");
        System.out.println("Sentence with underscores: " + sentenceWithUnderscores);
        
        // Close the scanner
        scanner.close();
    }
}
