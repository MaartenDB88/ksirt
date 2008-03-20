package gui;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListModel;

import javax.swing.WindowConstants;
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
public class JFrame_Boekingsoverzicht extends javax.swing.JFrame {
	private JScrollPane ScrlpnOverzicht;
	private JPanel_OverzichtKnoppen jPanel_OverzichtKnoppen;
	private JPanel JPanel;
	private JTextArea txaOverzicht;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame_Boekingsoverzicht inst = new JFrame_Boekingsoverzicht();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				inst.setSize(309, 269);
			}
		});
	}
	
	public JFrame_Boekingsoverzicht() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			BorderLayout thisLayout = new BorderLayout();
			getContentPane().setLayout(thisLayout);
			this.setTitle("Boekingsoverzicht");
			{
				ScrlpnOverzicht = new JScrollPane();
				getContentPane().add(ScrlpnOverzicht, BorderLayout.NORTH);
				ScrlpnOverzicht.setPreferredSize(new java.awt.Dimension(392, 169));
				{
					txaOverzicht = new JTextArea();
					ScrlpnOverzicht.setViewportView(txaOverzicht);
					txaOverzicht.setPreferredSize(new java.awt.Dimension(389, 189));
				}
			}
			{
				JPanel = new JPanel();
				FlowLayout JPanelLayout = new FlowLayout();
				JPanel.setLayout(JPanelLayout);
				getContentPane().add(JPanel, BorderLayout.SOUTH);
				JPanel.setPreferredSize(new java.awt.Dimension(392, 66));
				JPanel.setSize(392, 65);
				JPanel.setVerifyInputWhenFocusTarget(false);
				{
					jPanel_OverzichtKnoppen = new JPanel_OverzichtKnoppen();
					JPanel.add(jPanel_OverzichtKnoppen);
					FlowLayout jPanel_OverzichtKnoppenLayout = new FlowLayout();
					jPanel_OverzichtKnoppen.setLayout(jPanel_OverzichtKnoppenLayout);
					jPanel_OverzichtKnoppen.setPreferredSize(new java.awt.Dimension(389, 58));
					jPanel_OverzichtKnoppen.setSize(392, 65);
				}
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void btnAfdrukkenActionPerformed(ActionEvent evt) {
		System.out.println("btnAfdrukken.actionPerformed, event="+evt);
		//TODO add your code for btnAfdrukken.actionPerformed
	}
	
	private void btnAnnulerenActionPerformed(ActionEvent evt) {
		System.out.println("btnAnnuleren.actionPerformed, event="+evt);
		//TODO add your code for btnAnnuleren.actionPerformed
	}

}