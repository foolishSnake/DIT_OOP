

class Circle{
	public int rad;
	static final double PI = 3.14;
	
	public Circle(int startRad){
		rad = startRad;
	}// end Circle
	
	public double getArea(){
		double area = Math.pow(rad, 2) * PI;
		return area;
	}// end area
	
	public double getCir(int rad){
		double cir = (PI * rad * 2);
		return cir;
	}// end getCir
	
	
	public static void main(String args[]){
		//Circle cl = new Circle(5);
		Circle x = new Circle(10);
		
	//System.out.println(x);	
	System.out.printf("The area of our circle is %f", x.getArea());
	//System.out.printf("The area of our cir is %f", cl.getCir);
	}
}// end circle