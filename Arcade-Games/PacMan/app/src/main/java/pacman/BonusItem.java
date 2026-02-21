package pacman;

import java.awt.Image;
public class BonusItem extends Entity {

    int scoreValue;

    BonusItem(Image image, int x, int y, int tileSize, int scoreValue){
        super(image, x, y, tileSize, tileSize);
        this.scoreValue = scoreValue;
    }

}
