/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digital_clock;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;



/**
 *
 * @author tibip
 */
public class Clock_UI extends javax.swing.JFrame {

    /**
     * Creates new form Clock_UI
     */
    public Clock_UI() {
        
        
        try {
            initComponents();
            
            Clock new_clock = new Clock();
            
            Tf_Hrs.setText(new_clock.getHrs()+"");
            Tf_min.setText(new_clock.getMin()+"");
            Tf_sec.setText(new_clock.getSec()+"");  
            
            Increment_hrs.addActionListener((ActionEvent e) -> {
                try {
                    new_clock.IncrementHour();  //Incrementing hr
                    Tf_Hrs.setText(new_clock.getHrs()+"");
                    Tf_min.setText(new_clock.getMin()+"");
                    Tf_sec.setText(new_clock.getSec()+"");
                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(jPanel2, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                }
            });
            
             //Add listener to Decrement hour button
             
            Decrement_hrs.addActionListener((ActionEvent e) -> {
                try {
                    new_clock.DecrementHour();  //Decrementing hr
                    Tf_Hrs.setText(new_clock.getHrs()+"");
                    Tf_min.setText(new_clock.getMin()+"");
                    Tf_sec.setText(new_clock.getSec()+"");
                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(jPanel2, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                }
            });
           
             //Add listener to increment minute button
             
            Increment_min.addActionListener((ActionEvent e) -> {
                try {
                    new_clock.IncrementMinutes();   //Incrementing minute
                    Tf_Hrs.setText(new_clock.getHrs()+"");          
                    Tf_min.setText(new_clock.getMin()+"");   
                    Tf_sec.setText(new_clock.getSec()+""); 
                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(jPanel2, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                }
            });
            
             //Add listener to Decrement minute button
             
            Decrement_min.addActionListener((ActionEvent e) -> {
                try {
                    new_clock.DecrementMinutes();   //Decrementing minute
                    Tf_Hrs.setText(new_clock.getHrs()+"");  
                    Tf_min.setText(new_clock.getMin()+"");   
                    Tf_sec.setText(new_clock.getSec()+"");  
                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(jPanel2, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                }
            });
            
             //Add listener to Increment second button
             
            Increment_sec.addActionListener((ActionEvent e) -> {
                try {
                    new_clock.IncrementSeconds(); //Incrementing second
                    Tf_Hrs.setText(new_clock.getHrs()+"");  
                    Tf_min.setText(new_clock.getMin()+"");   
                    Tf_sec.setText(new_clock.getSec()+""); 
                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(jPanel2, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                }
            });
            
             //Add listener to Decrement Seconds button
            
            Decrement_Sec.addActionListener((ActionEvent e) -> {
                try {
                    new_clock.DecrementSeconds(); //Decrementing second
                    Tf_Hrs.setText(new_clock.getHrs()+"");  
                    Tf_min.setText(new_clock.getMin()+"");   
                    Tf_sec.setText(new_clock.getSec()+"");  
                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(jPanel2, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                }
            });
            
            //Add listener to convert to 12 hr button
            Btn_12hr.addActionListener((ActionEvent e) -> {
                try {
                    String value = new_clock.ConvertTo12Hr(); //Getting value of 12hr formatted clock value
                    Tf_12hrs.setText(value);   //To update value in Convert to 12hr Tf
                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(jPanel2, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                }
            });
             
    }
        
        
        catch (Exception ex) {
            
            JOptionPane.showMessageDialog(jPanel2, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            
        }
               
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Decrement_hrs = new javax.swing.JButton();
        Increment_hrs = new javax.swing.JButton();
        Decrement_Sec = new javax.swing.JButton();
        Decrement_min = new javax.swing.JButton();
        Increment_min = new javax.swing.JButton();
        Increment_sec = new javax.swing.JButton();
        Btn_12hr = new javax.swing.JButton();
        Tf_min = new javax.swing.JTextField();
        Tf_Hrs = new javax.swing.JTextField();
        Tf_12hrs = new javax.swing.JTextField();
        Tf_sec = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Decrement_hrs.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        Decrement_hrs.setText("Decrement");
        Decrement_hrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Decrement_hrsActionPerformed(evt);
            }
        });

        Increment_hrs.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        Increment_hrs.setText("Increment");
        Increment_hrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Increment_hrsActionPerformed(evt);
            }
        });

        Decrement_Sec.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        Decrement_Sec.setText("Decrement");
        Decrement_Sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Decrement_SecActionPerformed(evt);
            }
        });

        Decrement_min.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        Decrement_min.setText("Decrement");

        Increment_min.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        Increment_min.setText("Increment");

        Increment_sec.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        Increment_sec.setText("Increment");

        Btn_12hr.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        Btn_12hr.setText("Convert 12-Hours");
        Btn_12hr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_12hrActionPerformed(evt);
            }
        });

        Tf_min.setEditable(false);
        Tf_min.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N

        Tf_Hrs.setEditable(false);
        Tf_Hrs.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N

        Tf_12hrs.setEditable(false);
        Tf_12hrs.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        Tf_12hrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_12hrsActionPerformed(evt);
            }
        });

        Tf_sec.setEditable(false);
        Tf_sec.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setText("Digital Clock");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Decrement_min, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Decrement_hrs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_12hr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(Decrement_Sec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tf_min, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tf_Hrs, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tf_sec, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tf_12hrs, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Increment_min, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Increment_hrs, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Increment_sec, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Decrement_hrs, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tf_Hrs, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Increment_hrs, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tf_min, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Decrement_min, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Increment_min, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_sec, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Decrement_Sec, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Increment_sec, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_12hr, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tf_12hrs, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Increment_hrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Increment_hrsActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Increment_hrsActionPerformed

    private void Decrement_SecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Decrement_SecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Decrement_SecActionPerformed

    private void Tf_12hrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_12hrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_12hrsActionPerformed

    private void Decrement_hrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Decrement_hrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Decrement_hrsActionPerformed

    private void Btn_12hrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_12hrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_12hrActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Clock_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clock_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clock_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clock_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Clock_UI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_12hr;
    private javax.swing.JButton Decrement_Sec;
    private javax.swing.JButton Decrement_hrs;
    private javax.swing.JButton Decrement_min;
    private javax.swing.JButton Increment_hrs;
    private javax.swing.JButton Increment_min;
    private javax.swing.JButton Increment_sec;
    private javax.swing.JTextField Tf_12hrs;
    private javax.swing.JTextField Tf_Hrs;
    private javax.swing.JTextField Tf_min;
    private javax.swing.JTextField Tf_sec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
