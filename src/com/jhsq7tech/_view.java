package com.jhsq7tech;



import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;


public class _view extends JFrame {
	
	private boolean isDeBug = true;
	
	Dimension _screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	double _screenWidthOffSet = 0.4;
	
	double _screenHeightOffSet = 0.3;
	
	Dimension _wndSize = new Dimension(
			(int) (_screenSize.getWidth() * _screenWidthOffSet),
			(int) (_screenSize.getHeight() * _screenHeightOffSet)
	);
	
	File myData;
	
	_invoice myParent;
	
	String[] dataTableColumns;
	
	String[][] dataTableRows;
	
	ArrayList<String[]> dataTable = new ArrayList();
	
	String tmpRead = "";
	
	_a ascii;
	
	public _view(_invoice _parent, File f) {
		
		ascii = new _a();
		
		myData = f;
		
		myParent = _parent;
		
		ascii.setDelimiter(
				
				_parent.getCellDelimiter()
				
		);
		
		ascii.setEnclosure(
				
				_parent.getEnclosureDelimiter()
				
		);
		
		if (!myData.isFile() || !myData.exists()) {
			
			myParent._setSelectedFileLBL("File Not Found.");
			
			dispose();
			
		}
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setResizable(false);
		
		setPreferredSize(_wndSize);
		
		setLayout(new BorderLayout());
		
		addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {
			
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				
				myParent._setSelectedFileLBL("File Successfully Closed.");
				
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
				
				myParent._setSelectedFileLBL("File Successfully Closed.");
				
				dispose();
				
			}
		});
		
		initializeData();
		
		loadDocumentView();
		
		initializeWindow();
		
	}
	
	private void loadTableView() {
	
	
	}
	
	private void loadDocumentView() {
		
		JTable _dataTable = new JTable(dataTableRows, dataTableColumns);
		
		_dataTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		JScrollPane _dataScrollPane = new JScrollPane(_dataTable);
		
		add(_dataScrollPane, BorderLayout.CENTER);
		
	}
	
	String[] LineFeed = {};
	String[] CellFeed = {};
	String[] CellHeader = {};
	
	private void initializeData() {
		
		try (BufferedReader _fsR = new BufferedReader(new FileReader(myData))) {
			
			if (!_fsR.ready()) {
				
				myParent._setSelectedFileLBL("File Read Error!");
				
				dispose();
			}
			
			CellHeader = ascii.getLineFeed( _fsR.readLine() );
			
			
			for(int x = 0; x < CellHeader.length; x++){
				
				System.out.printf("[%s]\n", CellHeader[x]);
				
			}
			
			
			dataTableColumns = CellHeader;
			
			int colCount = dataTableColumns.length;
			
			int rowCount = 0;
			
			while ((tmpRead = _fsR.readLine()) != null) {
				
				LineFeed = ascii.getLineFeed(tmpRead);
				
				dataTable.add(LineFeed);
				
				rowCount++;
			
			}
			
			_fsR.close();
			
			if( 0 == rowCount ){
				
				dataTableRows = new String[ 1 ][ colCount ];
				
			}else{
				
				dataTableRows = new String[ rowCount ][ colCount ];
				
				
				//for( int ROW = 0; ROW < rowCount; ROW++){ dataTableRows[ ROW ] = dataTable.get( ROW ); }
				
				
				
				
				
			}
			
			
			
			tmpRead = "";
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			myParent._setSelectedFileLBL("File Reading Error!");
			
			dispose();
			
		}
		
		//System.out.print("\n");
		//System.out.printf("%s" , Arrays.toString(LineFeed) );
		//System.out.print("\n");
		//System.out.printf("wCol: %04d" , ascii.ColumnCount);
		//System.out.print("\n");
		//System.out.printf("nCol: %04d" , ascii.ColumnNULL);
		//System.out.print("\n");
		//System.out.printf("pCol: %04d" , LineFeed.length);
		//System.out.print("\n");
		
		
	}
	
	private void initializeWindow() {
		
		setTitle("Rows: " + dataTable.size());
		
		pack();
		
		setLocationRelativeTo(myParent);
		
		setVisible(true);
		
	}
	
	
	class _a extends _ascii {
		
	
		
	}
	
	
}
