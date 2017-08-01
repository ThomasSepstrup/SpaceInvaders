package dk.letsdoit;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageScaler {

    public  static Image getScaledImage(String imagePath, int w, int h){
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image srcImg = imageIcon.getImage();
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();

        return resizedImg;
    }

}
