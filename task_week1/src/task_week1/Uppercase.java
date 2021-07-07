
package task_week1;

public class Uppercase {

	public static void main(String[] args) {

		String s = "hello hi good evening everyone hope you are enjoying progamming with java";
		StringBuilder sb = new StringBuilder();
		String ar[] = s.split(" ");
		int Len = ar.length;
		for (int i = 0; i < Len; i++) {

			sb.append(ar[i].substring(0, ar[i].length() - 1)).append(ar[i].toUpperCase().charAt(ar[i].length() - 1))
					.append(" ");

		}

		System.out.println(sb.toString().trim());

	}

}