import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julio
 */
public class Lvl3 extends javax.swing.JFrame {

	/**
	 * Creates new form Lvl3
	 */
	public Lvl3() {
		setTitle("Nivel 3");
		setBounds(600, 196, 150, 196);
		getContentPane().setBackground(new Color(154, 205, 50));
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton1.setForeground(Color.WHITE);
		jButton1.setBackground(Color.WHITE);
		jButton2 = new javax.swing.JButton();
		jButton2.setBackground(Color.WHITE);
		jButton3 = new javax.swing.JButton();
		jButton3.setForeground(Color.WHITE);
		jButton3.setBackground(Color.WHITE);
		jButton4 = new javax.swing.JButton();
		jButton4.setBackground(Color.WHITE);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new Font("Gill Sans MT Condensed", Font.BOLD, 34)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(204, 0, 204));
		jLabel1.setText("3. Selecciona el cuadrado");

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trapecio.png"))); // NOI18N
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rectangulo.png"))); // NOI18N
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rombo.jpg"))); // NOI18N
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuadro.png"))); // NOI18N
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		TiempoFYC tiempo = new TiempoFYC();
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje = comboBox.getSelectedItem().toString();

				if (mensaje.equals("Descripcion")) {
					InfoCyF jM = new InfoCyF();
					jM.setVisible(true);
				}

				if (mensaje.equals("Salir")) {
					System.exit(0);
				}
			}
		});
		comboBox.setFont(new Font("Segoe UI", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Descripcion", "Salir" }));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup().addContainerGap(263, Short.MAX_VALUE)
						.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 344, GroupLayout.PREFERRED_SIZE).addGap(212))
				.addGroup(Alignment.LEADING, layout.createSequentialGroup().addGap(128)
						.addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(jButton3)
								.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(Alignment.TRAILING).addComponent(jButton2)
								.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE))
						.addGap(128))
				.addGroup(Alignment.LEADING,
						layout.createSequentialGroup()
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(696, Short.MAX_VALUE)));
		layout.setVerticalGroup(
				layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(28).addComponent(jLabel1).addGap(18)
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
										.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
								.addGap(24)
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 153, Short.MAX_VALUE)
										.addComponent(jButton3, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
								.addGap(31))
						.addGroup(layout
								.createSequentialGroup().addComponent(comboBox, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(438, Short.MAX_VALUE)));
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		Sonido sound = new Sonido();
		sound.ReproducirSonido("src/chicharra-error-incorrecto-.wav");
	}// GEN-LAST:event_jButton1ActionPerformed

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		Sonido sound = new Sonido();
		sound.ReproducirSonido("src/chicharra-error-incorrecto-.wav");
	}// GEN-LAST:event_jButton2ActionPerformed

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		Sonido sound = new Sonido();
		sound.ReproducirSonido("src/chicharra-error-incorrecto-.wav");
	}// GEN-LAST:event_jButton3ActionPerformed

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
		this.setVisible(false);
		Correcto cor = new Correcto();
		Lvl4 lev4 = new Lvl4();
		lev4.setVisible(true);

		Sonido sound = new Sonido();
		sound.ReproducirSonido("src/006202921_prev.wav");
		// cor.setVisible(true);
	}// GEN-LAST:event_jButton4ActionPerformed

	/**
	 * @param args the command line arguments
	 */

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel1;
	private JComboBox comboBox;
	// End of variables declaration//GEN-END:variables
}