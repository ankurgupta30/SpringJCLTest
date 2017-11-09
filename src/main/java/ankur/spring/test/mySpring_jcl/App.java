package ankur.spring.test.mySpring_jcl;

import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Log logger = LogFactory.getLog(App.class);
        logger.debug("Testing spring-jcl");
        System.out.println("This is a simple program which uses exactly one dependency of Spring");
        logger.info("final Statement in the logger...This is logger printing");
        
        // Try using Java util logger
        Logger log = Logger.getLogger(App.class.getName());
        log.info("TEsting default log level of Java util logger" + log.getName());
    }
}
