package core.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Resources declared in a try-with-resources are automatically closed after used.
 * Variables pointing to this resources are implicitly final, hence can-not be 
 * re-asigned
 * @author r.paredes.bernal
 *
 */
public class TestReAssignment {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("file1.txt"))) {
			System.out.println(reader.readLine());
			
			reader = new BufferedReader(new FileReader("file2.txt"));
			
	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
