import java.util.*;
public class my_class 
{

	public static void main(String[] args) 
	{
	    Map<String, Integer> m  = new HashMap<>(); 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = s.nextLine();
		System.out.println("Enter total words ");
		int num = s.nextInt();
		System.out.println("Enter the words ");
		while(num!=0) 
		{
		    	num -= 1;
			String help = s.next();
			m.put(help,1);
			
		}
		
		String[] total_words = str.split(" ");
		
		Vector<String> v = new Vector<String>();
		for(String j: total_words) 
		{
			if(m.containsKey(j)) 
			{
				String help = "";
				help += j.charAt(0);
				for(int i=1;i<j.length() ;i++)
				{
					help += '*';
				}
				v.add(help);
			}
			else 
			{
				v.add(j);
			}
		}
		String res = v.elementAt(0);
		for(int i=1;i<v.size();i++)
		{
			res += " ";
			res += v.elementAt(i);
		}
		System.out.println(res);
		
	}

}
