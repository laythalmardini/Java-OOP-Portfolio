package pacman;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public abstract class Entity {
    int x, y, width, height;
    int startX, startY;
    Image image;

    Entity(Image image, int x, int y, int width, int height) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.startX = x;
        this.startY = y;
    }

    void draw(Graphics g) {
        if (image != null) {
            g.drawImage(image, x, y, width, height, null);
        }
    }

    void reset() {
        this.x = startX;
        this.y = startY;
    }

    Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

    boolean collidesWith(Entity other) {
        return getBounds().intersects(other.getBounds());
    }
}