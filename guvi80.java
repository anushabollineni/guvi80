import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
        while (n > 0)
 {
            if (n % 2 != 0)
 {
                System.out.println(n % 10 + " is odd");
            }
            n = n / 10;
        
	}
}
}
