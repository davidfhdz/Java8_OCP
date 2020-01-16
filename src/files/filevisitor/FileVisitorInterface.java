package files.filevisitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * The FileVisitor has 4 methods:
 * 2 for directories and 2 for files
 * postVisitDirectory
 * preVisitDirectory
 * visitFile
 * visitFileFailed
 * @author r.paredes.bernal
 * Try to remove one method
 */
public class FileVisitorInterface implements FileVisitor<Integer>{

	@Override
	public FileVisitResult postVisitDirectory(Integer dir, IOException exc) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileVisitResult preVisitDirectory(Integer dir, BasicFileAttributes attrs) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileVisitResult visitFile(Integer file, BasicFileAttributes attrs) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileVisitResult visitFileFailed(Integer file, IOException exc) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
