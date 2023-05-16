package java2;

class A{
	int e=67;
}
class B extends A{
	int h=89;
}
class C extends B{
	int m=95;
}
class D extends C{
	int p=92;
}
class E extends D{
	int c=87;
}
class F extends E{
	public static void main(String args[]) {
		F obj=new F();
		float Average=(obj.e+obj.h+obj.m+obj.p+obj.c);
		System.out.println("Average is:"+Average);
	}
}