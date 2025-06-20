public class Logger {

    //static instance
    private static Logger instance;

    //private  constructor
    private Logger(){
    }

    //method to create object
    public static Logger getInstance(){
        if(instance==null){
            instance=new Logger();
        }

        return instance;
    }

    public void log(String message){
        System.out.println("LOG: "+ message);
    }
}
