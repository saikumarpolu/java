/*wap tp create static and non static and acess static variable in main method,create two objects and acesss
non static varoiable. draw the diagram*/


class Excution3
{
	public static int a=99;
    public double b=9.1;

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		System.out.println(z);
		Excution obj=new Excution();
		Excution obj1=new Excution();

    System.out.println(obj.b);
	System.out.println(obj1.b);



		System.out.println("main ends");

	}
}
