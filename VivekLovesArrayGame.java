//Vivek loves to play with array . One day Vivek just came up with a new array game which was introduced to him by his friend Ujjwal. The rules of the game are as folls:
//
//        Initially, there is an array, A , containing 'N' integers.
//
//        In each move, Vivek must divide the array into  two non-empty contiguous parts such that the sum of the elements in the left part is equal  to the sum of the elements in the right part. If Vivek can make such a move, he gets '1' point; otherwise, the game ends.
//
//        After each successful move, Vivek have to discards either the left part or the right part and continues playing by using
//        the remaining partition as array 'A'.
//
//        Vivek loves this game and wants your help getting the best score possible. Given 'A', can you find and print the maximum number of points he can score?
//
//        Input Format
//        First line of input contains an integer T denoting number of test cases. Each further Test case contains first line an integer 'N' , the size of array 'A'. After that 'N' space separated integers denoting the elements of array.
//
//        Constraints
//        1 <= T <= 10 1 <= N <= 17000 0 <= A[i] <= 10^9
//
//        Output Format
//        For each test case, print Vivek's maximum possible score on a new line.
//
//        Sample Input
//        3
//        3
//        3 3 3
//        4
//        2 2 2 2
//        7
//        4 1 0 1 1 0 1
//        Sample Output
//        0
//        2
//        3

package Assignment4;

import java.util.Scanner;

public class VivekLovesArrayGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i=0;i<n;i++){
                nums[i] = sc.nextInt();
            }
            System.out.println(sArray(nums, 0, n-1));
        }
    }
    private static int sArray(int[] nums, int l, int h){
        for(int i=l;i<h;i++){
            int left_sum = 0;
            for(int j=l;j<=i;j++){
                left_sum+=nums[j];
            }
            int right_sum = 0;
            for(int j=i+1;j<=h;j++){
                right_sum+=nums[j];
            }
            if(left_sum==right_sum){
                int lCount = sArray(nums, l, i);
                int RCount = sArray(nums, i+1, h);
                return Math.max(lCount, RCount)+1;
            }
        }
        return 0;
    }
}
