
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
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
import java.awt.Image;
import java.awt.Robot;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import javax.imageio.ImageIO;

import say.swing.JFontChooser;



@SuppressWarnings("unused")
public class TXE1 extends JFrame {
  
	
	
	
    private static final long serialVersionUID = 1L;

    public JTextArea TXEAREA = new JTextArea();
	
    private JFileChooser dialog = new JFileChooser(System.getProperty("home.dir"));

    private String currentFile = "Untitled Document-Txe 1.6.5 Closed Beta";

    private boolean changed = false;
    
    public String changeLog = ("TXE 1.6.5 change log 1. New color buttons in the easy access bar  2.New about option 3.Colors are added  4.Menu Seperators are added  5.The scroll bars  auto hide  6. Added the Settings Tab 7. Minor bug fixes ");
    public String DefualtText = ("Welcome To TXE. The  new innovative Text Editor. Type what ever you want. Updates coming soon! \r\n\r\n*Note* this is Alpha Version 1.6.5\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nCredits: Eric Zhu of Great Ark Studios and Turk4n of CodeCall.net Icons from http://www.visualpharm.com/");
    public String currentText = TXEAREA.getText();
    
    
	public TXE1() {
		
	TXEAREA.setText(DefualtText);
    	this.setSize(1000,1000);
    	this.setLocation(420, 250);
    	TXEAREA.setFont(new Font("Times New Roman",Font.PLAIN,12));
    	
        JScrollPane scroll = new JScrollPane(TXEAREA,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        this.add(scroll,BorderLayout.CENTER);
        JMenuItem About = new JMenuItem("About");
        JMenu format = new JMenu("Format");
        JMenu TXESettings = new JMenu("Tools");
        JMenuItem settingsFrame = new JMenuItem("Settings");
        JMenuItem addwebsite = new JMenuItem("Add Website Signature");
        JMenuItem addname = new JMenuItem("Add Name Signature");
        JMenuItem addcompany = new JMenuItem("Add Company Name");
        JMenuItem bold = new JMenuItem("Bold Document");
        JMenuItem italics = new JMenuItem("Italicize Document");
        JMenuItem plain = new JMenuItem("Normal Style");
        JMenuItem bI = new JMenuItem("Bold and Italicize Document");
        JMenuItem Fr = new JMenuItem("Font");
        JMenuItem bL = new JMenuItem("Blue");
        JMenuItem rD = new JMenuItem("Red");
        JMenuItem gR = new JMenuItem("Green");
        JMenuItem bLa = new JMenuItem("Normal");
        JMenuItem rsA = new JMenuItem("Text Align Right");
        JMenuItem lsA = new JMenuItem("Text Align Left");
        JMenuItem csA = new JMenuItem("Text Align Center");
        JMenuItem cL = new JMenuItem("Change Log");
        JMenuItem caL = new JMenuItem("Calculator");
        JMenuItem enc = new JMenuItem("Encryption");
         enc.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		Encrypt enC = new Encrypt();
                        enC.setVisible(true);
        	}
        });
        lsA.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		TXEAREA.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        	}
        });
        rsA.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
                TXEAREA.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);  

        	}
        });
        settingsFrame.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		Settings txesettings = new Settings();
        		txesettings.setVisible(true);
        	}
        });
        addwebsite.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		Settings settingsWeb = new Settings();
        		
        		TXEAREA.setText(currentText+settingsWeb.webText1);
        	}
        });
        addname.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		Settings settingsWeb = new Settings();
        	;
        		TXEAREA.setText(currentText+settingsWeb.nameText);
        	}
        });
        addwebsite.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		Settings settingsWeb = new Settings();
        		
        		TXEAREA.setText(currentText+settingsWeb.companyText1);
        	}
        });
        cL.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		{
        			TXEAREA.setText(changeLog);
            	}
        	}
        	
        });
        //add stuff to format
        format.add(plain); format.add(bold);format.add(italics);format.add(bI);format.addSeparator();format.add(Fr);format.addSeparator();format.add(bLa);format.add(rD);format.add(gR);format.add(bL);format.addSeparator();format.add(rsA);format.add(lsA);
        
        italics.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		{
        			TXEAREA.setFont(new Font("Times New Roman",Font.ITALIC,12));
            	}
        	}
        	
        });
        plain.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		{
        			TXEAREA.setFont(new Font("Times New Roman",Font.PLAIN,12));
            	}
        	}
        	
        });
        bold.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		{
        			TXEAREA.setFont(new Font("Times New Roman",Font.BOLD,12));
            	}
        	}
        	
        });
        bI.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		{
        			TXEAREA.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC,12));
            	}
        	}
        	
        });
        Fr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	JFontChooser fontChooser = new JFontChooser();
            
            	   int result = fontChooser.showDialog(TXEAREA);
            	   if (result == JFontChooser.OK_OPTION)
            	   {
            	   	Font font = fontChooser.getSelectedFont(); 
            	   	TXEAREA.setFont(font);
            	   	System.out.println("Selected Font : " + font); 
            	   }
            	 
            }	   
        });
        gR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	TXEAREA.setForeground( Color.green);
            	
            }
        });
        bL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	TXEAREA.setForeground( Color.blue);
            	
            }
        });
        rD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	TXEAREA.setForeground( Color.red);
            	
            }
        });
        bLa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	TXEAREA.setForeground( Color.black);
            	
            }
        });
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	About about= new About();
            	about.setVisible(true);
            			
            	
            }
        });
        caL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	Calculator calculator = new Calculator();
            	calculator.setVisible(true);
            	
            }
        });
        
        

        JMenu ScrollSettings = new JMenu("Settings");
        JMenuItem vsbA = new JMenuItem("Vertical Scroll Bar Always");
        JMenuItem hsbA = new JMenuItem("Horizontal Scroll Bar Always");
        JMenuItem vhsbA= new JMenuItem("Vertical And Horizontal Scroll Bar Always");
        vsbA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	 JScrollPane scrollv = new JScrollPane(TXEAREA,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            	
            }
        });
        vsbA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	 JScrollPane scrollh = new JScrollPane(TXEAREA,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            	
            }
        });
        vhsbA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	 JScrollPane scrollvh = new JScrollPane(TXEAREA,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            	
            }
        });
        ScrollSettings.add(vsbA);ScrollSettings.add(hsbA);ScrollSettings.add(vhsbA);
        JMenuBar JMB = new JMenuBar();

        setJMenuBar(JMB);
        // make the file and edit
        JMenu file = new JMenu("File");
        
        JMenu edit = new JMenu("Edit");
     
        
        //add menus 
        JMB.add(file); JMB.add(edit); JMB.add(format);JMB.add(TXESettings);
        
       //file menu items
        file.add(About); file.add(cL);file.add(New); file.add(Open); file.add(Save);file.add(SaveAs); file.add(Quit);
        //settings menu items
        TXESettings.add(settingsFrame);TXESettings.add(addwebsite);TXESettings.add(addname);TXESettings.add(addcompany);TXESettings.addSeparator(); TXESettings.add(caL);TXESettings.add(enc);
        
        
        
        
        
        
        
        

        for(int i=0; i<4; i++)

                file.getItem(i).setIcon(null);

        

        edit.add(Cut);edit.add(Copy);edit.add(Paste);
        
        
        edit.getItem(0).setText("Cut		");

        edit.getItem(1).setText("Copy			");

        edit.getItem(2).setText("Paste			");
        
        JToolBar TXEBAR = new JToolBar();
        
        add(TXEBAR,BorderLayout.SOUTH);

        TXEBAR.add(New);TXEBAR.add(Open);TXEBAR.add(Save);

        TXEBAR.addSeparator();
        
       
        

        JButton cut = TXEBAR.add(Cut), cop = TXEBAR.add(Copy), pas = TXEBAR.add(Paste);
       

        
        
        
        cut.setText("Cut"); cut.setIcon(new ImageIcon(getClass().getResource("images/cut.gif")));

        cop.setText("Copy"); cop.setIcon(new ImageIcon(getClass().getResource("images/copy.gif")));

        pas.setText("Paste"); pas.setIcon(new ImageIcon(getClass().getResource("images/paste.gif")));

        TXEBAR.addSeparator();
        TXEBAR.add(Normal);
        TXEBAR.add(Bold);
        TXEBAR.add(Italics);
        TXEBAR.add(BI);
        TXEBAR.addSeparator();
        TXEBAR.add(bLaB);
        TXEBAR.add(rDb);
        TXEBAR.add(gRb);
        TXEBAR.add(bLb);
       
        Save.setEnabled(false);

        SaveAs.setEnabled(false);

        

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.pack();

        TXEAREA.addKeyListener(k1);

        setTitle(currentFile);

        setVisible(true);

}

    private KeyListener k1 = new KeyAdapter() {

        public void keyPressed(KeyEvent e) {

                changed = true;
                
                Save.setEnabled(true);

                SaveAs.setEnabled(true);
        }

};
Action gRb = new AbstractAction("Green", new ImageIcon(getClass().getResource("images/green.gif"))){
	
	
	 
 	/**
 * 
 */
private static final long serialVersionUID = 1L;

	public void actionPerformed(ActionEvent e) {
 		{
 			TXEAREA.setForeground( Color.green);
     	}
 	}
 	
 };
