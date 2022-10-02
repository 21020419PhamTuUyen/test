package uet.oop.bomberman.entities;

import javafx.scene.image.Image;
import uet.oop.bomberman.entities.Entity;

public abstract class AnimatedEntity extends  Entity {
    protected int animateFrame = 0;
    protected final int MAX_ANIMATE = 1000;

    public AnimatedEntity() {}
    public  AnimatedEntity(int xUnit, int yUnit, Image img) {
        super(xUnit, yUnit, img);
    }

    public void animate() {
        if(animateFrame < MAX_ANIMATE) {
            animateFrame++;
        }
        else animateFrame = 0;
    }

    public int getAnimate() {
        return animateFrame;
    }
}