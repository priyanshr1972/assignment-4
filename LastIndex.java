//Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, a number. Write a recursive function which returns the last index at which M is found in the array and -1 if M is not found anywhere. Print the value returned.
//
//        Input Format
//        Enter a number N and add N more numbers to an array, then enter number M to be searched
//
//        Constraints
//        None
//
//        Output Format
//        Display the last index at which the number M is found
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
//        3

package Assignment4;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int item = sc.nextInt();
        System.out.println(findLastIndex(arr, arr.length-1, item));
    }
    private static int findLastIndex(int[] arr, int index, int item){
        if(index<0)
            return -1;
        if(index>=0 && arr[index]==item){
            return index;
        }
        return findLastIndex(arr, index-1, item);
    }
}
