import java.util.Scanner;
class demo
{
	public static void main(String args[])	
	{
		int n1,n2,add,sub,multi,div,mod,incr,decr,n,a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		n1=sc.nextInt();
		System.out.println("Enter second number:");
		n2=sc.nextInt();
		add=n1+n2;
		System.out.println("Adition is "+add);
		sub=n1-n2;
		System.out.println("Substraction is "+sub);
		multi=n1*n2;
		System.out.println("Multiplication is "+multi);
		div=n1/n2;
		System.out.println("Division is "+div);
		mod=n1%n2;
		System.out.println("Modulus is "+mod);
		n=sc.nextInt();
		b=++n;
		System.out.println("Pre-incrematation of number is "+b);
		c=--n;
		System.out.println("Pre-decrematation of number is"+c);
		a=n++;
		System.out.println("The number is:"+a);
		d=n--;
		System.out.println("Post-incrematation of number is "+a);
		System.out.println("Post-decrematation of number is "+d);

	}
}