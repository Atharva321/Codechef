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
	        long N = Long.parseLong(in.readLine());
	        if(N%2 == 0){
	            out.println(N*(N/2));
	        }
	        else{
	            out.println((N+1)*(N/2));
	        }
	        Testcases--;
	    }
	    out.close();
	}
}
