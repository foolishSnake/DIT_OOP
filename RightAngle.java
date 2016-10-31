import javax.swing.JOptionPane;

class RightAngle{
	public int side1;
	public int side2;
	
	public RightAngle(int n, int m){
		side1 = n;
		side2 = m;
	}
	
	public double getThirdSide(){
		return (Math.sqrt((Math.pow(side1,2)) + (Math.pow(side2,2))));
	}
	
	public static void main(String[] args){
		RightAngle r1 = new RightAngle(3,5);
		String output = String.format("The third side of a triangle with sides %d  and %d is %f",r1.side1, r1.side2, r1.getThirdSide());
		JOptionPane.showMessageDialog( null, output );
		//System.out.printf("The third side of a triangle with sides %d  and %d is %f",r1.side1, r1.side2, r1.getThirdSide());
	}
}