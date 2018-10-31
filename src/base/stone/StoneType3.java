package base.stone;

import base.Vector2D;
import base.physics.BoxCollider;
import base.renderer.SingleImageRenderer;

public class StoneType3 extends Stone {
    public StoneType3(){
        super();
        this.collider = new BoxCollider(183,161);
        this.renderer = new SingleImageRenderer("assets/images/stone/rock2.png");
        this.position = new Vector2D(295,-860);
    }
}
