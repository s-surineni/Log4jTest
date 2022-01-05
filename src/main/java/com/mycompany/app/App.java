package com.mycompany.app;
import org.apache.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
    final static Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args )
    {

        App obj = new App();
        obj.runMe("Ironman");
        System.out.println( "Hello World!" );
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
