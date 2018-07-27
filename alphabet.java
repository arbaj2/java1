import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			char c;
		Scanner sc=new Scanner(System.in);
		c=sc.next().charAt(0);
		if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z' ))
		{
			System.out.println("Alphabet");
		}
		else 
		{
			System.out.println("No");
	}
}
}
