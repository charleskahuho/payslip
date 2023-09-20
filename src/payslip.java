import java.util.Scanner;

public class payslip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.println("enter your employee number");
		int employeeNum = Scanner.nextInt();
		System.out.println("provide your name");
		String employeeName = Scanner.next();
		System.out.println("enter your designation");
		String Designation = Scanner.next();
		System.out.println("enter the days worked");
		int days = Scanner.nextInt();
		System.out.println("enter your pay rate");
		Double payrate = Scanner.nextDouble();
		System.out.println("enter the generation date");
		String genDate = Scanner.next();
		double basicPay = days * payrate;
		double pf = basicPay/ 10;
		double proftax = 0.2 * basicPay;
		double total = pf + proftax;
		double net = basicPay - total;
		System.out.println("\t\t\tSHREE KRISHNA CHEMISTS AND DRUGGISTS");
		System.out.println("\t\t\t\t SALARY MONTH 9 2013");
		System.out.println(" ");
		System.out.println("EMP.NO.:" + employeeNum + "\t\t EMP.NAME.:" + 	employeeName + "\t\t DESIGNATION:" + Designation);
		System.out.println("DAYS WORKED.:" + days + "\t\t PAY RATE:" + 	payrate + "\t\t    GEN.DATE:" + genDate);
		System.out.println("____________________________________________________________________________________________________________");
		System.out.println("EARNINGS\t AMOUNT(RS.)\t\t\tDEDUCTIONS\t\tAMOUNT(RS.)");
		System.out.println("____________________________________________________________________________________________________________");
		System.out.println("BASIC PAY\t" + basicPay +"\t\t\t     P.F\t\t\t" + pf);
		System.out.println("\t\t\t\t\t\tPROF.TAX\t\t" + proftax);
		System.out.println(" ");
		System.out.println("____________________________________________________________________________________________________________");
		System.out.println("CROSS.EARN\t " + basicPay + "\t\t\t       TOTAL DEDUCT.\t\t" + total);
		System.out.println("\t\t\t\t\t\tNET PAY\t\t    " + net);
		System.out.println("____________________________________________________________________________________________________________");


	}

}
