
package Interfaces;

import Classes.General.Button;
import Classes.RealEstate.*;
import java.io.File;
import javax.swing.JOptionPane;
import javax.xml.parsers.*;
import org.jb2011.lnf.beautyeye.*;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;
import javax.swing.table.DefaultTableModel;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;


public class RealEstate extends javax.swing.JFrame {

   
    private String path= "file.xml";
    
    private static SortedList list = new SortedList();
    private ListHouse house;
    
    public RealEstate() 
    {
        initComponents();
        loadTheXMLFile();
    }

    
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
        jBtnPopulate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Real Estate Program");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
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

        jBtnPopulate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnPopulate.setForeground(new java.awt.Color(255, 255, 255));
        jBtnPopulate.setText("Populate");
        jBtnPopulate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnPopulateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtnPopulateMouseExited(evt);
            }
        });
        jBtnPopulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPopulateActionPerformed(evt);
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
                        .addGap(105, 105, 105)
                        .addComponent(jBtnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnPopulate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(jBtnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                        .addGap(3, 3, 3)
                        .addComponent(jBtnPopulate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jBtnClose)
                        .addGap(20, 20, 20))
                    .addGroup(jMainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnNext)
                            .addComponent(jBtnPrev))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        pack();
        setLocationRelativeTo(null);
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
      jBtnPopulate.setUI(new BEButtonUI (). setNormalColor (BEButtonUI.NormalColor.lightBlue));
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
        jTxtFirstName.setText("");
        jTxtLastName.setText("");
        jTxtLotNo.setText("");
        jTxtNoOfBedrooms.setText("");
        jTxtPrice.setText("");
        jTxtSqFeet.setText("");
        
    }//GEN-LAST:event_jBtnAddActionPerformed

    private void jBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveActionPerformed
       try {
          house = getHouseDetails();
          if (list.isThereHouse(house)) {
             JOptionPane.showMessageDialog(rootPane, "Lot number you specified already in use.");
          } else {
             list.insertHouse(house);
             JOptionPane.showMessageDialog(rootPane, "All details saved.");
             PopulateTheTable();
          }
       } catch (NumberFormatException e) {
            // Text field info incorrectly formated
          JOptionPane.showMessageDialog(rootPane, "Please specify the Lot Number in correct format. Lot Number contains only numbers.");
       }
    }//GEN-LAST:event_jBtnSaveActionPerformed

    private void jBtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResetActionPerformed
       list.resetHouseList();
       house = (ListHouse) list.getNextItem(false);
       showHouseDetails(house);
    }//GEN-LAST:event_jBtnResetActionPerformed

    private void jBtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClearActionPerformed
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
      
       int lotNumber;
       
       try {
          lotNumber = Integer.parseInt(JOptionPane.showInputDialog(this,"Please enter the Lot Number to Search: ","Search Lot Number",JOptionPane.QUESTION_MESSAGE));

          house = new ListHouse("", "", lotNumber, 0, 0, 0);
          
          if (list.isThereHouse(house)) {
             house = (ListHouse) list.retrieveHouse(house);
             showHouseDetails(house);
          } else {
             JOptionPane.showMessageDialog(rootPane, "Lot Number you specified is unavailable");
          }
       } catch (NumberFormatException e) {
          JOptionPane.showMessageDialog(rootPane, "Please specify the Lot Number in correct format. Lot Number contains only numbers.");
       }
    }//GEN-LAST:event_jBtnSearchActionPerformed

    private void jBtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDeleteActionPerformed
       try {
          house = getHouseDetails();
          if (list.isThereHouse(house)) {
             list.deleteHouse(house);
             JOptionPane.showMessageDialog(rootPane, "Lot Number "+house.lotNumber() +" is deleted.");
             list.resetHouseList();
             house = (ListHouse) list.getNextItem(false);
             showHouseDetails(house);
             PopulateTheTable();
          } else {
             JOptionPane.showMessageDialog(rootPane, "Lot Number you specified is unavailable");
          }
       } catch (NumberFormatException e) {
          JOptionPane.showMessageDialog(rootPane, "Please specify the Lot Number in correct format. Lot Number contains only numbers.");
       }
    }//GEN-LAST:event_jBtnDeleteActionPerformed

    private void jBtnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPrevActionPerformed
       ListHouse house = (ListHouse) list.getPreviousItem(true);
       showHouseDetails(house);
    }//GEN-LAST:event_jBtnPrevActionPerformed

    private void jBtnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNextActionPerformed
       ListHouse house = (ListHouse) list.getNextItem(true);
       showHouseDetails(house);
    }//GEN-LAST:event_jBtnNextActionPerformed

    private void jBtnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCloseActionPerformed
        SaveToXML();
        this.dispose();
    }//GEN-LAST:event_jBtnCloseActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        SaveToXML();
    }//GEN-LAST:event_formWindowClosing

    private void jBtnPopulateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnPopulateMouseEntered
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnPopulate, "Entry");
    }//GEN-LAST:event_jBtnPopulateMouseEntered

    private void jBtnPopulateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnPopulateMouseExited
      Button ob = new Button();
      ob.paint(getGraphics(), jBtnPopulate, "Exit");
    }//GEN-LAST:event_jBtnPopulateMouseExited

    private void jBtnPopulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPopulateActionPerformed
        if (list.listLengthIs() != 0) {
            house = (ListHouse) list.getNextItem(false);
            showHouseDetails(house);

            PopulateTheTable();
        } else {
            JOptionPane.showMessageDialog(rootPane, "No houses to be shown.");
        }
    }//GEN-LAST:event_jBtnPopulateActionPerformed

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
    private javax.swing.JButton jBtnPopulate;
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

   private void loadTheXMLFile() 
   {
      ListHouse house;

      try {
         File fXmlFile = new File(path);
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(fXmlFile);

         doc.getDocumentElement().normalize();

         
         NodeList nList = doc.getElementsByTagName("House");
         int listSize=nList.getLength();
         
         for (int temp = 0; temp < listSize; temp++) {

            Node nNode = nList.item(temp);

               //JOptionPane.showMessageDialog(rootPane,"\nCurrent Element :" + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               house = HouseFile.getNextHouse(nNode);
               list.insertHouse(house);
               //			JOptionPane.showMessageDialog(rootPane,xmlValue);
            }
         }

         
      } catch (Exception e) {
         JOptionPane.showMessageDialog(rootPane, e.getMessage().toString());
      }    
   }

   private void showHouseDetails(ListHouse house) 
   {
      jTxtLotNo.setText(Integer.toString(house.lotNumber()));
      jTxtFirstName.setText(house.firstName());
      jTxtLastName.setText(house.lastName());
      jTxtPrice.setText(Integer.toString(house.price()));
      jTxtSqFeet.setText(Integer.toString(house.squareFeet()));
      jTxtNoOfBedrooms.setText(Integer.toString(house.bedRooms()));
   }

   private void PopulateTheTable() 
   {
      ListHouse house;
      int count = 0;
      list.resetHouseList();
      Object[] columnNames = {"Lot Number", "First Name", "Last Name", "Price", "Square Feet", "No of Bedrooms"};
      DefaultTableModel model = new DefaultTableModel(new Object[0][0], columnNames);
      
      while (count <= list.listLengthIs() - 1) 
      {
         Object[] o = new Object[6];
         
         house = (ListHouse) list.getNextItem(false);

         o[0] = Integer.toString(house.lotNumber());
         o[1] = (house.firstName());
         o[2] = (house.lastName());
         o[3] = (house.price());
         o[4] = (house.squareFeet());
         o[5] = (house.bedRooms());
         model.addRow(o);
         count++;
      }
      list.resetHouseList();
      jTableEstateInfo.setModel(model);
   }

   private ListHouse getHouseDetails() 
   {
      String lastName;
      String firstName;
      int lotNumber;
      int price;
      int squareFeet;
      int bedRooms;
      
      lotNumber = Integer.parseInt(jTxtLotNo.getText());
      firstName = jTxtFirstName.getText();
      lastName = jTxtLastName.getText();
      price = Integer.parseInt(jTxtPrice.getText());
      squareFeet = Integer.parseInt(jTxtSqFeet.getText());
      bedRooms = Integer.parseInt(jTxtNoOfBedrooms.getText());
      
      ListHouse house = new ListHouse(lastName, firstName, lotNumber, price, squareFeet, bedRooms);
      
      return house;
   }

    private void SaveToXML() {
        int count=0;
        
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            
            Element rootElement =
                doc.createElementNS("http://www.InfinityRealEstates.com/house", "Houses");
            
            doc.appendChild(rootElement);
 
            while(count<list.listLengthIs()){
            ListHouse house = (ListHouse) list.getNextItem(false);
            rootElement.appendChild(getHouse(doc, house.lotNumber(), house.firstName(), house.lastName(), house.price(), house.squareFeet(), house.bedRooms()));
            count++;
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
 
            StreamResult file = new StreamResult(new File(path));
 
            transformer.transform(source, file);
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }
    
    private static Node getHouse(Document doc, int lotNumber, String firstName, String lastName, int price,
            int squareFeet, int bedRooms) {
    
        Element house = doc.createElement("House");
        
        house.setAttribute("lotNumber", Integer.toString(lotNumber));
        house.appendChild(getHouseElements(doc, "firstName", firstName));
        house.appendChild(getHouseElements(doc, "lastName", lastName));
        house.appendChild(getHouseElements(doc, "price", Integer.toString(price)));
        house.appendChild(getHouseElements(doc, "squareFeet", Integer.toString(squareFeet)));
        house.appendChild(getHouseElements(doc, "bedRooms", Integer.toString(bedRooms)));
        
        return house;
    
    
    }
    
    private static Node getHouseElements(Document doc, String name, String value) {
        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        return node;
    }
}
