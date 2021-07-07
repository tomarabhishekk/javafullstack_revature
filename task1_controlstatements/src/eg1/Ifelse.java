package eg1;


import java.util.Scanner;
public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		System.out.println("enter you age");
		Scanner sc=new Scanner(System.in);	
		age=sc.nextInt();
		if(age>=18) {
			System.out.println("you are adult");
			System.out.println("jai bajrang bali");
		}
		else {
		System.out.println("your age "+age);
	}

}
}