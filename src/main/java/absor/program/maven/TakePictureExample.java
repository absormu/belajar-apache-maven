package absor.program.maven;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;


/**
 * Example of how to take single picture.
 *
 * @author Bartosz Firyn (SarXos)
 */
public class TakePictureExample {

    public static void main(String[] args) throws IOException {
        var folder = "image/";
        // get default webcam and open it
        Webcam webcam = Webcam.getDefault();
        Webcam webcam2 = Webcam.getWebcamByName("Logitech HD Webcam C525 1");

        webcam.setViewSize(new Dimension(640, 480));//1280 x 720
        webcam2.setViewSize(new Dimension(640, 480));//1280 x 720

        webcam.open();
        webcam2.open();

        // get image
        BufferedImage image = webcam.getImage();
        BufferedImage image2 = webcam2.getImage();

        // save image to PNG file
        ImageIO.write(image, "PNG", new File(folder+"depan.png"));
        ImageIO.write(image2, "PNG", new File(folder+"Samping.png"));

        webcam.close();
        webcam2.close();
    }


}
