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
		int t = scn.nextInt();
		while(t>0){
		    int chocolates = scn.nextInt();
		    if(chocolates % 2 == 0){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		    t--;
		}
	}
}
