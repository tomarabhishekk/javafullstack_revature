package eg1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" A s d E     ! a @ _dsk1239AX1iklasd>_f";
		int alpha =0,upper=0,lower=0,digit=0,alphanum=0,whitespace=0,special=0;
		
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if (Character.isAlphabetic(c)) {
				alpha++;
			}
			if(Character.isUpperCase(c)) {
				upper++;
			}
			if(Character.isLowerCase(c)) {
				lower++;
			}
			if(Character.isDigit(c)) {
				digit++;
			}
			if(Character.isLetterOrDigit(c)) {
				alphanum++;
			}
			if(Character.isWhitespace(c)) {
				whitespace++;
			}
			if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
				special++;
			}
		}
		System.out.println(alpha);
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(digit);
		System.out.println(alphanum);
		System.out.println(whitespace);
		System.out.println(special);
	}

}
