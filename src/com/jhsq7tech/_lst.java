package com.jhsq7tech;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.ArrayList;

public class _lst {
	JList jList;
	
	public _lst(){
		
		
		ArrayList<String> lstSample
				= new ArrayList<String>();
		
		lstSample.add("Sample Values 02.01");
		lstSample.add("Sample Values 02.02");
		lstSample.add("Sample Values 02.03");
		lstSample.add("Sample Values 02.04");
		lstSample.add("Sample Values 02.05");
		lstSample.add("Sample Values 02.06");
		lstSample.add("Sample Values 02.07");
		
		jList = new JList(lstSample.toArray());
		
		initialize();
		
	}
	
	
	public _lst(ArrayList content){
		
		jList = new JList(content.toArray());
		
		initialize();
		
	}
	
	public _lst(String[] content){
		
		jList = new JList(content);
		
		initialize();
		
	}
	
	private void initialize(){
		
		jList.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				if(!e.getValueIsAdjusting()){
					System.out.printf("%d\n" , jList.getSelectedIndex());
				}
				
			
			}
		});
		
	}
	
	public JList ListContent(){
		
		return jList;
		
	}
	
	public void SetListContent(ArrayList content){
		
		jList = new JList(content.toArray());
		
		initialize();
		
	}
	
	public void SetListContent(String[] content){
		
		jList = new JList(content);
		
		initialize();
		
	}
	
	
	
	
	public void setForeGround(Color color){ jList.setForeground(color); }
	public void setBackGround(Color color){ jList.setBackground(color); }
	public void setSelectForeGround(Color color){ jList.setSelectionForeground(color); }
	public void setSelectBackGround(Color color){ jList.setSelectionBackground(color); }
	
	public int getSelectedIndex(){ return jList.getSelectedIndex(); }
	public void setSelectedIndex(int IDX){ jList.setSelectedIndex(IDX); }
	
	
}
