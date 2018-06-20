package file_visitor;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = (Paths.get("temp.txt").toAbsolutePath());
        Files.walkFileTree(Paths.get("."), new HashSet<FileVisitOption>(), 1, new MyFileVisitor());
    }
}
class MyFileVisitor extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException{
        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }
}