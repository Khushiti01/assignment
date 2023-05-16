package name;
import java.util.*;

public class ten {

	public static void main(String[] args) {
	int a;
	int i=1;
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter 1 for for loop");
		System.out.println("Enter 2 for while loop");
		System.out.println("Enter 3 for do-while loop");
		a= sc.nextInt();
	}
	switch(a)
	{
	case 1: for(i=1;i<=10;i++) {
		System.out.println("Khushi");
	}
	break;
	case 2: while(i<=10) {
		System.out.println("Khushi");
		i++;
	}
	break;
	case 3: do {
		System.out.println("Khushi");
		i++;
	}while(i<=10);
	break;
	default : System.out.println("invalid input");
	
	
	
	
	}
	

	}

}
