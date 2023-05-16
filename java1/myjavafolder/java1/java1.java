package java1;

class A{
	int e=87;
}
class B{
	int h=88;
}
class C{
	int m=67;
}
class D{
	int p=90;
}
class E{
	int c=79;
}
public class java1{
	public static void main(String args[]) {
     A obj1=new A();
     B obj2=new B();
     C obj3=new C();
     D obj4=new D();
     E obj5=new E();
     float Average=(obj1.e+obj2.h+obj3.m+obj4.p+obj5.c)/5;
     System.out.println("Average is:"+Average);

     
	}
}