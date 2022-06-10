package uhg;

public class UniqueCharString {

	public static void main(String[] args) {
		 String s="aabbccddeerffy";
		 
		 String temp="";
		 
		 for (int i = 0; i < s.length(); i++) {
			if(temp.indexOf(s.charAt(i))==-1)
			 temp=temp+s.charAt(i);
		}
		 System.out.println(temp);
	}

}
