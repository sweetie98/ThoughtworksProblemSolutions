import java.util.*;
public class CollatzSequence {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the sequence starting number");
      int startingNumber = sc.nextInt();
      int tempVariable = startingNumber;
      while(true)
      {
          if(tempVariable==1)
          {
              System.out.print(tempVariable);
              break;
          }
          System.out.print(tempVariable+"->");
          tempVariable=(tempVariable%2==0)?tempVariable/2:(3*tempVariable+1);
      }
      
    }
}
