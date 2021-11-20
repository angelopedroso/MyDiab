/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author angel
 */
public class ResultModel extends AbstractTableModel{
    private LinkedList<Glucose> listGluc = new LinkedList<>();
    private String[] columns = {"Date","Breakfast","Lunch","1st Snack", "2nd Snack", "Dinner", "Midnight"};

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    @Override
    public int getRowCount() {
        return listGluc.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int line, int column) {
        switch(column){
            case 0:
                return listGluc.get(line).getBreakfast();
            
            case 1:
                return listGluc.get(line).getLunch();
                
            case 2:
                return listGluc.get(line).getSnack1();
                
            case 3:
                return listGluc.get(line).getSnack2(); 
                
            case 4:
                return listGluc.get(line).getDinner();   
                
            case 5:
                return listGluc.get(line).getMidnight();                
        }
        
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int line, int column) {
        switch(column){
            case 0:
                listGluc.get(line).setBreakfast(Integer.parseInt((String) aValue));
                break;
                
            case 1:
                listGluc.get(line).setLunch(Integer.parseInt((String) aValue));
                break;
                
            case 2:
                listGluc.get(line).setSnack1(Integer.parseInt((String) aValue));
                break;
                
            case 3:
                listGluc.get(line).setSnack2(Integer.parseInt((String) aValue)); 
                break;
                
            case 4:
                listGluc.get(line).setDinner(Integer.parseInt((String) aValue));   
                break;
                
            case 5:
                listGluc.get(line).setMidnight(Integer.parseInt((String) aValue));              
                break;
        }    
        
        this.fireTableRowsUpdated(line, line);
    }
    
    public void addRow(Glucose g){
        this.listGluc.add(g);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int line){
        this.listGluc.remove(line);
        this.fireTableRowsDeleted(line, line);
    } 
}
