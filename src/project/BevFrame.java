//package project;
//
//import javax.swing.*;
//
//import project.KioskFrame.Btn1;
//import project.KioskFrame.Btn2;
//import project.KioskFrame.Btn3;
//
//import java.awt.Color;
//import java.awt.Dimension;
//import java.awt.event.*;
//
//
//public class BevFrame extends JFrame{
//	Manager m = Manager.getInstance();
//
//	public class Btn1 implements ActionListener{
//		public void actionPerformed(ActionEvent e) {
//			new KioskFrame();
//			
//		}
//	}
//	public class Btn2 implements ActionListener{
//		public void actionPerformed(ActionEvent e) {
//			new BevFrame();
//			}
//	}
//	public class Btn3 implements ActionListener{
//		public void actionPerformed(ActionEvent e) {
//			new SideFrame();
//			}
//	}
//	public BevFrame(){
//		JTextArea result = new JTextArea();
//		JTextArea resultPrice = new JTextArea();
//
//		JPanel panel = new JPanel();
//		add(panel);
//		this.setTitle("Kiosk");
//		panel.setLayout(null);
//		this.setSize(600,600);
//		
//		JButton menuBtn1 = new JButton("햄버거");
//		panel.add(menuBtn1);
//
//		menuBtn1.setBounds(0,0,100,50);
//		menuBtn1.addActionListener(new Btn1());
//		menuBtn1.setBorderPainted(false);
//
//		
//		JButton menuBtn2 = new JButton("음료수");
//		menuBtn2.setBounds(100,0,100,50);
//		menuBtn2.addActionListener(new Btn2());
//		menuBtn2.setBorderPainted(false);
//		panel.add(menuBtn2);
//
//
//		JButton menuBtn3 = new JButton("사이드");
//		menuBtn3.addActionListener(new Btn3());
//		menuBtn3.setBounds(200,0,100,50);
//		menuBtn3.setBorderPainted(false);
//		panel.add(menuBtn3);
//
//	
//	this.setVisible(true);
//	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
//
//}
