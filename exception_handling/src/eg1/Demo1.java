package eg1;

public class Demo1 {
public static void main(String[] args) {
	int x=10;
	int y=2;
	int res=0;
	try {
		res=x/y;
		System.out.println(args[0]);
		String s=null;
		System.out.println(s.length());
		System.out.println(res);
		
	}catch(ArithmeticException e){
		System.out.println("no");
		
	}catch(NullPointerException e) {
		System.out.println("definetly no");
		
	}catch(Exception e	) {
		System.out.pri ntln("other exception" +e);
	}
	finally {
		System.out.println(res);
	}
	
}
}
