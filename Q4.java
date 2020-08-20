import java.io.*; 
import java.util.Arrays; 
import java.util.Collections; 
import java.util.Scanner;

public class Q4 
{ 
 
    static boolean check_anagram(String str1,String str2) 
{
        if (str1.length() != str2.length()) 
	{
            return false;
        }
        
        int occur[] = new int[256];
        
        for(int i=0;i<str1.length();i++) 
	{
            occur[str1.charAt(i)]++;
            occur[str2.charAt(i)]--;
        }
        
        for(int i =0;i<256;i++) 
	{
            if (occur[i]!= 0) 
	    {
                return false;
            }
        }
        
        return true;
    }


	public static void main(String args[]) 
	{ 
		Scanner myObj = new Scanner(System.in);
        	System.out.println("Enter Strings");
        	String str1= myObj.nextLine();
        	String str2= myObj.nextLine();
        
		if (check_anagram(str1,str2)) 
			System.out.println("Given string are anagrams"); 
		else
			System.out.println("Given string are not anagrams"); 
	} 
} 
