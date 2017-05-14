package testgui;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class TestGUI {

	public static void main(String[] args) {
		try {
			LookAndFeel laf	= new MetalLookAndFeel();
			UIManager.setLookAndFeel(laf);
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		JFrame frame	= new JFrame("Test Frame");
		ImageIcon image	= new ImageIcon("/home/kaze/workspace/TestGUI/src/testgui/mal-hrizantemi-1600.jpg");
		frame.setIconImage(image.getImage());
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		FlowLayout fl	= new FlowLayout();
		frame.setLayout(fl);
		
		JPanel panel	= new JPanel();
		panel.setSize(300, 300);
		panel.setBorder(BorderFactory.createRaisedBevelBorder());
		
		JButton button	= new JButton("Test button");
		button.setSize(200, 100);
		panel.add(button);
		
		frame.getContentPane().add(panel);
	}

}
