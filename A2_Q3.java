import java.util.*;
public class Main
{
public static void main(String[] args) {
  Scanner sc =new Scanner(System.in);
  String num = sc.next();
  char var;
  int index=0;
  char[] arr = num.toCharArray();
  int len = arr.length;
  for (int i = 0; i <len-1; i++) 
	{
      	index=i;
      	for (int j = i+1; j < len; j++) 
	{
 
       if(arr[j]<arr[index])
       		{
           	   index=j;
       		}
}
       
       	   var=arr[index];
           arr[index]=arr[i];
           arr[i]=var;
 
   }  
 

 
for(int k=0;k<len;k++){
System.out.print(arr[k]);
}
 
}
 
 

}