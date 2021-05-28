import java.util.*;
public class UpperTriangularMatrix
{
        static boolean checkLowerTriangular(int matrix[][],int numOfRows)
        {
            for (int i=0; i < numOfRows; i++)
                for (int j =i+1; j < numofRows; j++)
                  if (mat[i][j] != 0)
                       return false;
            return true;
        }
        public static void main(String[] args)
      	{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows: ");
            int numOfRows = sc.nextInt();
            System.out.println("Enter the number of columns: ");
            int numOfColumns=sc.nextInt();
            if(numOfRows==numOfColumns)
            {
                int[][] matrix = new int[numOfRows][numOfColumns];
                System.out.println("Input matrix elements : ");
                for(int i = 0; i < numOfRows; i++)
                  {
                    for(int j = 0; j < numOfColumns; j++)
                      matrix[i][j] = sc.nextInt();
                  }
                 System.out.println(checkLowerTriangular(matrix,numOfRows)?"yes":"no");		
            }
            else
            {
                System.out.println("no");
            }
        }
    
}
