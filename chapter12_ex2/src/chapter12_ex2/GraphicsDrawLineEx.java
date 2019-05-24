package chapter12_ex2;


import javax.swing.*;
import java.awt.*;

public class GraphicsDrawLineEx extends JFrame {
	private Mypanel panel = new Mypanel();

	
	public GraphicsDrawLineEx()
	{
		setTitle("DrawLine 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setVisible(true);
		setSize(480, 400);
		
	}
	
	class Mypanel extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawLine(20, 20, 100, 100);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsDrawLineEx();
	}

}
