//One of the important aspect of object oriented programming is readability of the code. To enhance the readability of code, developers write function and variable names in Camel Case. You are given a string, S, written in Camel Case. FindAllTheWordsContainedInIt.
//
//        Input Format
//        A single line contains the string.
//
//        Constraints
//        |S|<=1000
//
//        Output Format
//        Print words present in the string, in the order in which it appears in the string.
//
//        Sample Input
//        IAmACompetitiveProgrammer
//        Sample Output
//        I
//        Am
//        A
//        Competitive
//        Programmer
//        Explanation
//        There are 5 words in the string.

package Assignment3;

import java.util.Scanner;

public class CanYouReadThis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        findWords(s);
    }
    private static void findWords(String s){
        int start = 1;
        System.out.print(s.charAt(0));
        while(start<s.length()){
            if(s.charAt(start)>='A' && s.charAt(start)<='Z'){
                System.out.println();
            }
            System.out.print(s.charAt(start));
            start++;
        }
    }
}
