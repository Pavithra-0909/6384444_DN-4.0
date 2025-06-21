import java.util.Scanner;
public class FactoryTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter document type(Word/Pdf/Excel): ");
        String type = sc.nextLine();

        DocumentFactory factory = null;

        switch (type) {
            case "Word":
                factory = new WordDocumentFactory();
                break;
            case "Pdf":
                factory = new PdfDocumentFactory();
                break;
            case "Excel":
                factory = new ExcelDocumentFactory();
                break;
            default:
                System.out.println("Document Not Found!");
        }

        Document doc = factory.createDocument();
        doc.open();
        sc.close();
    }
}
