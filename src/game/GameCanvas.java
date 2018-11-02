package game;

import base.*;
import base.enemy.Enemy;
import base.enemy.EnemyType1;
import base.player.Player;
import base.stone.*;

import javax.swing.*;
import java.awt.*;

public class GameCanvas extends JPanel {
    Background background;
    Player player;
    StoneSummon stone1;
    //Hàm khởi tạo GameCanvas
    public GameCanvas() {

        int xTank2 = 130;
        int yTank2 = -1500;
        int xTank3 = 295;
        int yTank3 = -860;
        //this.position = new Vector2D(295,-860);
        this.background = GameObject.recycle(Background.class); //Background
        this.player = GameObject.recycle(Player.class); //Player
        //StoneType1 type1 = GameObject.recycle(StoneType1.class);
//        StoneType2 type2 = GameObject.recycle(StoneType2.class);
//        type2.position.set(160,-500) ;
//        for (int i = 0; i < 4; i++) {
//            StoneType2 type21 = GameObject.recycle(StoneType2.class);
//            type21.position.set(xTank2,yTank2);
//            xTank2+=80;
//            yTank2-=300;
//        }
//        StoneType3 type3 = GameObject.recycle(StoneType3.class);
//        for (int i = 0; i < 4; i++) {
//            StoneType3 type31 = GameObject.recycle(StoneType3.class);
//            type31.position.set(xTank3, yTank3);
//            xTank3 += 10;
//            yTank3 -= 1200;
//        }
//        StoneType4 type4 = GameObject.recycle(StoneType4.class);
        stone1 = GameObject.recycle(StoneSummon.class);

    }

    //Run: hàm để Update even khi có thay đổi về số liệu  (x += 1)
    //Chạy logic
    public void run() {
        //Run all: chạy tất cả object được add vào list static gameObjects
        stone1.isEnd = this.background.isEnd;
//        System.out.println(stone1.isEnd);
        GameObject.runAll();
    }

    //render là bút vẽ sau khi số liệu đc update (g.draw)
    //Vẽ lên giao diện
    public void render() {
        GameObject.renderAllToBackBuffer();
    }

    //painComponent: là hàm vẽ các thay đổi
    //Graphics : đóng vai trò là bút vẽ, là 1 phần trong Jpanel
    @Override
    protected void paintComponent(Graphics g) {
        //Gom tất cả các phần vẽ trong render để vẽ
        GameObject.renderBackBufferToGame(g);
    }
}
