import java.util.*;
import java.lang.*;
import java.io.*;
class Vowel
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		char s=sc.next().charAt(0);
		if(s=='a'|| s=='e'|| s=='i'|| s=='o'|| s=='u')
		{
			System.out.println("Vowel");
		}
		else if(s=='b'||s=='c'|| s=='d'|| s=='f'|| s=='g'|| s=='h' ||s=='j' || s=='k'||s=='l'|| s=='m'|| s=='n'|| s=='p'|| s=='q'||s=='r'||s=='s'||s=='t'||s=='w'||s=='x'||s=='y'||s=='z')
		{
			System.out.println("Consonant");
		}
		else
		{
			System.out.println("invalid");
		}
	}
}
