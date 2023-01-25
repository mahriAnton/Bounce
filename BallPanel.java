import javax.swing.*;
import java.awt.*;
import java.util.*;
public class BallPanel extends JPanel{
    int x = 100;
    int y = 50;
    int xSpeed=3;
    int ySpeed = 1;
    ArrayList <Ball> balls = new ArrayList<Ball> (20);
  
    
    public BallPanel(){
        setBackground(new Color(255,0,0));
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i<balls.size(); i++){
          balls.get(i).drawBall(g);
          balls.get(i).moveBall(this);
        }
        repaint();
        
       
    }
}