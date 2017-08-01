package dk.letsdoit;

import javax.swing.*;

public class Ufo extends Sprite {

    private final String ufoImage = Commons.UFO_IMAGE;

    public Ufo(int x, int y){

        initUfo(x,y);
    }

    private void initUfo(int x, int y) {

        ImageIcon ii = new ImageIcon(ufoImage);
        setImage(Commons.UFO_IMAGE, Commons.UFO_WIDTH, Commons.UFO_HEIGHT);

    }

}
