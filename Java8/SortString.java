package mypack166;

public class SortString {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("ashutosh");
		System.out.println(sb.reverse());

		StringBuilder sbd = new StringBuilder("abc");
		System.out.println(sbd.indexOf("c"));// 2
		System.out.println(sbd.indexOf("z"));// -1

		String s = "ashutosh";
		char[] a = s.toCharArray();
		char temp;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}

		System.out.print(new String(a));

	}

}
