import java.io.*;
import java.io.IOException;
import java.io.BufferedWriter;

public class s4a2{
	public static void main(String[] args) throws IOException{
			File org = new File("/Users/lily/Documents/CodeSmart/session4/org.txt");
			File copy = new File("/Users/lily/Documents/CodeSmart/session4/copy.txt");
			if(copy.exists())
				copy.delete();
			copy.createNewFile();
			FileReader fr = new FileReader(org);
			FileWriter fw = new FileWriter(copy,true);
			BufferedWriter bw = new BufferedWriter(fw);
			char[] ch = new char[(int)org.length()];
			fr.read(ch);
			//System.out.println(ch);
			fw.write(ch);
			fw.write('\n');
			fw.write("Lily Liang");
			fw.flush();
			fw.close();
	}
}