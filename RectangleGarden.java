import java.util.*;
public class MangoTree {
    static void checkMangoTree(int totalrows, int totalcolumns, int treenumber) {
        if(treenumber>(totalrows*totalcolumns))
            System.out.println("Your tree is not in dora's rectangular garden");
       else if (treenumber<=totalcolumns || treenumber%totalcolumns==0 || treenumber%totalcolumns==1)
            System.out.println("Mango Tree");
       else
            System.out.println("Not a Mango Tree");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of rows");
        int totalrows = sc.nextInt();
        System.out.println("Enter total number of columns");
        int totalcolumns = sc.nextInt();
        System.out.println("Enter tree number");
        int treenumber = sc.nextInt();
        checkMangoTree(totalrows, totalcolumns, treenumber);

    }
}
