import java.util.*;
public class A2_Q4 
{

public static void main(String[] args) 
{
		int num = Integer.MAX_VALUE;
		int  var1 = 0;
		
		for(int i=num;i>=1;i--)
		{
			int s;
			s=i*i;
			int t = (i*(i+1))/2;
			if(s==t)
			{
				System.out.println(i);
				break;
			}
		}
		
	}
}
