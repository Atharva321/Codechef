import java.util.*;
import java.lang.*;
import java.io.*;
import static java.lang.System.*;
import java.util.stream.IntStream;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static PrintWriter out=new PrintWriter((System.out));
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int Testcases = Integer.parseInt(in.readLine());
	    while(Testcases>0){
	        int[] input = Arrays.stream(in.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
	        int sum = Arrays.stream(input).parallel().reduce(0,(a,b)->  a + b);
	        int P = input[input.length - 1];
	        sum -= P;
	        if(sum*P <=120){
	            out.println("No");
	        }
	        else{
	            out.println("Yes");
	        }
	        Testcases--;
	    }
	    out.close();
	}
}
