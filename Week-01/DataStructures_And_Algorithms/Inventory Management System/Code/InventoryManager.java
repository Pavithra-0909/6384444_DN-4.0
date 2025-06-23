import java.util.HashMap;

public class InventoryManager{
    private HashMap<Integer, Product> inventory=new HashMap<>();

    public void addProduct(Product product){
        if(inventory.containsKey(product.getProductId())){
            System.out.println("Product ID already exists.");
        }else{
            inventory.put(product.getProductId(), product);
            System.out.println("Product added successfully.");
        }
    }

    public void updateProduct(int productId, String newName, int newQuantity, double newPrice) {
        Product product=inventory.get(productId);
        if(product != null){
            product.setProductName(newName);
            product.setQuantity(newQuantity);
            product.setPrice(newPrice);
            System.out.println("Product updated successfully!");
        }else{
            System.out.println("Product not found!!!");
        }
    }

    public void deleteProduct(int productId){
        if (inventory.remove(productId) != null){
            System.out.println("Product deleted successfully.");
        }else{
            System.out.println("Product not found!!!");
        }
    }
}
