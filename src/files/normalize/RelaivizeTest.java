package files.normalize;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelaivizeTest {

	public static void main(String[] args) {
		Path path1 = Paths.get("//users/./project/../../src/main/resources/config.xml");
		System.out.println("Normalize:" + path1.normalize());
		Path path2 = path1.relativize(path1.normalize());
		System.out.println("Relativize" + path1.relativize(path1.normalize()));
		System.out.println(path1.getNameCount() + " " + path2.getNameCount());
	}

}
