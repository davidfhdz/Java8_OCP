package files.paths;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * Paths methods doesn't throw an exception until they are used in a File
 * path.getRoot() returns null if the root doesn't exist
 * path.getParent() return the complete directory tree until the last element
 * path.getName is zero based token
 */
public class GetParentTest {
	static Path path = Paths.get("src" + File.separator + "main" + 
			File.separator + "java" + File.separator + "package");

	public static void main(String[] args) {
		System.out.println(path.getRoot() + " " + path.getParent() + " " +path.getName(3));
	}

}
