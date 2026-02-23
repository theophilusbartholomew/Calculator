import java.util.Scanner;
class Calculator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char chf;
		do
		{
		System.out.println("Enter Please!");
		double a=sc.nextDouble();
		char ch=sc.next().charAt(0);
		double b=sc.nextDouble();
		switch(ch)
		{
			case '+' :
				{
					System.out.println("Answer is : "+(a+b));
					break;
				}
			case '-' :
				{

					System.out.println("Answer is : "+(a-b));
					break;
				}
			case '*' :
				{
					System.out.println("Answer is : "+ (a*b));
					break;
				}
			case '/' :
				{
					System.out.println("Answer is : "+(a/b));
					break;
				}
		}
		System.out.println("Do you want to continue? y/n");
		chf=sc.next().charAt(0);
		} while(chf== 'y' || chf== 'Y');
	}
}


