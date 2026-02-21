package pacman;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;
import java.util.Set;

public class Ghost extends Entity {
    char direction = ' ';
    int velocityX = 0;
    int velocityY = 0;
    Random random = new Random();
    int currentSpeed;
    boolean isScared = false;
    int scaredTimer = 0;
    Image normalImg;
    Image scaredImg;
    Image imageToDraw;

    Ghost(Image normalImg, Image scaredImg, int x, int y, int tileSize, int speedDivisor) {
        super(normalImg, x, y, tileSize, tileSize);
        this.normalImg = normalImg;
        this.scaredImg = scaredImg;
        this.currentSpeed = tileSize / speedDivisor;
    }

    void move(Set<Entity> walls, int tileSize, Player pacman) {

        if (isScared && scaredTimer > 0) {
            scaredTimer--;

            if (scaredTimer <= 0) {
                isScared = false;
                scaredTimer = 0; 
            }  
        }

        this.x += this.velocityX;
        this.y += this.velocityY;

        for (Entity wall : walls) {
            if (this.collidesWith(wall)) {
                this.x -= this.velocityX;
                this.y -= this.velocityY;
                changeDirection();
                return;
            }
        }

        if (this.x % tileSize == 0 && this.y % tileSize == 0) {
            if (random.nextInt(4) == 0) {
                changeDirection();
            }
        }
    }

    void changeDirection() {
        char[] directions = {'U', 'D', 'L', 'R'};
        this.direction = directions[random.nextInt(4)];
        
        switch (this.direction) {
            case 'U' -> { 
                velocityX = 0;
                velocityY = -currentSpeed; 
            }
            case 'D' -> { 
                velocityX = 0; 
                velocityY = currentSpeed; 
            }
            case 'L' -> { 
                velocityX = -currentSpeed; 
                velocityY = 0; 
            }
            case 'R' -> { 
                velocityX = currentSpeed;
                velocityY = 0;
            }
        }
    }

    @Override
    void draw(Graphics g) {
        
        if (isScared) {
            imageToDraw = scaredImg;
        } else {
            imageToDraw = normalImg;
        }

        if (isScared && scaredTimer < 120 && (scaredTimer / 10) % 2 == 0) {
            return;
        }

        if (imageToDraw != null) {
            g.drawImage(imageToDraw, x, y, width, height, null);
            
        }  
    }
}