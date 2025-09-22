package class4;
import java.util.Scanner;
class ArrayParameter{
    int[] num;   
    ArrayParameter(int[] arr) {
        num = arr;
    }
    public void UserInput(){
        System.out.println("\nEntered array elements are:\n ");
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
    }
}

public class array{
    public static void main(String[] args) {
        System.out.println("Enter number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter parameters: ");
        int num[] = new int[n];
        for(int i=0; i<n; i++){
            num[i]=sc.nextInt();
        }

        ArrayParameter object = new ArrayParameter(num);
        object.UserInput();
    }
}

