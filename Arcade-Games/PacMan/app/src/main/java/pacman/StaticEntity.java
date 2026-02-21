package pacman;

import java.awt.Image;

public class StaticEntity extends Entity {
    public StaticEntity(Image img, int x, int y, int size) {
        super(img, x, y, size, size);
    }
}