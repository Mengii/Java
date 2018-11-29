package fr.dauphine.ja.DUANMengzhao.td01.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.dauphine.ja.DUANMengzhao.td01.controller.MouseController;
import fr.dauphine.ja.DUANMengzhao.td01.model.Circle;
import fr.dauphine.ja.DUANMengzhao.td01.model.Ring;
import fr.dauphine.ja.DUANMengzhao.td01.model.World;

public class MyDisplay extends JPanel {
	/**
	 * canvas panel for the shapes
	 */
	private static final long serialVersionUID = 1L;
	
	private static World world = new World();
	
	static JFrame frame;
	
	private final static int WIDTH = 500;
	private final static int HEIGHT = 500;
	
	static JButton newCircleButton = new JButton();
	static JButton newRingButton = new JButton();
	static MyDisplay display = new MyDisplay();
		
	@Override 
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(Drawer d : Drawer.allDrawers) {
			d.drawMe(g);
		}
	}
	
	//exo1.3
	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(WIDTH,HEIGHT));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(display);
		
		MouseController mouseControl = new MouseController(display, world);
		frame.addMouseMotionListener(mouseControl);
		frame.addMouseListener(mouseControl);
		
		newCircleButton.setText("create circle");
		display.add(newCircleButton);
		newCircleButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Circle c = new Circle(WIDTH, HEIGHT);				
				world.addShape(c);				
				CircleDrawer cdrawer = new CircleDrawer(c);				
				frame.repaint();
				System.out.println(c);
				
			}
			
		});
		
		newRingButton.setText("create ring");
		display.add(newRingButton);
		newRingButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Ring r = new Ring(WIDTH, HEIGHT);
				world.addShape(r);
				RingDrawer rdrawer = new RingDrawer(r);
				frame.repaint();
				System.out.println(r);
			}
			
		});
	}
}
