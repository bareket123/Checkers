import javax.swing.*;
import java.util.Scanner;

public class Main extends JFrame {
    public static void main(String[] args) {
            Main main = new Main();




    }
    public Main(){
        Board board = new Board(0,0,5,5);
        this.add(board);

        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(Consts.WINDOW_WIDTH,Consts.WINDOW_HIGHT);

    }

}
