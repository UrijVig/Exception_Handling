package FileManagerProject;

import FileManagerProject.Exception.FileCopyException;
import FileManagerProject.Exception.FileReadException;
import FileManagerProject.Exception.FileWriteException;
import FileManagerProject.Tools.TxtFileManager;
import java.io.File;


public class Program {
    public void run() {
        File worker = new File("test.txt");
        TxtFileManager manager = new TxtFileManager(worker);

        try {
            manager.writeFile("Это тестовая строка!", false);
        } catch (FileWriteException e) {
            System.out.println(e.getMessage());
        }
        try {
            manager.readFile();
        } catch (FileReadException e) {
            System.out.println(e.getMessage());
        }
        try {
            manager.copyFile(new File("testCopy.txt"));
        } catch (FileCopyException e) {
            System.out.println(e.getMessage());
        }
    }
}

