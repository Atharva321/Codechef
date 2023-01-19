import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
// Time  : O(1)
// Space : O(1)

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		InputReader ir = new InputReader(System.in);
        	int t = ir.nextInt();
        	while(t-->0){
        	    double _N_Balls     = ir.nextDouble();
        	    double _K_Boxes     = ir.nextDouble();
        	    double _Sum = _K_Boxes*(_K_Boxes+1)/2;
        	    if(_Sum <= _N_Balls){
        	        System.out.println("YES");
        	    }
        	    else{
        	        System.out.println("NO");
        	    }
        	}
        	ir.close();
	}
}

class InputReader{
    private BufferedReader br;
    InputReader(InputStream is){
        br = new BufferedReader(new InputStreamReader(is));
    }
    private StringTokenizer st;
    public String nextLine(){
        String s=null;
        try {
            s = br.readLine();
        } catch (Exception e) {
           
        }
        return s;
    }
    public String next(){
        if(st == null || !st.hasMoreTokens()){
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return st.nextToken(" ");
    }

    public int nextInt(){
        return Integer.parseInt(next());
    }

    public long nextLong(){
        return Long.parseLong(next());
    }

    public double nextDouble(){
        return Double.parseDouble(next());
    }
    public void close(){
       try {
        br.close();
       } catch (IOException e) {
        System.out.println(e.getMessage());
       }
    }
}
