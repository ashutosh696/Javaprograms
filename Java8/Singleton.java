package hsbc;
/* Singleton */

public class Singleton implements Cloneable {

	private static Singleton INSTANCE=null;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		
		if (INSTANCE==null) {
			INSTANCE=new Singleton();
		}
		return INSTANCE;
	}
	
	@Override
		public Object clone() throws CloneNotSupportedException {
		
		throw new CloneNotSupportedException("Can't create clone of Singleton!!");
			//return super.clone();
		}
}
