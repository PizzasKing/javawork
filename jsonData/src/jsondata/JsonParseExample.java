package jsondata;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class JsonParseExample {

	public static void main(String[] args) {
		Reader reader;
		try {
			reader = new FileReader("C:/File/member.json");
			BufferedReader br = new BufferedReader(reader);
			
			String json = br.readLine();
			br.close();
			
			System.out.println(json);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			
			e.printStackTrace();
		}

	}

}
