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
	}
	
}

class D implements C
{
	
}
class E implements A{}
public class TestInterface {

	public static void main(String[] args) {
		 
D d=new D();
d.name(); //C

A a=new E();
a.name();//A

	}

}

