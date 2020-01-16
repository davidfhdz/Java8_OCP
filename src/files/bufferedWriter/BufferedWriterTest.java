package files.bufferedWriter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BufferedWriterTest {
/**
 * Buffered writer by default create and overwrite the file,
 * but if the attributes are passed the default options don't apply
 * @param args
 */
	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\r.paredes.bernal\\eclipse-workspace\\Java8_OCP\\src\\files\\bufferedWriter\\file.txt");
		
		/*
		try(BufferedWriter bw = Files.newBufferedWriter(path)) {
			bw.write("Test");
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		try(BufferedWriter bw = Files.newBufferedWriter(path, StandardOpenOption.DSYNC)) {
			bw.write("Test");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
