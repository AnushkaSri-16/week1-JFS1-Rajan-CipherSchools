import java.util.Scanner;
public class EmployeePayRoll {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter BasicPay");
        double BasicPay= sc.nextDouble();
        sc.close();
        double HRA, DA, GrossPay;
        if(BasicPay>=5000)
        {
            HRA= BasicPay/10;
            DA= BasicPay/5;
        }
        else
        {
            HRA= BasicPay/5;
            DA= (BasicPay/100)*30;
        }
        //Gross Pay= Basic Pay+ HRA+ Other allowances
        GrossPay = BasicPay+ HRA+DA;
        System.out.println(GrossPay + " is GrossPay");

    }
}
