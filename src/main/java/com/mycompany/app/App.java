package com.mycompany.app;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.DefaultConfiguration;
import org.apache.logging.log4j.core.config.xml.XmlConfiguration;
import org.apache.logging.log4j.spi.LoggerContext;

import java.lang.reflect.Field;

/**
 * Hello world!
 *
 */
public class App 
{
    final static Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args ) throws NoSuchFieldException, IllegalAccessException {

        App obj = new App();
        obj.runMe("Ironman");
        System.out.println( "Hello World!" );

        LoggerContext lContect = LogManager.getContext();
        Field f = lContect.getClass().getDeclaredField("configuration");
        f.setAccessible(true);
//        XmlConfiguration iWantThis = (XmlConfiguration) f.get(lContect);
//        System.out.println("Config File: " + iWantThis.getName());
        System.out.println("Config File: " + f.get(lContect));
    }

    private void runMe(String parameter){

        if(logger.isDebugEnabled()){
            logger.debug("This is debug : " + parameter);
        }

        if(logger.isInfoEnabled()){
            logger.info("This is info : " + parameter);
        }

        logger.warn("This is warn : " + parameter);
        logger.error("This is error : " + parameter);
        logger.fatal("This is fatal : " + parameter);

    }
}
