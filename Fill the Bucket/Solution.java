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
		while(Testcases > 0){
		    int K_capacity = scn.nextInt();
		    int X_filledliterofwater = scn.nextInt();
		    int difference = K_capacity - X_filledliterofwater;
		    if(difference >= 0){
		        System.out.println(difference);
		    }   
		    else{
		        System.out.println(-1);
		    }
		    Testcases--;
		}
	}
}
