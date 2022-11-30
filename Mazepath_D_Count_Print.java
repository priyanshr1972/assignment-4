//Take as input N1 and N2, both numbers. N1 and N2 is the number of row and columns on a rectangular board. Our player starts in top-left corner of the board and must reach bottom-right corner. In one move the player can move 1 step horizontally (right) or 1 step vertically (down) or 1 step diagonally (south-east).
//
//        a. Write a recursive function which returns the count of different ways the player can travel across the board. Print the value returned.
//
//        b. Write a recursive function which prints moves for all valid paths across the board (void is the return type for function).
//
//        Input Format
//        Enter the number of row N1 and number of columns N2
//
//        Constraints
//        None
//
//        Output Format
//        Display the total number of paths and print all the possible paths in a space separated manner
//
//        Sample Input
//        3
//        3
//        Sample Output
//        VVHH VHVH VHHV VHD VDH HVVH HVHV HVD HHVV HDV DVH DHV DD
//        13

// package Assignment4;

// import java.util.Scanner;

// public class Mazepath_D_Count_Print {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r= sc.nextInt();
//         int c= sc.nextInt();
//         mazePrint(0,0, r-1, c-1,"");
//         System.out.println("\n"+mazePathDCount(0,0,r-1, c-1));
//     }
//     private static void mazePrint(int row, int col, int row1, int col1, String res){
//         if(row==row1 && col==col1){
//             System.out.print(res+" ");
//             return;
//         }
//         if(row>row1 || col>col1){
//             return;
//         }
//         mazePrint(row+1, col, row1, col1, res+"V");
//         mazePrint(row, col+1, row1, col1, res+"H");
//         if(row<row1 && col<col1){
//             mazePrint(row+1, col+1, row1, col1, res+"D");
//         }
//     }
//     private static int mazePathDCount(int row, int col, int row1, int col1){
//         if(row==row1 && col==col1){
//             return 1;
//         }
//         if(row>row1 || col>col1){
//             return 0;
//         }
//         int count = 0;
//         count+=mazePathDCount(row, col+1, row1, col1);
//         count+=mazePathDCount(row+1, col, row1, col1);
//         if(row<row1 && col<col1){
//             count+=mazePathDCount(row+1, col+1, row1, col1);
//         }
//         return count;
//     }
// }
import java.util.*;
public class Mazepath_D_Count_Print{
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }

}
