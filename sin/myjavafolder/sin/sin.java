package sin;
import java.util.Scanner;

class marks  {
	int m1,m2,m3,m4,m5;
	Scanner w=new Scanner(System.in);
	public void mark() 
	{
		System.out.println("Enter marks of five subjects");	
		m1=w.nextInt();
		m2=w.nextInt();
		m3=w.nextInt();
		m4=w.nextInt();
		m5=w.nextInt();
	}
public void display() {
	System.out.println("Average of marks is"+((m1+m2+m3+m4+m5)/5));
}
}
	
public class sin extends marks{
	public static void main(String args[])
	{
		sin f=new sin();
		f.mark();
		f.display();		
	}
}
		
