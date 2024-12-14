import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();  // Number of test cases
        
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();  // Number of students
            int M = scanner.nextInt();  // Number of tickets
            
            if (N > M) {
                System.out.println(N - M);  // Students who won't get tickets
            } else {
                System.out.println(0);  // All students can get tickets
            }
        }
        
        scanner.close();// your code goes here

	}
}
