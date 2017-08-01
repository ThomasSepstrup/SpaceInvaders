package dk.letsdoit;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class Player extends Sprite implements Commons {

    public Player() {

        initPlayer();
    }

    private void initPlayer() {

        ImageIcon ii = new ImageIcon(PLAYER_SHIP_IMAGE);

        setImage(ImageScaler.getScaledImage(PLAYER_SHIP_IMAGE,PLAYER_WIDTH,PLAYER_HEIGHT));
        setX(BOARD_WIDTH / 2);
        setY(GROUND - PLAYER_GROUND_OFFSET);
    }

    public void act() {

        x += dx;

        if (x <= 2) {
            x = 2;
        }

        if (x >= BOARD_WIDTH - 2 * PLAYER_WIDTH) {
            x = BOARD_WIDTH - 2 * PLAYER_WIDTH;
        }
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {

            dx = -2;
        }

        if (key == KeyEvent.VK_RIGHT) {

            dx = 2;
        }
    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {

            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {

            dx = 0;
        }
    }
}