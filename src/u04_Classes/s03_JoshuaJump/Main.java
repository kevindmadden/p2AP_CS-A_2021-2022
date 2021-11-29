package u04_Classes.s03_JoshuaJump;

public class Main {

    /*
    -Player (Joshua)
        -Movement
            -Can move left/right
            -Space key - jump
        -Gravity??
    -Platforms
        -Ground
        -High place to jump on
        -You shouldn't be able to fall through the ground
     -Coins
     -Background features

     -Main Class
        -Store all platforms in an array
        -Loop through the array to do collision detection stuff

     */

    public static void main(String[] args){
        StdDraw.setScale(0, 100);
        StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call many different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.

        Platform ground = new Platform(50, 5, 50, 5);
        Platform platform1 = new Platform(75, 30, 7, 2);

        Player player = new Player(25, 5, 2,5, ground);


        double timeElapsed = 0.017; //0.017 seconds-- this is how long each frame of our animation appears.
        while(true){


            //Calculation
            player.calculate(timeElapsed);


            //Graphics
            Background.draw();
            ground.draw();
            platform1.draw();
            player.draw();



            StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
            StdDraw.pause((int)(timeElapsed*1000)); //You must pass to the pause method the number of milliseconds to pause for; so we multiply by 1000 because our timeElapsed variable is in seconds, not milliseconds.
            StdDraw.clear(); //This clears everything drawn on the screen. You must redraw the image you wish to display for each frame of an animation
        }
    }


}
