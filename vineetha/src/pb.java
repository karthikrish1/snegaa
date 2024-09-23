import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ProgressMonitor;
import javax.swing.SwingWorker;

public class pb extends JPanel implements ActionListener,PropertyChangeListener{
	
	JButton startbutton;
	JProgressBar progressbar;
	JTextArea taskop;
	Task task;

	ProgressMonitor pm;
	
	class Task extends SwingWorker<Void,Void>

	{
	
// during the progress
		@Override
		protected Void doInBackground() throws Exception {
			// TODO Auto-generated method stub
			Random random= new Random();
			int progress=0;
			setProgress(0);
			while(progress<100)
			{
				Thread.sleep(random.nextInt(1000));
				progress+=random.nextInt(10);
				setProgress(Math.min(progress, 100));
			}
		return null;
		}
		
		//after the progress is completed in pb
		@Override
		public void done()
		{
			Toolkit.getDefaultToolkit().beep();
			startbutton.setEnabled(true);
		    pm.setProgress(0);
		    
		}
		
	}
	
	public pb()
	{
		super(new BorderLayout());
		 startbutton= new JButton("Start");
		 startbutton.setActionCommand("start");
		 startbutton.addActionListener(this);
		 
		
		taskop= new JTextArea(10,30);
		taskop.setMargin(new Insets(5,5,5,5));
		taskop.setEditable(false);
		
		add(startbutton,BorderLayout.PAGE_START);
		add(new JScrollPane(taskop),BorderLayout.CENTER);
		 
		
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if("progress"==evt.getPropertyName())
		{
int progress=(Integer)evt.getNewValue();
			pm.setProgress(progress);
			String msg=String.format("completed %d%% \n", progress);
			pm.setNote(msg);
			taskop.append(msg);
			// cancelled / completed
			if(pm.isCanceled() || task.isDone())
			{
				Toolkit.getDefaultToolkit().beep();
				if(pm.isCanceled())
				{
					task.cancel(true);
					taskop.append("Task cancelled\n");
				}
				else
				{
					taskop.append("Task completed\n");
				}
			}
			startbutton.setEnabled(true);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		 pm= new ProgressMonitor(pb.this,"Running a big tsk","" ,0,100);
		 pm.setProgress(0);
		
		 task= new Task();
		 task.addPropertyChangeListener(this);
		 task.execute();
		 startbutton.setEnabled(false);
		
	}
	
	public static void main(String[] args) {
		JFrame f= new JFrame();
		pb ob = new pb();
		f.setContentPane(ob);
		f.setSize(300,200);
		f.pack();
		f.setVisible(true);
	}

}
