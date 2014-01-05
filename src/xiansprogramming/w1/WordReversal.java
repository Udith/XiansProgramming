/*
 * Input
 * You will be given a number of test cases. The first line contains a positive 
 * integer indicating the number of cases to follow. Each case is given on a line
 * containing a list of words separated by one space, and each word contains only
 * uppercase and lowercase letters.
 * 
 * Output
 * For each test case, print the output on one line.
 * 
 * Sample Input
 * 3
 * I am happy today
 * To be or not to be
 * I want to win the practice contest
 * 
 * Sample Output
 * I ma yppah yadot
 * oT eb ro ton ot eb
 * I tnaw ot niw eht ecitcarp tsetnoc
 */

package xiansprogramming.w1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Udith Arosha
 */
public class WordReversal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int tests = Integer.parseInt(line);

        for (int i = 0; i < tests; i++) {
            line = br.readLine();
            reverseLine(line);
        }
    }

    public static void reverseLine(String line) {
        
        String[] parts = line.split(" ");
        for (int i=0;i<parts.length;i++) {
            System.out.print(new StringBuilder(parts[i]).reverse().toString());
            if(i != parts.length-1){
                System.out.print(" ");
            }            
        }
        System.out.println();
    }
}
