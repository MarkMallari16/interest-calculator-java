/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interest;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Mallari
 */
public class Form extends javax.swing.JFrame {

    private String strResult;
    private ButtonGroup timeTypes = new ButtonGroup();

    /**
     * Creates new form Form
     */
    public Form() {
        initComponents();

        //combo box options;
        cbInterestFormula.removeAllItems();
        cbInterestFormula.addItem("Select Calculation");
        cbInterestFormula.addItem("Calculate Interest");
        cbInterestFormula.addItem("Calculate Principal");
        cbInterestFormula.addItem("Calculate Rate");
        cbInterestFormula.addItem("Calculate Time");

        //placeholder
        txtFieldPrincipal.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter Principal");
        txtFielRate.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter Rate");
        txtFieldInterest.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter Interest");
        txtFieldTime.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter Time");

        //icons
        lblTitle.setIcon(new FlatSVGIcon("svg/icon.svg"));
        txtFieldInterest.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("svg/interest.svg"));
        txtFieldPrincipal.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("svg/principal.svg"));
        txtFielRate.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("svg/rate.svg"));
        txtFieldTime.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("svg/time.svg"));

        //set button icons
        btnCalculate.setIcon(new FlatSVGIcon("svg/calculator.svg"));
        btnClear.setIcon(new FlatSVGIcon("svg/cross.svg"));

        //disabling text fields
        disabledTextfield();
        //adding radio btn name type
        rdbNormalTime.setText("Normal Time");
        rdbExactTime.setText("Exact Time");
        rdbOrdinaryTime.setText("Ordinary Time");

        //adding time radio type
        timeTypes.add(rdbNormalTime);
        timeTypes.add(rdbExactTime);
        timeTypes.add(rdbOrdinaryTime);

        //validates all text fields
        validateTextField(txtFieldPrincipal);
        validateTextField(txtFielRate);
        validateTextField(txtFieldInterest);
        validateTextField(txtFieldTime);

    }

    private void validateTextField(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                String text = textField.getText();

                //validate character if digits
                if (Character.isDigit(c)) {
                    return;
                }

                //validate if there is decimal first
                if (c == '.' && !text.contains(".")) {
                    return;
                }

                //validate if have negative sign (-)
                if (c == '-' && text.isEmpty()) {
                    return;
                }

                e.consume();

            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFieldPrincipal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFielRate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFieldInterest = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        txtFieldResult = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        cbInterestFormula = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtFieldTime = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        rdbOrdinaryTime = new javax.swing.JRadioButton();
        rdbNormalTime = new javax.swing.JRadioButton();
        rdbExactTime = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Interest Calculator");
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        lblTitle.setText("Simple Interest Calculator");

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel2.setText("Principal");

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel3.setText("Rate (converted decimal)");

        txtFielRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFielRateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel4.setText("Interest");

        btnCalculate.setBackground(new java.awt.Color(51, 153, 255));
        btnCalculate.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnCalculate.setForeground(new java.awt.Color(255, 255, 255));
        btnCalculate.setText("CALCULATE");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        txtFieldResult.setBackground(new java.awt.Color(35, 35, 35));
        txtFieldResult.setFont(new java.awt.Font("Poppins Black", 1, 36)); // NOI18N
        txtFieldResult.setCaretColor(new java.awt.Color(255, 255, 255));
        txtFieldResult.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtFieldResult.setEnabled(false);
        txtFieldResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldResultActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel5.setText("Result");

        btnClear.setBackground(new java.awt.Color(255, 102, 102));
        btnClear.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        cbInterestFormula.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        cbInterestFormula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbInterestFormula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbInterestFormulaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel6.setText("Calculation");

        jLabel7.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel7.setText("Time");

        rdbOrdinaryTime.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        rdbOrdinaryTime.setText("jRadioButton1");
        rdbOrdinaryTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbOrdinaryTimeActionPerformed(evt);
            }
        });

        rdbNormalTime.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        rdbNormalTime.setText("jRadioButton1");
        rdbNormalTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNormalTimeActionPerformed(evt);
            }
        });

        rdbExactTime.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        rdbExactTime.setText("jRadioButton1");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(rdbNormalTime)
                .addGap(12, 12, 12)
                .addComponent(rdbExactTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbOrdinaryTime)
                .addGap(12, 12, 12))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbNormalTime)
                    .addComponent(rdbExactTime)
                    .addComponent(rdbOrdinaryTime))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7)
                        .addComponent(txtFieldTime, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                        .addComponent(lblTitle)
                        .addComponent(jLabel3)
                        .addComponent(txtFielRate)
                        .addComponent(jLabel6)
                        .addComponent(jLabel4)
                        .addComponent(txtFieldInterest)
                        .addComponent(cbInterestFormula, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2)
                    .addComponent(txtFieldPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(txtFieldResult, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(113, 113, 113))
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbInterestFormula, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFielRate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldTime, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldResult, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed

        //getting selected checkedbox
        String choice = (String) cbInterestFormula.getSelectedItem();

        if (choice == null || choice.equals("Select Calculation")) {
            JOptionPane.showMessageDialog(this, "Please select calculation!", "Required Field", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //getting the formula
        double result = getFormula();

        strResult = String.format("%.4f", result);
        txtFieldResult.setText(strResult);
    }//GEN-LAST:event_btnCalculateActionPerformed
    private boolean validateFields(JTextField textField, String textFieldName) {
        //getting and trimming textfield
        String text = textField.getText().trim();

        //validation
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, textFieldName + " is required!", "Required Field", JOptionPane.ERROR_MESSAGE);
            textField.requestFocusInWindow();
            return false;
        }
        return true;
    }

    public double getFormula() {
        //getting all values
        String selectedFormula = (String) cbInterestFormula.getSelectedItem();

        switch (selectedFormula) {
            case "Calculate Interest": {
                if (!validateFields(txtFieldPrincipal, "Principal") || !validateFields(txtFielRate, "Rate") || !validateFields(txtFieldTime, "Time")) {
                    return 0.0;
                }
                //validating time
                validateTimeSelectedType();

                double principal = Double.parseDouble(txtFieldPrincipal.getText());
                double rate = Double.parseDouble(txtFielRate.getText());
                double time = getTimeSelectedType();
                return (principal * rate * time);
            }

            case "Calculate Principal": {
                if (!validateFields(txtFielRate, "Rate") || !validateFields(txtFieldInterest, "Interest") || !validateFields(txtFieldTime, "Time")) {
                    return 0.0;
                }
                //validating time
                validateTimeSelectedType();

                double interest = Double.parseDouble(txtFieldInterest.getText());
                double rate = Double.parseDouble(txtFielRate.getText());
                double time = getTimeSelectedType();
                return (interest * 100) / (rate * time);
            }

            case "Calculate Rate": {
                if (!validateFields(txtFieldPrincipal, "Principal") || !validateFields(txtFieldInterest, "Interest") || !validateFields(txtFieldTime, "Time")) {
                    return 0.0;
                }
                //validating time
                validateTimeSelectedType();

                double interest = Double.parseDouble(txtFieldInterest.getText());
                double principal = Double.parseDouble(txtFieldPrincipal.getText());
                double time = getTimeSelectedType();

                return (interest * 100) / (principal * time);
            }

            case "Calculate Time": {
                if (!validateFields(txtFieldPrincipal, "Principal") || !validateFields(txtFieldInterest, "Interest") || !validateFields(txtFielRate, "Rate")) {
                    return 0.0;
                }
                double interest = Double.parseDouble(txtFieldInterest.getText());
                double principal = Double.parseDouble(txtFieldPrincipal.getText());
                double rate = Double.parseDouble(txtFielRate.getText());

                return (interest * 100) / (principal * rate);
            }

            default:
                return 0.0;
        }
    }

    private double getTimeSelectedType() {
        double time = Double.parseDouble(txtFieldTime.getText());

        //normal year
        if (rdbNormalTime.isSelected()) {
            return time;
        } else if (rdbExactTime.isSelected()) {
            // for exact interest
            return time / 365;
        } else if (rdbOrdinaryTime.isSelected()) {
            //for ordinary interest
            return time / 360;
        }
        return 0.0;
    }

    //validating radio button
    private void validateTimeSelectedType() {
        if (!rdbNormalTime.isSelected() && !rdbExactTime.isSelected() && !rdbOrdinaryTime.isSelected()) {
            JOptionPane.showMessageDialog(this, "Select Specific Time! (eg: Normal, Exact, Ordinary)", "Required", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    //clear textfields
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearField(txtFieldPrincipal);
        clearField(txtFielRate);
        clearField(txtFieldInterest);
        clearField(txtFieldTime);
        clearField(txtFieldResult);
        timeTypes.clearSelection();

    }//GEN-LAST:event_btnClearActionPerformed

    private void txtFieldResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldResultActionPerformed
    //disabling field based on selected calculation
    private void disabledTextfield() {
        cbInterestFormula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedFormula = (String) cbInterestFormula.getSelectedItem();

                //enabled textfield first.
                txtFieldInterest.setEnabled(true);
                txtFieldPrincipal.setEnabled(true);
                txtFielRate.setEnabled(true);
                txtFieldTime.setEnabled(true);

                rdbNormalTime.setEnabled(true);
                rdbExactTime.setEnabled(true);
                rdbOrdinaryTime.setEnabled(true);

                switch (selectedFormula) {
                    case "Calculate Interest":
                        txtFieldInterest.setEnabled(false);
                        break;
                    case "Calculate Principal":
                        txtFieldPrincipal.setEnabled(false);
                        break;
                    case "Calculate Rate":
                        txtFielRate.setEnabled(false);
                        break;
                    case "Calculate Time":
                        txtFieldTime.setEnabled(false);
                        rdbNormalTime.setEnabled(false);
                        rdbExactTime.setEnabled(false);
                        rdbOrdinaryTime.setEnabled(false);

                        break;
                }
            }
        });
    }
    private void cbInterestFormulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbInterestFormulaActionPerformed

    }//GEN-LAST:event_cbInterestFormulaActionPerformed

    private void rdbNormalTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNormalTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbNormalTimeActionPerformed

    private void txtFielRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFielRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFielRateActionPerformed

    private void rdbOrdinaryTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbOrdinaryTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbOrdinaryTimeActionPerformed
    private void clearField(JTextField textField) {
        textField.setText("");
        cbInterestFormula.setSelectedItem("Select Calculation");
    }

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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JComboBox<String> cbInterestFormula;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblTitle;
    private java.awt.Panel panel1;
    private javax.swing.JRadioButton rdbExactTime;
    private javax.swing.JRadioButton rdbNormalTime;
    private javax.swing.JRadioButton rdbOrdinaryTime;
    private javax.swing.JTextField txtFielRate;
    private javax.swing.JTextField txtFieldInterest;
    private javax.swing.JTextField txtFieldPrincipal;
    private javax.swing.JTextField txtFieldResult;
    private javax.swing.JTextField txtFieldTime;
    // End of variables declaration//GEN-END:variables
}
