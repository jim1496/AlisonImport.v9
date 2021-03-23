package com.jhsq7tech;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class _file extends JFrame {
	
	File _f;
	
	private final String pdfFolder = System.getProperty("user.dir") + "/_pdf";
	private final String importFolder = System.getProperty("user.dir") + "/_import";
	private final String dataFolder = System.getProperty("user.dir") + "/_data";
	
	Dimension _screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double _screenWidthOffSet = 0.8;
	double _screenHeightOffSet = 0.8;
	Dimension _wndSize = new Dimension((int)(_screenSize.getWidth() * _screenWidthOffSet) , (int)(_screenSize.getHeight() * _screenHeightOffSet) );
	
	
	GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	String[] fonts = ge.getAvailableFontFamilyNames();
	
	File cvsFile;
	JFileChooser cvsFileChooser = new JFileChooser();
	
	JList cellHeaderList;
	JPanel cellHeaderPanel;
	JScrollPane cellHeaderScrollPane;
	String[] cellHeader;
	
	JList cellDataList;
	JPanel cellDataPanel;
	JScrollPane cellDataScrollPane;
	String[] cellData;
	
	ArrayList<JList> cellDataTable;
	JButton csvSelect;
	_file me = this;
	
	JPanel csvSelectPanel;
	
	
	
	public _file(){
		
		
		try{
			
			_f = new File(pdfFolder);
			
			_f.mkdir();
			
			_f = new File(importFolder);
			
			_f.mkdir();
			
			_f = new File(dataFolder);
			
			_f.mkdir();
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		cvsFileChooser.setCurrentDirectory(new File(System.getProperty("user.home")) );
		
		cvsFileChooser.setFileFilter(new FileNameExtensionFilter("CSV File", "csv"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setResizable(false);
		
		setPreferredSize(_wndSize);
		
		setLayout(new BorderLayout());
		
		//getContentPane().setLayout(new BorderLayout());
		csvSelect = new JButton("Select file to view.");
		csvSelect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//remove(csvSelectPanel);
				
				
				//cellDataPanel.remove(cellDataList);
				//cellDataScrollPane.remove(cellDataPanel);
				//remove(cellDataScrollPane);
				//cellDataScrollPane.setPreferredSize(new Dimension(0,0));
				//cellDataScrollPane.revalidate();
				//cellDataScrollPane.repaint();
				
				
				//cellHeaderPanel.remove(cellHeaderList);
				//cellHeaderScrollPane.remove(cellHeaderPanel);
				//remove(cellHeaderScrollPane);
				//cellHeaderScrollPane.setPreferredSize(new Dimension(0,0));
				
				
				//cellHeaderScrollPane.revalidate();
				//cellHeaderScrollPane.repaint();
				//setVisible(false);
				
				//setPreferredSize(_wndSize);
				
				//revalidate();
				//pack();
				
				//repaint();
				dispose();
				
				_file f = new _file();
				
				//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//setResizable(false);
				
				//setPreferredSize(_wndSize);
				
				//if (cvsFileChooser.showOpenDialog(me) == JFileChooser.APPROVE_OPTION) {
					
					//cvsFile = cvsFileChooser.getSelectedFile();
					
					//cellHeader = getHeaderCells( cvsFile , "," , "\"");
					
					//cellData = getDataLines( cvsFile , "," , "\"" , true);
					
				//}
				
				//initialize();
			}
		});
		
		if (cvsFileChooser.showOpenDialog(me) == JFileChooser.APPROVE_OPTION) {
			
			cvsFile = cvsFileChooser.getSelectedFile();
			
			cellHeader = getHeaderCells( cvsFile , "," , "\"");
			
			cellData = getDataLines( cvsFile , "," , "\"" , true);
			
		}
		csvSelectPanel = new JPanel();
		
		csvSelectPanel.add(csvSelect);
		
		getContentPane().add(csvSelectPanel , BorderLayout.NORTH);
		
		initialize();
		
	}
	
	
	private void initialize(){
		
		
		
		
		JList cellHeaderList = new JList(cellHeader);
		
		cellHeaderList.setForeground(Color.black);
		
		cellHeaderList.setSelectionBackground(Color.lightGray);
		
		cellHeaderList.setSelectionForeground(Color.white);
		
		cellHeaderList.setBorder(new EmptyBorder(3,3,3,3));
		
		cellHeaderList.setSelectedIndex(0);
		
		JPanel cellHeaderPanel = new JPanel();
		
		cellHeaderPanel.setBackground(Color.white);
		
		cellHeaderPanel.setLayout(new BorderLayout());
		
		cellHeaderPanel.add(cellHeaderList);
		
		cellHeaderScrollPane = new JScrollPane(cellHeaderPanel);
		
		cellHeaderScrollPane.setBackground(Color.white);
		
		getContentPane().add(cellHeaderScrollPane , BorderLayout.WEST);
		
		//cellHeaderScrollPane.revalidate();
		//cellHeaderScrollPane.repaint();
		
		
		JList cellDataList = new JList(cellData);
		
		cellDataList.setForeground(Color.black);
		
		cellDataList.setSelectionBackground(Color.lightGray);
		
		cellDataList.setSelectionForeground(Color.white);
		
		cellDataList.setBorder(new EmptyBorder(3,3,3,3));
		
		cellDataList.setSelectedIndex(0);
		
		JPanel cellDataPanel = new JPanel();
		
		cellDataPanel.setBackground(Color.white);
		
		cellDataPanel.setLayout(new BorderLayout());
		
		cellDataPanel.add(cellDataList);
		
		cellDataScrollPane = new JScrollPane(cellDataPanel);
		
		cellDataScrollPane.setBackground(Color.white);
		
		getContentPane().add(cellDataScrollPane , BorderLayout.EAST);
		
		//cellDataScrollPane.revalidate();
		//cellDataScrollPane.repaint();
		revalidate();
		pack();
		
		setLocationRelativeTo(null);
		
		setVisible(true);
		

		
		
		cellHeaderScrollPane.setPreferredSize(
				new Dimension(
						(int)(cellHeaderScrollPane.getWidth()*1.2), 0)
		);
		cellDataScrollPane.setPreferredSize(
				new Dimension(
						(int)(getContentPane().getWidth()-(int)(cellHeaderScrollPane.getWidth()*1.3)), 0)
		);
		
		repaint();
		System.out.printf("cellDataTable: %05d \n" , cellDataTable.size());
		
	}
	
	private void setHeaderScrollPane(){
		
		if (cvsFileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			
			cvsFile = cvsFileChooser.getSelectedFile();
			
			cellHeader = getHeaderCells( cvsFile , "," , "\"");
			
			cellData = getDataLines( cvsFile , "," , "\"" , true);
			
		}
		
	}
	
	
	
	private String[] getHeaderCells(File _fs , String CellDelimiter , String EnclosureDelimiter){
		
		String[] aryColumns = {};
		
		String rdLn;
		
		try{
			
			BufferedReader _fsR = new BufferedReader(new FileReader(_fs));
			
			if( _fsR.ready() && (  (rdLn = _fsR.readLine() ) != null ) ){
				
				aryColumns = rdLn.split( CellDelimiter );
				
			}
			
			_fsR.close();
			
		} catch(Exception e){
			
			e.printStackTrace();
		
		}
		
		return aryColumns;
		
	}
	
	
	
	
	
	
	
	
	private String[] getDataLines(File _fs , String CellDelimiter , String EnclosureDelimiter , boolean hasHeaderCells){
		
		String[] aryDataLines = {};
		
		cellDataTable = new ArrayList<>();
		
		ArrayList<String> dL = new ArrayList<>();
		
		String rdLn;
		
		int currentLine = 0;
		
		try{
			
			BufferedReader _fsR = new BufferedReader(new FileReader(_fs));
			
			if( _fsR.ready() ){
				
				while(  (rdLn = _fsR.readLine() ) != null ){
					
					if( currentLine == 0 && hasHeaderCells ){
						/* < skip > */
					}else{
						
						dL.add(rdLn);
						
						cellDataTable.add(
								
								new JList(
										
										rdLn.split(CellDelimiter)
										
								)
								
						);
						
					}
					
					currentLine++;
				}
				
			}
			aryDataLines = dL.toArray(new String[0]);
			_fsR.close();
			
		} catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		
		
		return aryDataLines;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private void wrFile(String wrLine){
	
	}
	private void wrFile(String[] wrLines){
	
	}
	private void wrFile(char wrChar){
	
	}
	private void wrFile(char[] wrChars){
	
	}
	
	private char[] rdFileChars(){
		
		char[] rdChars = {};
		
		
		
		return rdChars;
	}
	private void wrFile(byte wrByte){
	
	}
	
	private void wrFile(byte[] wrBytes){
	
	}
	private byte[] rdFileBytes(){
		
		byte[] rdBytes = {};
		
		
		
		return rdBytes;
	}
	
	
}
