/*
 * Input
 * There will be multiple input sets. Each set will consist of one line of text 
 * of no more than 80 characters. The last line of the file will contain the 
 * sentence "THE END." and should not be processed.
 * 
 * Output
 * For each input set, output either the word Yes or the word No depending on 
 * whether the input string is a palindrome or not.
 * 
 * Sample Input
 * 
 * Go hang a salami, I'm a lasagna hog.
 * East Central Regional Programming Contest
 * Dennis sinned
 * THE END.
 * 
 * Sample Output
 * Yes
 * No
 * Yes
 */
package xiansprogramming.w1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Udith Arosha
 */
public class PalindromeProblem {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        while (!line.equals("THE END.")) {

            boolean r = checkPalindrome(line);
            if (r) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            line = br.readLine();
        }

    }

    public static boolean checkPalindrome(String line) {
        String newLine = line.replaceAll("[^A-Za-z]+", "");
        newLine = newLine.toLowerCase();

        String reverseLine = new StringBuilder(newLine).reverse().toString();

        return (newLine.equals(reverseLine));
    }
}
