
public class MyCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalc c = new MyCalc();
		
		try {
			System.out.println(c.div(10,0));
		}catch(ArithmeticException ae) {
			System.out.println("Cant divide by zero");
		}catch(Exception ex) {
			System.out.println("This is an exception");
		}
		
		

	}
		public int div(int x, int y)  throws ArithmeticException {
			int result=0;
			result = x/y;
			System.out.println("Calculation completed");
			return x/y;
		}
}
