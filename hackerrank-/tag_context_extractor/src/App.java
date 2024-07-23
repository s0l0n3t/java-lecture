
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine()); // Read number of test cases

    while(testCases > 0) {
        String line = in.nextLine(); // Read each line
        boolean patternMatch = false; // Flag to check if any pattern matches

        // Define the regex pattern to match HTML tags and capture the content between them
        Pattern pattern = Pattern.compile("<(.+?)>([^<>]+)</\\1>");
        Matcher matcher = pattern.matcher(line);

        // Iterate through all the matches found in the line
        while(matcher.find()) {
            System.out.println(matcher.group(2)); // Print the content between the tags
            patternMatch = true; // Set flag to true if a pattern match is found
        }

        if(!patternMatch) {
            System.out.println("None"); // Print "None" if no matches are found
        }

        testCases--; // Decrement the test case count
    }
    in.close(); // Close the scanner
}
        
    }

