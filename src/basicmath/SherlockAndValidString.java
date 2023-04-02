/**
 * 
 */
package basicmath;

/**
 * @author reddy
 *
 */
public class SherlockAndValidString{

	String emplname;
	int age;
	
	public SherlockAndValidString(String emplname, int a) {
		super();
		this.emplname = emplname;
	}
	
	public SherlockAndValidString() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		
		int a = 8;
		int b = 9;
        int d= 953675678;
		String c = "10";
		//int d = Integer.parseInt(c);
		System.out.println("Reqd op : "+d);
		int lint = -Integer.MAX_VALUE/10;
		System.out.println("multimin"+lint);
		//String str = new String("abd"); // hashcode - memory id - 123
	    //String str2 = new String("fgh"); // hashcode - memory id - 124
		//String str3 = str2;
		SherlockAndValidString one = new SherlockAndValidString("kiran",2);
		SherlockAndValidString two = new SherlockAndValidString("reddy",23);
		SherlockAndValidString three = (SherlockAndValidString) two.clone();
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		three.emplname = "new name";
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
	}
	public String getEmplname() {
		return emplname;
	}
	public void setEmplname(String emplname) {
		this.emplname = emplname;
	}
	
	@Override
	public String toString(){
		return emplname;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		SherlockAndValidString andValidString = new SherlockAndValidString();
		andValidString.setEmplname(this.emplname);
		return andValidString;
	}
}