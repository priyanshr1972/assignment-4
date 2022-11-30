//Replace all occurrences of pi with 3.14
//
//        Input Format
//        Integer N, no of lines with one string per line
//
//        Constraints
//        0 < N < 1000
//        0 <= len(str) < 1000
//
//        Output Format
//        Output result one per line
//
//        Sample Input
//        3
//        xpix
//        xabpixx3.15x
//        xpipippixx
//        Sample Output
//        x3.14x
//        xab3.14xx3.15x
//        x3.143.14p3.14xx
//        Explanation
//        All occurrences of pi have been replaced with "3.14".

package Assignment4;

import java.util.Scanner;

public class ReplaceallPi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String s = sc.next();
            System.out.println(replacePi(s));
        }
    }
    private static String replacePi(String s){
        int si = 0;
        int ei = 2;
        while(ei<s.length()){
            if(s.substring(si,ei).equals("pi")){
                s = s.substring(0,si)+"3.14"+s.substring(ei);
            }
            ei++;
            si++;
        }
        return s;
    }
}
