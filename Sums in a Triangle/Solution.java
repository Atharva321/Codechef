// Time  : 
// Space :

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
		InputReader ir = new InputReader(System.in);
        int t = ir.nextInt();
        while(t-->0){
            int n=ir.nextInt();
		    int arr[][]=new int[n][n];
		    for(int i=0;i<n;i++){
		        for(int j=0;j<=i;j++){
		            arr[i][j]=ir.nextInt();
		        }
		    }
		    for(int i=n-2;i>=0;i--){
		        for(int j=0;j<=i;j++){
		            arr[i][j]=arr[i][j]+Math.max(arr[i+1][j],arr[i+1][j+1]);
		        }
		    }
		    System.out.println(arr[0][0]);
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
            } 
            catch (Exception e) {
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
