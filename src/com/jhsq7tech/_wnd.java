package com.jhsq7tech;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class _wnd extends JFrame {
	
	Dimension _screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double _screenWidthOffSet = 0.6;
	double _screenHeightOffSet = 0.3;
	Dimension _wndSize = new Dimension((int)(_screenSize.getWidth() * _screenWidthOffSet) , (int)(_screenSize.getHeight() * _screenHeightOffSet) );
	
	GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	String[] fonts = ge.getAvailableFontFamilyNames();
	
	public _wnd(){
		
		initialize();
		
		
		
	}
	
	
	private void initialize(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setPreferredSize(_wndSize);
		
		JFileChooser cvsFileChooser = new JFileChooser();
		cvsFileChooser.setCurrentDirectory(new File(System.getProperty("user.home")) );
		cvsFileChooser.setFileFilter(new FileNameExtensionFilter("CSV File", "csv"));
		
		File cvsFile;
		String cvsFileName = "";
		int lines = 0;
		if (cvsFileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			
			ArrayList<String> lstValues = new ArrayList<String>();
			String[] lstColumns = {};
			String read;
			cvsFile = cvsFileChooser.getSelectedFile();
			
			
			try{
				BufferedReader _fsR = new BufferedReader(new FileReader(cvsFile));
				cvsFileName = cvsFile.getName();
				if( _fsR.ready() ){
					while (  (read = _fsR.readLine()) != null ){
						
						if(lines == 0){
							
							//read = read.substring(1,read.length() - 1);
							lstColumns = read.split(",");
						
						} else {
							
							lstValues.add(read);
							//if(lines > 25){break;}
							
						}
						//lstValues.add(scrub);
						
							
						
						lines++;
					}
				}
				_fsR.close();
			}catch(Exception e){ e.printStackTrace(); }
			
			JList importColumn = new JList(lstColumns);
			importColumn.setForeground(Color.red);
			importColumn.setSelectionBackground(Color.black);
			importColumn.setSelectionForeground(Color.yellow);
			importColumn.setBorder(new EmptyBorder(3,3,3,3));
			importColumn.setSelectedIndex(0);
			
			JList importLST = new JList(lstValues.toArray());
			importLST.setForeground(Color.red);
			importLST.setSelectionBackground(Color.black);
			importLST.setSelectionForeground(Color.yellow);
			importLST.setBorder(new EmptyBorder(3,3,3,3));
			importLST.setSelectedIndex(0);
			
			
			JPanel jp1 = new JPanel();
			jp1.setBackground(Color.white);
			//jp1.setLayout(new FlowLayout(FlowLayout.LEFT));
			jp1.add(importColumn);
			
			JScrollPane jScrollPane1 = new JScrollPane(jp1);
			jScrollPane1.setBackground(Color.white);
			
			JPanel jp2 = new JPanel();
			jp2.setBackground(Color.white);
			//jp2.setLayout(new FlowLayout(FlowLayout.LEFT));
			jp2.add(importLST);
			
			JScrollPane jScrollPane2 = new JScrollPane(jp2);
			jScrollPane1.setBackground(Color.white);
			
			
			
			
			
			JLabel label = new JLabel("Hello");
			label.setBorder(new EmptyBorder(10,10,10,10));
			
			getContentPane().add(label , BorderLayout.NORTH);
			
			getContentPane().add(jScrollPane1 , BorderLayout.WEST);
			getContentPane().add(jScrollPane2 , BorderLayout.EAST);
			
			
			JPanel jPanelSouth = new JPanel();
			jPanelSouth.setBorder(new EmptyBorder(5,5,5,5));
			jPanelSouth.setLayout(new BorderLayout());
			
			
			JLabel labelEAST = new JLabel(String.format("Total DataLines: %05d  ", lines));
			jPanelSouth.add(labelEAST , BorderLayout.EAST );
			JLabel labelWEST = new JLabel("WESTWESTWESTWESTWESTWESTWESTWESTWESTWESTWEST");
			jPanelSouth.add(labelWEST , BorderLayout.WEST );
			JLabel labelCENTER = new JLabel(cvsFileName);
			labelCENTER.setHorizontalAlignment(SwingConstants.CENTER);
			jPanelSouth.add(labelCENTER , BorderLayout.CENTER );
			
			getContentPane().add(jPanelSouth , BorderLayout.SOUTH);
			
			pack();
			setLocationRelativeTo(null);
			setVisible(true);
			jPanelSouth.setPreferredSize(
					new Dimension(
							getContentPane().getWidth() , jPanelSouth.getHeight())
			);
			
			jScrollPane1.setPreferredSize(
					new Dimension(
							(int)(jScrollPane1.getWidth()*1.1), 0)
			);
			jScrollPane2.setPreferredSize(
					new Dimension(
							(int)(getContentPane().getWidth()-(int)(jScrollPane1.getWidth() + 30)), 0)
			);
			
		} else { System.exit(0);}
		
	}
	
	public boolean isIllegalCharacter(char thisChar){
		
		if( thisChar > 30 && thisChar < 127 ){
			
			return false;
			
		} else {
			
			return true;
			
		}
		
	}
	private void initializeList(){
		
		getContentPane().setBackground(Color.white);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setPreferredSize(_wndSize);
		
		
		ArrayList<String> lstValues = new ArrayList<String>();
		
		lstValues.add("2021 importLST 02.01");
		lstValues.add("2021 importLST 02.02");
		lstValues.add("2021 importLST 02.03");
		lstValues.add("2021 importLST 02.04");
		lstValues.add("2021 importLST 02.05");
		lstValues.add("2021 importLST 02.06");
		lstValues.add("2021 importLST 02.07");
		lstValues.add("2021 importLST 02.01");
		lstValues.add("2021 importLST 02.02");
		
		_lst newListType = new _lst(fonts);
		
		ArrayList<String> lstValues2 = new ArrayList<String>();
		
		lstValues2.add("E2021.02.01");
		lstValues2.add("E2021.02.02");
		lstValues2.add("E2021.02.03");
		lstValues2.add("E2021.02.04");
		lstValues2.add("E2021.02.05");
		lstValues2.add("E2021.02.06");
		lstValues2.add("E2021.02.07");
		lstValues2.add("E2021.02.01");
		lstValues2.add("E2021.02.02");
		lstValues2.add("E2021.02.03");
		lstValues2.add("E2021.02.04");
		lstValues2.add("E2021.02.05");
		lstValues2.add("E2021.02.06");
		lstValues2.add("E2021.02.07");
		lstValues2.add("E2021.02.01");
		lstValues2.add("E2021.02.02");
		lstValues2.add("E2021.02.03");
		lstValues2.add("E2021.02.04");
		lstValues2.add("E2021.02.05");
		lstValues2.add("E2021.02.06");
		lstValues2.add("E2021.02.07");
		
		Color newBlueLabel = new Color(23,23,190);
		Color newBlackLabel = new Color(23,23,23);

		
		
		
		JList fontsLST = new JList(fonts);
		fontsLST.setSelectedIndex(0);
		
		fontsLST.setForeground(newBlackLabel);
		
		//JList importLST = new JList(lstValues.toArray());
		JList importLST = newListType.ListContent();
		importLST.setForeground(Color.red);
		importLST.setSelectionBackground(Color.black);
		importLST.setSelectionForeground(Color.yellow);
		importLST.setSelectedIndex(0);
		
		JList importLST2 = new JList(lstValues2.toArray());
		importLST2.setSelectedIndex(0);
		importLST2.setBorder(new EmptyBorder(3,3,3,3));
		importLST2.setForeground(newBlackLabel);
		
		JLabel jp1Label = new JLabel("Selection");
		jp1Label.setForeground(newBlueLabel);
		jp1Label.setBorder(new EmptyBorder(10,10,10,10));
		
		EmptyBorder emptyBorderX2 = new EmptyBorder(2,2,2,2);
		
		JPanel jp1 = new JPanel();
		jp1.setBackground(Color.white);
		jp1.setBorder(emptyBorderX2);
		jp1.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp1.add(fontsLST);
		JScrollPane jScrollPane1 = new JScrollPane(jp1);
		jScrollPane1.setBackground(Color.white);
		
		
		JPanel jp2 = new JPanel();
		jp2.setBackground(Color.white);
		jp2.setBorder(emptyBorderX2);
		jp2.setLayout(new BorderLayout());
		
		jp2.add(new JLabel("importLST Title") , BorderLayout.NORTH);
		
		jp2.add(importLST , BorderLayout.CENTER);
		JScrollPane jScrollPane2 = new JScrollPane(jp2);
		jScrollPane2.setBackground(Color.white);
		
		
		JPanel jp3 = new JPanel();
		jp3.setBackground(Color.white);
		jp3.setBorder(emptyBorderX2);
		jp3.setLayout(new BorderLayout());
		
		JLabel importListLabel = new JLabel("importListLabel");
		importListLabel.setForeground(newBlueLabel);
		importListLabel.setBorder(emptyBorderX2);
		
		jp3.add(importListLabel , BorderLayout.NORTH);
		jp3.add(importLST2 , BorderLayout.CENTER);
		JScrollPane jScrollPane3 = new JScrollPane(jp3);
		jScrollPane3.setBackground(Color.white);
		
		getContentPane().add(jp1Label, BorderLayout.NORTH);
		
		JPanel container = new JPanel();
		container.setBackground(Color.white);
		container.add(new JLabel("hello"));
		container.add(new JLabel("world"));
		
		getContentPane().add(jScrollPane2 , BorderLayout.CENTER);
		getContentPane().add(jScrollPane1 , BorderLayout.WEST);
		getContentPane().add(jScrollPane3 , BorderLayout.EAST);
		
		
		getContentPane().add(container , BorderLayout.SOUTH);
		
		
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		
		jScrollPane1.setPreferredSize(
				new Dimension(
						(int)(getContentPane().getWidth()*0.33), 0)
		);
		jScrollPane2.setPreferredSize(
				new Dimension(
						(int)(getContentPane().getWidth()*0.33), 0)
		);
		jScrollPane3.setPreferredSize(
				new Dimension(
						(int)(getContentPane().getWidth()*0.33), 0)
		);
		//jScrollPane2.setPreferredSize(new Dimension((int)(jScrollPane2.getWidth()+17),0));
		//jScrollPane3.setPreferredSize(new Dimension((int)(jScrollPane3.getWidth()+17),0));
		addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {
			
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
			
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
			
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
			
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
			
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
			
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
			
			}
		});
		
	}
	
	
	
	
	
}
