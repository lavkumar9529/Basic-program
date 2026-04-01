import java.util.*;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int A = sc.nextInt();
        System.out.println("Enter a number: ");
        int B = sc.nextInt();
        System.out.println("Enter a number: ");
        int C = sc.nextInt();
        
        int sum = A+B+C;
        System.out.println(sum);
        float newsum = sum + (0.18f*sum);
        System.out.println(newsum);
        
        sc.close();
    }
}
