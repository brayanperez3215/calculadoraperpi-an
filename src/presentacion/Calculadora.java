/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.*;
import punto3.OperacionesMatematicas;

/**
 *
 * @author pipea
 */
public class Calculadora extends javax.swing.JFrame {

    String dato;
    String operacion;
    String signo;
    String dato2;
    String contenido;
    double num;
    boolean punto = true;
    OperacionesMatematicas operaciones = new OperacionesMatematicas();
    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    JLabel personalizado ()
    {
        return new JLabel()
        {
            @Override
            public void paint (Graphics grphcs)
            {
              Graphics2D g= (Graphics2D)grphcs;
              g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
              super.paint(g);
            }
        };
    }
    JLabel teclado ()
    {
        return new JLabel()
        {
            @Override
            public void paint (Graphics grphcs)
            {
              Graphics2D g= (Graphics2D)grphcs;
              g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
              try
              {
                  Integer.parseInt(getText());
                  g.setColor(Color.WHITE);
              }catch(Exception e)
                {
                    g.setColor(new Color(230,230,230));
                }
              g.fillRect(0, 0, getWidth(), getHeight());
              super.paint(g);
            }
        };
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = personalizado();
        jLabel3 = personalizado();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = teclado ();
        jLabel5 = teclado ();
        jLabel6 = teclado ();
        jLabel7 = teclado ();
        jLabel8 = teclado ();
        jLabel9 = teclado ();
        jLabel10 = teclado ();
        jLabel11 = teclado ();
        jLabel12 = teclado ();
        jLabel13 = teclado ();
        jLabel14 = teclado ();
        jLabel15 = teclado ();
        jLabel16 = teclado ();
        jLabel17 = teclado ();
        jLabel18 = teclado ();
        jLabel19 = teclado ();
        jLabel20 = teclado ();
        jLabel21 = teclado ();
        jLabel22 = teclado ();
        jLabel23 = teclado ();
        jLabel24 = teclado ();
        jLabel25 = teclado ();
        jLabel26 = teclado ();
        jLabel27 = teclado ();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("Calculadora");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Retornar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel3.setBackground(new java.awt.Color(51, 51, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new java.awt.GridLayout(6, 4, 0, 3));

        jLabel4.setBackground(new java.awt.Color(0, 255, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("sen");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4);

        jLabel5.setBackground(new java.awt.Color(0, 153, 153));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("cos");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5);

        jLabel6.setBackground(new java.awt.Color(0, 153, 153));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("tan");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("x!");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("√");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("x^n");
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("1/x");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("÷");
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("1");
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("2");
        jLabel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel13);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("3");
        jLabel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel14);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("x");
        jLabel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel15);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("4");
        jLabel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel16);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("5");
        jLabel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel17);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("6");
        jLabel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel18);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("-");
        jLabel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel19);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("7");
        jLabel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel20);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("8");
        jLabel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel21);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("9");
        jLabel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel22);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("+");
        jLabel23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel23);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText(".");
        jLabel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel24);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("0");
        jLabel25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel25);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("C");
        jLabel26.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel26);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("=");
        jLabel27.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel27);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        operacion = jLabel2.getText();
        jLabel2.setText("");
        signo = "sen";
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        jLabel2.setText("");
        jLabel3.setText("0");
    }//GEN-LAST:event_jLabel26MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jLabel2.setText("");
        jLabel3.setText("0");
    }//GEN-LAST:event_formWindowOpened

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        jLabel2.setText(jLabel2.getText()+"1");
        dato=dato+"1";
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        jLabel2.setText(jLabel2.getText()+"2");
        dato=dato+"2";
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        jLabel2.setText(jLabel2.getText()+"3");
        dato=dato+"3";
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        jLabel2.setText(jLabel2.getText()+"4");
        dato=dato+"4";
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        jLabel2.setText(jLabel2.getText()+"6");
        dato=dato+"6";
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        jLabel2.setText(jLabel2.getText()+"5");
        dato=dato+"5";
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        jLabel2.setText(jLabel2.getText()+"7");
        dato=dato+"7";
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        jLabel2.setText(jLabel2.getText()+"8");
        dato=dato+"8";
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        jLabel2.setText(jLabel2.getText()+"9");
        dato=dato+"9";
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
       jLabel2.setText(jLabel2.getText()+"0");
       dato=dato+"0";
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        operacion = jLabel2.getText();
        jLabel2.setText("");
        signo = "cos";
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        operacion = jLabel2.getText();
        jLabel2.setText("");
        signo = "tan";
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        operacion = jLabel2.getText();
        jLabel2.setText("");
        signo = "!";
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        operacion = jLabel2.getText();
        jLabel2.setText("");
        signo = "inverso";
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        Double num = Double.parseDouble(operacion);
        operaciones.setNumero(num);
        if (signo.equals("+"))
        {
            Double num2 = Double.parseDouble(jLabel2.getText());
            operaciones.setNumero2(num2);
            jLabel2.setText(""+num+"+"+num2);
            jLabel3.setText(operaciones.suma()+"");
        }
        else if (signo.equals("-"))
        {
            Double num2 = Double.parseDouble(jLabel2.getText());
            operaciones.setNumero2(num2);
            jLabel2.setText(""+num+"-"+num2);
            jLabel3.setText(operaciones.resta()+"");
        }
        else if(signo.equals("*"))
        {
            Double num2 = Double.parseDouble(jLabel2.getText());
            operaciones.setNumero2(num2);
            jLabel2.setText(""+num+"*"+num2);
            jLabel3.setText(operaciones.producto()+"");
        }
        else if (signo.equals("/"))
        {
            Double num2 = Double.parseDouble(jLabel2.getText());
            operaciones.setNumero2(num2);
            jLabel2.setText(""+num+"/"+num2);
            jLabel3.setText(operaciones.cociente()+"");
        }
        else if (signo.equals("inverso"))
        {
            jLabel2.setText("1/"+num);
            jLabel3.setText(operaciones.inverso()+"");
        }
        else if (signo.equals("^"))
        {
            Double num2 = Double.parseDouble(jLabel2.getText());
            operaciones.setNumero2(num2);
            jLabel2.setText(""+num+"^"+num2);
            jLabel3.setText(operaciones.potencia()+"");
        }
        else if (signo.equals("raiz"))
        {
            Double num2 = Double.parseDouble(jLabel2.getText());
            operaciones.setNumero2(num2);
            jLabel2.setText(num2+"√("+num+")");
            jLabel3.setText(operaciones.raizEnesima()+"");
        }
        else if (signo.equals("!"))
        {
            jLabel2.setText(num+"!");
            jLabel3.setText(operaciones.factorial()+"");
        }
        else if (signo.equals("tan"))
        {
            jLabel2.setText("tan("+num+")");
            jLabel3.setText(operaciones.tangente()+"");
        }
        else if (signo.equals("cos"))
        {
            jLabel2.setText("cos("+num+")");
            jLabel3.setText(operaciones.coseno()+"");
        }
        else if (signo.equals("sen"))
        {
            jLabel2.setText("sen("+num+")");
            jLabel3.setText(operaciones.seno()+"");
        }
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
       contenido = jLabel2.getText();
       if(contenido.length()<=0)
       {
           jLabel2.setText("0.");
       }
       else if(jLabel2.getText().contains("."))
       {
       }
       else 
       {
           jLabel2.setText(jLabel2.getText()+".");
           punto=false;
       }
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        operacion = jLabel2.getText();
        jLabel2.setText("");
        signo = "+";
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        operacion = jLabel2.getText();
        jLabel2.setText("");
        signo = "-";
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        operacion = jLabel2.getText();
        jLabel2.setText("");
        signo = "*";
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        operacion = jLabel2.getText();
        jLabel2.setText("");
        signo = "/";
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        operacion = jLabel2.getText();
        jLabel2.setText("");
        signo = "^";
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        operacion = jLabel2.getText();
        jLabel2.setText("");
        signo = "raiz";
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
