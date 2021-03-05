package assignstringclasses;

class Stringassign {
	public static void main(String[] args) {

		String s1 = "lakshmi";
		String str = "rajyalakshmi";
		String s2 = "MahaLakshmi";

		char c = s1.charAt(2);
		System.out.println("char value is " + c);

		int i = s1.codePointAt(3);
		System.out.println("code point value is " + i);

		int i1 = s1.codePointBefore(4);
		System.out.println("code point before value is " + i1);

		int i2 = s1.codePointCount(0, 6);
		System.out.println("code point count " + i2);

		int i3 = s1.compareTo(str);
		System.out.println("comparision is " + i3);

		int i4 = s1.compareToIgnoreCase(s2);
		System.out.println("compared by ignoring case " + i4);

		String s3 = s1.concat(str);
		System.out.println("concatination " + s3);

		boolean b1 = s1.contains(str);
		System.out.println("contains= " + b1);

		boolean b2 = s1.contentEquals(s2);
		System.out.println("content equals= " + b2);

		boolean b3 = s1.endsWith(s3);
		System.out.println("ends with=" + b3);

		boolean b4 = s1.equalsIgnoreCase("Lakshmi");
		System.out.println("equating by ignoring case= " + b4);

		boolean b5 = s2.isEmpty();
		System.out.println("empty= " + b5);

		int i5 = s2.hashCode();
		System.out.println("hashcode =" + i5);

		int i6 = str.indexOf('k');
		System.out.println("index of k is " + i6);

		int i7 = s3.indexOf('a', 2);
		System.out.println("index of a after 2= " + i7);

		int i8 = s3.lastIndexOf('a');
		System.out.println("last index of a is " + i8);

		int i9 = s3.lastIndexOf('a', 2);
		System.out.println("last index of a after 2 " + i9);

		int i10 = s3.lastIndexOf("renuka");
		System.out.println("last index of string is " + i10);

		int i11 = s1.length();
		System.out.println("length of s1 is " + i11);

		boolean b6 = s1.matches(s3);
		System.out.println("matches = " + b6);

		String s4 = str.toUpperCase();
		System.out.println("the upper case is " + s4);

		String s5 = str.toLowerCase();
		System.out.println("the lower case is " + s5);

		String s6 = s1.substring(0);
		System.out.println("the substring is " + s6);

		String s7 = str.substring(0, 4);
		System.out.println("the substring of the string is " + s7);

		String s8 = s3.trim();
		System.out.println("by trimming the string is " + s8);

		String s9 = s2.substring(3);
		System.out.println("the substring of the string is " + s9);

		char[] r = s1.toCharArray();
		for (int z = 0; z <= s1.length() - 1; z++) {
			System.out.println("the length of array  " + r[z]);
		}
		
	}
}