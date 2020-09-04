import java.util.*;
public class Main
{
    public static void main(String args[])
	{
	String str1,str2;
	Scanner sc=new Scanner(System.in);
	str1=sc.next();
	str2=sc.next();
	int len1=str1.length();
	int len2=str2.length();
	int len;
	if(len1>len2)
	{
	    len = len1;
	}
	else
	len = len2;
	int res=0;
	for(int i=0;i<len;i++)
	{
		if(str1.charAt(i)<str2.charAt(i))
		{
		    res=1;
		    break;
		    
		}
		else if(str1.charAt(i)>str2.charAt(i))
		{
		    res=2;
		    break;
		    
		}
	}
	if(res==0)
	{
		if(len1==len2) 
		System.out.println("Length of both strings is equal");
		else if(len1<len2)
		System.out.println("Length of 1st string is less than 2nd string");
		else 
		System.out.println("Length of 2nd string is less than 1st string");
	}
	else
	{
		if(res==1) 
		System.out.println("Length of 1st string is less than 2nd string");
		else 
		System.out.println("Length of 2nd string is less than 1st string");
	}
	}
}