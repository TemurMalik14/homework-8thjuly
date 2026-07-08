import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i=0; i<n; i++){
        System.out.print("Element "+(i+1)+": ");
        arr[i]= input.nextInt();
        }
                System.out.print("Array: ");
        for (int i=0; i<n; i++){
        System.out.print(arr[i]+" ");
        }
        int[] backArr = new int[n];
        for (int i=0; i<n; i++){
        backArr[i] = arr[n-1-i];
        }
        System.out.print("Reverse counted array: ");
        for (int i=0; i<n; i++){
        System.out.print(backArr[i]+" ");
        }
                }
                }