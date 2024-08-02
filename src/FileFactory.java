import java.io.File;
import java.io.IOException;

public abstract class FileFactory {
    public static boolean create(String filePath, String fileName) {
        File file = new File(filePath + "\\" + fileName);
        try {
            if (file.createNewFile()) {
                return true;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
