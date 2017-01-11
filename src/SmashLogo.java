import java.awt.*;

public class SmashLogo {
	public static void main(String[] args){
		DrawingPanel panel = new DrawingPanel(200, 200);
		panel.setBackground(Color.WHITE);
		
		Graphics g = panel.getGraphics();		
		g.setColor(Color.RED);
		g.fillOval(50, 50, 100, 100);
		g.setColor(Color.WHITE);
		g.fillRect(75, 50, 25, 100);
		g.fillRect(50, 110, 100, 10);
		
	}
	
}
