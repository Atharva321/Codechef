// Time  : O(1)
// Space : O(1)

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
		int T = scn.nextInt();
		while(T>0){
		    int Alice = scn.nextInt();
		    int Bob = scn.nextInt();
		    if((Alice+Bob)%2 == 0){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		    T--;
		}
	}
}
