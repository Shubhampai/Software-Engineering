import java.util.logging.Level;
import java.util.logging.Logger;

public class Bike implements Vehicle {
    @Override
    public void changeTires(){
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        logger.log(Level.INFO,"changed 2 tires of Bike");
    }
}
