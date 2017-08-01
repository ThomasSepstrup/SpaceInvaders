package dk.letsdoit;

public class Shot extends Sprite {

    private final String shotImg = Commons.SHOT_IMAGE;
    private final int H_SPACE = 6;
    private final int V_SPACE = 1;

    public Shot() {
    }

    public Shot(int x, int y) {

        initShot(x, y);
    }

    private void initShot(int x, int y) {

        setImage(Commons.SHOT_IMAGE, Commons.SHOT_WIDTH, Commons.SHOT_HEIGHT);

        setX(x + H_SPACE);
        setY(y - V_SPACE);
    }
}