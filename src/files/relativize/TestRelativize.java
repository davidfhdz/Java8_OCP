package files.relativize;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestRelativize {

	public static void main(String[] args) {
		Path path1 = Paths.get("../../file1");
		Path path2 = Paths.get("file2");
		System.out.println(path1.relativize(path2));
		
	}

}
