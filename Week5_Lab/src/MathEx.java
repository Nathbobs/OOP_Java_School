
public class MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 60984;
		int b = 808;
		
		double x = 2.0;
		double y = 3.0;
		double r;
		
		r = Math.random()*10;
				/* Random Number, 0<=r<10 */
		
		System.out.println("Maximum: " + Math.max(a,b));
		System.out.println("Mininum: " + Math.min(a,b));
		System.out.println("x^y: " + Math.pow(x,y));
		System.out.println("y^x: " + Math.pow(y,x));
		System.out.println("Radius: " + r);
		System.out.println("Circle area: " + Math.PI*r*r);
		
	}

}
