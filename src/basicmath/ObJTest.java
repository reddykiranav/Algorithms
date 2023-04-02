package basicmath;

/**
 * @author reddy
 *
 */
public class ObJTest{
	
	 int a;
	 int b;
	 String c;
	
	// setters
	// getters
	
	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public String getC() {
		return c;
	}


	public void setC(String c) {
		this.c = c;
	}


	{
		System.out.println("In Instance Block");
	
	}
	
	
	@Override
	public String toString() {
		return "ObJTest [a=" + a + ", b=" + b + ", c=" + c + "]";
	}


	public ObJTest() {
		// TODO Auto-generated constructor stub
		System.out.println("In Constructor");
		Object object = new Object();
	    System.out.println("Class Name of Object::" + object.getClass());
	}
	
	
	public static void main(String[] args) {
		ObJTest jTest = new ObJTest();
	}
	
	

}