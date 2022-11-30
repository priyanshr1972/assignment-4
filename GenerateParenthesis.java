//Given an integer 'n'. Print all the possible pairs of 'n' balanced parentheses.
//        The output strings should be printed in the sorted order considering '(' has higher value than ')'.
//
//        Input Format
//        Single line containing an integral value 'n'.
//
//        Constraints
//        1<=n<=11
//
//        Output Format
//        Print the balanced parentheses strings with every possible solution on new line.
//
//        Sample Input
//        2
//        Sample Output
//        ()()
//        (())

        package Assignment4;

import java.util.*;
import java.util.Scanner;

public class GenerateParenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> ans = new ArrayList<>();
        generateParenthesis(n, 0, 0, "", ans);
        for(int i=ans.size()-1;i>=0;i--){
            System.out.println(ans.get(i));
        }
    }
    private static void generateParenthesis(int n, int opening, int closing, String res, List<String> ans){
        if(opening==n && closing==n){
            ans.add(res);
            return;
        }
        if(opening<n){
            generateParenthesis(n, opening+1, closing, res+"(", ans);
        }
        if(closing<opening){
            generateParenthesis(n, opening, closing+1, res+")", ans);
        }
    }
}
