package dk.letsdoit;

public class Alien extends Sprite {

    private Bomb bomb;
    private Alien alienAbove;
    private Alien alienBelow;

    public Alien(int x, int y) {

        initAlien(x, y);
    }

    private void initAlien(int x, int y) {

        this.x = x;
        this.y = y;

        bomb = new Bomb(x, y);
        setImage(Commons.ALIEN_SHIP_IMAGE,Commons.ALIEN_WIDTH, Commons.ALIEN_HEIGHT);
    }

    public void act(int direction) {

        this.x += direction;
    }

    public Bomb getBomb() {

        return bomb;
    }

    public boolean hasCleanShot() {
        return alienBelow == null;
    }

    public Alien getAlienAbove() {
        return alienAbove;
    }

    public void setAlienAbove(Alien alienAbove) {
        this.alienAbove = alienAbove;
    }

    public Alien getAlienBelow() {
        return alienBelow;
    }

    public void setAlienBelow(Alien alienBelow) {
        this.alienBelow = alienBelow;
    }

    public class Bomb extends Sprite {

        private final String bombImg = Commons.BOMB_IMAGE;
        private boolean destroyed;

        public Bomb(int x, int y) {

            initBomb(x, y);
        }

        private void initBomb(int x, int y) {

            setDestroyed(true);
            this.x = x;
            this.y = y;

            setImage(Commons.BOMB_IMAGE, Commons.BOMB_WIDTH, Commons.BOMB_HEIGHT);

        }

        public void setDestroyed(boolean destroyed) {

            this.destroyed = destroyed;
        }

        public boolean isDestroyed() {

            return destroyed;
        }
    }
}