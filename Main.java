import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        double sum = 0.0;
        double avg = 0.0;
        int even = 0;
        int odd = 0;
        for (int i=0; i<n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for (int i=0; i<n; i++){
            sum += arr[i];
            if (arr[i]%2!=0){
                odd+=1;
            }else {
                even+=1;
            }
            if (arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        avg = sum/n;
        System.out.print("Sum: "+sum);

        System.out.println("Average: "+avg);

        System.out.println("Min: "+min);

        System.out.println("Max: "+max);

        System.out.println("Odd : "+odd);

        System.out.println("Even : "+even);
    }
}

