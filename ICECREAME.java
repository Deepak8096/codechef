import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();  // Cost of one ice cream
        int Y = sc.nextInt();  // Money Chef has

        if (Y >= 2 * X) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

	}
}
