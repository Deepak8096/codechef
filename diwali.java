import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int amountpaid=A-B;
		if(amountpaid<0)
		{
		    amountpaid=0;
		}
		System.out.println(amountpaid);

	}
}
