//Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, a number. Write a recursive function which returns an array containing indices of all items in the array which have value equal to M. Print all the values in the returned array.
//
//        Input Format
//        Enter a number N(size of the array) and add N more numbers to the array Enter number M to be searched in the array
//
//        Constraints
//        1 <= Size of array <= 10^5
//
//        Output Format
//        Display all the indices at which number M is found in a space separated manner
//
//        Sample Input
//        5
//        3
//        2
//        1
//        2
//        3
//        2
//        Sample Output
//        1 3
//        Explanation
//        2 is found at indices 1 and 3.

package Assignment4;

import java.util.Scanner;

public class AllIndicesProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int item = sc.nextInt();
        int[] res = findIndices(arr, 0, item);
        for(int i:res)
            System.out.print(i+" ");
    }
    private static int[] findIndices(int[] arr, int index, int item){
        if(index==arr.length)
            return new int[0];
        int[] temp1 = new int[0];
        if(arr[index]==item){
            temp1 = new int[1];
            temp1[0] = index;
        }
        int[] temp2 = findIndices(arr, index+1, item);
        int[] res = new int[temp1.length+temp2.length];
        int i = 0;
        while(i<temp1.length){
            res[i] = temp1[i++];
        }
        int j=0;
        while(j<temp2.length){
            res[i++] = temp2[j++];
        }
        return res;
    }
}
