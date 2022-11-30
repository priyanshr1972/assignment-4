//Take as input N, a number. N is the size of a snakes and ladder board (without any snakes and ladders). Take as input M, a number. M is the number of faces of the d.
//
//        a. Write a recursive function which returns the count of different ways the board can be traveled using the d. Print the value returned.
//
//        b. Write a recursive function which prints d-values for all valid paths across the board (void is the return type for function).
//
//        Input Format
//        Enter a number N (size of the board) and number M(number of the faces of a d)
//
//        Constraints
//        None
//
//        Output Format
//        Display the number of paths and print all the paths in a space separated manner
//
//        Sample Input
//        3
//        3
//        Sample Output
//        111 12 21 3
//        4

package Assignment4;

import java.util.Scanner;

public class Boardpath_Count_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bod = sc.nextInt();
        int d = sc.nextInt();
        printBPath(bod, d, "");
        System.out.println("\n"+countBPath(bod, d));
    }
    private static void printBPath(int bod, int d, String res){
        if(bod==0){
            System.out.print(res+" ");
            return;
        }
        if(bod<0){
            return;
        }
        for(int i=1;i<=d;i++){
            printBPath(bod-i, d, res+i);
        }
    }
    private static int countBPath(int bod, int d){
        if(bod==0){
            return 1;
        }
        if(bod<0){
            return 0;
        }
        int count = 0;
        for(int i=1;i<=d;i++){
            count += countBPath(bod-i, d);
        }
        return count;
    }
}
