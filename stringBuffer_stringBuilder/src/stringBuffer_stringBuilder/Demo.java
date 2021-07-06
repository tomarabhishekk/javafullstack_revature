package stringBuffer_stringBuilder;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		sb.append(" heyy").append(1123123).append(1345566.6);
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		sb.insert(1	, "Java");
		System.out.println(sb);
		System.out.println(sb.reverse());
		sb.delete(1, 4);
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		
		
		StringBuffer sb1=new StringBuffer("Java");
		StringBuffer sb2=new StringBuffer("Java");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.toString().equals(sb2.toString()));
	
	
	
	
	
	
	}

}
