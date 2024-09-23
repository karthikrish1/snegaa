package tables;

import java.awt.Color;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableCellRenderer;

public class classrenderer extends JPanel implements TableCellRenderer {
Border selectedborder=null;
Border unselectedborder=null;
	boolean isbordered=true;
	
	public classrenderer(boolean isbordered) {
		// TODO Auto-generated constructor stub
		this.isbordered=isbordered;
		setOpaque(true);
		
	}
	@Override
	public Component getTableCellRendererComponent(JTable table, Object color, boolean isSelected, boolean hasFocus,
			int row, int column) {
		Color newcolor = (Color)color;
		setBackground(newcolor);
		if(isbordered)
		{
			if(isSelected)
			{
				if(selectedborder==null)
				{
					selectedborder=BorderFactory.createMatteBorder(2, 5, 2, 5, table.getSelectionBackground());
				}
				setBorder(selectedborder);
			}
			
			else
			{
				if(unselectedborder==null)
				{
					unselectedborder=BorderFactory.createMatteBorder(2, 5, 2, 5, table.getBackground());
				}
				setBorder(unselectedborder);
			}
		}
		setToolTipText("RGB VALUE"+ newcolor.getRed()+ ","+ newcolor.getGreen()+ ","+ newcolor.getBlue());
		return this;
	}

}
