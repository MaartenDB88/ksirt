package gui;
import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.WindowConstants;
import javax.swing.JFrame;


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
public class JPanel_OverzichtKnoppen extends javax.swing.JPanel {
	private JButton btnAfdrukken;
	private JButton btnAnnuleren;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new JPanel_OverzichtKnoppen());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public JPanel_OverzichtKnoppen() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GridLayout thisLayout = new GridLayout(1, 2);
			thisLayout.setColumns(2);
			thisLayout.setHgap(5);
			thisLayout.setVgap(5);
			this.setLayout(thisLayout);
			this.setPreferredSize(new java.awt.Dimension(391, 67));
			{
				btnAfdrukken = new JButton();
				btnAfdrukken.setLayout(null);
				this.add(btnAfdrukken);
				btnAfdrukken.setText("Afdrukken");
				btnAfdrukken.setPreferredSize(new java.awt.Dimension(151, 44));
				btnAfdrukken.setSize(151, 44);
				btnAfdrukken.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						btnAfdrukkenActionPerformed(evt);
					}
				});
			}
			{
				btnAnnuleren = new JButton();
				this.add(btnAnnuleren);
				btnAnnuleren.setText("Annuleren");
				btnAnnuleren.setSize(151, 44);
				btnAnnuleren.setPreferredSize(new java.awt.Dimension(151, 44));
				btnAnnuleren.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						btnAnnulerenActionPerformed(evt);
					}
				});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void btnAnnulerenActionPerformed(ActionEvent evt) {
		System.out.println("btnAnnuleren.actionPerformed, event="+evt);
		//TODO add your code for btnAnnuleren.actionPerformed
	}
	
	private void btnAfdrukkenActionPerformed(ActionEvent evt) {
		System.out.println("btnAfdrukken.actionPerformed, event="+evt);
		//TODO add your code for btnAfdrukken.actionPerformed
	}

}
