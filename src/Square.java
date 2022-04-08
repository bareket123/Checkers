import javax.swing.*;
import java.awt.*;

public class Square extends JButton {
    private  Color color;
    private Player player;

    public Square(Color color,Player player){
        this.color=color;
        this.player=player;

    }

    protected void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        graphics.setColor(this.color);
        graphics.fillRect(0,0,this.getWidth(),this.getHeight());
        switch (this.player){

            case none:

                //do nothing
                break;
            case red:
                graphics.setColor(Color.red);
                graphics.fillOval(0,0,this.getWidth()-Consts.PROPORTION_OVAL_RED_WIDTH,this.getHeight()-Consts.PROPORTION_OVAL_RED_HEIGHT);

                break;
            case blue:
                graphics.setColor(Color.blue);
                graphics.fillOval(5,5,this.getWidth()-Consts.PROPORTION_OVAL_BLUE,this.getHeight()-Consts.PROPORTION_OVAL_BLUE);
                break;



        }


    }

    public boolean isPlayerBlue () {
        boolean blue=false;
       if (this.player==Player.blue){
         blue=true;
       }
       return blue;
    }
    public boolean isPlayerRed () {
        if (this.player==Player.red){
            return true;
        }
        return false;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
