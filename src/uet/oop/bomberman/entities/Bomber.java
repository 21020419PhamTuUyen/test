package uet.oop.bomberman.entities;

import javafx.scene.image.Image;
import uet.oop.bomberman.graphics.Sprite;

public class Bomber extends AnimatedEntity {
    protected int timer = 0;
    public Bomber(int x, int y, Image img) {
        super(x, y, img);
    }
    public Bomber(int x, int y, Image img, String input) {
        super(x, y, img);
        this.input = input;
    }

    @Override
    public void update() {
        animate();
        if(input.equals("DOWN"))
            img = Sprite.movingSprite(Sprite.player_down_1, Sprite.player_down_2, animateFrame, 20).getFxImage();
        else if(input.equals("UP"))
            img = Sprite.movingSprite(Sprite.player_up_1, Sprite.player_up_2, animateFrame, 20).getFxImage();
        else if(input.equals("RIGHT"))
            img = Sprite.movingSprite(Sprite.player_right_1, Sprite.player_right_2, animateFrame, 20).getFxImage();
        else if(input.equals("LEFT")){
            img = Sprite.movingSprite(Sprite.player_left_1, Sprite.player_left_2, animateFrame, 20).getFxImage();
        }
        if(timer < 20) timer++;
        else {
            if(input.equals("DOWN")) {
                img = Sprite.player_down.getFxImage();
            }
            else if(input.equals("UP")) {
                img = Sprite.player_up.getFxImage();
            }
            else if(input.equals("RIGHT")) {
                img = Sprite.player_right.getFxImage();
            }
            else if(input.equals("LEFT")) {
                img = Sprite.player_left.getFxImage();
            }
            timer = 0;
            input = "";
        }
    }


}
