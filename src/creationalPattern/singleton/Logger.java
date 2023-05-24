package creationalPattern.singleton;

public class Logger {

    private static Logger logger;
    private Logger() {

    }

    private static Logger getInstance() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }
    
    public void log(String message) {
        System.out.println("Log: " + message);
    }

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("IOException");
    }
}
