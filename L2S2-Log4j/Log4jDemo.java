package log4j;

import org.apache.logging.log4j.*;

public class Log4jDemo {
	private static Logger LOGGER = LogManager.getLogger(Log4jDemo.class.getName());
    
    public static void main(String[] args)
    {
        LOGGER.debug("Debug Message Logged !!!");
        LOGGER.info("Info Message Logged !!!");
        LOGGER.trace("Trace Message Logged !!!");
        LOGGER.warn("Warn Message Logged !!!");
        LOGGER.fatal("Fatal Message Logged !!!");
        LOGGER.error("Error Message Logged !!!");

    }
}
