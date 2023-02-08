import java.util.Scanner;
class Interest
{
	public static void main(String args[])
	{
		double p,r,t,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal Amount:");
		p=sc.nextDouble();
		System.out.println("Enter Rate of Interest:");
		r=sc.nextDouble();
		System.out.println("Enter Number of year:");
		t=sc.nextDouble();
		s=p*r*t/100;
		System.out.println("Simple interest :"+s);
	}
}