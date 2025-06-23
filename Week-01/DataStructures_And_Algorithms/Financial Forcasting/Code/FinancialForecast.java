public class FinancialForecast{
    public static double predictFutureValue(double initialValue, double growthRate, int years){
        if (years==0)
            return initialValue;
        return(1+growthRate)*predictFutureValue(initialValue, growthRate, years-1);
    }

    public static void main(String[] args){
        double initialValue=50000; 
        double growthRate=0.20;    
        int years=10;
        double futureValue = predictFutureValue(initialValue, growthRate, years);
        System.out.printf("Predicted value after %d years: Rs.%.2f%n", years, futureValue);
    }
}
