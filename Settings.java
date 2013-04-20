
import java.awt.*;

import java.awt.event.*;
import java.awt.Window;
import java.io.*;

import javax.swing.*;

import javax.swing.text.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.DefaultEditorKit;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
import java.awt.*;

import java.awt.event.*;

import java.io.*;

import javax.swing.*;

import javax.swing.text.*;

import java.awt.print.*;
import javax.swing.AbstractAction;
import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BoxLayout;
import java.awt.CardLayout;

import javax.swing.JFileChooser;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SpringLayout;

import java.awt.Component;
import javax.swing.JMenuBar;
import java.awt.TextField;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import java.awt.Toolkit;
import javax.swing.JTabbedPane;
import java.awt.Dimension;
import java.awt.AWTException;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Robot;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import javax.imageio.ImageIO;

@SuppressWarnings("unused")
public class Settings extends JFrame{
  public static void main(String [] args) 
	{
	    new Settings();
	}
	TXE1 txe = new TXE1();
	public String webText=("Your website url here");
	JTextField name = new JTextField(20);
	JTextField website = new JTextField(20);
	JTextField company = new JTextField(20);
	public JButton okButton, cancelButton;
	public JRadioButton bold, italics, boldI, normal;
	public String nameText = name.getText();
	public String webText1 = website.getText();
	public String companyText1 = company.getText();
	private static final long serialVersionUID = 1L;
	public String companyText=("Your Company/Orgniztion name here");
	
	public Settings(){
		this.setSize(500,500);
		this.setTitle("TXE Settings");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		JPanel panel1= new JPanel();
		panel1.setLayout(new GridBagLayout());
		addItem(panel1, new JLabel("Name:"),
				0, 0, 1, 1, GridBagConstraints.EAST);
		addItem(panel1, new JLabel("Website:"),
				0, 1, 1, 1, GridBagConstraints.EAST);
		addItem(panel1, new JLabel("Company:"),
				0, 2, 1, 1, GridBagConstraints.EAST);
		addItem(panel1, name, 1, 0, 2, 1, GridBagConstraints.WEST);
		addItem(panel1, website, 1, 1, 1, 1, GridBagConstraints.WEST);
		addItem(panel1, company, 1, 2, 2, 1, GridBagConstraints.WEST);
		Box formatBox = Box.createVerticalBox();
		bold = new JRadioButton("Defualt Bold");
		italics = new JRadioButton("Defualt Italics");
		boldI = new JRadioButton("Defualt Bold And Italics");
		normal = new JRadioButton("Defualt Normal");
		ButtonGroup formatGroup = new ButtonGroup();
		formatGroup.add(bold);
		formatGroup.add(boldI);
		formatGroup.add(italics);
		formatGroup.add(normal);
		formatBox.add(bold);
		formatBox.add(boldI);
		formatBox.add(italics);
		formatBox.add(normal);
		formatBox.setBorder(BorderFactory.createTitledBorder("Defualt Style Of Text"));
		addItem(panel1, formatBox, 1, 3,1,1,GridBagConstraints.NORTH);
		//add panel1
		this.add(panel1);
		//pack frame
		this.pack();
		bold.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(java.awt.event.ActionEvent evt) {
	        	
	        	txe.TXEAREA.setFont(new Font("Times New Roman",Font.BOLD,12));

	        	
	        	
	        }
	    });
		italics.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(java.awt.event.ActionEvent evt) {
	        
	        	txe.TXEAREA.setFont(new Font("Times New Roman",Font.ITALIC,12));

	        	
	        	
	        }
	    });
		boldI.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(java.awt.event.ActionEvent evt) {
	        	
	        	txe.TXEAREA.setFont(new Font("Times New Roman",Font.BOLD+Font.ITALIC,12));

	        	
	        	
	        }
	    });
		normal.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(java.awt.event.ActionEvent evt) {
	        	
	        	txe.TXEAREA.setFont(new Font("Times New Roman",Font.PLAIN,12));

	        	
	        	
	        }
	    });
	}
	

	private void addItem(JPanel panel1, JComponent c, int x, int y, int width,
			int height, int align) {
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = x;
	    gc.gridy = y;
		gc.gridheight = height;
		gc.gridwidth = width;
		gc.weightx = 100.0;
		gc.weighty = 100.0;
		gc.insets= new Insets(5, 5, 5, 5);
		gc.anchor = align;
		gc.fill = GridBagConstraints.NONE;
		panel1.add(c, gc);
	}
	
}

