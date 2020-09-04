import java.util.*;
public class Main
{	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<num;i++)
	arr[i]=sc.nextInt();
	
	int occur[]=new int[100005];	
	for(int i=0;i<21;i++)
		occur[i]=0;
	
	for(int i=0;i<num;i++)
	{
		occur[arr[i]]++;
	}

	int i=0,index=0;
	while(i<num && index<21)
	{
		while(index<21 && occur[index]<=0)
		index++;
		if(index==21)
		break;
		arr[i++]=index;
		occur[index]--;
	}
	
	for(i=0;i<num;i++)
	{
	System.out.print(arr[i]+" ");
	}
	}
}