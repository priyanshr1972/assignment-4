import java.util.*;
public class prime {
    public static void main(String[] args) {
        int n=100;
        PrimeSieve(n);
    }
    public static void PrimeSieve(int n) {
        // kisi index pe false set h use index ko prime no. consider krna h
        // kisi index pe true set h use index ko not prime no. consider krna h
        boolean[] arr=new boolean[n+1];
        arr[0]=true;
        arr[1]=true;
        for(int i=2;i<arr.length;i++){
            if(arr[i]==false){
                for(int j=2;i*j<=n;j++){
                    arr[i*j]=true;                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]==true){
                System.out.println(arr[j]);
            }
        }

    }
    
}