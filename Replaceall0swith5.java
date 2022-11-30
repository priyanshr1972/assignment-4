//Given an integer N, now you have to convert all zeros of N to 5.
//
//        Input Format
//        The first Line takes input integer N, denoting the number.
//
//        Constraints
//        1<=N<=10000
//
//        Output Format
//        Print the number after replacing all 0's with 5.
//
//        Sample Input
//        103
//        Sample Output
//        153
//        Explanation
//        Testcase 1: after replacing 0 with 5 ,number will become 153.
//        Testcase 2: there is no zero in number so it will remain same.

package Assignment4;

import java.util.Scanner;

public class Replaceall0swith5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(replace0to5(n));
    }
    private static int replace0to5(int n){
        if(n/10==0){
            return n;
        }
        return replace0to5(n/10)*10+(n%10==0?5:n%10);
    }
}
