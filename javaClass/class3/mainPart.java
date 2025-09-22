package class3;
import java.util.Scanner;

public class mainPart {
    public static void main(String[] args)
    {
        // Take Range from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting range: ");
        int x = sc.nextInt();
        System.out.println("Enter ending Range: ");
        int y = sc.nextInt();
        int count = 0;

        for(int i=x; i<=y; i++)
        {
            if(i%3==0)            
                count++;
            
            if(i%5==0)
                count++;
            
            if(i%7==0)
                count++;
            
        }
        System.out.println(count);
    }
}
