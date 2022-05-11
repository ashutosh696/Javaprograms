package test;

public class MutiDArray {

	public static void main(String[] args) {
		int a[][]=new int[2][3];
a[0][0]=101;
a[0][1]=102;
a[0][2]=103;

a[1][0]=201;
a[1][1]=202;
a[1][2]=203;

for(int i=0;i<a.length;i++)
{
	System.out.print("Flates of "+i+"th Floor ");	
for(int j=0;j<a[i].length;j++)
{
	
System.out.print(a[i][j]);
System.out.print(" ");

}

System.out.print("\n");

}
	}

}
