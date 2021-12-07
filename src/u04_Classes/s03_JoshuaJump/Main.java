package u04_Classes.s03_JoshuaJump;

import java.awt.*;

public class Main {

    /*
    - Getting other platform to work
        -Moving platform
    -Sprint feature
    -Enemies
    -Coins (for each coin you get, your score goes up)

     */

    public static void main(String[] args){
        boolean isGameOver = false;

        StdDraw.setScale(0, 100);
        StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call many different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.

        Platform ground = new Platform(50, 5, 50, 5);
        Platform platform1 = new Platform(75, 30, 7, 2);

        Player player = new Player(25, 15, 2,5, ground);
        Enemy enemy = new Enemy(ground);



        double timeElapsed = 0.017; //0.017 seconds-- this is how long each frame of our animation appears.
        while(true){
            if(isGameOver){ //If we want to organize our different screens, split off this screen
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledSquare(50, 50, 50);
            }else{
                //Calculation
                player.calculate(timeElapsed);
                enemy.calculate(timeElapsed);
                if(player.getxPos() > 50){
                    isGameOver = true;
                }

                //Graphics
                Background.draw();
                ground.draw();
                platform1.draw();
                player.draw();
                enemy.draw();
            }

            StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
            StdDraw.pause((int)(timeElapsed*1000)); //You must pass to the pause method the number of milliseconds to pause for; so we multiply by 1000 because our timeElapsed variable is in seconds, not milliseconds.
            StdDraw.clear(); //This clears everything drawn on the screen. You must redraw the image you wish to display for each frame of an animation
        }
    }

    public void drawMainGame(){

    }




    public boolean rectRectCollision(double xPos1, double yPos1, double halfWidth1, double halfHeight1, double xPos2, double yPos2, double halfWidth2, double halfheight2){




        return false;
    }

    public boolean didRectRectColl(double rect1_x, double rect1_y, double rect1_width, double rect1_height, double rect2_x, double rect2_y, double rect2_width, double rect2_height){ //https://developer.mozilla.org/en-US/docs/Games/Techniques/2D_collision_detection
        if (rect1_x < rect2_x + rect2_width &&
                rect1_x + rect1_width > rect2_x &&
                rect1_y < rect2_y + rect2_height &&
                rect1_y + rect1_height > rect2_y) {
            return true;
        }else{
            return false;
        }
    }




}
