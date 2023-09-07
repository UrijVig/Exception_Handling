package FileManagerProject.Tools;

import FileManagerProject.Exception.FileCopyException;
import FileManagerProject.Exception.FileReadException;
import FileManagerProject.Exception.FileWriteException;

import java.io.File;

public abstract class FileManager{
    protected final File file;

    public FileManager(File file) {
        this.file = file;
    }

    public abstract void readFile() throws FileReadException;
    public abstract void copyFile(File file) throws FileCopyException;
    public abstract void writeFile(String data) throws FileWriteException;
    public abstract void writeFile(String data, boolean append) throws FileWriteException;
}
