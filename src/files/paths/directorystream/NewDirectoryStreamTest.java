package files.paths.directorystream;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewDirectoryStreamTest {
	public static void main(String[] args) {
		String path = "C:\\Users\\r.paredes.bernal\\eclipse-workspace\\Java8_OCP\\src\\files\\paths\\directorystream";
		
		try(DirectoryStream<Path> stream = Files.newDirectoryStream(
				Paths.get(path),"glob*.txt")) {
			stream.forEach(System.out::println);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
