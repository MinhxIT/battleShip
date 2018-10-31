package base.stone;

import base.GameObject;
import base.Settings;
import base.Vector2D;
import base.action.Action;
import base.action.ActionRepeat;
import base.action.ActionSequence;
import base.action.ActionWait;

import java.util.ArrayList;
import java.util.Random;

public class StoneSummon extends GameObject {
    Action action;
    ArrayList<Stone> arr = new ArrayList<>();
    int i=0;

    public StoneSummon() {
//        ArrayList<BufferedImage> images = SprssssssaasssssaddddddddwiteUtils.loadImages(""
        createStones();

    }

    public void createStones() {
        ActionWait actionWait = new ActionWait(100);
        Action actionFire = new Action() {
            @Override
            public void run(GameObject master) {
                createStone();
                this.isDone = true;
            }

            @Override
            public void reset() {
                this.isDone = false;
            }
        };
        ActionSequence actionSequence = new ActionSequence(actionWait, actionFire);
        ActionRepeat actionRepeat = new ActionRepeat(actionSequence);
        this.action = actionRepeat;
    }

    public void createStone() {
            Stone stoneType1 = GameObject.recycle(StoneType1.class);
            stoneType1.position.set(Settings.START_STONE_POSITION_X,Settings.START_STONE_POSITION_Y);
            Settings.START_STONE_POSITION_Y = Settings.START_STONE_POSITION_Y-140+new Random().nextInt(100);
            Settings.START_STONE_POSITION_X = Settings.START_STONE_POSITION_X+(new Random().nextInt(30)-new Random().nextInt(30));
            this.arr.add(stoneType1);

    }

    @Override
    public void run() {
        this.action.run(this);

    }
}
