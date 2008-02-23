package gui;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import javax.swing.WindowConstants;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class StartJFrame extends javax.swing.JFrame {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JButton Cancel;
	private JButton Ok;
	private JButton EngelsKnop;
	private JButton FransKnop;
	private JButton NederlandsKnop;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				StartJFrame inst = new StartJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public StartJFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				Cancel = new JButton();
				Cancel.setText("Cancel");
			}
			{
				Ok = new JButton();
				Ok.setText("Ok");
			}
			{
				NederlandsKnop = new JButton();
				NederlandsKnop.setText("Nederlands");
			}
			{
				EngelsKnop = new JButton();
				EngelsKnop.setText("English");
			}
			{
				FransKnop = new JButton();
				FransKnop.setText("Français");
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(139, 139)
				.add(thisLayout.createParallelGroup(GroupLayout.BASELINE)
				    .add(GroupLayout.BASELINE, NederlandsKnop, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
				    .add(GroupLayout.BASELINE, EngelsKnop, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
				    .add(GroupLayout.BASELINE, FransKnop, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
				.add(0, 101, Short.MAX_VALUE)
				.add(thisLayout.createParallelGroup(GroupLayout.BASELINE)
				    .add(GroupLayout.BASELINE, Cancel, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .add(GroupLayout.BASELINE, Ok, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(32, 32)
				.add(NederlandsKnop, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
				.add(36)
				.add(thisLayout.createParallelGroup()
				    .add(GroupLayout.LEADING, thisLayout.createSequentialGroup()
				        .add(EngelsKnop, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
				        .add(33))
				    .add(GroupLayout.LEADING, thisLayout.createSequentialGroup()
				        .add(38)
				        .add(Ok, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))
				.add(thisLayout.createParallelGroup()
				    .add(GroupLayout.LEADING, thisLayout.createSequentialGroup()
				        .add(FransKnop, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
				        .add(13))
				    .add(GroupLayout.LEADING, thisLayout.createSequentialGroup()
				        .add(18)
				        .add(Cancel, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(16, 16));
			thisLayout.linkSize(new Component[] {NederlandsKnop, EngelsKnop, FransKnop}, GroupLayout.VERTICAL);
			thisLayout.linkSize(new Component[] {Ok, Cancel}, GroupLayout.VERTICAL);
			thisLayout.linkSize(new Component[] {Ok, Cancel}, GroupLayout.HORIZONTAL);
			thisLayout.linkSize(new Component[] {NederlandsKnop, EngelsKnop, FransKnop}, GroupLayout.HORIZONTAL);
			pack();
			this.setSize(423, 349);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
