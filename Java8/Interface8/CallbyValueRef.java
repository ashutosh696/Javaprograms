package Interface8;

//Call by value: work on copy of data

//Call by reference work on original data
public class CallbyValueRef {

	public static void main(String[] args) {
	
		int a=2;
		CallbyValueRef.change(a);
		System.out.println("Original value "+a);
		
		Ref r=new Ref();
		
		CallbyValueRef.changeRef(r);
		
		System.out.println("Original value "+r.b);
	}

	
	public static  void change(int a)
	{
		a=a+12;
		System.out.println("in change method "+a);
	}
	public static  void changeRef(Ref ref)
	{
		 ref.b=78;
		System.out.println("in change method "+ref.b);
	}
}

class Ref
{
int b=5;

}