package jsondata;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSonCreateExample {

	public static void main(String[] args) {
		JSONObject member = new JSONObject();
		
		member.put("id", "sky123");
		member.put("name", "이하늘");
		member.put("age", 28);
		
		//속성 및 속성값(문자열, 숫자, 객체) 추가
		JSONObject tel = new JSONObject();
		tel.put("home", "02-123-4567");
		tel.put("mobile", "010-1234-5678");
		member.put("tel", tel);
		
		//배열 속성 추가
		JSONArray skill = new JSONArray();
		skill.put("java");
		skill.put("C");
		skill.put("C++");
		member.put("skill", skill);
		
		String json = member.toString();
		System.out.println(json);
		
		System.out.println(member);
		System.out.println(tel);
		System.out.println(skill);
		
		//파일에 쓰기
		try {
			Writer writer = new FileWriter("C:/File/member.json",Charset.forName("utf-8"));
			writer.write(json);
			writer.flush();
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}












