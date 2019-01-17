package operations;

import java.util.Scanner;

public class calAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b;
		Scanner sc = new Scanner(System.in);
		int ch=0;
		do {
			System.out.println("Enter choice");
			System.out.println("1.ADD 2 nos");
			System.out.println("2.Subtract 2 nos");
			System.out.println("5.Exit");
			ch=sc.nextInt();
			if(ch==1) {
				System.out.println("enter the 2 numbers to add : ");
				a=sc.nextFloat();
				b=sc.nextFloat();
				float res=a+b;
				System.out.println("Result is : "+res);
			}
			else if(ch==2) {
				System.out.println("enter the 2 numbers to subtract : ");
				a=sc.nextFloat();
				b=sc.nextFloat();
				Subtract su = new Subtract(a,b);
				float res=su.getResult();
				System.out.println("Result is : "+res);
			}
			else if(ch!=5) {
				System.out.println("enter valid choice");
			}
			System.out.println("\n --------------------------------------------\n");
		}while(ch!=5);
	}

}
