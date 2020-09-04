import java.util.*;
public class q2 
{
public static void main(String[] args) 
{
		int num;
		Scanner sc=new Scanner(System.in);
		num = sc.nextInt();
		if(num<1)
		System.out.println("Input is not valid");
		else 
		{
		    while(num!=1)
		{
			System.out.print(num+" ");
			if(num%2==0) 
			num/=2;
			else
			num=num*3+1;
		}
		System.out.print(num+" ");
		}
		}
}