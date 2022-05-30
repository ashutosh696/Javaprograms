package mypack;

import java.io.FileOutputStream;

public class TrywithResources {

	public static void main(String[] args) {

try (FileOutputStream out=new FileOutputStream("D:\\Spring workspace\\test\\src\\mypack\\abc.txt"))

{
	String str=" TrywithResources introduced in java 7 ";
	
byte arr[]	=str.getBytes();

out.write(arr);

	
}
catch (Exception e) {
System.out.println("Exception: "+e);	
}
System.out.println(" Resource are closed ");
	}
	
}
