import java.util.*;
public class ArrayRange {
    static int findArrayRange(int A[]){
        int max = A[0];
        int min = A[0];
        for ( int i=1;i<A.length;i++ )
        {
            if ( A[i] > max )
                max = A[i];
            else if ( A[i] < min )
                min = A[i];
        }
        return max-min;
    }
   
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int array[]= new int[arraySize];
        for(int i=0;i<arraySize;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("The range of the array is " + findArrayRange(array));
    }
}
