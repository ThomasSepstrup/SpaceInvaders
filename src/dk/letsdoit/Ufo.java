package dk.letsdoit;

import javax.swing.*;

public class Ufo extends Sprite {

    private final String ufoImage = Commons.UFO_SHIP_IMAGE;

    public Ufo(int x, int y){

        initUfo(x,y);
    }

    private void initUfo(int x, int y) {

        ImageIcon ii = new ImageIcon(ufoImage);
        setImage(ii.getImage());

    }

}
