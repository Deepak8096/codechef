import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        int totalMoney = (X * 5000) + (Y * 9800);
        
        System.out.println(totalMoney);
        sc.close();
    }
}