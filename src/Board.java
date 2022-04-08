import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Board extends JPanel {
     private ArrayList<ArrayList<Square>> boardData=new ArrayList<>();

    public Board(int x, int y, int width, int height) {
        boolean black=true;
        boolean setPlayer=true;
        this.setBounds(x, y, width, height);
        this.setBackground(Color.blue);
        GridLayout gridLayout= new GridLayout(Consts.BOARD_LENGTH,Consts.BOARD_LENGTH);
        this.setLayout(gridLayout);

        for (int row = 0; row < Consts.BOARD_LENGTH; row++) {
            ArrayList<Square> currentRow=new ArrayList<Square>();
            for (int colum = 0; colum < Consts.BOARD_LENGTH; colum++) {
              Player player=Player.none;
              if (setPlayer){


              if (row < 3) {
                    player = player.red;
                }else if(row>=5){
                    player=Player.blue;
                }
              }
               Square square = new Square( black ? Color.BLACK:Color.WHITE, player);
              int finalRow=row;
              int finalColum=colum;
              square.addActionListener((event->{
               if (square.isPlayerBlue()){
                   Square northEast=this.boardData.get(finalRow-1).get(finalColum+1);
                   Square northWest=this.boardData.get(finalRow-1).get(finalColum-1);
                   northEast.setPlayer(Player.blue);
                   square.setPlayer(Player.none);

               }
                square.repaint();
              })
              );
                this.add(square);
                currentRow.add(square);
                black=!black;
                setPlayer=!setPlayer;
            }
            this.boardData.add(currentRow);
            black=!black;
            setPlayer=!setPlayer;

        }





    }
}


