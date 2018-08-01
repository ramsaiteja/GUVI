import java.util.*;
import java.lang.*;
import java.io.*;
class Even
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		if(s%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("invalid");
		}
	}
}
