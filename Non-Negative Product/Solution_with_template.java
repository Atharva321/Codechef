/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef{
	public static void main (String[] args) throws IOException{
	    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
	    
        byte test = Byte.parseByte(input.readLine());
        while (test-- > 0) {
            short n = Short.parseShort(input.readLine().trim());
            int[] arr = Arrays.stream(input.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
            int negCount = 0;
            boolean hasZero = false;
            for (int val : arr) {
                if (val < 0) negCount++;
                else if (val == 0) {
                    hasZero = true;
                    break;
                }
            }
            if (hasZero) output.write(0 + "\n");
            else output.write((negCount & 1) + "\n");
            output.flush();
        }
        output.close();
        input.close();
	}
}
