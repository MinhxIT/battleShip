package base.stone;

import base.Vector2D;
import base.physics.BoxCollider;
import base.renderer.SingleImageRenderer;

public class StoneType4 extends Stone {
    public StoneType4(){
        this.collider = new BoxCollider(183,161);
        this.renderer = new SingleImageRenderer("assets/images/stone/rock1.png");
        this.position = new Vector2D(220,-1200);
    }
}
