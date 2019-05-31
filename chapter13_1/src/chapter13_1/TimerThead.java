package chapter13_1;

import java.awt.*;
import javax.swing.*;

public class TimerThead extends Thread{
private JLabel timeLabel;

public TimerThead(JLabel timerLabel){
	this.timerLabel = timerLabel;
}
public void run(){
	int n=0;
	while(true){
		timeLabel.setText(Integer.toBinaryString(n));
		n++;
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			return;
			}
		}
	}
}
public class ThreadTimerEx extends JFrame{
	public ThreadTimerEx(){
		setTitle("Thead를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("gothic",Font.ITALIC,80));
		c.add(timerLabel);
		
		TimerThread th = new TimerThread(timerLabel);
		
		setSize(300,170);
		setVisible(true);
		
		th.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadTimerEx();
		}		
	
	}

