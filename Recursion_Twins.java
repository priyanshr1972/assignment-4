//Take as input str, a string. A “twin” is defined as two instances of a char separated by a char. E.g. "AxA" the A's make a “twin”. “twins” can overlap, so "AxAxA" contains 3 “twins” - 2 for A and 1 for x. Write a function which recursively counts number of “twins” in a string. Print the value returned.
//
//        Input Format
//        Enter the string
//
//        Constraints
//        None
//
//        Output Format
//        Display the number of twins
//
//        Sample Input
//        AXAXA
//        Sample Output
//        3

package Assignment4;

import java.util.Scanner;

public class Recursion_Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(cTwins(st));
    }
    private static int cTwins(String str){
        if(str.length()<3){
            return 0;
        }
        int count = 0;
        if(str.charAt(0)==str.charAt(2))
            count++;
        count += cTwins(str.substring(1));
        return count;
    }
}
