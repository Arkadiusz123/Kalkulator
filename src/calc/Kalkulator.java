
package calc;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import static jdk.nashorn.tools.ShellFunctions.input;


public class Kalkulator extends javax.swing.JFrame {
    String wyrazenie ="";

    public int calC () throws ScriptException {
    ScriptEngineManager mgr = new ScriptEngineManager();    
    ScriptEngine engine = mgr.getEngineByName("JavaScript");        
    return new BigDecimal(engine.eval(wyrazenie).toString()).intValue();
}
    public Kalkulator() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        przycisk1 = new javax.swing.JButton();
        przycisk2 = new javax.swing.JButton();
        przycisk3 = new javax.swing.JButton();
        przycisk6 = new javax.swing.JButton();
        przycisk4 = new javax.swing.JButton();
        przycisk5 = new javax.swing.JButton();
        przycisk7 = new javax.swing.JButton();
        przycisk8 = new javax.swing.JButton();
        przycisk9 = new javax.swing.JButton();
        przyciskDodaj = new javax.swing.JButton();
        przyciskOdejmij = new javax.swing.JButton();
        przyciskPomnoz = new javax.swing.JButton();
        przyciskPodziel = new javax.swing.JButton();
        przyciskRownaSie = new javax.swing.JButton();
        przycisk0 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Kalkulator");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        przycisk1.setText("1");
        przycisk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przycisk1ActionPerformed(evt);
            }
        });

        przycisk2.setText("2");
        przycisk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przycisk2ActionPerformed(evt);
            }
        });

        przycisk3.setText("3");
        przycisk3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przycisk3ActionPerformed(evt);
            }
        });

        przycisk6.setText("6");
        przycisk6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przycisk6ActionPerformed(evt);
            }
        });

        przycisk4.setText("4");
        przycisk4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przycisk4ActionPerformed(evt);
            }
        });

        przycisk5.setText("5");
        przycisk5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przycisk5ActionPerformed(evt);
            }
        });

        przycisk7.setText("7");
        przycisk7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przycisk7ActionPerformed(evt);
            }
        });

        przycisk8.setText("8");
        przycisk8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przycisk8ActionPerformed(evt);
            }
        });

        przycisk9.setText("9");
        przycisk9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przycisk9ActionPerformed(evt);
            }
        });

        przyciskDodaj.setText("+");
        przyciskDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przyciskDodajActionPerformed(evt);
            }
        });

        przyciskOdejmij.setText("-");
        przyciskOdejmij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przyciskOdejmijActionPerformed(evt);
            }
        });

        przyciskPomnoz.setText("*");
        przyciskPomnoz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przyciskPomnozActionPerformed(evt);
            }
        });

        przyciskPodziel.setText("/");
        przyciskPodziel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przyciskPodzielActionPerformed(evt);
            }
        });

        przyciskRownaSie.setText("=");
        przyciskRownaSie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przyciskRownaSieActionPerformed(evt);
            }
        });

        przycisk0.setText("0");
        przycisk0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przycisk0ActionPerformed(evt);
            }
        });

        jButton1.setText("C");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(przycisk7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(przycisk0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(przycisk8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(przycisk9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(przyciskPomnoz, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(przyciskRownaSie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(przyciskPodziel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(przycisk1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(przycisk2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(przycisk3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(przyciskDodaj)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(przycisk4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(przycisk5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(przycisk6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(przyciskOdejmij, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(przycisk4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(przycisk5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(przycisk6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(przycisk7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(przycisk8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(przycisk9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(przycisk1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(przycisk2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(przycisk3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(przyciskDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(przyciskOdejmij, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(przyciskPodziel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(przyciskPomnoz, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(przyciskRownaSie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(przycisk0, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void przycisk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przycisk1ActionPerformed
           wyrazenie=wyrazenie+"1";
           jTextField1.setText(wyrazenie);
           
    }//GEN-LAST:event_przycisk1ActionPerformed

    private void przycisk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przycisk2ActionPerformed
            wyrazenie=wyrazenie+"2";
           jTextField1.setText(wyrazenie);        
    }//GEN-LAST:event_przycisk2ActionPerformed

    private void przycisk3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przycisk3ActionPerformed
            wyrazenie=wyrazenie+"3";
           jTextField1.setText(wyrazenie);        
    }//GEN-LAST:event_przycisk3ActionPerformed

    private void przycisk4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przycisk4ActionPerformed
        wyrazenie=wyrazenie+"4";
           jTextField1.setText(wyrazenie);
    }//GEN-LAST:event_przycisk4ActionPerformed

    private void przycisk5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przycisk5ActionPerformed
            wyrazenie=wyrazenie+"5";
           jTextField1.setText(wyrazenie);
    }//GEN-LAST:event_przycisk5ActionPerformed

    private void przycisk6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przycisk6ActionPerformed
            wyrazenie=wyrazenie+"6";
           jTextField1.setText(wyrazenie);
    }//GEN-LAST:event_przycisk6ActionPerformed

    private void przycisk7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przycisk7ActionPerformed
        wyrazenie=wyrazenie+"7";
        jTextField1.setText(wyrazenie);
    }//GEN-LAST:event_przycisk7ActionPerformed

    private void przycisk8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przycisk8ActionPerformed
        wyrazenie=wyrazenie+"8";
        jTextField1.setText(wyrazenie);
    }//GEN-LAST:event_przycisk8ActionPerformed

    private void przycisk9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przycisk9ActionPerformed
        wyrazenie=wyrazenie+"9";
           jTextField1.setText(wyrazenie);
    }//GEN-LAST:event_przycisk9ActionPerformed

    private void przycisk0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przycisk0ActionPerformed
            wyrazenie=wyrazenie+"0";
           jTextField1.setText(wyrazenie);
    }//GEN-LAST:event_przycisk0ActionPerformed

    private void przyciskRownaSieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przyciskRownaSieActionPerformed
            
        try {
            wyrazenie=wyrazenie+"="+calC();
        } catch (ScriptException ex) {
            Logger.getLogger(Kalkulator.class.getName()).log(Level.SEVERE, null, ex);
        }
           jTextField1.setText(wyrazenie);
           wyrazenie="";
           
  
       
           
           
    }//GEN-LAST:event_przyciskRownaSieActionPerformed

    private void przyciskPomnozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przyciskPomnozActionPerformed
        wyrazenie=wyrazenie+"*";
           jTextField1.setText(wyrazenie);
    }//GEN-LAST:event_przyciskPomnozActionPerformed

    private void przyciskDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przyciskDodajActionPerformed
        wyrazenie=wyrazenie+"+";
           jTextField1.setText(wyrazenie);
    }//GEN-LAST:event_przyciskDodajActionPerformed

    private void przyciskPodzielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przyciskPodzielActionPerformed
        wyrazenie=wyrazenie+"/";
           jTextField1.setText(wyrazenie);
    }//GEN-LAST:event_przyciskPodzielActionPerformed

    private void przyciskOdejmijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przyciskOdejmijActionPerformed
            wyrazenie=wyrazenie+"-";
           jTextField1.setText(wyrazenie);
    }//GEN-LAST:event_przyciskOdejmijActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       wyrazenie="";
       jTextField1.setText(wyrazenie);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton przycisk0;
    private javax.swing.JButton przycisk1;
    private javax.swing.JButton przycisk2;
    private javax.swing.JButton przycisk3;
    private javax.swing.JButton przycisk4;
    private javax.swing.JButton przycisk5;
    private javax.swing.JButton przycisk6;
    private javax.swing.JButton przycisk7;
    private javax.swing.JButton przycisk8;
    private javax.swing.JButton przycisk9;
    private javax.swing.JButton przyciskDodaj;
    private javax.swing.JButton przyciskOdejmij;
    private javax.swing.JButton przyciskPodziel;
    private javax.swing.JButton przyciskPomnoz;
    private javax.swing.JButton przyciskRownaSie;
    // End of variables declaration//GEN-END:variables
}
