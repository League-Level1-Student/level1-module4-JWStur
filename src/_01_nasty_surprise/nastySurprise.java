package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastySurprise implements ActionListener {
	JFrame frame = new JFrame();
	JButton trick = new JButton();
	JButton treat = new JButton();
	JPanel panel = new JPanel();
	
	void setup() {
		trick.setText("Trick");
		treat.setText("Treat");
		panel.add(trick);
		panel.add(treat);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		
		trick.addActionListener(this);
		treat.addActionListener(this);
	}
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == trick) {
			showPictureFromTheInternet("https://images.pexels.com/photos/1108099/pexels-photo-1108099.jpeg");
			System.out.println("trick");
		}
		if (arg0.getSource() == treat) {
			System.out.println("treat");
		}
	}
		
}
