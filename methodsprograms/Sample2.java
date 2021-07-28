/*wap to create two non static methods*/


class Sample2 
{
	public void fly()
	{
		System.out.println("fly high");
	}
		public void drink()
	{
			System.out.println("drinking");
	}

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Sample2 obj=new Sample2();
		obj.fly();
	    obj.drink();
        System.out.println(" main ends");
	}
	}

