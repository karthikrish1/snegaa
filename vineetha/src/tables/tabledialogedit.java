package tables;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class tabledialogedit extends JPanel  {
boolean debug=true;
	public tabledialogedit()
	{
		super(new GridLayout(1,0));
		JTable table= new JTable(new mytablemodel());
		table.setPreferredScrollableViewportSize(new Dimension(400,60));
		table.setFillsViewportHeight(true);
		
		JScrollPane js= new JScrollPane(table);
		table.setDefaultRenderer(Color.class, new classrenderer(true));
		table.setDefaultEditor(Color.class, new classeditor());
		add(js);
	}
	class mytablemodel extends AbstractTableModel
	{
		
		String colnames[]= {"firstname","desiredcolor","sports","number","veg"};
		
		Object[][]data= {
				{"dhivya", new Color(153,0,153),"cricket",new Integer(2),new Boolean(true)},
				{"vinitha", new Color(51,51,153),"tennis",new Integer(10),new Boolean(true)},
				{"alpha", new Color(51,102,51),"hockey",new Integer(5),new Boolean(false)},
				{"beta", Color.pink,"volleyball",new Integer(2),new Boolean(false)},
					{	"gamma", Color.red,"tabletennis",new Integer(4),new Boolean(true)},
				
		};
	

		@Override
		public int getRowCount() {
			return data.length;
		}

		@Override
		public int getColumnCount() {
			return colnames.length;
		}

		@Override
		public Object getValueAt(int row, int col) {
			return data[row][col];
		}
		
		public String getColumnName(int col)
		{
			return colnames[col];
		}
		
		public Class getColumnClass(int c)
		{
			return getValueAt(0,c).getClass();
		}
	
	
		public boolean isCellEditable(int row, int col)
		{
			if(col<1)
			{
				return false;
				
			}
			else
			{
				return true;
			}
		}
	
		
		public void setValueAt(Object value,int row, int col)
		{
			if(debug)
			{
				System.out.println("setting value at "+ row+ ","+ col+ "to" + value+ "(an instance of" +value.getClass()+")");
			}
			
			data[row][col]=value;
			fireTableCellUpdated(row,col);
			
			if(debug)
			{
				System.out.println("new value of data ");
				print();
			}
			
			
		}
		
		public void print()
		{
			int nrows=getRowCount();
			int ncol=getColumnCount();
			
			for(int i=0;i<nrows;i++)
			{
				System.out.println(" row "+ i+ ":" );
				for(int j=0;j<ncol;j++)
				{
					System.out.println(" "+ data[i][j]);
				}
				System.out.println();
			}
			System.out.println("-----------------------------");
			
		}
	
	}
	
	public static void main(String[] args) {
		
		JFrame j= new JFrame();
		j.add(new tabledialogedit());
		
		j.pack();
		j.setVisible(true);
	}
	
}
