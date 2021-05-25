import java.util.*;
public class MangoTree {
    static void checkMangoTree(int rownumber, int columnnumber, int lastcolumn) {
        //Assuming row and column starts from index 1
        if (rownumber == 1 || columnnumber == 1 || columnnumber == lastcolumn)
            System.out.println("Mango Tree");
        else
            System.out.println("Not a Mango Tree");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter last column number");
        int lastcolumnnumber = sc.nextInt();
        System.out.println("Enter tree row number");
        int treerownumber = sc.nextInt();
        System.out.println("Enter tree column number");
        int treecolumnnumber = sc.nextInt();
        checkMangoTree(treerownumber, treecolumnnumber, lastcolumnnumber);

    }
}
