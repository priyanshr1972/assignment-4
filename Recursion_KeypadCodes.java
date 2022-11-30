//Take as input str, a string. str represultents keys presultsed on a nokia phone keypad. We are concerned with all possible words that can be written with the presultsed keys.
//
//        Assume the following alphabets on the keys: 1 -> abc , 2 -> def , 3 -> ghi , 4 -> jkl , 5 -> mno , 6 -> pqrs , 7 -> tuv , 8 -> wx , 9 -> yz
//
//        E.g. “12” can produce following words “ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf”
//
//        a. Write a recursive function which returns the count of words for a given keypad string. Print the value returned.
//
//        b.Write a recursive function which prints all possible words for a given keypad string (void is the return type for function).
//
//        Input Format
//        Single line input containing a single integer.
//
//        Constraints
//        1 <= Length of string <= 10^3
//
//        Output Format
//        Print all the words in a space separated manner. Also print the count of these numbers in next line.
//
//        Sample Input
//        12
//        Sample Output
//        ad ae af bd be bf cd ce cf
//        9
//        Explanation
//        1 can corresultpond to 'a' , 'b' or 'c' .
//        2 can corresultpond to 'd', 'e' or 'f'.
//        We print all combinations of these

package Assignment4;

import java.util.Scanner;

public class Recursion_KeypadCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] val = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz"};
        String s = sc.next();
        System.out.println("\n"+Print(val, s, ""));
    }
    private static int Print(String[] val, String s, String result){
        if(s.length()==0){
            System.out.print(result+" ");
            return 1;
        }
        int count = 0;
        for(int i=0;i<val[(int)(s.charAt(0)-'1')].length();i++){
            count += Print(val, s.substring(1),result+val[(int)(s.charAt(0)-'1')].charAt(i));
        }
        return count;
    }
}
