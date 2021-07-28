//wap to create  two static and non static variables,acess in main method .draw excution diagram.


class Demoexcution
{
	public static int a=69;
	public  double b=69.7;
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		System.out.println(a);
		Demoexcution d=new Demoexcution();
		System.out.println(d.b);


		System.out.println("main ends....");
	}
}
