/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	    Scanner scn = new Scanner(System.in);
	    int Testcases = scn.nextInt();
	    while(Testcases>0){
	        long N = scn.nextInt();
	        //int div = N/2;
	        if(N%2 == 0){
	            System.out.println(N*(N/2));
	        }
	        else{
	            System.out.println((N+1)*(N/2));
	        }
	        Testcases--;
	    }
	}
}
