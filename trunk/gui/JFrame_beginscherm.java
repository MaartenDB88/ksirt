package gui;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
public class JFrame_beginscherm extends javax.swing.JFrame {
	private JButton btnNederlands;
	private JButton btnFrans;
	private JButton btnEngels;
	
	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public JFrame_beginscherm() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("Selecteer uw gewenste taal.");
			this.setFocusTraversalKeysEnabled(false);
			this.setResizable(false);
			{
				btnNederlands = new JButton();
				getContentPane().add(btnNederlands);
				btnNederlands.setText("Nederlands");
				btnNederlands.setBounds(23, 95, 92, 52);
				btnNederlands.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						btnNederlandsActionPerformed(evt);
					}
				});
			}
			{
				btnEngels = new JButton();
				getContentPane().add(btnEngels);
				btnEngels.setText("Engels");
				btnEngels.setBounds(150, 96, 92, 52);
			}
			{
				btnFrans = new JButton();
				getContentPane().add(btnFrans);
				btnFrans.setText("Frans");
				btnFrans.setBounds(274, 96, 92, 52);
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	private void btnNederlandsActionPerformed(ActionEvent evt) {
		System.out.println("btnNederlands.actionPerformed, event="+evt);
		//TODO add your code for btnNederlands.actionPerformed
		JFrame_menu2 menu = new JFrame_menu2();
		this.setVisible(false);
		menu.setVisible(true);
	
		menu.addWindowListener(
			new WindowAdapter()
			{
				public void windowClosed(WindowEvent e)
				{
					hoofdvensterWeergeven();
				}
			}
			);
	}
	
		public void hoofdvensterWeergeven()
		{
			this.setVisible(true);
			// UPDATE? of opkuisen van invoervakken
		}
}
