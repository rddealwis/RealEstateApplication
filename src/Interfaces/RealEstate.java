/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import Classes.Button;
import Classes.HouseFile;
import Classes.List;
import java.io.File;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.jb2011.lnf.beautyeye.*;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import Classes.ListHouse.*;
import Classes.SortedList.*;
import Classes.ListHouse;
import Classes.SortedList;
import java.awt.Component;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Ras
 */
public class RealEstate extends javax.swing.JFrame {

    /**
     * Creates new form RealEstate
     */
    private String path= "file.xml";
    
    private static SortedList list = new SortedList();
    private ListHouse house;
    public RealEstate() {
        this.setLocationRelativeTo(null);
        initComponents();
        loadTheXMLFile();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMainPanel = new javax.swing.JPanel();
        jLabelLotNo = new javax.swing.JLabel();
        jTxtLotNo = new javax.swing.JTextField();
        jLabelPrice = new javax.swing.JLabel();
        jTxtPrice = new javax.swing.JTextField();
        jLabelFirstName = new javax.swing.JLabel();
        jTxtFirstName = new javax.swing.JTextField();
        jLabelSqFeet = new javax.swing.JLabel();
        jTxtSqFeet = new javax.swing.JTextField();
        jLabelLastName = new javax.swing.JLabel();
        jTxtLastName = new javax.swing.JTextField();
        jLabelNoOfBedrooms = new javax.swing.JLabel();
        jTxtNoOfBedrooms = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstateInfo = new javax.swing.JTable();
        jBtnClose = new javax.swing.JButton();
        jBtnAdd = new javax.swing.JButton();
        jBtnSave = new javax.swing.JButton();
        jBtnReset = new javax.swing.JButton();
        jBtnClear = new javax.swing.JButton();
        jBtnSearch = new javax.swing.JButton();
        jBtnDelete = new javax.swing.JButton();
        jBtnPrev = new javax.swing.JButton();
        jBtnNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Real Estate Program");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelLotNo.setText("Lot Number");

        jLabelPrice.setText("Price");

        jLabelFirstName.setText("First Name");

        jLabelSqFeet.setText("Square Feet");

        jLabelLastName.setText("Last Name");

        jLabelNoOfBedrooms.setText("No of Bedrooms");

        jTableEstateInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Lot Number", "First Name", "Last Name", "Price", "Square Feet", "No of Bedrooms"
            }
        ));
        jTableEstateInfo.setGridColor(new java.awt.Color(0, 204, 204));
        jTableEstateInfo.setSelectionBackground(new java.awt.Color(0, 153, 204));
        jScrollPane1.setViewportView(jTableEstateInfo);

        jBtnClose.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnClose.setForeground(new java.awt.Color(255, 255, 255));
        jBtnClose.setText("Close");
        jBtnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnCloseMouseExited(evt);
            }
        });
        jBtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCloseActionPerformed(evt);
            }
        });

        jBtnAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnAdd.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAdd.setText("Add");
        jBtnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnAddMouseExited(evt);
            }
        });
        jBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddActionPerformed(evt);
            }
        });

        jBtnSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnSave.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSave.setText("Save");
        jBtnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnSaveMouseExited(evt);
            }
        });
        jBtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSaveActionPerformed(evt);
            }
        });

        jBtnReset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnReset.setForeground(new java.awt.Color(255, 255, 255));
        jBtnReset.setText("Reset");
        jBtnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnResetMouseExited(evt);
            }
        });
        jBtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResetActionPerformed(evt);
            }
        });

        jBtnClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnClear.setForeground(new java.awt.Color(255, 255, 255));
        jBtnClear.setText("Clear");
        jBtnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnClearMouseExited(evt);
            }
        });
        jBtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClearActionPerformed(evt);
            }
        });

        jBtnSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnSearch.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSearch.setText("Search");
        jBtnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnSearchMouseExited(evt);
            }
        });
        jBtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSearchActionPerformed(evt);
            }
        });

        jBtnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnDelete.setForeground(new java.awt.Color(255, 255, 255));
        jBtnDelete.setText("Delete");
        jBtnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnDeleteMouseExited(evt);
            }
        });
        jBtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDeleteActionPerformed(evt);
            }
        });

        jBtnPrev.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnPrev.setForeground(new java.awt.Color(255, 255, 255));
        jBtnPrev.setText("Previous");
        jBtnPrev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnPrevMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnPrevMouseExited(evt);
            }
        });
        jBtnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPrevActionPerformed(evt);
            }
        });

        jBtnNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnNext.setForeground(new java.awt.Color(255, 255, 255));
        jBtnNext.setText("Next");
        jBtnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnNextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnNextMouseExited(evt);
            }
        });
        jBtnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jMainPanelLayout = new javax.swing.GroupLayout(jMainPanel);
        jMainPanel.setLayout(jMainPanelLayout);
        jMainPanelLayout.setHorizontalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jMainPanelLayout.createSequentialGroup()
                        .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLotNo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtLotNo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSqFeet, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtSqFeet, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtNoOfBedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNoOfBedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jMainPanelLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jBtnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(jBtnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBtnSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jMainPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );
        jMainPanelLayout.setVerticalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMainPanelLayout.createSequentialGroup()
                        .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jMainPanelLayout.createSequentialGroup()
                                    .addComponent(jLabelLotNo)
                                    .addGap(6, 6, 6)
                                    .addComponent(jTxtLotNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(11, 11, 11)
                                    .addComponent(jLabelPrice)
                                    .addGap(6, 6, 6)
                                    .addComponent(jTxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jMainPanelLayout.createSequentialGroup()
                                    .addComponent(jLabelLastName)
                                    .addGap(6, 6, 6)
                                    .addComponent(jTxtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(11, 11, 11)
                                    .addComponent(jLabelNoOfBedrooms)
                                    .addGap(6, 6, 6)
                                    .addComponent(jTxtNoOfBedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jMainPanelLayout.createSequentialGroup()
                                .addComponent(jLabelFirstName)
                                .addGap(6, 6, 6)
                                .addComponent(jTxtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jLabelSqFeet)
                                .addGap(6, 6, 6)
                                .addComponent(jTxtSqFeet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMainPanelLayout.createSequentialGroup()
                        .addComponent(jBtnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnDelete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnClose)
                    .addComponent(jBtnPrev)
                    .addComponent(jBtnNext))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnAddMouseEntered
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnAdd, "Entry");
    }//GEN-LAST:event_jBtnAddMouseEntered

    private void jBtnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnAddMouseExited
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnAdd, "Exit");
    }//GEN-LAST:event_jBtnAddMouseExited

    private void jBtnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnSaveMouseEntered
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnSave, "Entry");
    }//GEN-LAST:event_jBtnSaveMouseEntered

    private void jBtnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnSaveMouseExited
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnSave, "Exit");
    }//GEN-LAST:event_jBtnSaveMouseExited

    private void jBtnResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnResetMouseEntered
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnReset, "Entry");
    }//GEN-LAST:event_jBtnResetMouseEntered

    private void jBtnResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnResetMouseExited
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnReset, "Exit");
    }//GEN-LAST:event_jBtnResetMouseExited

    private void jBtnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnClearMouseEntered
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnClear, "Entry");
    }//GEN-LAST:event_jBtnClearMouseEntered

    private void jBtnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnClearMouseExited
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnClear, "Exit");
    }//GEN-LAST:event_jBtnClearMouseExited

    private void jBtnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnSearchMouseEntered
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnSearch, "Entry");
    }//GEN-LAST:event_jBtnSearchMouseEntered

    private void jBtnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnSearchMouseExited
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnSearch, "Exit");
    }//GEN-LAST:event_jBtnSearchMouseExited

    private void jBtnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnDeleteMouseEntered
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnDelete, "Entry");
    }//GEN-LAST:event_jBtnDeleteMouseEntered

    private void jBtnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnDeleteMouseExited
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnDelete, "Exit");
    }//GEN-LAST:event_jBtnDeleteMouseExited

    private void jBtnPrevMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnPrevMouseEntered
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnPrev, "Entry");
    }//GEN-LAST:event_jBtnPrevMouseEntered

    private void jBtnPrevMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnPrevMouseExited
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnPrev, "Exit");
    }//GEN-LAST:event_jBtnPrevMouseExited

    private void jBtnNextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnNextMouseEntered
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnNext, "Entry");
    }//GEN-LAST:event_jBtnNextMouseEntered

    private void jBtnNextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnNextMouseExited
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnNext, "Exit");
    }//GEN-LAST:event_jBtnNextMouseExited

    private void jBtnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnCloseMouseEntered
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnClose, "Entry");
    }//GEN-LAST:event_jBtnCloseMouseEntered

    private void jBtnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnCloseMouseExited
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnClose, "Exit");
    }//GEN-LAST:event_jBtnCloseMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                   
      // Start, Button formatting
      jBtnAdd.setUI (new BEButtonUI (). setNormalColor (BEButtonUI.NormalColor.lightBlue));
      jBtnClear.setUI (new BEButtonUI (). setNormalColor (BEButtonUI.NormalColor.lightBlue));
      jBtnClose.setUI (new BEButtonUI (). setNormalColor (BEButtonUI.NormalColor.lightBlue));
      jBtnDelete.setUI (new BEButtonUI (). setNormalColor (BEButtonUI.NormalColor.lightBlue));
      jBtnNext.setUI (new BEButtonUI (). setNormalColor (BEButtonUI.NormalColor.lightBlue));
      jBtnPrev.setUI(new BEButtonUI (). setNormalColor (BEButtonUI.NormalColor.lightBlue));
      jBtnReset.setUI(new BEButtonUI (). setNormalColor (BEButtonUI.NormalColor.lightBlue));
      jBtnSave.setUI(new BEButtonUI (). setNormalColor (BEButtonUI.NormalColor.lightBlue));
      jBtnSearch.setUI(new BEButtonUI (). setNormalColor (BEButtonUI.NormalColor.lightBlue));
      // End, Button formatting
      
      // Start, Table formatting
       jTableEstateInfo.getColumnModel().getColumn(0).setPreferredWidth(70);
       jTableEstateInfo.getColumnModel().getColumn(1).setPreferredWidth(100);
       jTableEstateInfo.getColumnModel().getColumn(2).setPreferredWidth(100);
       jTableEstateInfo.getColumnModel().getColumn(3).setPreferredWidth(55);
       jTableEstateInfo.getColumnModel().getColumn(4).setPreferredWidth(55);
       jTableEstateInfo.getColumnModel().getColumn(5).setPreferredWidth(60);      
      // End, Table formatting       
       
    }//GEN-LAST:event_formWindowOpened

    private void jBtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddActionPerformed
        // TODO add your handling code here:
        jTxtFirstName.setText("");
        jTxtLastName.setText("");
        jTxtLotNo.setText("");
        jTxtNoOfBedrooms.setText("");
        jTxtPrice.setText("");
        jTxtSqFeet.setText("");
        
    }//GEN-LAST:event_jBtnAddActionPerformed

    private void jBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveActionPerformed
        // TODO add your handling code here:
        try {
                    house = getHouse();
                    if (list.isThere(house)) {
                       JOptionPane.showMessageDialog(rootPane,"Lot number already in use");
                    } else {
                        list.insert(house);
                        JOptionPane.showMessageDialog(rootPane,"House added to list");
                        PopulateTheTable();
                    }
                } catch (NumberFormatException badHouseData) {
// Text field info incorrectly formated
                    JOptionPane.showMessageDialog(rootPane,"Number? " + badHouseData.getMessage());
                }
    }//GEN-LAST:event_jBtnSaveActionPerformed

    private void jBtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResetActionPerformed
        // TODO add your handling code here:
        list.reset();
        house = (ListHouse) list.getNextItem();
            showHouse(house);
    }//GEN-LAST:event_jBtnResetActionPerformed

    private void jBtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClearActionPerformed
        // TODO add your handling code here:
        jTxtFirstName.setText("");
        jTxtLastName.setText("");
        jTxtLotNo.setText("");
        jTxtNoOfBedrooms.setText("");
        jTxtPrice.setText("");
        jTxtSqFeet.setText("");
        DefaultTableModel model = (DefaultTableModel) jTableEstateInfo.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_jBtnClearActionPerformed

    private void jBtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSearchActionPerformed
      //SearchLotNumber ob = new SearchLotNumber(this, rootPaneCheckingEnabled);
      //ob.setVisible(true);
      /*String test3= JOptionPane.showInputDialog("Please input mark for test 3: ");

        int int1 = Integer.parseInt(test1);*/
      int lotNumber;
                try {
                    lotNumber= Integer.parseInt(JOptionPane.showInputDialog("Please enter the Lot Number to Search: "));
                    
                    house = new ListHouse("", "", lotNumber, "0", "0", "0");
                    if (list.isThere(house)) {
                        house = (ListHouse) list.retrieve(house);
                        showHouse(house);
                         JOptionPane.showMessageDialog(rootPane,"House found");
                    } else {
                         JOptionPane.showMessageDialog(rootPane,"House not found");
                    }
                } catch (NumberFormatException badHouseData) {
// Text field info incorrectly formated
                     JOptionPane.showMessageDialog(rootPane,"Number? " + badHouseData.getMessage());
                }
    }//GEN-LAST:event_jBtnSearchActionPerformed

    private void jBtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDeleteActionPerformed
        // TODO add your handling code here:
        try {
                    house = getHouse();
                    if (list.isThere(house)) {
                        list.delete(house);
                        JOptionPane.showMessageDialog(rootPane,"House deleted");
                        PopulateTheTable();
                    } else {
                        JOptionPane.showMessageDialog(rootPane,"Lot number not on list");
                    }
                } catch (NumberFormatException badHouseData) {
// Text field info incorrectly formated
                    JOptionPane.showMessageDialog(rootPane,"Number? " + badHouseData.getMessage());
                }
    }//GEN-LAST:event_jBtnDeleteActionPerformed

    private void jBtnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPrevActionPerformed
        // TODO add your handling code here:
        ListHouse house = (ListHouse) list.getPreviousItem();
            showHouse(house);
    }//GEN-LAST:event_jBtnPrevActionPerformed

    private void jBtnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNextActionPerformed
        // TODO add your handling code here:
        ListHouse house = (ListHouse) list.getNextItem();
            showHouse(house);
    }//GEN-LAST:event_jBtnNextActionPerformed

    private void jBtnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBtnCloseActionPerformed

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
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;

            javax.swing.UIManager.setLookAndFeel("org.jb2011.lnf.beautyeye.BeautyEyeLookAndFeelWin");
            javax.swing.UIManager.put("RootPane.setupButtonVisible", false);

        } catch (javax.swing.UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RealEstate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealEstate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAdd;
    private javax.swing.JButton jBtnClear;
    private javax.swing.JButton jBtnClose;
    private javax.swing.JButton jBtnDelete;
    private javax.swing.JButton jBtnNext;
    private javax.swing.JButton jBtnPrev;
    private javax.swing.JButton jBtnReset;
    private javax.swing.JButton jBtnSave;
    private javax.swing.JButton jBtnSearch;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelLotNo;
    private javax.swing.JLabel jLabelNoOfBedrooms;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelSqFeet;
    private javax.swing.JPanel jMainPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEstateInfo;
    private javax.swing.JTextField jTxtFirstName;
    private javax.swing.JTextField jTxtLastName;
    private javax.swing.JTextField jTxtLotNo;
    private javax.swing.JTextField jTxtNoOfBedrooms;
    private javax.swing.JTextField jTxtPrice;
    private javax.swing.JTextField jTxtSqFeet;
    // End of variables declaration//GEN-END:variables

    private void loadTheXMLFile() {
        ListHouse house;
        
    try {
 
	File fXmlFile = new File(path);
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);
 
	doc.getDocumentElement().normalize();
 
	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
 
	NodeList nList = doc.getElementsByTagName("Employee");
 
	
 for (int temp = 0; temp < nList.getLength(); temp++) {
 
		Node nNode = nList.item(temp);
 
		//JOptionPane.showMessageDialog(rootPane,"\nCurrent Element :" + nNode.getNodeName());
 
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
 
			house = HouseFile.getNextHouse(nNode);
                          list.insert(house);      
//			JOptionPane.showMessageDialog(rootPane,xmlValue);
                            
		}
	}
 
            house = (ListHouse) list.getNextItem();
            showHouse(house);
            
            PopulateTheTable();
            
            
            
            
            
    } catch (Exception e) {
	JOptionPane.showMessageDialog(rootPane,e.getMessage());
    }
    
    }

    private void showHouse(ListHouse house) {
        jTxtLotNo.setText(Integer.toString(house.lotNumber()));
        jTxtFirstName.setText(house.firstName());
        jTxtLastName.setText(house.lastName());
        jTxtPrice.setText(house.price());
        jTxtSqFeet.setText(house.squareFeet());
        jTxtNoOfBedrooms.setText(house.bedRooms());   
    
    }

    private void PopulateTheTable() {
        ListHouse house;
        int count=0;
        Object[] columnNames = {"Lot Number", "First Name", "Last Name", "Price", "Square Feet", "No of Bedrooms"};
        DefaultTableModel model = new DefaultTableModel(new Object[0][0], columnNames);
        while (count<=list.lengthIs() - 1) {
            Object[] o = new Object[6];
            house = (ListHouse) list.getNextItem();
            
            o[0] = Integer.toString(house.lotNumber());
            o[1] = (house.firstName());
            o[2] = (house.lastName());
            o[3] = (house.price());
            o[4] = (house.squareFeet());
            o[5] = (house.bedRooms());
            model.addRow(o);
            count++;
        }
        jTableEstateInfo.setModel(model);
    
    }

    private ListHouse getHouse() {
        String lastName;
        String firstName;
        int lotNumber;
        String price;
        String squareFeet;
        String bedRooms;
        lotNumber = Integer.parseInt(jTxtLotNo.getText());
        firstName = jTxtFirstName.getText();
        lastName = jTxtLastName.getText();
        price = jTxtPrice.getText();
        squareFeet = jTxtSqFeet.getText();
        bedRooms = jTxtNoOfBedrooms.getText();
        ListHouse house = new ListHouse(lastName, firstName, lotNumber, price,
                squareFeet, bedRooms);
        return house;
        
    }
    
}
