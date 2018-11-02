package base.stone;

import base.GameObject;
import base.Vector2D;
import base.physics.BoxCollider;
import base.physics.Physics;

import java.util.Random;

public class Stone extends GameObject implements Physics {
    BoxCollider collider;
    public Stone(){
        this.position = new Vector2D(200,200);
        //this.setPosition();
    }

    @Override
    public void setPosition() {
        super.setPosition();
        //
       // this.position= new Vector2D(new Random().nextInt(370),0 );
    }

    @Override
    public void run() {
            this.position.y += 3/*speed*/;
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.collider;
    }
}
