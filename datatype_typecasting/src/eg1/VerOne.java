package eg1;

public class VerOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//dataTypes
		
		
		int x=20;
		System.out.println(x);
		
		
		long m=1209120391123123123L;
		System.out.println(m);
		
		float f=344.4f;
		System.out.println(f);
		
		
		
		
		//TypeCasting
		
		
		
		double d=f; //implicit
		System.out.println("d = "+d);
		d=m; //implicit
		System.out.println("d = "+d);
		
		d=x;//implicit
		System.out.println("d = "+d);
		
		f=x;//implicit (float=int)
		System.out.println("f = "+f);
		
		
		
		int c=100;
		char s=(char)c; //explicit
		System.out.println("s = "+s);
		
		
		
		float f1=22.444f;
		System.out.println("f1 = "+f1);
		int h=(int) f1; //explicit
		System.out.println("h = "+h);
		
		
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		
	}

}
