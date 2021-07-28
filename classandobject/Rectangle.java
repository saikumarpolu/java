/*wap for rectangle object
  rectangle states are length and width
  rectnagle behavoiur print rectangle dimensions.create main method,create 3 rectangle objects and
  print dimensions*/


class Rectangle
{
	public int length;
	public int width;
	public void displyDimensions()
	{
		System.out.println("length is"+this.length);
			System.out.println("width"+this.width);
	}


  public static void main(String[] args) 
	{
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		Rectangle r3=new Rectangle();


		r1.length=9;
		r1.brath=6;
		r2.length=7;
		r2.width=9;
		r1.dimensions();

	
		
	

	}
}
