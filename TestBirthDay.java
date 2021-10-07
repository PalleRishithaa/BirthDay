package it.tests;
import it.excepts.*;
import it.core.*;
import java.util.*;
import java.io.*;
import java.lang.String;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GUI extends JFrame 
{
	ArrayList<BirthDay> al =new ArrayList<BirthDay>();
	BirthDay birthDay;
	JMenuBar menuBar;
	JMenu	file;
	JMenuItem  misave;
	JMenu 	Help;
	JMenuItem miexit;
	JMenuItem miAboutTheAssignment;
	JMenuItem micredits;
	JPanel  pnl1;
	JPanel  pnl2;
	JPanel  pnl3;
	JLabel 	lbmmddyyyy;
	JLabel lbObjects;
	JTextField tfInput;
	JTextArea taResult;
	JButton btbutton;
	JScrollPane scrollBar;
	JTextField tfdob;
	JPanel pnl4;
	JLabel lbdob;
	public GUI()
	{
		initializeComponents();
		addComponentsToFrame();
		addListenerInterfaces();
	}
	
	public void  initializeComponents()
	{
		menuBar=new JMenuBar();
		file=new JMenu("File");
		Help=new JMenu("Help");
		misave=new JMenuItem("Save");
		miexit=new JMenuItem("Exit");
		miAboutTheAssignment=new JMenuItem("AboutThisAssignment");
		micredits=new JMenuItem("Credits");
		lbmmddyyyy=new JLabel("Enter DOB");
		lbObjects=new JLabel("Entered Objects");
		tfInput=new JTextField(30);
		taResult=new JTextArea(5,5);
		
		scrollBar=new JScrollPane(taResult);
		scrollBar.setVisible(true);
		//scrollBar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		btbutton=new JButton("Click This");
		
		
		
		
		pnl1=new JPanel();
		pnl1.setLayout(new FlowLayout());
		pnl2=new JPanel();
		pnl2.setLayout(new FlowLayout());
		pnl3=new JPanel();
		pnl3.setLayout(new FlowLayout());
		pnl4=new JPanel();
		pnl4.setLayout(new FlowLayout());
	}
	public void addComponentsToFrame()
	{
		setJMenuBar(menuBar);
		setLayout(new FlowLayout());
		setSize(500,500);
		
		menuBar.add(file);
		file.add(misave);
		file.add(miexit);
		Help.add(miAboutTheAssignment);
		Help.add(micredits);
		menuBar.add(file);
		menuBar.add(Help);
		pnl1.add(lbmmddyyyy);
		pnl2.add(tfInput);
		pnl3.add(btbutton);


		pnl4.add(lbObjects);
		pnl4.add(taResult);
		add(pnl1);
		add(pnl2);
		add(pnl3);
		add(pnl4);
		setVisible(true);
	}
	public void addListenerInterfaces()
	{
		btbutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
			
				try
				{
				StringTokenizer st=new StringTokenizer(tfInput.getText());
				
				
				String mm,dd,yyyy;
				mm=st.nextToken();
				dd=st.nextToken();
				yyyy=st.nextToken();
				if(st.hasMoreTokens())
				{
					
				 	System.out.println(new WrongInputException());
				 	
				 	
				 
					
				}
					
				

			
				else if(((Integer.parseInt(mm)<=12)&&(Integer.parseInt(mm)>0))&&((Integer.parseInt(dd)<=31)&&(Integer.parseInt(dd)>0))&&((Integer.parseInt(yyyy)<10000)&&(Integer.parseInt(yyyy)>999)))
				{
					
				
					BirthDay birthDay=new BirthDay(Integer.parseInt(dd),Integer.parseInt(mm),Integer.parseInt(yyyy));

					birthDay.calcDay(Integer.parseInt(yyyy),Integer.parseInt(mm),Integer.parseInt(dd));
					
				
					al.add(birthDay);

			
				}
				else 
				{
					
					
					JOptionPane.showMessageDialog(null,"enter valid values for mm dd yyyy\n enter a 4-digit year (yyyy) ","ERROR",JOptionPane.ERROR_MESSAGE);
					
					
				}
				}
				
			
			catch(Exception wrongInputException)
			{
				
				System.out.println(new WrongInputException());
				
			
				
				
			}
			
			if(al.isEmpty())
			{
				taResult.setText(" ");
					
			}
			else 
			{
				
				taResult.setText(" ");
				
				for(Object birthDay : al)
				{
					taResult.append(birthDay.toString()+"\n");
					
				}
				
				
			} 
			}});
		misave.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				try{
				File file=new File("data.bin");
				FileOutputStream fos=new FileOutputStream(file);
				ObjectOutputStream Oos=new ObjectOutputStream(fos);
				Oos.writeObject(birthDay);
				}
				catch(IOException ei)
				{
					JOptionPane.showMessageDialog(null,"Object didn't save","WARNING",JOptionPane.WARNING_MESSAGE);
				}
				FileDialog fd =new FileDialog(GUI.this,"data.bin");
				fd.setVisible(true);
				
			}
		});
		miexit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		miAboutTheAssignment.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(miAboutTheAssignment," Sample input :\n 09 15 2000\nSample Output:\nFriday,September 15,2000\n ","AboutThisAssignment",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		micredits.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(micredits,"Name :Sahithi\nRollNumber: 1602-18-737-033 ","Credits",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
	}
	
}
public class TestBirthDay
{
	public static void main(String args[])
	{
		
		
		new GUI();
		

	}
}
