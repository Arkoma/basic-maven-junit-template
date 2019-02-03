import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Application {
    public static Log log = LogFactory.getLog(Application.class);


    public static String main(String msg) {
        log.info(msg);
        return msg;
    }
}
