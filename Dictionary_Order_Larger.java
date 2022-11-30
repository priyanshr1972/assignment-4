//Take as input str, a string. Write a recursive function which prints all the words possible by rearranging the characters of this string which are in dictionary order larger than the given string.
//        The output strings must be lexicographically sorted.
//
//        Input Format
//        Single line input containing a string
//
//        Constraints
//        Length of string <= 10
//
//        Output Format
//        Display all the words which are in dictionary order larger than the string entered in a new line each. The output strings must be sorted.
//
//        Sample Input
//        cab
//
//        Sample Output
//        cba
//        Explanation
//        The possible permutations of string "cab" are "abc" , "acb" ,"bac" , "bca" , "cab" and "cba" . Only one of them is lexicographically greater than "cab". We only print "cba".

package Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class Dictionary_Order_Larger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        boolean[] visited = new boolean[arr.length];
        Arrays.sort(arr);
        printPermutation(arr, visited, "", s);
    }
    private static void printPermutation(char[] arr, boolean[] visited, String res, String ques){
        if(res.length()==arr.length && res.compareTo(ques)>0){
            System.out.println(res);
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(visited[i]==false){
                visited[i] = true;
                printPermutation(arr, visited, res+arr[i], ques);
                visited[i] = false;
            }
        }
    }
}
