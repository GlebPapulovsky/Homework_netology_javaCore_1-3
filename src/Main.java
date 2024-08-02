import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//C:\Users\papul\OneDrive\Рабочий стол\idea_projects\games
public class Main {
    public static void main(String[] args) {
        final String filePath = "C:\\Users\\papul\\IdeaProjects\\java_core_2\\Games";
        Logger logger = new Logger();

        //1. В папке Games создайте несколько директорий: src, res, savegames, temp.
        logger.writeInfo(FolderFactory.create(filePath, "src"), "src");
        logger.writeInfo(FolderFactory.create(filePath, "res"), "res");
        logger.writeInfo(FolderFactory.create(filePath, "savegames"), "savegames");
        logger.writeInfo(FolderFactory.create(filePath, "temp"), "temp");


        //2. В каталоге src создайте две директории: main, test.
        logger.writeInfo(FolderFactory.create(filePath + "\\src", "main"), "main");
        logger.writeInfo(FolderFactory.create(filePath + "\\src", "test"), "test");


        //3. В подкаталоге main создайте два файла: Main.java, Utils.java.
        logger.writeInfo(FileFactory.create(filePath + "\\src" + "\\main", "Main.java"), "Main.java");
        logger.writeInfo(FileFactory.create(filePath + "\\src" + "\\main", "Utils.java"), "Utils.java");

        //4. В каталог res создайте три директории: drawables, vectors, icons.
        logger.writeInfo(FolderFactory.create(filePath + "\\res", "drawables"), "drawables");
        logger.writeInfo(FolderFactory.create(filePath + "\\res", "vectors"), "vectors");
        logger.writeInfo(FolderFactory.create(filePath + "\\res", "icons"), "icons");


        //5. В директории temp создайте файл temp.txt.

        logger.writeInfo(FileFactory.create(filePath + "\\temp", "temp.txt"), "temp.txt");

        //записываю информацию из логера в файл temp.txt
        byte[] buffer=logger.getLogger().getBytes();
        try(FileOutputStream fos=new FileOutputStream(filePath + "\\temp\\temp.txt");
            BufferedOutputStream bos=new BufferedOutputStream(fos)){
           bos.write(buffer,0,buffer.length);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }



    }
}