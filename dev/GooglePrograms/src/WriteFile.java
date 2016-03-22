import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class WriteFile {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("text.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("This is Rakesh");
			bw.newLine();
			bw.write("How are you?");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
