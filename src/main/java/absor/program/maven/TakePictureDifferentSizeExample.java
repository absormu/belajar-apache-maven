package absor.program.maven;


import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


/**
 * Set view size before taking picture. It's worth to mention that size has to
 * be set before opening camera.
 *
 * @author Bartosz Firyn (SarXos)
 */
public class TakePictureDifferentSizeExample {

    public static void main(String[] args) throws IOException {
        var folder = "image/";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

//        Webcam webcam = Webcam.getDefault();//1280x720
        Webcam webcam = Webcam.getWebcamByName("Logitech HD Webcam C525 1");
        webcam.setViewSize(new Dimension(640, 480));//1280 x 720
        webcam.open();
        ImageIO.write(webcam.getImage(), "PNG", new File(folder+dtf.format(now)+".png"));
        webcam.close();
    }

}
