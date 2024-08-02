import java.io.File;

public abstract class FolderFactory {
    public static boolean create(String filePath, String folderName) {
        File dir = new File(filePath + "\\" + folderName);
        return dir.mkdir();


    }
}
