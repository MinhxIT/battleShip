package base.stone;

import base.physics.BoxCollider;
import base.renderer.SingleImageRenderer;

public class StoneType1 extends Stone {
    public StoneType1(){
        this.collider = new BoxCollider(183,161);
        this.renderer = new SingleImageRenderer("assets/images/stone/rock.png");
    }
}
