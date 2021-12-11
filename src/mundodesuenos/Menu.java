
package mundodesuenos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Menu extends javax.swing.JFrame {
    
    static Connection conn;
   
    public Menu() {
        initComponents();
        conexionBD();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        buscarButton = new javax.swing.JButton();
        actualizarButton = new javax.swing.JButton();
        verInventarioButton = new javax.swing.JButton();
        agregarButton = new javax.swing.JButton();
        eliminarButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(182, 61, 27));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/libros.jpg"))); // NOI18N
        imageLabel.setText("jLabel2");

        titleLabel.setFont(new java.awt.Font("Vivaldi", 0, 48)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Un Mundo de Sueños");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buscarButton.setFont(new java.awt.Font("Vivaldi", 1, 21)); // NOI18N
        buscarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/buscar.jpg"))); // NOI18N
        buscarButton.setText("Buscar  ");
        buscarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscarButton.setContentAreaFilled(false);
        buscarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarButton.setFocusPainted(false);
        buscarButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        actualizarButton.setFont(new java.awt.Font("Vivaldi", 1, 21)); // NOI18N
        actualizarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Actualizar.png"))); // NOI18N
        actualizarButton.setText("Actualizar  ");
        actualizarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        actualizarButton.setContentAreaFilled(false);
        actualizarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        actualizarButton.setFocusPainted(false);
        actualizarButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        actualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarButtonActionPerformed(evt);
            }
        });

        verInventarioButton.setFont(new java.awt.Font("Vivaldi", 1, 21)); // NOI18N
        verInventarioButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/inventario.jpg"))); // NOI18N
        verInventarioButton.setText("Inventario  ");
        verInventarioButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        verInventarioButton.setContentAreaFilled(false);
        verInventarioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verInventarioButton.setFocusPainted(false);
        verInventarioButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        verInventarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verInventarioButtonActionPerformed(evt);
            }
        });

        agregarButton.setFont(new java.awt.Font("Vivaldi", 1, 21)); // NOI18N
        agregarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/botonAgregar.png"))); // NOI18N
        agregarButton.setText("Agregar  ");
        agregarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        agregarButton.setContentAreaFilled(false);
        agregarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarButton.setFocusPainted(false);
        agregarButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        eliminarButton1.setFont(new java.awt.Font("Vivaldi", 1, 21)); // NOI18N
        eliminarButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/eliminar.jpg"))); // NOI18N
        eliminarButton1.setText("Eliminar   ");
        eliminarButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eliminarButton1.setContentAreaFilled(false);
        eliminarButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarButton1.setFocusPainted(false);
        eliminarButton1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        eliminarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(agregarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(eliminarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(actualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(verInventarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verInventarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        new Buscar().setVisible(true);
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
        new Agregar().setVisible(true);
    }//GEN-LAST:event_agregarButtonActionPerformed

    private void eliminarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButton1ActionPerformed
        new Eliminar().setVisible(true);
    }//GEN-LAST:event_eliminarButton1ActionPerformed

    private void verInventarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verInventarioButtonActionPerformed
        new Inventario().setVisible(true);
    }//GEN-LAST:event_verInventarioButtonActionPerformed

    private void actualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarButtonActionPerformed
        new Actualizar().setVisible(true);
    }//GEN-LAST:event_actualizarButtonActionPerformed

    
    // Conexion a base de datos
    
    private void conexionBD() {
        String dbURL = "jdbc:mysql://localhost:3306/libreriamundodesuenos";
        String username = "root";
        String password = "P@ndora84";
        try {

            conn = DriverManager.getConnection(dbURL, username, password);

            System.out.println("Conexión exitosa");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarButton;
    private javax.swing.JButton agregarButton;
    private javax.swing.JButton buscarButton;
    private javax.swing.JButton eliminarButton1;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton verInventarioButton;
    // End of variables declaration//GEN-END:variables
}
