package eg1;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="BPJIA7502m";
		if(s!=null && s.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println("Valid pan");
		}else {
			System.out.println("invalid pan");
		}
		String s1=" A s d E     ! a @ _dsk1239AX1iklasd>_f";
		System.out.println(s1.replaceAll("[a-zA-z]","" ));
		System.out.println(s1.replaceAll("[a-zA-z]","" ).length());
		
		String s3="+91-9140598069";
		if(s3.matches("\\+91-[0-9]{10}")) {
			System.out.println("valid num");
		}else {
				System.out.println("invalid num");
			}
		}
	}


