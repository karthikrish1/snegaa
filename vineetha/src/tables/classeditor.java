package tables;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class classeditor extends AbstractCellEditor implements TableCellEditor,ActionListener {
	 JColorChooser jc;
	 Color currentcolor;
	 JDialog dialog;
	JButton btn;
	public classeditor()
	{
		 btn= new JButton();
		 btn.setActionCommand("edit");
		 btn.addActionListener(this);
		 btn.setBorderPainted(false);
		 
		 jc= new JColorChooser();
		 dialog=JColorChooser.createDialog(btn, "pick a clr", true, jc, this, null);
	}
	@Override
	public Object getCellEditorValue() {
		return currentcolor;
	}

	@Override// edit from table
	public void actionPerformed(ActionEvent e) {
		if("edit".equals(e.getActionCommand()))
		{
			btn.setBackground(currentcolor);
			jc.setColor(currentcolor);
			dialog.setVisible(true);
			fireEditingStopped();
			
		}
		else
		{//ok from dialog
			currentcolor=jc.getColor();
		}
		
	}

	@Override
	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		// TODO Auto-generated method stub
		currentcolor=(Color)value;
		return btn;
	}

}
