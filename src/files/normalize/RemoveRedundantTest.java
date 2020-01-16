package files.normalize;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RemoveRedundantTest {

	public static void main(String[] args) {
		Path path = Paths.get("./my-dir/..");
		System.out.println(path.normalize());
		Path path1 = Paths.get("./my-dir");
		System.out.println(path1.normalize());		
		Path path2 = Paths.get("/my-dir/");
		System.out.println(path2.normalize());
		Path path3 = Paths.get("../../a/../mydir");
		System.out.println(path3.normalize());
	}

}
