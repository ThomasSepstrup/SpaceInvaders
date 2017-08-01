package dk.letsdoit;

public interface Commons {

    int BOARD_WIDTH = 358 * 2;
    int BOARD_HEIGHT = 350 * 2;
    int GROUND = BOARD_HEIGHT - 60;
    int BOMB_HEIGHT = 5;
    int ALIEN_HEIGHT = 12 * 2;
    int ALIEN_WIDTH = 12 * 2;
    int ALIEN_INIT_X = 150;
    int ALIEN_INIT_Y = 5;
    int ALIEN_X_OFFSET = 36;
    int ALIEN_Y_OFFSET = 36;
    int ALIEN_X_COUNT = 6;
    int ALIEN_Y_COUNT = 4;
    int BORDER_RIGHT = 30;
    int BORDER_LEFT = 5;
    int GO_DOWN = 15;
    int NUMBER_OF_ALIENS_TO_DESTROY = 24;
    int CHANCE = 5;
    int DELAY = 17;
    int PLAYER_WIDTH = 15 * 2;
    int PLAYER_HEIGHT = 10 * 2;
    int PLAYER_GROUND_OFFSET = 40;
    int BOMB_CHANCE = 80;
    String PLAYER_SHIP_IMAGE = "src/images/player.png";
    String ALIEN_SHIP_IMAGE = "src/images/alien.png";
    String SHOT_IMAGE = "src/images/shot.png";
    String BOMB_IMAGE = "src/images/bomb.png";
    String UFO_SHIP_IMAGE = "src/images/ufo.png";
}