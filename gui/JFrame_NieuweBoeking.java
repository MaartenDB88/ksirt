package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
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
public class JFrame_NieuweBoeking extends javax.swing.JFrame {

	private JLabel lblNr;
	private JLabel lblDatum;
	private JTextField txtdatum;
	private JTextField jTextField2;
	private JTextField jTextField1;
	private JLabel lblPostc;
	private JTextField txtGem;
	private JTextField txtNR;
	private JTextField txtAdr;
	private JButton btnK;
	private JTextField txtPers;
	private JTextField txtType;
	private JTextField txtSeizoen;
	private JTextField txtVertrek;
	private JTextField txtAankomst;
	private JLabel lblSeizoen;
	private JLabel lblVertrek;
	private JLabel lblAankomst;
	private JLabel lblPeriode;
	private JLabel lblPers;
	private JLabel lblKamertype;
	private JLabel lblKamer;
	private JTextField txtRnr;
	private JTextField txtGsm;
	private JTextField txtTel;
	private JTextField txtAdres;
	private JLabel lblKlant;
	private JTextField txtVoornaam;
	private JLabel lblRnr;
	private JLabel lblGsm;
	private JLabel lblTel;
	private JLabel lblAdres;
	private JLabel lblVoornaam;
	private JTextField txtNaam;
	private JLabel lblNaam;
	private JTextField txtNr;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame_NieuweBoeking inst = new JFrame_NieuweBoeking();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public JFrame_NieuweBoeking() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("Nieuwe boeking");
			{
				lblNr = new JLabel();
				getContentPane().add(lblNr);
				lblNr.setText("Boekingsnummer:");
				lblNr.setBounds(22, 12, 120, 20);
				lblNr.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
			}
			{
				lblDatum = new JLabel();
				getContentPane().add(lblDatum);
				lblDatum.setText("Datum:");
				lblDatum.setBounds(22, 38, 120, 20);
				lblDatum.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
			}
			{
				txtdatum = new JTextField();
				getContentPane().add(txtdatum);
				txtdatum.setBounds(154, 38, 62, 20);
			}
			{
				txtNr = new JTextField();
				getContentPane().add(txtNr);
				txtNr.setBounds(154, 12, 62, 20);
			}
			{
				lblKlant = new JLabel();
				getContentPane().add(lblKlant);
				lblKlant.setText("Klant");
				lblKlant.setBounds(5, 84, 77, 16);
				lblKlant.setBorder(BorderFactory.createTitledBorder(""));
				lblKlant.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				lblNaam = new JLabel();
				getContentPane().add(lblNaam);
				lblNaam.setText("Naam:");
				lblNaam.setBounds(18, 103, 55, 25);
			}
			{
				txtNaam = new JTextField();
				getContentPane().add(txtNaam);
				txtNaam.setBounds(91, 104, 109, 21);
			}
			{
				lblVoornaam = new JLabel();
				getContentPane().add(lblVoornaam);
				lblVoornaam.setText("Voornaam:");
				lblVoornaam.setBounds(18, 127, 74, 25);
			}
			{
				lblAdres = new JLabel();
				getContentPane().add(lblAdres);
				lblAdres.setText("Straat - Nr:");
				lblAdres.setBounds(18, 151, 72, 25);
			}
			{
				lblTel = new JLabel();
				getContentPane().add(lblTel);
				lblTel.setText("Tel:");
				lblTel.setBounds(18, 201, 55, 25);
			}
			{
				lblGsm = new JLabel();
				getContentPane().add(lblGsm);
				lblGsm.setText("gsm:");
				lblGsm.setBounds(18, 226, 55, 25);
			}
			{
				lblRnr = new JLabel();
				getContentPane().add(lblRnr);
				lblRnr.setText("Rekeningnr:");
				lblRnr.setBounds(18, 253, 79, 25);
			}
			{
				txtVoornaam = new JTextField();
				getContentPane().add(txtVoornaam);
				txtVoornaam.setBounds(91, 125, 109, 21);
			}
			{
				txtAdres = new JTextField();
				getContentPane().add(txtAdres);
				txtAdres.setBounds(90, 149, 109, 20);
			}
			{
				txtTel = new JTextField();
				getContentPane().add(txtTel);
				txtTel.setBounds(58, 204, 136, 21);
			}
			{
				txtGsm = new JTextField();
				getContentPane().add(txtGsm);
				txtGsm.setBounds(58, 228, 136, 21);
			}
			{
				txtRnr = new JTextField();
				getContentPane().add(txtRnr);
				txtRnr.setBounds(97, 254, 136, 21);
			}
			{
				lblKamer = new JLabel();
				getContentPane().add(lblKamer);
				lblKamer.setText("Kamer");
				lblKamer.setBounds(248, 85, 77, 16);
				lblKamer.setBorder(BorderFactory.createTitledBorder(""));
				lblKamer.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				lblKamertype = new JLabel();
				getContentPane().add(lblKamertype);
				lblKamertype.setText("Kamertype:");
				lblKamertype.setBounds(235, 111, 94, 18);
			}
			{
				lblPers = new JLabel();
				getContentPane().add(lblPers);
				lblPers.setText("# personen:");
				lblPers.setBounds(234, 135, 90, 20);
			}
			{
				lblPeriode = new JLabel();
				getContentPane().add(lblPeriode);
				lblPeriode.setText("Periode");
				lblPeriode.setBounds(419, 85, 77, 16);
				lblPeriode.setBorder(BorderFactory.createTitledBorder(""));
				lblPeriode.setFont(new java.awt.Font("Tahoma",1,11));
			}
			{
				lblAankomst = new JLabel();
				getContentPane().add(lblAankomst);
				lblAankomst.setText("Aankomst:");
				lblAankomst.setBounds(429, 109, 67, 21);
			}
			{
				lblVertrek = new JLabel();
				getContentPane().add(lblVertrek);
				lblVertrek.setText("Vertrek:");
				lblVertrek.setBounds(429, 134, 60, 21);
			}
			{
				lblSeizoen = new JLabel();
				getContentPane().add(lblSeizoen);
				lblSeizoen.setText("Seizoen:");
				lblSeizoen.setBounds(429, 169, 60, 21);
			}
			{
				txtAankomst = new JTextField();
				getContentPane().add(txtAankomst);
				txtAankomst.setBounds(495, 110, 83, 21);
			}
			{
				txtVertrek = new JTextField();
				getContentPane().add(txtVertrek);
				txtVertrek.setBounds(495, 135, 82, 21);
			}
			{
				txtSeizoen = new JTextField();
				getContentPane().add(txtSeizoen);
				txtSeizoen.setBounds(495, 169, 82, 21);
			}
			{
				txtType = new JTextField();
				getContentPane().add(txtType);
				txtType.setBounds(316, 110, 61, 21);
			}
			{
				txtPers = new JTextField();
				getContentPane().add(txtPers);
				txtPers.setBounds(316, 135, 61, 21);
			}
			{
				btnK = new JButton();
				getContentPane().add(btnK);
				btnK.setText("Ok");
				btnK.setBounds(383, 259, 55, 31);
				btnK.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						btnOkActionPerformed(evt);
					}
				});
			}
			{
				txtAdr = new JTextField();
				getContentPane().add(txtAdr);
				txtAdr.setBounds(131, 175, 42, 21);
			}
			{
				txtNR = new JTextField();
				getContentPane().add(txtNR);
				txtNR.setBounds(205, 150, 25, 19);
			}
			{
				txtGem = new JTextField();
				getContentPane().add(txtGem);
				txtGem.setBounds(179, 175, 78, 21);
			}
			{
				lblPostc = new JLabel();
				getContentPane().add(lblPostc);
				lblPostc.setText("Postcode - Gemeente:");
				lblPostc.setBounds(18, 173, 107, 25);
			}
			{
				jTextField1 = new JTextField();
				getContentPane().add(jTextField1);
				jTextField1.setBounds(316, 135, 61, 21);
			}
			{
				jTextField2 = new JTextField();
				getContentPane().add(jTextField2);
				jTextField2.setBounds(316, 135, 61, 21);
			}
			pack();
			this.setSize(591, 338);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void btnOkActionPerformed(ActionEvent evt) {
		System.out.println("btnOk.actionPerformed, event="+evt);
		//TODO add your code for btnOk.actionPerformed
	}

}
