import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class Lvl5 extends javax.swing.JFrame {

	/**
	 * Creates new form Lvl5
	 */
	public Lvl5() {
		setTitle("Nivel 5");
		setBounds(600, 196, 150, 196);
		getContentPane().setBackground(Color.WHITE);
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
		jLabel2 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton1.setBackground(new Color(176, 224, 230));
		jButton2 = new javax.swing.JButton();
		jButton2.setBackground(new Color(176, 224, 230));
		jButton3 = new javax.swing.JButton();
		jButton3.setBackground(new Color(176, 224, 230));
		jButton4 = new javax.swing.JButton();
		jButton4.setBackground(new Color(176, 224, 230));
		jButton5 = new javax.swing.JButton();
		jButton5.setBackground(new Color(176, 224, 230));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new Font("Gill Sans MT Condensed", Font.BOLD, 34)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(204, 0, 204));
		jLabel1.setText("<html>5. \u00BFCuantas figuras geometricas diferentes ves en la figura?<html>");

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elefante.png"))); // NOI18N

		jButton1.setFont(new Font("Eras Demi ITC", Font.BOLD, 18)); // NOI18N
		jButton1.setText("1");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setFont(new Font("Eras Demi ITC", Font.BOLD, 18)); // NOI18N
		jButton2.setText("2");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setFont(new Font("Eras Demi ITC", Font.BOLD, 18)); // NOI18N
		jButton3.setText("3");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setFont(new Font("Eras Demi ITC", Font.BOLD, 18)); // NOI18N
		jButton4.setText("4");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setFont(new Font("Eras Demi ITC", Font.BOLD, 18)); // NOI18N
		jButton5.setText("5");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
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
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(99).addComponent(jLabel2).addGap(18)
								.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(jButton5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)))
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createSequentialGroup().addGap(55).addComponent(jLabel1,
								GroupLayout.PREFERRED_SIZE, 681, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(91, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(jButton1).addGap(7)
								.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
								.addGap(7)
								.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(jButton4)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(jButton5).addGap(39))
						.addGroup(layout.createSequentialGroup().addGap(116).addComponent(jLabel2)))
						.addContainerGap()));
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

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
		Sonido sound = new Sonido();
		sound.ReproducirSonido("src/chicharra-error-incorrecto-.wav");
	}// GEN-LAST:event_jButton5ActionPerformed

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
		this.setVisible(false);

		Sonido sound = new Sonido();
		sound.ReproducirSonido("src/006202921_prev.wav");
		Correcto cor = new Correcto();
		Win win = new Win();

		// Instanciar fecha
		Date fecha = new Date();
		DateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		// Instancias usuarios y sqlusuarios
		SQLUsuarios sqlU = new SQLUsuarios();
		Usuarios u = new Usuarios();

		u.setFinT(formato.format(fecha));

		if (sqlU.cronoFin(u)) {
			win.setVisible(true);
		}
	}// GEN-LAST:event_jButton4ActionPerformed

	/**
	 * @param args the command line arguments
	 */

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private JComboBox comboBox;
	// End of variables declaration//GEN-END:variables
}
