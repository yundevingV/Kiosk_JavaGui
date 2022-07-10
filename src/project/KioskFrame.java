package project;

import javax.swing.*;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;


public class KioskFrame extends JFrame{	
//시작점x, y , 가로크기, 세로크기

	
	int startX = 0;
	int startY = 50;
	int menuButtonWidth = 150;
	int menuButtonHeight = 75;
	int menuLabelHeight = 25;
	
	int plusBtnX = 50;
	int plusBtnY = startY+menuButtonHeight+menuLabelHeight+5;
	int plusBtnWidth = 50;
	int plusBtnHeight = 50;
	
	int minusBtnX = 50;
	int minusBtnY = startY+menuButtonHeight+menuLabelHeight+5;
	int minusBtnWidth = 50;
	int minusBtnHeight = 50;
	
	int xBtnX = 50;
	int xBtnY = startY+menuButtonHeight+menuLabelHeight+5;
	int xBtnWidth = 50;
	int xBtnHeight = 50;
	
	JTextArea result = new JTextArea();
	JTextArea resultPrice = new JTextArea();
	
	int[] burgerCounts = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	String[] burgerNames = {"스태커 2와퍼","스태커 3와퍼","스태커 4와퍼","베이컨 치즈와퍼",
			"할라피뇨 와퍼","치즈 와퍼","와퍼","불고기 와퍼","비프&쉬림프 버거","콰트로 치즈 X와퍼"
			,"코카콜라","스프라이트","감자튀김","치즈스틱"};
	
	int[] burgerPrices = {8000,9200,9900,7200,7200,7000,6500,6700,6200,5700,1700,1700,2300,1000};
	String str = "";
	int totalPrice =0;
	
	public void orderBurger(JTextArea result,JTextArea resultPrice) {
		str="";
		totalPrice=0;
		for(int i = 0 ;i<burgerCounts.length;i++) {
			if(burgerCounts[i] > 0) {
				str += burgerNames[i] + burgerCounts[i] + "개  ";
				
				totalPrice += (burgerPrices[i] * burgerCounts[i]);
				
			}
			result.setText(str);
			resultPrice.setText( Integer.toString(totalPrice));
		}
	}
	public void minusBurger(JTextArea result,JTextArea resultPrice) {
		str="";

		for(int i = 0 ;i<burgerCounts.length;i++) {
			if(burgerCounts[i] > 0) {
				str += burgerNames[i] + burgerCounts[i] + "개  ";
				
				totalPrice -= (burgerPrices[i] * burgerCounts[i]);
				
			}
			result.setText(str);
			resultPrice.setText( Integer.toString(totalPrice));
		}
	}
	
	public KioskFrame() {

		JTextArea result = new JTextArea();
		JTextArea resultPrice = new JTextArea();

		JPanel panel = new JPanel();
		add(panel); 
		this.setTitle("Kiosk");
		panel.setLayout(null);
		this.setSize(1200,600);

		JLabel title = new JLabel("햄버거 키오스크");
		panel.add(title);
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setBounds(0,0,1200,50);
		


		JButton ham1 = new JButton("");
		ImageIcon ham1icon = new ImageIcon("./image/ham1.png");
		ham1.setIcon(ham1icon);
		panel.add(ham1);
		
		JLabel ham1L = new JLabel("스태커 2와퍼");
		panel.add(ham1L);
		
		JButton ham1Plus = new JButton("+");
		ham1Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[0]++;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham1Plus);
		
