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
        int Z = sc.nextInt();

        int cost_with_combos = 2 * Z + Y;
        int cost_without_combos = 2 * X + 3 * Y;

        System.out.println(Math.min(cost_with_combos, cost_without_combos));// your code goes here

	}
}
