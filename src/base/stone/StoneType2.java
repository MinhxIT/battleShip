package base.stone;

import base.Vector2D;
import base.physics.BoxCollider;
import base.renderer.SingleImageRenderer;

public class StoneType2 extends Stone {
    public StoneType2(){
        super();
        this.collider = new BoxCollider(183,161);
        this.renderer = new SingleImageRenderer("assets/images/stone/rock4.png");
    }
}
