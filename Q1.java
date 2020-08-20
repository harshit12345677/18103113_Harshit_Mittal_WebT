import java.util.*;
public class xyz 
    {

	 public static String sort_the_string(String in_string)
	 { 
	     char array[] = in_string.toCharArray();  
	     Arrays.sort(array); 
	     return new String(array); 
	 } 
	public static void main(String[] args) 
	 {
	    	int occur = 0;
		System.out.println(" Enter the string ");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(" Enter the substring ");
		String sub_str = s.nextLine();
		int len = str.length();
		sub_str = sort_the_string(sub_str);
		for(int i=0;i<len;i++) 
		{
			for(int j=i;j<len;j++) 
			{
				String help =  str.substring(i, j+1);
				help = sort_the_string(help);
				if(help.equals(sub_str))
				occur += 1;
			}
		}
		System.out.print(" Count of substring is ");
		System.out.println(occur);
	 }

    }
