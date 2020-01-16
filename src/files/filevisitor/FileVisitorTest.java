package files.filevisitor;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitorTest {
	public static void main(String[] args) {
		Path path = Paths.get(".\\src\\files\\filevisitor");
		FileVisitor<Path> searcher = new Search();
		try {
			Files.walkFileTree(path, searcher);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static final class Search extends SimpleFileVisitor<Path>{
		
		@Override
		public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
			PathMatcher pm = FileSystems.getDefault().getPathMatcher("glob:*.png");
			
			if ( pm.matches(file.getFileName())) {
				System.out.println(file);
			}
			return FileVisitResult.CONTINUE; 
		}
		
	}
}
