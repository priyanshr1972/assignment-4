//Take as input N, a number. Take N more inputs and store that in an array.
//
//        a. Write a recursive function which counts the number of ways the array could be split in two groups, so that the sum of items in both groups is equal. Each number in the array must belong to one of the two groups. Print the value returned.
//
//        b. Write a recursive function which keeps track of ways an array could be split in two groups, so that the sum of items in both groups is equal. Each number in the array must belong to one of the two groups. Return type of function should be void. Print the two groups, each time you find a successful split.
//
//        Input Format
//        Take as input N, a number. Take N more inputs and store that in an array.
//
//        Constraints
//        None
//
//        Output Format
//        Display all the groups in a comma separated manner and display the number of ways the array can be split
//
//        Sample Input
//        6
//        1
//        2
//        3
//        3
//        4
//        5
//        Sample Output
//        1 2 3 3 and 4 5
//        1 3 5 and 2 3 4
//        1 3 5 and 2 3 4
//        2 3 4 and 1 3 5
//        2 3 4 and 1 3 5
//        4 5 and 1 2 3 3
//        6

package Assignment4;

import java.util.Scanner;

public class SplitArray_Recursion {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        splitArray(arr,0,0,0,"","");
        System.out.println(count);
        
    }
    private static void splitArray(int[] arr, int index, int leftsum, int rightsum, String res1, String res2){
        if(index==arr.length){
            if(leftsum==rightsum){
                System.out.println(res1+" and "+res2);
                count++;
            }
            return;
        }
        splitArray(arr,index+1,leftsum+arr[index],rightsum,res1+arr[index]+" ",res2);
        splitArray(arr,index+1,leftsum, rightsum+arr[index],res1, res2+arr[index]+" ");
    }
}
