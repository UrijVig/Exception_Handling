package FileManagerProject.Tools;

import FileManagerProject.Exception.FileCopyException;
import FileManagerProject.Exception.FileReadException;
import FileManagerProject.Exception.FileWriteException;

import java.io.*;

public class TxtFileManager extends FileManager{
    public TxtFileManager(File file) {
        super(file);
    }

    @Override
    public void readFile() throws FileReadException {
        try(FileReader reader = new FileReader(file)){
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        } catch (Exception e) {
            throw new FileReadException("Не удалось прочитать данные из файла, ошибка: " + e.getMessage());
        }
    }

    @Override
    public void copyFile(File file) throws FileCopyException {
        try (FileReader reader = new FileReader(this.file); FileWriter writer = new FileWriter(file)){
            int c;
            while((c=reader.read())!=-1){
                writer.append((char)c);
            }
        }catch (Exception e) {
            throw new FileCopyException("Не удалось скопировать данные, ошибка: " + e.getMessage());
        }
    }

    @Override
    public void writeFile(String data) throws FileWriteException {
        this.writeFile(data, true);
    }

    @Override
    public void writeFile(String data, boolean append) throws FileWriteException {
        try (FileWriter writer = new FileWriter(file, append)){
            writer.write(data);
            writer.append('\n');
        } catch (IOException e) {
            throw new FileWriteException("Не удалось записать данные в файл, ошибка: " + e.getMessage());
        }
    }
}
