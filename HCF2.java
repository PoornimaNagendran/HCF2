import java.util.Scanner;
public class HCF2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("HCF of 2 numbers");
System.out.println("Enter 2 numbers");
int a=s.nextInt();
int b=s.nextInt();
if(a<=b)
{
for(int i=a;i>0;i--)
{
	if(a%i==0 && b%i==0)
	{
		System.out.println("HCF of "+a+" and "+b+" is "+i);
		break;
	}
}
}
else
{
	for(int i=b;i>0;i--)
	{
		if(a%i==0 && b%i==0)
		{
			System.out.println("HCF of "+a+" and "+b+" is "+i);
			break;
		}
	}
}
	}

}
