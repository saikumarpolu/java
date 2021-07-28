/*wap to print total count of all the odd numbers present betweem 21 to 37*/

class  Countofodd
{
	public static void main(String[] args) 
	{
		int count=0;
		for (int i=21;i<=37;i++)
		{
			if(i%2==1)

			{
				count++;
			}
		
		}
					System.out.println("the total count of odd numbers between 21 to 37 is "+count);

	}
}
