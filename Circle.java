class Circle{
	public int rad;
	public double pi = 3.14;
	public Circle(int startRad){
		rad = startRad;
	}// end Circle
	
	public double getArea(int rad){
		double area = rad * rad * pi;
		return area;
	}// end area
	
	public double getCir(int rad){
		double cir = (pi * rad * 2);
		return cir;
	}// end getCir
	
	
	public static void main(String args[]){
		Circle cl= new Circle(5);
		
	System.out.printf("The area of our circle is %f", cl.getArea);
	System.out.printf("The area of our cir is %f", cl.getCir);
	}
}// end circle