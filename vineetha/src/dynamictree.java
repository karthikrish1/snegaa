import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

public class dynamictree extends JPanel {

	DefaultMutableTreeNode rootnode;
	 DefaultTreeModel treemodel;
	 JTree tree;
	Toolkit toolkit= Toolkit.getDefaultToolkit();
	public dynamictree()
	{
		super(new GridLayout(1,0));
		 rootnode= new DefaultMutableTreeNode("rootnode");
		  treemodel= new DefaultTreeModel(rootnode);
		  treemodel.addTreeModelListener(new NTreeModelListener());
		  tree=new JTree(treemodel);
		  tree.setEditable(true);
		  tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		  tree.setShowsRootHandles(true);
		  JScrollPane js= new JScrollPane(tree);
		  add(js);
		  
	}
	
	public void clear()
	{
		rootnode.removeAllChildren();
		treemodel.reload();
		
	}
	
	
	public void removecurrentnode()
	{
		TreePath cs = tree.getSelectionPath();
		if(cs!=null)
		{
			DefaultMutableTreeNode cn = (DefaultMutableTreeNode)(cs.getLastPathComponent());
			MutableTreeNode parent = (MutableTreeNode)(cn.getParent());
			if(parent!=null)
			{
				treemodel.removeNodeFromParent(cn);
				return;
				}
		}
		toolkit.beep();
	}
	
	public DefaultMutableTreeNode addObject(Object child)
	{
		DefaultMutableTreeNode parentnode=null;
		TreePath parentpath = tree.getSelectionPath();
		if(parentpath==null)
		{
			parentnode=rootnode;
		}
		else
		{
			parentnode=(DefaultMutableTreeNode)(parentpath.getLastPathComponent());
			
		}
		
		return addObject(parentnode,child,true);
		
	}
	
	public DefaultMutableTreeNode addObject(DefaultMutableTreeNode parent,Object child,boolean visible)
	{
		DefaultMutableTreeNode childnode = new DefaultMutableTreeNode(child);
		if(parent==null)
		{
			parent=rootnode;
		}
		
		treemodel.insertNodeInto(childnode, parent, parent.getChildCount());
		
		if(visible)
		{
			tree.scrollPathToVisible(new TreePath(childnode.getPath()));
		}
		return childnode;
		
	}
	
	
	
	class NTreeModelListener implements TreeModelListener
	{

		@Override
		public void treeNodesChanged(TreeModelEvent e) {
			
			DefaultMutableTreeNode node;
			node=(DefaultMutableTreeNode)(e.getTreePath().getLastPathComponent());
			
			int index=e.getChildIndices()[0];
			node=(DefaultMutableTreeNode)(node.getChildAt(index));
			
			System.out.println("New value is "+ node.getUserObject());
		}

		@Override
		public void treeNodesInserted(TreeModelEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void treeNodesRemoved(TreeModelEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void treeStructureChanged(TreeModelEvent e) {
			// TODO Auto-generated method stub
			
		}}
	
	
	
}
