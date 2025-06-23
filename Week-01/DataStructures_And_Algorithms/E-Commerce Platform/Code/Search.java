import java.util.Arrays;
import java.util.Comparator;

public class Search{

    public static Product linearSearch(Product[] products, String name){
        for(Product p : products){
            if(p.productName.equalsIgnoreCase(name)){
                return p;
            }
        }
        return null;
    }

    public static void sortByName(Product[] products){
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
    }

    public static Product binarySearch(Product[] products, String name){
        int low = 0;
        int high = products.length-1;

        while(low <= high) {
            int mid=(low + high)/2;
            int cmp=products[mid].productName.compareToIgnoreCase(name);

            if(cmp == 0)
                return products[mid];
            else if(cmp < 0)
                low = mid + 1;
            else{
                high = mid - 1;
            }
        }
        return null;
    }
}
