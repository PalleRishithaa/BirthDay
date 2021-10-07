package it.excepts;

import javax.swing.JOptionPane;

public class WrongInputException extends Exception{
	public WrongInputException()
	{
		
		JOptionPane.showMessageDialog(null,"\nenter date of Birth in following pattern \n\n mm dd yyyy","ERROR",JOptionPane.ERROR_MESSAGE);
	}

}
