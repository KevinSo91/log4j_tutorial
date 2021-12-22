package Main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModuleA {

    // Creating a logger
    private static Logger logger = LogManager.getLogger();

    // Log messages
    public static void main(String[] args){

        logger.debug("It is a debug logger.");
        logger.error("It is a error logger.");
        logger.fatal("It is a fatal logger.");
        logger.info("It is a info logger.");
        logger.trace("It is a trace logger.");
        logger.warn("It is a warn logger.");



    }


}