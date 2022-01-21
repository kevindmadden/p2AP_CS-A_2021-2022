package u05_Connect4;

public class Token {
    private int player;

    public Token(int player){
        this.player = player;
        System.out.println("player number"+player);
    }

    public void draw(int x, int y){
        if(this.player == 1){
            StdDraw.setPenColor(StdDraw.YELLOW);
        }else if(this.player == 2){
            StdDraw.setPenColor(StdDraw.RED);
        }
        StdDraw.filledCircle(x+5,y+5,4.5);
    }

    public int getPlayer(){
        return player;
    }

}
