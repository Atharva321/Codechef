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
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
	    
        byte test = Byte.parseByte(input.readLine());
        while (test-- > 0) {
            short n = Short.parseShort(input.readLine().trim());
            if (n>=1 && n<100) output.write("Easy"+"\n");
            else if (n>=100 && n<200) output.write("Medium" + "\n");
            else if (n>=200 && n<=300) output.write("Hard" + "\n");
            output.flush();
        }
        output.close();
        input.close();
	}
}
