package project;

import java.awt.Font;

import javax.swing.*;

public class SubmitFrame extends JFrame{
	public SubmitFrame(int totalPrice) {
		JPanel panel = new JPanel();
		add(panel); 
		this.setTitle("�����ϱ� ");
		panel.setLayout(null);
		this.setSize(600,600);
		
		
		JLabel payPrice = new JLabel("�� ���� �Ͻ� �ݾ��� : " + totalPrice);
		panel.add(payPrice);
		payPrice.setBounds(200,0,400,100);
		payPrice.setFont(new Font("",Font.BOLD,20));
		
		JButton cancel = new JButton("����ϱ�");
		panel.add(cancel);
		cancel.setBounds(250,400,100,30);
		
		cancel.addActionListener(e->{
			dispose();
		});
		
		JLabel pay = new JLabel("IC Ĩ�� �Ⱦ��ּ���. ");
		panel.add(pay);
		pay.setBounds(250,500,200,100);
		payPrice.setFont(new Font("",Font.BOLD,15));

		this.setVisible(true);
	}
	}
