package base;

import base.player.Player;
import base.renderer.SingleImageRenderer;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class Background extends GameObject {
    public boolean isEnd = false;
    BufferedImage image;

    public Background() {
        super();
        this.image = SpriteUtils.loadImage("assets/images/background/0.png");
        this.renderer = new SingleImageRenderer(image);
        this.position = new Vector2D(0,
                -(image.getHeight() - Settings.SCREEN_HEIGHT));
        this.anchor.set(0, 0);
    }


    @Override
    public void run() {
        if (this.position.y >= 0) {
            //isEnd = true;
            return;

        } else {
            if (this.position.y > -Settings.SCREEN_HEIGHT+200) {
                isEnd = true;
            }
                this.position.y += 3/*speed*/;
        }
    }
}
