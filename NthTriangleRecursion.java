//Take as input N, a number. Write a recursive function to find Nth triangle where 1st triangle is 1, 2nd triangle is 1 + 2 = 3, 3rd triangle is 1 + 2 + 3 = 6, so on and so forth. Print the value returned.
//
//        Input Format
//        Integer N is the single line of input.
//
//        Constraints
//        1 <= N <= 100
//
//        Output Format
//        Print the output as a single integer which is the nth triangle.
//
//        Sample Input
//        3
//        Sample Output
//        6

package Assignment4;

import java.util.Scanner;

public class NthTriangleRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nthTriangle(n));
    }
    private static int nthTriangle(int n){
        if(n==0)
            return 0;
        return n+nthTriangle(n-1);
    }
}
