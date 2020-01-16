package files.relativize;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestRelativize2 {
	public static void main(String[] args) {
		Path path1 = Paths.get("/users/projects");
		Path path2 = Paths.get("index.html");
		System.out.println(path1.relativize(path2));
		
	}
}
