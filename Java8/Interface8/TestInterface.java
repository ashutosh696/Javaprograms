package Interface8;
interface A
{
public default void name() {
	System.out.println("in interface A");
}	
}

interface B
{
	public default void name() {
	System.out.println("in interface B");
}	
}

interface C extends A,B
{ //for resolving Diamond problem. need to define common method otherwise it will create ambiguity
	public	default void name() {	 
		System.out.println("in interface C");
		A.super.name();//to calling interface A method
		B.super.name();//to calling interface B method
	}
	
}

public class TestInterface implements C {

	public static void main(String[] args) {
		 
		TestInterface d=new TestInterface();
		d.name(); //C

 

	}

}

