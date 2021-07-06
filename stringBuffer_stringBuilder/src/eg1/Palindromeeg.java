package eg1;

public class Palindromeeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		System.out.println(isPalindrome(s));
		int x=121;
		System.out.println(isPalindrome(x+""));
		}
public static boolean isPalindrome(String s) {
	StringBuffer sb=new StringBuffer(s);
	sb.reverse();
	String temp=sb.toString();
	return s.equals(temp);
}
}