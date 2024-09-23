package min5;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.KeyStroke;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkEvent.EventType;
import javax.swing.event.HyperlinkListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.Document;

public class textbatchprinting implements HyperlinkListener,ListSelectionListener{
static class PageItem extends JEditorPane{
		String title;
	    public String toString()
		{
			if(title==null)
			{
				String s=(String)getDocument().getProperty(Document.TitleProperty);
				title=(s==null ? getPage().toString(): s);
			}
			return title;
		}
		
	}
	static String defaultPage="index.html";
	static String defaultMessage="select : Alt-A Print: Alt-P Quit: Alt-Q";
	PrintService printService=PrintServiceLookup.lookupDefaultPrintService();
	PageItem pageItem;
	URL homePage;
	Map<URL,PageItem>pageCache= new HashMap<URL,PageItem>();
	JList selectedPages;
	JLabel messageArea;
	
	//printing
	
public void printSelectedPages()
	{
        DefaultListModel pages=(DefaultListModel)selectedPages.getModel();
		int n=pages.getSize();
		if(n<1)
		{
		messageArea.setText("no page selected");
		return;
		}
		if(printService==null)
		{
			messageArea.setText("no print service");
			return;
		}
		//iterating through the pages
		for(int i=0;i<n;i++)
		{
		PageItem item = (PageItem)pages.getElementAt(i);
		Runnable printTask = new Runnable()
		{
            @Override
			public void run() {
				try {
					item.print(null, null,false,printService,null,false);
				} catch (PrinterException e) {
					JOptionPane.showMessageDialog(null, "Error printing"+ 
				          item.getPage()+"\n"+e,"Print error",JOptionPane.WARNING_MESSAGE);
				}
				
			}};
			new Thread(printTask).start();//start the printing process
		}
		
		pages.removeAllElements();
		messageArea.setText(n+(n>1 ? "pages": "page")+ "printed");
		
	}
	
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		if(!e.getValueIsAdjusting())
		{
			int index=((JList)e.getSource()).getSelectedIndex();
			if(index>=0)
			{
				PageItem item = (PageItem)selectedPages.getModel().getElementAt(index);
				URL page = item.getPage();
				if(!page.equals(pageItem.getPage()))
				{
					setPage(page);
				}
			}
		}
		
	}

	@Override
	public void hyperlinkUpdate(HyperlinkEvent e) {
		URL url=e.getURL();
		EventType type = e.getEventType();
		
		if(type==EventType.ENTERED)
		{
			messageArea.setText("Go to"+ url );
		}
		
		else if(type==EventType.EXITED)
		{
			messageArea.setText(defaultMessage );
		}
		else if(type==EventType.ACTIVATED)
		{
			setPage(url);
			messageArea.setText(defaultMessage );
			
		}
		
	}
	
	
	public void setPage(URL url)
	{
		PageItem item=pageCache.get(url);
		if(item==null)
		{
			item=createPageItem(url);
			pageCache.put(url, item);
			
		}
		
		if(pageItem!=null)
		{
			Container p = pageItem.getParent();
			if(p!=null)
			{
				p.remove(pageItem);
				p.add(item);
			}
			
			
		}
		pageItem=item;
		updateSelectedPages();
	}
	
	// syn the selection in the print list with current page 
	//currnt page is not in the print list , clear all the
	public void updateSelectedPages()
	{
		ListModel pages = selectedPages.getModel();
		int n=pages.getSize();
		if(n>0)
		{
			URL page=pageItem.getPage();//current one 
			int index=selectedPages.getSelectedIndex();
			if(index>=0)
			{
				PageItem selected = (PageItem)pages.getElementAt(index);// colecting page from the selection list 
				// selected vs page
				if(page.equals(selected.getPage()))
				{
					// current displayed page is selected in the print list 
					return;
				}
			}
			
			for(int i=0;i<n;i++)
			{
				PageItem pi = (PageItem)pages.getElementAt(i);
				if(page.equals(pi.getPage()))
				{
					//currently displayed page is in the print list, select it
					selectedPages.setSelectedIndex(i);
					return;
				}
			}
			
			selectedPages.clearSelection();
		}
		
		
		
	}
	
	public PageItem createPageItem(URL url)
	{
		PageItem item = new PageItem();
		item.setPreferredSize(new Dimension(800,600));
		item.setEditable(false);
		item.addHyperlinkListener(this);
		try {
			item.setPage(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return item;
	}

	JMenuItem createMenuItem(Action action, int mnemonics, KeyStroke accel)
	{
		JMenuItem item= new JMenuItem(action);
		item.setMnemonic(mnemonics);
		item.setAccelerator(accel);
		return item;
	}
	
	public void creategui()
	{
		messageArea= new JLabel(defaultMessage);
		
		selectedPages=new JList(new DefaultListModel());
		selectedPages.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		selectedPages.addListSelectionListener(this);
		setPage(homePage);
		
		JSplitPane pane= new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,new JScrollPane(pageItem),new JScrollPane(selectedPages));
		
		JMenu fileMenu= new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		//adding page
		fileMenu.add(createMenuItem(new AbstractAction("Add page")
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						
						DefaultListModel pages = (DefaultListModel)selectedPages.getModel();
						pages.addElement(pageItem);
						selectedPages.setSelectedIndex(pages.getSize()-1);
						
					}},KeyEvent.VK_A,KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.ALT_MASK)));
		
		 //print selected values
		
		fileMenu.add(createMenuItem(new AbstractAction("Print Selected ")
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				
				printSelectedPages();
				
			}},KeyEvent.VK_P,KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.ALT_MASK)));
		
		//clear selected
		
		fileMenu.add(createMenuItem(new AbstractAction("Clear selected")
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				
				DefaultListModel pages = (DefaultListModel)selectedPages.getModel();
				pages.removeAllElements();
				
				
			}},KeyEvent.VK_C,KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.ALT_MASK)));
		
		fileMenu.addSeparator();
		
		//home page
		
		fileMenu.add(createMenuItem(new AbstractAction("Home page")
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				
				setPage(homePage);
				
			}},KeyEvent.VK_H,KeyStroke.getKeyStroke(KeyEvent.VK_H,ActionEvent.ALT_MASK)));
		
		//quit
		
		fileMenu.add(createMenuItem(new AbstractAction("Quit")
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				
			//iterate 
				for(Window w:Window.getWindows())
				{
					w.dispose();
				}
				
			}},KeyEvent.VK_Q,KeyStroke.getKeyStroke(KeyEvent.VK_Q,ActionEvent.ALT_MASK)));
		
		JMenuBar mb= new JMenuBar();
		mb.add(fileMenu);
		
		JPanel contentPane= new JPanel();
		contentPane.setLayout(new BoxLayout(contentPane,BoxLayout.Y_AXIS));
		contentPane.add(pane);
		contentPane.add(messageArea);
		
		JFrame f= new JFrame();
		f.setJMenuBar(mb);
		f.setContentPane(contentPane);
		f.pack();
		f.setVisible(true);
		if(printService==null)
		{
			JOptionPane.showMessageDialog(f, "no service","ALERT", JOptionPane.WARNING_MESSAGE);
		}
		
		
	}
	
	public static void main(String[] args) {
		textbatchprinting obj= new textbatchprinting();
		obj.homePage=obj.getClass().getResource(defaultPage);
		
		if(args.length>0)
		{
			String pageName=args[0];
			try {
				URL url = new URL(pageName);
				obj.homePage=url;
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
		
		
		UIManager.put("swing.boldMetal", Boolean.FALSE);
		obj.creategui();}
			});
	}
}
