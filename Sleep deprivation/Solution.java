  // SHREE LAKSHMI NARAYAN 
import java.util.*;
import java.io.*;
   public class Main
    { 
	   public static void main(String[] args)
	   {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
           int testCases=in.nextInt();
           while(testCases-- > 0)
           {
                int sleep_hours = in.nextInt();
                if(sleep_hours >= 7){
                    System.out.println("No");
                }
                else{
                    System.out.println("Yes");
                }
           }
        } 
        catch (Exception e)
        {
            return;
        }
    }
    /////////////////////////////////////////////////////////////////// STANDERD DECLARATIONS
	static final int mod = 1000000009;
	final static int MAX = Integer.MAX_VALUE;
    final static int MIN = Integer.MIN_VALUE;
    final static long INF = Long.MAX_VALUE;
    final static long NEG_INF = Long.MIN_VALUE;
    ///////////////////////////////////////////////// //////////////////// FAST READER CLASS
    static class FastReader{
    	BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    ///////////////////////////////////////////////////////////// FAST WRITER CLASS
    static class FastWriter {
		private final BufferedWriter bw;

		public FastWriter() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(Object object) throws IOException {
			bw.append("" + object);
		}

		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}

		public void close() throws IOException {
			bw.close();
		}
	}
  
}
