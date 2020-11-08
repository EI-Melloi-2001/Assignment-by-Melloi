package section11;
import java.io.*;

public class CharInput {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String s;
		InputStreamReader ir;
		BufferedReader in;
		ir = new InputStreamReader (System.in);
		in = new BufferedReader(ir);
		while ((s = in.readLine())!=null) {
			System.out.println("Read:"+s);
		}

	}

}
