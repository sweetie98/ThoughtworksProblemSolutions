import java.util.*;
public class SalaryEvaluation {
    static long salaryOfAWeek(int hoursPerDay[])
    {
        int hoursInAWeek =0;
        int salary=0;
        for(int i=0;i<7;i++)
        {
            if(i==0)
                salary+= hoursPerDay[i]*150;
            else if(i==6)
                salary+= hoursPerDay[i]*125;
            else
            {
                if(hoursPerDay[i]>8)
                {
                    salary+=(8*100)+(hoursPerDay[i]-8)*115;
                }
                else
                {
                    salary+=hoursPerDay[i]*100;
                }
                hoursInAWeek+=hoursPerDay[i];
            }
        }
        if(hoursInAWeek>40)
            salary+=(hoursInAWeek-40)*25;
       return salary;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int hoursPerDay[] = new int[7];
        for(int i=0;i<7;i++)
        {
            hoursPerDay[i]=sc.nextInt();
        }
        System.out.println(salaryOfAWeek(hoursPerDay));

    }
}
