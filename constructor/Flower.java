class Flower
{
	public String Fname;
	public Flower(String Fname)
	{
		this.Fname=Fname;
}
   public void display()
	{
	   System.out.println("the flower name is:"+Fname);
	}
	
	public static void main(String[] args) 
	{
		Flower f1=new Flower("rose");
		Flower f2=new Flower("lilly");
		Flower f3=new Flower("jasmine");
		f1.display();
		f2.display();
		f3.display();
	}
}
