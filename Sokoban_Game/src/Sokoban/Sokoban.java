package Sokoban;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Sokoban extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int OFFSET = 30;

    public Sokoban(int i) {

        initUI(i);
    }

    private void initUI(int i) {
        
        Board board = new Board(i);
        add(board);
    	
        setTitle("Sokoban");
        
        setSize(board.getBoardWidth() + OFFSET,
                board.getBoardHeight() + 2 * OFFSET);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    	
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
     
            Sokoban game = new Sokoban(0);
            game.setVisible(true);
            
        		
         }
    	
        		
        );
    	
    }
}


