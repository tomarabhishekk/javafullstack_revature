			package eg1;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer i1=10;
Integer i2=new Integer(10);
Integer i3=10;
System.out.println(i1==2);
System.out.println(i1==i3);
System.out.println(i1.equals(i2));
System.out.println(i1.equals(i3));
int x=100;
i1 =x; //Autoboxing	
System.out.println(x);
i1=99;
x=i1; //unboxing
System.out.println(x);
System.out.println(i1.compareTo(100));	
System.out.println(i1.compareTo(99));
System.out.println(i1.compareTo(90));
String s="10000";
x=Integer.parseInt(s);
System.out.println(x);
x=1899;
System.out.println(x);
s=x+"";
System.out.println(s);
s=i1.toString();
System.out.println(s);
System.out.println(Integer.MAX_VALUE);
System.out.println(Integer.MIN_VALUE);	
System.out.println(Integer.toBinaryString(99));
System.out.println(Integer.toOctalString(89));

	
	}

}
