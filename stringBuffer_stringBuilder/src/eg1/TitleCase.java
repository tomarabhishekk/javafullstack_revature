package eg1;

public class TitleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello hi everyone i think its tough but doable";
		StringBuilder sb=new StringBuilder();
		String ar[]=s.split(" ");
		for (int i = 0; i < ar.length; i++) {
			sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");

		}
		System.out.println(sb);
	}

}
