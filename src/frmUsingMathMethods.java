/*
Isaac Collier
April 1 2020
This program uses the math methods and a gui to do operations and give an answer to the user.
 */

/**
 *
 * @author Isaac
 * This class is teaching me about methods and how to use them in a program
 */
public class frmUsingMathMethods extends javax.swing.JFrame {

    /**
     * Creates new form frmUsingMathMethods
     */
    public frmUsingMathMethods() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblheader = new javax.swing.JLabel();
        lblInstMax = new javax.swing.JLabel();
        txtMaxNum1 = new javax.swing.JTextField();
        txtMaxNum2 = new javax.swing.JTextField();
        btnMax = new javax.swing.JButton();
        lblMaxValue = new javax.swing.JLabel();
        lblInstMin = new javax.swing.JLabel();
        txtMinNum1 = new javax.swing.JTextField();
        txtMinNum2 = new javax.swing.JTextField();
        btnMin = new javax.swing.JButton();
        lblMinValue = new javax.swing.JLabel();
        lblInstPow = new javax.swing.JLabel();
        txtPowNum1 = new javax.swing.JTextField();
        txtPowNum2 = new javax.swing.JTextField();
        btnPow = new javax.swing.JButton();
        lblPowValue = new javax.swing.JLabel();
        lblInstHypot = new javax.swing.JLabel();
        txtHypotNum1 = new javax.swing.JTextField();
        txtHypotNum2 = new javax.swing.JTextField();
        btnHypot = new javax.swing.JButton();
        lblHypotValue = new javax.swing.JLabel();
        lblInstFloor = new javax.swing.JLabel();
        txtFloorNum = new javax.swing.JTextField();
        btnFloor = new javax.swing.JButton();
        lblFloorValue = new javax.swing.JLabel();
        lblInstCeiling = new javax.swing.JLabel();
        txtCeilingNum = new javax.swing.JTextField();
        btnCeiling = new javax.swing.JButton();
        lblCeilingValue = new javax.swing.JLabel();
        lblInstSqrt = new javax.swing.JLabel();
        txtSqrtNum = new javax.swing.JTextField();
        btnSqrt = new javax.swing.JButton();
        lblSqrtValue = new javax.swing.JLabel();
        lblInstToRadians = new javax.swing.JLabel();
        btnToRadians = new javax.swing.JButton();
        txtToRadiansNum = new javax.swing.JTextField();
        lblToRadiansValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        lblheader.setText("Magical Math Methods");

        lblInstMax.setText("Enter two numbers and click the button. The program will display the largest of the two numbers.");

        txtMaxNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaxNum1ActionPerformed(evt);
            }
        });

        btnMax.setText("Largest");
        btnMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaxActionPerformed(evt);
            }
        });

        lblInstMin.setText("Enter two numbers and click the button. The program will display the smallest of the two numbers.");

        btnMin.setText("Smallest");
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });

        lblInstPow.setText("Enter two numbers and click the button. The program will display the first number to the power of the second.");

        btnPow.setText("Power");
        btnPow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPowActionPerformed(evt);
            }
        });

        lblInstHypot.setText("Enter the length of two sides of a right angle triangle. The program will display the hypotenuse of the triangle.");

        btnHypot.setText("Hypotenuse");
        btnHypot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHypotActionPerformed(evt);
            }
        });

        lblInstFloor.setText("Enter a decimal value. The program will display the value rounded down to the nearest integer.");

        txtFloorNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFloorNumActionPerformed(evt);
            }
        });

        btnFloor.setText("Rounded Down");
        btnFloor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFloorActionPerformed(evt);
            }
        });

        lblInstCeiling.setText("Enter a decimal value. The program will display the value rounded up to the nearest integer.");

        txtCeilingNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCeilingNumActionPerformed(evt);
            }
        });

        btnCeiling.setText("Rounded Up");
        btnCeiling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeilingActionPerformed(evt);
            }
        });

        lblInstSqrt.setText("Enter an integer. The program will display the square root of the integer.");

        btnSqrt.setText("Square Root");
        btnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSqrtActionPerformed(evt);
            }
        });

        lblInstToRadians.setText("Enter an angle in degrees. The program will display the angle in radians.");

        btnToRadians.setText("In Radians");
        btnToRadians.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToRadiansActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInstToRadians, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstCeiling, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblInstMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblheader, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtMaxNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtMaxNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnMax)
                            .addGap(18, 18, 18)
                            .addComponent(lblMaxValue, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblInstMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtMinNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtMinNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnMin)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblMinValue, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblInstPow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtPowNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtPowNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnPow)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblPowValue, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblInstHypot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtHypotNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtHypotNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnHypot)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblHypotValue, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblInstFloor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtToRadiansNum, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnToRadians)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblToRadiansValue, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSqrtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(btnSqrt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSqrtValue, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCeilingNum, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btnCeiling)
                                .addGap(18, 18, 18)
                                .addComponent(lblCeilingValue, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFloorNum, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btnFloor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblFloorValue, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblheader)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(lblInstMax)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaxNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaxNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMax)
                    .addComponent(lblMaxValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstMin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMinNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMinNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMin)
                    .addComponent(lblMinValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstPow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPowNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPowNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPow)
                    .addComponent(lblPowValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInstHypot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHypotNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHypotNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHypot)
                    .addComponent(lblHypotValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstFloor, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFloorNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFloor)
                    .addComponent(lblFloorValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstCeiling)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCeilingNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCeiling)
                    .addComponent(lblCeilingValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstSqrt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSqrtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSqrt)
                    .addComponent(lblSqrtValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstToRadians)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnToRadians)
                    .addComponent(txtToRadiansNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblToRadiansValue))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaxNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaxNum1ActionPerformed
   
    }//GEN-LAST:event_txtMaxNum1ActionPerformed

    //code for finding highest number:
    private void btnMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaxActionPerformed
       
        //declares variables and gets their values from the text box user input:
        double maxNum1 = Double.parseDouble(txtMaxNum1.getText());
        double maxNum2 = Double.parseDouble(txtMaxNum2.getText());
        
         //performs operation and displays answer to user:
        lblMaxValue.setText(String.valueOf(Math.max(maxNum1, maxNum2)));
    }//GEN-LAST:event_btnMaxActionPerformed

    //code for finding first numer to the power of the second:
    private void btnPowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPowActionPerformed
      
          //declares variables and gets their values from the text box user input:
        double powNum1 = Double.parseDouble(txtPowNum1.getText());
        double powNum2 = Double.parseDouble(txtPowNum2.getText());
        
         //performs operation and displays answer to user:
        lblPowValue.setText(String.valueOf(Math.pow(powNum1, powNum2)));
    }//GEN-LAST:event_btnPowActionPerformed

    private void txtFloorNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFloorNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFloorNumActionPerformed

    //code for rounding a number down:
    private void btnFloorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFloorActionPerformed
   
          //declares a variable and gets its value from the text box user input:
        double floorNum = Double.parseDouble(txtFloorNum.getText());
        
         //performs operation and displays answer to user:
        lblFloorValue.setText(String.valueOf(Math.floor(floorNum)));
    }//GEN-LAST:event_btnFloorActionPerformed

    private void txtCeilingNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCeilingNumActionPerformed

    }//GEN-LAST:event_txtCeilingNumActionPerformed

    //code for finding smallest number:
    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
       
          //declares variables and gets their values from the text box user input:
        double minNum1 = Double.parseDouble(txtMinNum1.getText());
        double minNum2 = Double.parseDouble(txtMinNum2.getText());
       
        //performs operation and displays answer to user:
        lblMinValue.setText(String.valueOf(Math.min(minNum1, minNum2)));
    }//GEN-LAST:event_btnMinActionPerformed

    //code for rounding a number up:
    private void btnCeilingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeilingActionPerformed
       
          //declares a variable and gets its value from the text box user input:
        double ceilingNum = Double.parseDouble(txtCeilingNum.getText());
        
         //performs operation and displays answer to user:
        lblCeilingValue.setText(String.valueOf(Math.ceil(ceilingNum)));
    }//GEN-LAST:event_btnCeilingActionPerformed

    //code for finding hypotenuse of a right angle triangle:
    private void btnHypotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHypotActionPerformed
        
          //declares variables and gets their values from the text box user input:
        double hypotNum1 = Double.parseDouble(txtHypotNum1.getText());
        double hypotNum2 = Double.parseDouble(txtHypotNum2.getText());
        
         //performs operation and displays answer to user:
        lblHypotValue.setText(String.valueOf(Math.hypot(hypotNum1, hypotNum2)));
    }//GEN-LAST:event_btnHypotActionPerformed

    //code for finding square root of a number:
    private void btnSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSqrtActionPerformed
         
          //declares a variable and gets its value from the text box user input:
        int sqrtNum = Integer.parseInt(txtSqrtNum.getText());
        
         //performs operation and displays answer to user:
        lblSqrtValue.setText(String.valueOf(Math.sqrt(sqrtNum)));
    }//GEN-LAST:event_btnSqrtActionPerformed

    //code for finding radians value of an angle when input as a degree:
    private void btnToRadiansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToRadiansActionPerformed
       
        //declares a variable and gets its value from the text box user input:
        double toRadiansNum = Double.parseDouble(txtToRadiansNum.getText());
        
         //performs operation and displays answer to user:
        lblToRadiansValue.setText(String.valueOf(Math.toRadians(toRadiansNum)));
    }//GEN-LAST:event_btnToRadiansActionPerformed

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
            java.util.logging.Logger.getLogger(frmUsingMathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUsingMathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUsingMathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUsingMathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUsingMathMethods().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCeiling;
    private javax.swing.JButton btnFloor;
    private javax.swing.JButton btnHypot;
    private javax.swing.JButton btnMax;
    private javax.swing.JButton btnMin;
    private javax.swing.JButton btnPow;
    private javax.swing.JButton btnSqrt;
    private javax.swing.JButton btnToRadians;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCeilingValue;
    private javax.swing.JLabel lblFloorValue;
    private javax.swing.JLabel lblHypotValue;
    private javax.swing.JLabel lblInstCeiling;
    private javax.swing.JLabel lblInstFloor;
    private javax.swing.JLabel lblInstHypot;
    private javax.swing.JLabel lblInstMax;
    private javax.swing.JLabel lblInstMin;
    private javax.swing.JLabel lblInstPow;
    private javax.swing.JLabel lblInstSqrt;
    private javax.swing.JLabel lblInstToRadians;
    private javax.swing.JLabel lblMaxValue;
    private javax.swing.JLabel lblMinValue;
    private javax.swing.JLabel lblPowValue;
    private javax.swing.JLabel lblSqrtValue;
    private javax.swing.JLabel lblToRadiansValue;
    private javax.swing.JLabel lblheader;
    private javax.swing.JTextField txtCeilingNum;
    private javax.swing.JTextField txtFloorNum;
    private javax.swing.JTextField txtHypotNum1;
    private javax.swing.JTextField txtHypotNum2;
    private javax.swing.JTextField txtMaxNum1;
    private javax.swing.JTextField txtMaxNum2;
    private javax.swing.JTextField txtMinNum1;
    private javax.swing.JTextField txtMinNum2;
    private javax.swing.JTextField txtPowNum1;
    private javax.swing.JTextField txtPowNum2;
    private javax.swing.JTextField txtSqrtNum;
    private javax.swing.JTextField txtToRadiansNum;
    // End of variables declaration//GEN-END:variables
}
