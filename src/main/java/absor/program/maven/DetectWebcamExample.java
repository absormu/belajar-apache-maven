package absor.program.maven;

import com.github.sarxos.webcam.Webcam;

public class DetectWebcamExample {
    public static void main(String[] args) {
        Webcam webcam = Webcam.getDefault();
        if (webcam != null) {
            System.out.println("Webcam: " + webcam.getName());
        } else {
            System.out.println("No webcam detected");
        }

        Webcam webcam2 = Webcam.getWebcamByName("Logitech HD Webcam C525 1");
//        Webcam webcam2 = Webcam.getDefault();
        if (webcam2 != null) {
            System.out.println("Webcam2: " + webcam2.getName());
        } else {
            System.out.println("No webcam2 detected");
        }
    }
}
