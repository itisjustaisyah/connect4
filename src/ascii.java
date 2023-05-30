import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ascii {
    public static void main(String[] args) throws IOException {
        String density = "$@B%8&WM#*oahkbdpqwmZO0QLCJUYXzcvunxrjft/\\| ";
        displayImage("test.png");
        //



    }

    public static void displayImage(String filename) throws IOException{
        String filepath = (("image/" + filename));
        File file = new File(filepath);
        JFrame jframe = new JFrame();

        jframe.setLayout(new FlowLayout());
        jframe.setSize(3, 3);
        JLabel jlabel = new JLabel();
        jframe.add(jlabel);
        jframe.setVisible(true);

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
