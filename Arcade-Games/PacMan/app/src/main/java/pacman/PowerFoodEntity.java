package pacman;

import java.awt.Image;

public class PowerFoodEntity extends Entity {

    PowerFoodEntity(Image image, int x, int y, int tileSize){
        super(image, x + 8, y + 8, 16, 16);
    }
    
}