Action bLaB = new AbstractAction("Normal", new ImageIcon(getClass().getResource("images/black.gif"))){
	
	
	 
 	/**
 * 
 */
private static final long serialVersionUID = 1L;

@Override
	public void actionPerformed(ActionEvent e) {
 		{
 			TXEAREA.setForeground( Color.black);
     	}
 	}
 	
 };
Action rDb = new AbstractAction("Red", new ImageIcon(getClass().getResource("images/red.gif"))){
	
	
	 
 	/**
 * 
 */
private static final long serialVersionUID = 1L;

	public void actionPerformed(ActionEvent e) {
 		{
 			TXEAREA.setForeground( Color.red);
     	}
 	}
 	
 };
 Action bLb = new AbstractAction("Red", new ImageIcon(getClass().getResource("images/blue.gif"))){
		
		
	 
	 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent e) {
	 		{
	 			TXEAREA.setForeground( Color.blue);
	     	}
	 	}
	 	
	 };

Action BI = new AbstractAction("Bold and Italics", new ImageIcon(getClass().getResource("images/Bold and Italic.gif"))){
	
	
	 
     	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent e) {
     		{
     			TXEAREA.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC , 12));
         	}
     	}
     	
     };

Action Normal = new AbstractAction("Normal", new ImageIcon(getClass().getResource("images/normal.gif"))){
	
	
	 
     	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent e) {
     		{
     			TXEAREA.setFont(new Font("Times New Roman", Font.PLAIN, 12));
         	}
     	}
     	
     };

