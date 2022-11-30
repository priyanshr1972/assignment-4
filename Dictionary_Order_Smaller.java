//Take as input str, a string. Write a recursive function which returns all the words possible by rearranging the characters of this string which are in dictionary order smaller than the given string. The output strings must be lexicographically sorted.
//
//        Input Format
//        Single line input containing a string
//
//        Constraints
//        Length of string <= 25
//
//        Output Format
//        Display all the words which are in dictionary order smaller than the string entered in a new line each. The output strings must be sorted.
//
//        Sample Input
//        cab
//        Sample Output
//        abc
//        acb
//        bac
//        bca
//        Explanation
//        The possible permutations of string "cab" are "abc" , "acb" ,"bac" , "bca" , "cab" and "cba" . Only four of them are lexicographically less than "cab". We print them in lexicographical order.

package Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class Dictionary_Order_Smaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        boolean[] visit = new boolean[arr.length];
        Arrays.sort(arr);
        printPer(arr, visit, "", s);
    }
    private static void printPer(char[] arr, boolean[] visit, String result, String val){
        if(result.length()==arr.length && result.compareTo(val)<0){
            System.out.println(result);
            return;
        }
        if(result.compareTo(val)>=0){
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(visit[i]==false){
                visit[i] = true;
                printPer(arr, visit, result+arr[i], val);
                visit[i] = false;
            }
        }
    }
}
