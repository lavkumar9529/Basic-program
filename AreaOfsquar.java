import java.util.*;
public class AreaOfsquar{
    
    public static void main(String[] args) {
       Scanner se = new Scanner(System.in);
       System.out.println("Enter side= ");
       int side = se.nextInt();
       int Area = side*side;
       System.out.println(Area);
       
       se.close();
    }
}
