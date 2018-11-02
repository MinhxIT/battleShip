package base.stone;

import base.physics.BoxCollider;
import base.physics.Physics;
import base.renderer.SingleImageRenderer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StoneType1 extends Stone {
    public StoneType1() {
        List<String> listStones = Arrays.asList(
                "assets/images/stone/1.png",
                "assets/images/stone/2.png",
                "assets/images/stone/3.png",
                "assets/images/stone/4.png",
                "assets/images/stone/5.png"
                );
        Random rand = new Random();
        int randomIndex = rand.nextInt(listStones.size());
        String randomElement = listStones.get(randomIndex);
        this.renderer = new SingleImageRenderer(randomElement);
        this.collider = new BoxCollider(50, 50);
        // this.renderer = new SingleImageRenderer("assets/images/stone/rock.png");
    }


}
