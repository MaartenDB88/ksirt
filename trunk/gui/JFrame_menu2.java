package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JLabel;


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
public class JFrame_menu2 extends javax.swing.JFrame {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	private JButton btnNieuweBoeking;
	private JLabel lblBoeking;
	private JLabel lblOverzicht;
	private JButton btnBoekingOverzicht;
	private JButton btnBasisgegevens;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame_menu2 inst = new JFrame_menu2();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public JFrame_menu2() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("Menu");
			this.setFocusTraversalKeysEnabled(false);
			this.setResizable(false);
			{
				btnBasisgegevens = new JButton();
				getContentPane().add(btnBasisgegevens);
				btnBasisgegevens.setText("Basisgegevens");
				btnBasisgegevens.setBounds(10, 26, 124, 26);
				btnBasisgegevens.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						btnBasisgegevensActionPerformed(evt);
					}
				});
			}
			{
				btnBoekingOverzicht = new JButton();
				getContentPane().add(btnBoekingOverzicht);
				btnBoekingOverzicht.setText("Boekingsoverzicht");
				btnBoekingOverzicht.setBounds(10, 99, 124, 23);
				btnBoekingOverzicht.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						btnBoekingActionPerformed(evt);
					}
				});
			}
			{
				btnNieuweBoeking = new JButton();
				getContentPane().add(btnNieuweBoeking);
				btnNieuweBoeking.setText("Nieuwe boeking");
				btnNieuweBoeking.setBounds(10, 167, 124, 23);
				btnNieuweBoeking.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						btnNieuweBoekingActionPerformed(evt);
					}
				});
			}
			{
				lblOverzicht = new JLabel();
				getContentPane().add(lblOverzicht);
				lblOverzicht.setText("(Klik op boekingsoverzicht voor een overzicht van alle boekingen.)");
				lblOverzicht.setBounds(20, 128, 384, 19);
			}
			{
				lblBoeking = new JLabel();
				getContentPane().add(lblBoeking);
				lblBoeking.setText("(Klik op nieuwe boeking om een nieuwe boeking te maken.)");
				lblBoeking.setBounds(20, 201, 376, 17);
			}
			pack();
			this.setSize(431, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void btnBasisgegevensActionPerformed(ActionEvent evt) {
		System.out.println("btnBasisgegevens.actionPerformed, event="+evt);
		//TODO add your code for btnBasisgegevens.actionPerformed
	}
	
	private void btnBoekingActionPerformed(ActionEvent evt) {
		System.out.println("btnBoeking.actionPerformed, event="+evt);
		//TODO add your code for btnBoeking.actionPerformed
		JFrame_Boekingsoverzicht overzicht = new JFrame_Boekingsoverzicht();
		this.setVisible(false);
		overzicht.setVisible(true);
		overzicht.addWindowListener(
				new WindowAdapter()
				{
					public void windowClosed(WindowEvent e)
					{
						hoofdvensterWeergeven();
					}
				}
				);
	}
	
	private void btnNieuweBoekingActionPerformed(ActionEvent evt) {
		System.out.println("btnNieuweBoeking.actionPerformed, event="+evt);
		//TODO add your code for btnNieuweBoeking.actionPerformed
		JFrame_NieuweBoeking boeking = new JFrame_NieuweBoeking();
		this.setVisible(false);
		boeking.setVisible(true);
		boeking.addWindowListener(
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
