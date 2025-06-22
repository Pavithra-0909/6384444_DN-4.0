public class Test {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("Cognizant1.jpeg");
        Image image2 = new ProxyImage("Cognizant2.jpg");

        image1.display();  
        image1.display();  

        image2.display();  
    }
}
