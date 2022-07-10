package project;

import java.util.ArrayList;

import javax.swing.*;


public class Manager {


	private static Manager instance = new Manager();
	
	private Manager() {
	}
	public static Manager getInstance() {
		return instance ; 
	}




}
	
	