package hsbc;

public class ClientSingltonTest {

	public static void main(String[] args) throws CloneNotSupportedException {

Singleton singleton1 = Singleton.getInstance();
/* Singleton singleton2 = Singleton.getInstance(); */

Singleton singleton2 = (Singleton) singleton1.clone();

System.out.println(singleton1.hashCode());
System.out.println(singleton2.hashCode());

	}

}
