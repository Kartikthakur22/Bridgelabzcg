package Week1.Assignment3;

import java.util.Scanner;

public class employeeSalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] salary=new double[10];
        double[] newSalary=new double[10];
        double[] bonus=new double[10];
        int[] years=new int[10];
        double totalBonus=0,totalNewSalary=0,totalOldSalary=0;
        System.out.println("Enter salaries and years of service");
        int ind=0;
        while(ind<10){
            System.out.println("Enter salary and years of service of employee "+ind);
            double s=sc.nextDouble();
            int y=sc.nextInt();
            if(s<0 || y<0){
                continue;
            }else{
                salary[ind]=s;
                years[ind]=y;
                ind++;
            }
        }
        for(int i=0;i<10;i++){
            totalOldSalary+=salary[i];
            if(years[i]>=5){
                bonus[i]=5*salary[i]/100;
            }
            else if(years[i]>=2){
                bonus[i]=2*salary[i]/100;
            }
            totalBonus+=bonus[i];
            newSalary[i]=bonus[i]+salary[i];
            totalNewSalary+=newSalary[i];
        }
        System.out.println("Total bonus:"+totalBonus);
        System.out.println("Total old salary:"+totalOldSalary);
        System.out.println("Total new salary:"+totalNewSalary);
        sc.close();
    }
}
