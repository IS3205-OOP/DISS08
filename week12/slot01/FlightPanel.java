package week12.slot01;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class FlightPanel extends JPanel {

	final int WIDTH = 600, HEIGHT = 600;
	BirdPanel bird;
	Timer timer;
	
	public FlightPanel() {
		this.setLayout(null);
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		this.setBackground(Color.GREEN);
		
		bird = new BirdPanel();
		bird.setBounds(
				10,
				HEIGHT / 2,
				bird.getPreferredSize().width,
				bird.getPreferredSize().height
				);
		
		timer = new Timer(30, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int birdY = bird.getBounds().y;
				bird.setBounds(
						10,
						birdY + 5,
						bird.getPreferredSize().width,
						bird.getPreferredSize().height);
			}
		});
		timer.start();
		
		this.add(bird);
	}
	
}
