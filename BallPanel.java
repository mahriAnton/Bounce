import javax.swing.*;
import java.awt.*;
import java.util.*;
public class BallPanel extends JPanel{
  
   
   ArrayList <Ball> balls = new ArrayList<Ball>(20);
   
    
    public BallPanel(){
        setBackground(new Color(255,0,0));
for (int i = 0; i<20;i++){
    Ball baller = new Ball();
    balls.add(baller);
   }
      
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