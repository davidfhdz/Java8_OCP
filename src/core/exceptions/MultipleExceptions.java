package core.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultipleExceptions {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("non-existing.txt"))){
			
		} catch(FileNotFoundException | IOException  e) {
			
		}
	}

}
