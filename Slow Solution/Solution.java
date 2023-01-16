/* package codechef; // don't place package name! */
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
		int Testcases = scn.nextInt();
		while(Testcases>0){
		    int maxT = scn.nextInt();
		    int maxN = scn.nextInt();
		    int sumN = scn.nextInt();
		    int ans = 0;
		    int Ans = 0;
		    //Both are equal.
		    if(maxN == sumN){
		        System.out.println(maxN*maxN);
		    }
		    //Sum is possible within given iterations.
		    else if(maxT*maxN>sumN){
		        int div = Math.abs(sumN/maxN);
		        for(int i=0; i<div;i++){
		            ans += (maxN*maxN);
		        }
		        ans += ((sumN%maxN)*(sumN%maxN));
		        System.out.println(ans);
		    }
		    //Sum is not possible within given iterations.
		    else{
		        for(int i=0; i<maxT;i++){
		            ans += (maxN*maxN);
		        }
		        System.out.println(ans);
		    }
		    Testcases--;
		}
	}
}
