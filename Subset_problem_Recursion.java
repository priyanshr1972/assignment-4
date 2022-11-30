//Take as input N, a number. Take N more inputs and store that in an array. Take as input tg, a number
//
//        a. Write a recursive function which vals the number of subsets of the array which sum to tg. Print the value returned.
//
//        b. Write a recursive function which prints subsets of the array which sum to tg. Return type of functions is void.
//
//        Input Format
//        Take as input N, a number. Take N more inputs and store that in an array.Take as input tg, a number
//
//        Constraints
//        None
//
//        Output Format
//        Display the number of subsets and print the subsets in a space separated manner.
//
//        Sample Input
//        3
//        1
//        2
//        3
//        3
//        Sample Output
//        1 2  3
//        2
package Assignment4;

import java.util.*;

public class Subset_problem_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int tg = sc.nextInt();
        PSubsets(nums, tg, 0, "", 0);
        System.out.println("\n"+valSubsets(nums, tg, 0, 0));
    }

    private static void PSubsets(int[] nums, int tg, int index, String res, int currentSum){
        if(index==nums.length){
            if(currentSum==tg){
                System.out.print(res+" ");
            }
            return;
        }
        PSubsets(nums, tg, index+1, res+nums[index]+" ", currentSum+nums[index]);
        PSubsets(nums, tg, index+1, res, currentSum);
    }
    private static int valSubsets(int[] nums, int tg, int index, int currentSum){
        if(index==nums.length){
            if(currentSum==tg){
                return 1;
            }
            return 0;
        }
        int val = 0;
        val+=valSubsets(nums, tg, index+1, currentSum+nums[index]);
        val+=valSubsets(nums, tg, index+1, currentSum);
        return val;
    }
}
