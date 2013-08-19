import package_one.AnotherClassToCheckIn;
import package_two.SeeWhatThisDoes;


public class GIT_Test_Proj_Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		AnotherClassToCheckIn a = new AnotherClassToCheckIn("Happy");
		SeeWhatThisDoes s = new SeeWhatThisDoes();
		
		System.out.println(s.add(a.elementAt(0)));
	}

}
