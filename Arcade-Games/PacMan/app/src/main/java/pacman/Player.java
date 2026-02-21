package pacman;

import java.awt.Image;

public class Player extends Entity {
    char direction = 'R';
    int velocityX = 0;
    int velocityY = 0;

    Player(Image image, int x, int y, int tileSize) {
        super(image, x, y, tileSize, tileSize);
    }

    void updateDirection(char newDirection, int tileSize) {
        this.direction = newDirection;
        updateVelocity(tileSize);
    }

    void updateVelocity(int tileSize) {
        int speed = tileSize / 8;
        switch (this.direction) {
            case 'U' -> { 
                velocityX = 0; 
                velocityY = -speed; 
            }
            case 'D' -> { 
                velocityX = 0;
                velocityY = speed; 
            }
            case 'L' -> {
                velocityX = -speed; 
                velocityY = 0; 
            }
            case 'R' -> { 
                velocityX = speed; 
                velocityY = 0; 
            }
        }
    }

    void move() {
        this.x += velocityX;
        this.y += velocityY;
    }

    void undoMove() {
        this.x -= velocityX;
        this.y -= velocityY;
    }

    void stop() {
        this.velocityX = 0;
        this.velocityY = 0;
    }
}