		JButton ham1Minus = new JButton("-");
		ham1Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[0]--;
				if(burgerCounts[0] <= 0) {
					burgerCounts[0]=0;
				}
				orderBurger(result,resultPrice);
			}});
		panel.add(ham1Minus);
		
		JButton ham1X = new JButton("X");
		ham1X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[0]=0;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham1X);
		ham1.setBounds(startX,startY,menuButtonWidth,menuButtonHeight);
		ham1L.setBounds(startX,startY+menuButtonHeight,menuButtonWidth,menuLabelHeight);
		ham1Plus.setBounds(plusBtnX*0,plusBtnY,plusBtnWidth,plusBtnHeight);
		ham1Minus.setBounds(minusBtnX*1,minusBtnY,minusBtnWidth,minusBtnHeight);
		ham1X.setBounds(xBtnX*2,xBtnY,xBtnWidth,xBtnHeight);	
		// x+width 		
		
		
		ham1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[0]++;
				orderBurger(result,resultPrice);
			}});
		

		JButton ham2 = new JButton("");
		ImageIcon ham2icon = new ImageIcon("./image/ham2.png");
		ham2.setBounds(startX+menuButtonWidth,startY,menuButtonWidth,menuButtonHeight);
		ham2.setIcon(ham2icon);
		panel.add(ham2);
		JLabel ham2L = new JLabel("스태커 3와퍼");
		ham2L.setBounds(startX+menuButtonWidth,startY+menuButtonHeight,menuButtonWidth,menuLabelHeight); 
		// x+width 		
		panel.add(ham2L);
		
		ham2.addActionListener(e-> {
				
			burgerCounts[1]++;
			orderBurger(result,resultPrice);
			});
		
		JButton ham2Plus = new JButton("+");
		ham2Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[1]++;
				orderBurger(result,resultPrice);


			}});
		panel.add(ham2Plus);
		
		JButton ham2Minus = new JButton("-");
		ham2Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[1]--;
				if(burgerCounts[1] <= 0) {
					burgerCounts[1]=0;
				}
				orderBurger(result,resultPrice);
				}});
		panel.add(ham2Minus);
		
		JButton ham2X = new JButton("X");
		ham2X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[1]=0;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham2X);
		ham2Plus.setBounds(plusBtnX*3,plusBtnY,plusBtnWidth,plusBtnHeight);
		ham2Minus.setBounds(minusBtnX*4,minusBtnY,minusBtnWidth,minusBtnHeight);
		ham2X.setBounds(xBtnX*5 ,xBtnY,xBtnWidth,xBtnHeight);	
		
		
		JButton ham3 = new JButton("");
		ImageIcon ham3icon = new ImageIcon("./image/ham3.png");
		ham3.setIcon(ham3icon);
		panel.add(ham3);
		JLabel ham3L = new JLabel("스태커 4와퍼");
		ham3.setBounds(startX+(menuButtonWidth*2),startY,menuButtonWidth,menuButtonHeight);	
		ham3L.setBounds(startX+(menuButtonWidth*2),startY+menuButtonHeight,menuButtonWidth,menuLabelHeight); 
		// x+width 		
		panel.add(ham3L);
		ham3.addActionListener(e-> {
			
			burgerCounts[2]++;
			orderBurger(result,resultPrice);
			});
		
		JButton ham3Plus = new JButton("+");
		ham3Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[2]++;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham3Plus);
		
		JButton ham3Minus = new JButton("-");
		ham3Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[2]--;
				if(burgerCounts[2] <= 0) {
					burgerCounts[2]=0;
				}
				orderBurger(result,resultPrice);
			}});
		panel.add(ham3Minus);
		
		JButton ham3X = new JButton("X");
		ham3X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[2]=0;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham3X);
		ham3Plus.setBounds(plusBtnX*6,plusBtnY,plusBtnWidth,plusBtnHeight);
		ham3Minus.setBounds(minusBtnX*7,minusBtnY,minusBtnWidth,minusBtnHeight);
		ham3X.setBounds(xBtnX*8 ,xBtnY,xBtnWidth,xBtnHeight);	
		
		
		JButton ham4 = new JButton("");
		ImageIcon ham4icon = new ImageIcon("./image/ham4.png");
		ham4.setIcon(ham4icon);
		panel.add(ham4);
		JLabel ham4L = new JLabel("베이컨 치즈 와퍼");
		// x+width 		
		panel.add(ham4L);
		
		ham4.setBounds(startX+(menuButtonWidth*3),startY,menuButtonWidth,menuButtonHeight);	
		ham4L.setBounds(startX+(menuButtonWidth*3),startY+menuButtonHeight,menuButtonWidth,menuLabelHeight); 
		
		ham4.addActionListener(e-> {
			
			burgerCounts[3]++;
			orderBurger(result,resultPrice);
			});
		
		JButton ham4Plus = new JButton("+");
		ham4Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[3]++;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham4Plus);
		
		JButton ham4Minus = new JButton("-");
		ham4Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[3]--;
				if(burgerCounts[3] <= 0) {
					burgerCounts[3]=0;
				}
				orderBurger(result,resultPrice);
			}});
		panel.add(ham4Minus);
		
		JButton ham4X = new JButton("X");
		ham4X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[3]=0;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham4X);
		ham4Plus.setBounds(plusBtnX*9,plusBtnY,plusBtnWidth,plusBtnHeight);
		ham4Minus.setBounds(minusBtnX*10,minusBtnY,minusBtnWidth,minusBtnHeight);
		ham4X.setBounds(xBtnX*11 ,xBtnY,xBtnWidth,xBtnHeight);	
		
		
		JButton ham5 = new JButton("");
		ImageIcon ham5icon = new ImageIcon("./image/ham5.png");
		ham5.setIcon(ham5icon);
		panel.add(ham5);
		JLabel ham5L = new JLabel("할라피뇨 와퍼");
		// x+width 		
		panel.add(ham5L);
		ham5.setBounds(startX+(menuButtonWidth*4),startY,menuButtonWidth,menuButtonHeight);	
		ham5L.setBounds(startX+(menuButtonWidth*4),startY+menuButtonHeight,menuButtonWidth,menuLabelHeight); 
		
		ham5.addActionListener(e-> {
			
			burgerCounts[4]++;
			orderBurger(result,resultPrice);
			});
		
		JButton ham5Plus = new JButton("+");
		ham5Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[4]++;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham5Plus);
		
		JButton ham5Minus = new JButton("-");
		ham5Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[4]--;
				if(burgerCounts[4] <= 0) {
					burgerCounts[4]=0;
				}
				orderBurger(result,resultPrice);
			}});
		panel.add(ham5Minus);
		
		JButton ham5X = new JButton("X");
		ham5X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[4]=0;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham5X);
		ham5Plus.setBounds(plusBtnX*12,plusBtnY,plusBtnWidth,plusBtnHeight);
		ham5Minus.setBounds(minusBtnX*13,minusBtnY,minusBtnWidth,minusBtnHeight);
		ham5X.setBounds(xBtnX*14 ,xBtnY,xBtnWidth,xBtnHeight);	
		JButton ham6 = new JButton("");
		ImageIcon ham6icon = new ImageIcon("./image/ham6.png");
		ham6.setIcon(ham6icon);
		panel.add(ham6);
		JLabel ham6L = new JLabel("치즈 와퍼");
		ham6.setBounds(startX+(menuButtonWidth*5),startY,menuButtonWidth,menuButtonHeight);	
		ham6L.setBounds(startX+(menuButtonWidth*5),startY+menuButtonHeight,menuButtonWidth,menuLabelHeight); 
		// x+width 		
		panel.add(ham6L);
		ham6.addActionListener(e-> {
			
			burgerCounts[5]++;
			orderBurger(result,resultPrice);
			});
		
		JButton ham6Plus = new JButton("+");
		ham6Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[5]++;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham6Plus);
		
		JButton ham6Minus = new JButton("-");
		ham6Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[5]--;
				if(burgerCounts[5] <= 0) {
					burgerCounts[5]=0;
				}
				orderBurger(result,resultPrice);
			}});
		panel.add(ham6Minus);
		
		JButton ham6X = new JButton("X");
		ham6X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[5]=0;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham6X);
		ham6Plus.setBounds(plusBtnX*15,plusBtnY,plusBtnWidth,plusBtnHeight);
		ham6Minus.setBounds(minusBtnX*16,minusBtnY,minusBtnWidth,minusBtnHeight);
		ham6X.setBounds(xBtnX*17 ,xBtnY,xBtnWidth,xBtnHeight);	
		
		JButton ham7 = new JButton("");
		ImageIcon ham7icon = new ImageIcon("./image/ham7.png");
		ham7.setIcon(ham7icon);
		panel.add(ham7);
		JLabel ham7L = new JLabel("와퍼");

		ham7.setBounds(startX+(menuButtonWidth*6),startY,menuButtonWidth,menuButtonHeight);	
		ham7L.setBounds(startX+(menuButtonWidth*6),startY+menuButtonHeight,menuButtonWidth,menuLabelHeight); 
		// x+width 		
		panel.add(ham7L);
		ham7.addActionListener(e-> {
			
			burgerCounts[6]++;
			orderBurger(result,resultPrice);
			});
		JButton ham7Plus = new JButton("+");
		ham7Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[6]++;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham7Plus);
		
		JButton ham7Minus = new JButton("-");
		ham7Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[6]--;
				if(burgerCounts[6] <= 0) {
					burgerCounts[6]=0;
				}
				orderBurger(result,resultPrice);
			}});
		panel.add(ham7Minus);
		
		JButton ham7X = new JButton("X");
		ham7X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[6]=0;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham7X);
		ham7Plus.setBounds(plusBtnX*18,plusBtnY,plusBtnWidth,plusBtnHeight);
		ham7Minus.setBounds(minusBtnX*19,minusBtnY,minusBtnWidth,minusBtnHeight);
		ham7X.setBounds(xBtnX*20 ,xBtnY,xBtnWidth,xBtnHeight);	
		
		JButton ham8 = new JButton("");
		ImageIcon ham8icon = new ImageIcon("./image/ham8.png");
		ham8.setIcon(ham8icon);
		panel.add(ham8);
		JLabel ham8L = new JLabel("불고기 와퍼");
		ham8.setBounds(startX+(menuButtonWidth*7),startY,menuButtonWidth,menuButtonHeight);	
		ham8L.setBounds(startX+(menuButtonWidth*7),startY+menuButtonHeight,menuButtonWidth,menuLabelHeight); 
		panel.add(ham8L);
		ham8.addActionListener(e-> {
			
			burgerCounts[7]++;
			orderBurger(result,resultPrice);
			});
		
		
		JButton ham8Plus = new JButton("+");
		ham8Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[7]++;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham8Plus);
		
		JButton ham8Minus = new JButton("-");
		ham8Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[7]--;
				if(burgerCounts[7] <= 0) {
					burgerCounts[7]=0;
				}
				orderBurger(result,resultPrice);
			}});
		panel.add(ham8Minus);
		
		JButton ham8X = new JButton("X");
		ham8X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[7]=0;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham8X);
		ham8Plus.setBounds(plusBtnX*21,plusBtnY,plusBtnWidth,plusBtnHeight);
		ham8Minus.setBounds(minusBtnX*22,minusBtnY,minusBtnWidth,minusBtnHeight);
		ham8X.setBounds(xBtnX*23 ,xBtnY,xBtnWidth,xBtnHeight);	
		
		
		JButton ham9 = new JButton("");
		ImageIcon ham9icon = new ImageIcon("./image/ham9.png");

		ham9.setIcon(ham9icon);
		panel.add(ham9);
		JLabel ham9L = new JLabel("비프&쉬림프 버거");
		// x+width 		
		panel.add(ham9L);
		ham9.setBounds(startX+(menuButtonWidth*0),startY+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5,menuButtonWidth,menuButtonHeight);	
		ham9L.setBounds(startX+(menuButtonWidth*0),startY+menuButtonHeight+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5,menuButtonWidth,menuLabelHeight); 
		ham9.addActionListener(e-> {
			
			burgerCounts[8]++;
			orderBurger(result,resultPrice);
			});
		JButton ham9Plus = new JButton("+");
		ham9Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[8]++;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham9Plus);
		
		JButton ham9Minus = new JButton("-");
		ham9Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[8]--;
				if(burgerCounts[8] <= 0) {
					burgerCounts[8]=0;
				}
				orderBurger(result,resultPrice);
			}});
		panel.add(ham9Minus);
		
		JButton ham9X = new JButton("X");
		ham9X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[8]=0;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham9X);
		ham9Plus.setBounds(plusBtnX*0,plusBtnY+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5,plusBtnWidth,plusBtnHeight);
		ham9Minus.setBounds(minusBtnX*1,minusBtnY+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5,minusBtnWidth,minusBtnHeight);
		ham9X.setBounds(xBtnX*2,xBtnY+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5,xBtnWidth,xBtnHeight);	
		JButton ham10 = new JButton("");
		ImageIcon ham10icon = new ImageIcon("./image/ham10.png");
		ham10.setIcon(ham10icon);
		panel.add(ham10);
		JLabel ham10L = new JLabel("콰트로치즈X와퍼");
		// x+width 		
		panel.add(ham10L);
		ham10.setBounds(startX+(menuButtonWidth*1),startY+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5,menuButtonWidth,menuButtonHeight);
		ham10L.setBounds(startX+(menuButtonWidth*1),startY+menuButtonHeight+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5,menuButtonWidth,menuLabelHeight); 
		ham10.addActionListener(e-> {
			
			burgerCounts[9]++;
			orderBurger(result,resultPrice);
			});
		JButton ham10Plus = new JButton("+");
		ham10Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[9]++;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham10Plus);
		
		JButton ham10Minus = new JButton("-");
		ham10Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[9]--;
				if(burgerCounts[9] <= 0) {
					burgerCounts[9]=0;
				}
				orderBurger(result,resultPrice);
			}});
		panel.add(ham10Minus);
		
		JButton ham10X = new JButton("X");
		ham10X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[9]=0;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham10X);
		ham10Plus.setBounds(plusBtnX*3,plusBtnY+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5,plusBtnWidth,plusBtnHeight);
		ham10Minus.setBounds(minusBtnX*4,minusBtnY+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5,minusBtnWidth,minusBtnHeight);
		ham10X.setBounds(xBtnX*5 ,xBtnY+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5 ,xBtnWidth,xBtnHeight);	
		
		JButton ham11 = new JButton("");
		ImageIcon ham11icon = new ImageIcon("./image/ham11.png");
		ham11.setIcon(ham11icon);
		panel.add(ham11);
		JLabel ham11L = new JLabel("코카콜라");
		// x+width 		
		panel.add(ham11L);
		ham11.setBounds(startX+(menuButtonWidth*2),startY+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5,menuButtonWidth,menuButtonHeight);
		ham11L.setBounds(startX+(menuButtonWidth*2),startY+menuButtonHeight+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5,menuButtonWidth,menuLabelHeight); 
		ham11.addActionListener(e-> {
			
			burgerCounts[10]++;
			orderBurger(result,resultPrice);
			});
		JButton ham11Plus = new JButton("+");
		ham11Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[10]++;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham11Plus);
		
		JButton ham11Minus = new JButton("-");
		ham11Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[10]--;
				if(burgerCounts[10] <= 0) {
					burgerCounts[10]=0;
				}
				orderBurger(result,resultPrice);
			}});
		panel.add(ham11Minus);
		
		JButton ham11X = new JButton("X");	
		ham11X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[10]=0;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham11X);
		ham11Plus.setBounds(plusBtnX*6,plusBtnY+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5,plusBtnWidth,plusBtnHeight);
		ham11Minus.setBounds(minusBtnX*7,minusBtnY+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5,minusBtnWidth,minusBtnHeight);
		ham11X.setBounds(xBtnX*8 ,xBtnY+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5 ,xBtnWidth,xBtnHeight);	
		
		JButton ham12 = new JButton("");
		ImageIcon ham12icon = new ImageIcon("./image/ham12.png");
		ham12.setIcon(ham12icon);
		panel.add(ham12);
		JLabel ham12L = new JLabel("스프라이트");
		// x+width 		
		panel.add(ham12L);
		ham12.setBounds(startX+(menuButtonWidth*3),startY+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5,menuButtonWidth,menuButtonHeight);
		ham12L.setBounds(startX+(menuButtonWidth*3),startY+menuButtonHeight+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5,menuButtonWidth,menuLabelHeight); 
		ham12.addActionListener(e-> {
			
			burgerCounts[11]++;
			orderBurger(result,resultPrice);
			});
		JButton ham12Plus = new JButton("+");
		ham12Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[11]++;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham12Plus);
		
		JButton ham12Minus = new JButton("-");
		ham12Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[11]--;
				if(burgerCounts[11] <= 0) {
					burgerCounts[11]=0;
				}
				orderBurger(result,resultPrice);
			}});
		panel.add(ham12Minus);
		
		JButton ham12X = new JButton("X");	
		ham12X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[11]=0;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham12X);
		ham12Plus.setBounds(plusBtnX*9,plusBtnY+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5,plusBtnWidth,plusBtnHeight);
		ham12Minus.setBounds(minusBtnX*10,minusBtnY+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5,minusBtnWidth,minusBtnHeight);
		ham12X.setBounds(xBtnX*11 ,xBtnY+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5 ,xBtnWidth,xBtnHeight);	
		
		JButton ham13 = new JButton("");
		ImageIcon ham13icon = new ImageIcon("./image/ham13.png");
		ham13.setIcon(ham13icon);
		panel.add(ham13);
		JLabel ham13L = new JLabel("감자튀김");
		// x+width 		
		panel.add(ham13L);
		ham13.setBounds(startX+(menuButtonWidth*4),startY+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5,menuButtonWidth,menuButtonHeight);
		ham13L.setBounds(startX+(menuButtonWidth*4),startY+menuButtonHeight+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5,menuButtonWidth,menuLabelHeight); 
		ham13.addActionListener(e-> {
			
			burgerCounts[12]++;
			orderBurger(result,resultPrice);
			});
		JButton ham13Plus = new JButton("+");
		ham13Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[12]++;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham13Plus);
		
		JButton ham13Minus = new JButton("-");
		ham13Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[12]--;
				if(burgerCounts[12] <= 0) {
					burgerCounts[12]=0;
				}
				orderBurger(result,resultPrice);
			}});
		panel.add(ham13Minus);
		
		JButton ham13X = new JButton("X");	
		ham13X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[12 ]=0;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham13X);
		ham13Plus.setBounds(plusBtnX*12,plusBtnY+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5,plusBtnWidth,plusBtnHeight);
		ham13Minus.setBounds(minusBtnX*13,minusBtnY+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5,minusBtnWidth,minusBtnHeight);
		ham13X.setBounds(xBtnX*14 ,xBtnY+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5 ,xBtnWidth,xBtnHeight);	
		JButton ham14 = new JButton("");
		ImageIcon ham14icon = new ImageIcon("./image/ham14.png");
		ham14.setIcon(ham14icon);
		panel.add(ham14);
		JLabel ham14L = new JLabel("치즈스틱");
		// x+width 		
		panel.add(ham14L);
		ham14.setBounds(startX+(menuButtonWidth*5),startY+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5,menuButtonWidth,menuButtonHeight);
		ham14L.setBounds(startX+(menuButtonWidth*5),startY+menuButtonHeight+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5,menuButtonWidth,menuLabelHeight); 
		ham14.addActionListener(e-> {
			
			burgerCounts[13]++;
			orderBurger(result,resultPrice);
			});
		JButton ham14Plus = new JButton("+");
		ham14Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[13]++;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham14Plus);
		
		JButton ham14Minus = new JButton("-");
		ham14Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[13]--;
				if(burgerCounts[13] <= 0) {
					burgerCounts[13]=0;
				}
				orderBurger(result,resultPrice);
			}});
		panel.add(ham14Minus);
		
		JButton ham14X = new JButton("X");	
		ham14X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				burgerCounts[13]=0;
				orderBurger(result,resultPrice);
			}});
		panel.add(ham14X);
		ham14Plus.setBounds(plusBtnX*15,plusBtnY+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5,plusBtnWidth,plusBtnHeight);
		ham14Minus.setBounds(minusBtnX*16,minusBtnY+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5,minusBtnWidth,minusBtnHeight);
		ham14X.setBounds(xBtnX*17 ,xBtnY+(menuLabelHeight+menuButtonHeight)+plusBtnHeight+5 ,xBtnWidth,xBtnHeight);	
		
		
		result.setBounds(600,400,460,200);
		panel.add(result);
		result.setEditable(false);
		result.setForeground(Color.black);
		
		resultPrice.setBounds(600,500,460,50);
		panel.add(resultPrice);
		resultPrice.setEditable(false);
		resultPrice.setForeground(Color.black);
		result.setLineWrap(true);
		resultPrice.setLineWrap(true);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton submit = new JButton("결제하기");
		submit.setBounds(1070, 500, 100, 50);
		panel.add(submit);
		
		submit.addActionListener(e->{
			if(totalPrice >0) {
				new SubmitFrame(totalPrice);
			}
		});
		JButton cancel = new JButton("취소하기");
		cancel.setBounds(1070, 430, 100, 50);
		panel.add(cancel);
		cancel.addActionListener(e-> {
			str="";
			for(int i=0;i<burgerCounts.length;i++) {
				burgerCounts[i]=0;
			}
			totalPrice =0;

			result.setText("");
			resultPrice.setText("0 ");

			});
	}

}
