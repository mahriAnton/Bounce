import java.awt.*;
import javax.swing.*;
public class Ball {
    
    private int x, y, size, xSpeed, ySpeed;
    private Color color;
    
    
    public Ball( ){
        x = (int)(Math.random()*500);
        y =(int)(Math.random()*500);
        size = (int)(Math.random()*50);
        xSpeed = (int)(Math.random()*5)+1;
        ySpeed = (int)(Math.random()*5)+1;
        int r = (int)(Math.random()*255);
        int g =(int)(Math.random()*255);
        int b = (int)(Math.random()*255);
        color = new Color(r,g,b);
    }
    
    public void drawBall(Graphics pony){
        pony.setColor(color);
        pony.fillOval(x,y,size,size);
    }
    
    public void moveBall(JPanel a){
        x+= xSpeed;
        y += ySpeed;
        if(x >= a.getWidth() || x <= 0){
         xSpeed = xSpeed * -1; 
        } 
        if(y <= 0 || y>= a.getHeight()){
            ySpeed = ySpeed * -1;
        }
        
        try{
        Thread.sleep(10);
    } catch(Exception e){
        System.out.println(e);
    }
        
    }
    
        
    
    
    
}
