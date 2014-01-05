/*
 * Input and Output:
 * The input file consists of a number of strings (one per line), of at most 80
 * characters each, starting in column 1. Strings contain only upper case letters.
 * For each non-empty input line,the output consists of one line containing the 
 * largest length of the palindromes and the number of UNIQUE largest palindromes.
 * 
 * Sample Input:
 * SHAKIL
 * BABU
 * BABUAAA
 * 
 * Sample Output:
 * 1 6
 * 3 1
 * 3 2
 */

package xiansprogramming.w1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Udith Arosha
 */
public class LongestPalindrome {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        while (!line.equals("")) {
            int longest = longestPalindromeLength(line);
            int count = numStrings(line, longest);
            System.out.println(longest+" "+count);

            line = br.readLine();
        }

    }

    public static int longestPalindromeLength(String s) {
        if (s.equals("")) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        String longest = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            // get longest palindrome with center of i
            String tmp = helper(s, i, i);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }

            // get longest palindrome with center of i, i+1
            tmp = helper(s, i, i + 1);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }
        }

        return longest.length();
    }

    public static String helper(String s, int begin, int end) {
        while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }
        return s.substring(begin + 1, end);
    }

    public static int numStrings(String s, int longest) {
        if (longest == 1) {
            return s.length();
        }
        
        int count = 0;
        for (int i = 0; i <= (s.length() - longest); i++) {
            String sub = s.substring(i, i + longest);
            if(checkPalindrome(sub)){
                count++;
            }
        }

        return count;
    }

    public static boolean checkPalindrome(String line) {
        String reverseLine = new StringBuilder(line).reverse().toString();
        return (line.equals(reverseLine));
    }
}
