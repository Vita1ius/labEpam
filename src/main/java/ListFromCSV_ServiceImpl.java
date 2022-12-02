import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ListFromCSV_ServiceImpl implements ListFromCSV_Service {
    private static final Logger logger = Logger.getLogger(ListFromCSV_ServiceImpl.class);
    String line;
    @Override
    public List<SuperCar> getlist() {
        List<SuperCar> cars = new LinkedList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("src/main/resources/file.csv"))){
            while ((line = br.readLine()) != null)
            {
                String[] employee = line.split(",");
                cars.add(new SuperCar(employee[0],Integer.parseInt(employee[1]),Integer.parseInt(employee[2])));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
            logger.error("������� � ListFromCSV_ServiceImpl");
        }
        return cars;
    }
}
