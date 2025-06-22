import javax.swing.*;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        System.out.println("Loading image from remote server: " + filename);
    }

    @Override
    public void display() {
        JOptionPane.showMessageDialog(null, new ImageIcon(filename), 
                "Displaying " + filename, JOptionPane.PLAIN_MESSAGE);
    }
}
