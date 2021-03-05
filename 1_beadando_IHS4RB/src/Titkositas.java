import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Titkositas {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("eredeti.txt"));
		PrintWriter pw = new PrintWriter("titkositott.txt");
		
		String sor = br.readLine();
		while(sor!=null) {
			System.out.println("Az eredeti üzenet: "+sor);
			int h = sor.length();
			//System.out.println(h);
			char [] szoveg = new char[h];
			
			for (int i=0; i<h;i++) {
				szoveg[i] = sor.charAt(i);
			} 
			
			int[] ascii = new int[h];
			int[] kod = new int[h];
			char[] titkos = new char[h];
			
			System.out.print("A titkos üzenet: ");
			
			for (int i=0; i<h;i++) {
				ascii[i] = (int) szoveg[i];
				//System.out.println(ascii[i]);
				kod[i] = ascii[i]+1;
				//System.out.println(kod[i]);
				titkos[i]= (char) kod[i];
				System.out.print(titkos[i]);
			}
			sor = br.readLine();	
			pw.println(titkos);
			
		}
		
		pw.flush();
		pw.close();	
		br.close();
	}
}
