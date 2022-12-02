import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Запуск програми");
        logger.error("помилка");
        System.out.println("CSV object");
        System.out.println(new ListFromCSV_ServiceImpl().getlist().toString());
        System.out.println("XLSX object");
        System.out.println(new ListFromXLSX_ServiceImpl().getlist().toString());
        logger.info("Завершення програми");
    }
}

