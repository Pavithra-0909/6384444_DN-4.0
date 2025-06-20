public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        
        logger1.log("First Message") ;
        logger2.log("Second Message") ;

      //To test Singleton Pattern Implementation
        System.out.println("Logger1 hashCode: "+logger1.hashCode());
        System.out.println("Logger2 hashCode: "+logger2.hashCode());
        
        if(logger1==logger2){
            System.out.println("Same instance confirmed!");
        }else{
            System.out.println("Both have different instances!");
        }

    }
    
}
