import java.util.*;
public class ArrayType {
    static int checkArrayType(int array[])
    {
        boolean checkEven=false;
        boolean checkOdd =false;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]%2==0)
                checkEven=true;
            else
                checkOdd =true;
            if(checkEven && checkOdd)
                return 3;
        }
     return (checkEven? 1:2);
    }
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int arraySize = sc.nextInt();
     int array[] = new int[arraySize];
     for(int i=0;i<arraySize;i++)
        array[i]=sc.nextInt();
     String type[]={"Even","Odd","Mixed"};
     System.out.println("The array is "+type[checkArrayType(array)-1]);
    }
}
