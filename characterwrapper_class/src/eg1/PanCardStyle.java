		package eg1;

public class PanCardStyle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="BPJIA7502M";
		System.out.println(isValidPan(s));
		System.out.println(isValidPan("asdasdqweqe"));
		
	}
	public static boolean isValidPan(String s) {
		boolean b=false;
		if(s!=null && s.length()==10 && Character.isUpperCase(s.charAt(9))) {
			int upper=0;
			for (int i = 0; i <5; i++) {
				if(Character.isUpperCase(s.charAt(i))) {
					upper++;
				}
				
			}
			if(upper==5) {
				int digit =0;
				for (int i = 5; i<9; i++) {
					if(Character.isDigit(s.charAt(i))) {
						digit++;
						
					}
				}
				if(digit==4) {
					b=true;
				}
			}
		}
		return b;
	}

}
