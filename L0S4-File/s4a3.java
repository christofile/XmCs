import java.io.*;
import java.io.IOException;

public class s4a3{
	public static void main(String[] args) throws IOException{
			File f = new File("/Users/lily/Documents/CodeSmart/session4/num.txt");
			//System.out.println(f.exists());
			FileReader fr = new FileReader(f);
			int i = fr.read();
			int odd=0;
			int even=0;
			while(i!=-1){
				if (i%2==0)
					even++;
				else
					odd++;
				i=fr.read();
			}
			System.out.println("Even is "+even);
			System.out.println("Odd is "+odd);
	}
}