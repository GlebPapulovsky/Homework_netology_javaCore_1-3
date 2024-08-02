import java.time.LocalDateTime;
//создал класс для того,чтобы не повторять ifelse-овые контрукции в main и для лаконичности
public class Logger {
    private StringBuilder logger = new StringBuilder();

    public void writeInfo(boolean isCreated, String fileName) {
        LocalDateTime ldt = LocalDateTime.now();
        if (fileName.contains(".") && isCreated) {
            this.logger.append("Время ").append(ldt).append(" : был создан файл - ").append(fileName).append("\n");
        } else if (fileName.contains(".") && !isCreated) {
            this.logger.append("Время ").append(ldt).append(" : пробовали создать файл - ").append(fileName).append(".Произошла ошибка. Файл не был создан. ").append("\n");
        } else if (isCreated) {
            this.logger.append("Время ").append(ldt).append(" : была создана директория - ").append(fileName).append("\n");
        } else {
            this.logger.append("Время ").append(ldt).append(" : пробовали создать директорию - ").append(fileName).append(".Произошла ошибка. Директория не была создана. ").append("\n");
        }


    }

    public String getLogger(){
        return this.logger.toString();
    }
}
