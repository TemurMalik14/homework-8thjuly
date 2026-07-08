import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 10 elements: ");
    int n = 10;
    int[]arr=new int[n];
    for (int i = 0; i < n; i++) {
        System.out.print("Elements: " + (i+1)+" ");
        arr[i] = input.nextInt();
    }
    System.out.print("Elements");
    System.out.println();

    for (int i=0; i<n; i++){
        System.out.print(arr[i]+" ");
    }
    for (int i=0; i<n-1; i++){
        for (int j=0; j<n-1-i; j++){
            if (arr[j] > arr[j+1]){
                int time = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]=time;
            }
        }
    }
    System.out.print("Sorted array: ");
    for (int i=0; i<n; i++){
        System.out.print(arr[i]+" ");
    }
}
}
