package pacman;

import java.awt.Color;
import java.awt.Graphics;

public class FoodEntity extends Entity {
    public FoodEntity(int x, int y) {
        super(null, x, y, 4, 4);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, width, height);
    }
}