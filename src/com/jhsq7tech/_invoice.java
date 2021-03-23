package com.jhsq7tech;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class _invoice extends JFrame {
	
	private final String pdfFolder = System.getProperty("user.dir") + "/_pdf";
	private final String importFolder = System.getProperty("user.dir") + "/_import";
	private final String dataFolder = System.getProperty("user.dir") + "/_data";
	_invoice _ME = this;
	_view View;
	File _fs;
	Dimension _screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double _screenWidthOffSet = 0.1;
	double _screenHeightOffSet = 0.1;
	Dimension _wndSize = new Dimension((int) (_screenSize.getWidth() * _screenWidthOffSet), (int) (_screenSize.getHeight() * _screenHeightOffSet));
	
	
	GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	String[] fonts = ge.getAvailableFontFamilyNames();
	
	File cvsSelectedFile;
	JFileChooser cvsFileChooser = new JFileChooser();
	JButton csvSelectFile = new JButton("Select file to view.");
	JPanel csvSelectPanel = new JPanel();
	JLabel csvSelectedFileLBL = new JLabel("No File Selected");
	
	char CellDelimiter = 44;
	char EnclosureDelimiter = 34;
	
	
	public _invoice() {
		
		
		this.initialize();
		
		pack();
		
		setLocationRelativeTo(null);
		
		setVisible(true);
		csvSelectedFileLBL.setPreferredSize(new Dimension(220, csvSelectedFileLBL.getHeight()));
		
	}
	
	private void initialize() {
		
		cvsFileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		cvsFileChooser.setFileFilter(new FileNameExtensionFilter("CSV File", "csv"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setPreferredSize(_wndSize);
		setLayout(new BorderLayout());
		
		
		csvSelectPanel.add(csvSelectFile, FlowLayout.LEFT);
		
		csvSelectPanel.add(csvSelectedFileLBL, FlowLayout.CENTER);
		getContentPane().add(csvSelectPanel, BorderLayout.NORTH);
		
		csvSelectFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (cvsFileChooser.showOpenDialog(_ME) == JFileChooser.APPROVE_OPTION) {
					
					cvsSelectedFile = cvsFileChooser.getSelectedFile();
					csvSelectedFileLBL.setText("File: " + cvsSelectedFile.getName());
					View = new _view(_ME, cvsSelectedFile);
					
					
				} else {
					
					cvsSelectedFile = null;
					csvSelectedFileLBL.setText("No File Selected");
					
				}
			}
		});
		
		
	}
	
	
	public void _setSelectedFileLBL(String _value) {
		
		csvSelectedFileLBL.setText(_value);
		
	}
	
	
	public char getCellDelimiter() {
		
		return this.CellDelimiter;
		
	}
	
	public void setCellDelimiter(char _value) {
		
		this.CellDelimiter = _value;
		
	}
	
	public char getEnclosureDelimiter() {
		
		return this.EnclosureDelimiter;
		
	}
	
	public void setEnclosureDelimiter(char _value) {
		
		this.EnclosureDelimiter = _value;
		
	}
	
	
}
