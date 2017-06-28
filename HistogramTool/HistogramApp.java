
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class HistogramApp {

  public static void main(String[] args) {

    try {
      BufferedImage img = ImageIO.read(new File("data/DSC_0278.JPG"));
      int w = img.getWidth();
      int h = img.getHeight();
      int[] dataBuffInt = img.getRGB(0, 0, w, h, null, 0, w);

      // TODO...

    } catch (IOException e) {
      System.out.println(e);
    }
  }

}
