//Take as input str, a number in form of a string. Write a recursive function to convert the number in string form to number in integer form. E.g. for “1234” return 1234. Print the value returned.
//
//        Input Format
//        Enter a number in form of a String
//
//        Constraints
//        1 <= Length of String <= 10
//
//        Output Format
//        Print the number after converting it into integer
//
//        Sample Input
//        1234
//        Sample Output
//        1234
//        Explanation
//        Convert the string to int. Do not use any inbuilt functions.

package Assignment4;

import java.util.Scanner;

public class Recursion_ConvertStringtoInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(convert(s));
    }
    private static int convert(String s){
        if(s.length()==1)
            return Integer.parseInt(s);
        return Integer.parseInt(s.substring(0,1))*(int)Math.pow(10,s.length()-1)+convert(s.substring(1));
    }
}
