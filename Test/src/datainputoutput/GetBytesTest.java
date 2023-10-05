package datainputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class GetBytesTest {

	public static void main(String[] args) {
		
		try {
			OutputStream os = new FileOutputStream("C:/File/out.txt");
			String data = "안녕하세요";
			
			os.write(data.getBytes());
			
			os.flush();
			os.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
