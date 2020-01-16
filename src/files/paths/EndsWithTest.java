package files.paths;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EndsWithTest {

	/**
	 * endsWith return a boolean. It's test if a path ends with some string
	 * but it's not testing an extension such as .txt
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Files.find(Paths.get(""), Integer.MAX_VALUE, (p,a) -> p.endsWith("txt"))
			.map(p -> p.toAbsolutePath()).forEach(System.out::println);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
