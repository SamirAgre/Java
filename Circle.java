import java.util.Scanner;

class Circle
{
	public static void main(String args[])
	{
		int r;
		double pi=3.14f,Area,Cr;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Radius:");
		r=sc.nextInt();
		Area=pi*r*r;
		Cr=2*pi*r;
		System.out.println("Area of Circle is "+Area);
		System.out.println("Circumference of circle is "+Cr);
		
	}
}

 