Action Bold = new AbstractAction("Bold", new ImageIcon(getClass().getResource("images/Bold.gif"))){
	
	
	 
     	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent e) {
     		{
     			TXEAREA.setFont(new Font("Times New Roman", Font.BOLD, 12));
         	}
     	}
     	
     };
     

Action Italics = new AbstractAction("Italics", new ImageIcon(getClass().getResource("images/Italic.gif"))){
	
	
	 
     	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent e) {
     		{
     			TXEAREA.setFont(new Font("Times New Roman", Font.ITALIC, 12));
         	}
     	}
     	
     };



Action Open = new AbstractAction("Open", new ImageIcon(getClass().getResource("images/open.gif"))) {


	
   private static final long serialVersionUID = 1L;
   
   @Override
	public void actionPerformed(ActionEvent e) {
			
            saveOld();
            
            if(dialog.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {

                    readInFile(dialog.getSelectedFile().getAbsolutePath());
                   
                    
            }

            SaveAs.setEnabled(true);

    }


};
Action New = new AbstractAction("New", new ImageIcon(getClass().getResource("images/new.gif"))) {

 
	private static final long serialVersionUID = 1L;

	public void actionPerformed(ActionEvent e) {

            saveOld();

            TXEAREA.setText("Type here...");

            currentFile = "Untitled Document-Txe 1.6.5 Closed Beta";

            setTitle(currentFile);

            changed = false;

            Save.setEnabled(false);

            SaveAs.setEnabled(false);
            
    }

};


Action Save = new AbstractAction("Save", new ImageIcon(getClass().getResource("images/save.gif"))) {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void actionPerformed(ActionEvent e) {

            if(!currentFile.equals("Untitled.txt"))

                    saveFile(currentFile);

            else

                    saveFileAs();

    }

};

Action SaveAs = new AbstractAction("Save as") {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void actionPerformed(ActionEvent e) {

            saveFileAs();

    }

};

Action Quit = new AbstractAction("Quit") {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void actionPerformed(ActionEvent e) {

            saveOld();

            System.exit(0);

    }

};

ActionMap m = TXEAREA.getActionMap();

Action Cut = m.get(DefaultEditorKit.cutAction);

Action Copy = m.get(DefaultEditorKit.copyAction);

Action Paste = m.get(DefaultEditorKit.pasteAction);


private void saveOld() {

    if(changed) {

            if(JOptionPane.showConfirmDialog(this, "Would you like to save "+ currentFile +" ?","Save",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION)

                    saveFile(currentFile);

    }

}


private void readInFile(String fileName) {

    try {

            FileReader fr = new FileReader(fileName);

            TXEAREA.read(fr,null);

            fr.close();

            currentFile = fileName;

            setTitle(currentFile);

            changed = false;
            
    }

    catch(IOException e) {

            Toolkit.getDefaultToolkit().beep();

            JOptionPane.showMessageDialog(this,"TXE can not find the file: "+fileName);

    }

}


private void saveFile(String fileName) {

    try {

            FileWriter fw = new FileWriter(fileName);

            TXEAREA.write(fw);

            fw.close();

            currentFile = fileName;

            setTitle(currentFile);

            changed = false;

            Save.setEnabled(false);

    }

    catch(IOException e) {

    }

}

private void saveFileAs() {

    if(dialog.showSaveDialog(null)==JFileChooser.APPROVE_OPTION)

            saveFile(dialog.getSelectedFile().getAbsolutePath());

}




public  static void main(String[] arg) {
        TXE1 txE1 = new TXE1();

}

}




