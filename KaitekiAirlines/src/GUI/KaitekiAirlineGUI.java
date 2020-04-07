/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import classes.Flight;
import classes.KaitekiAirlineSystem;
//import classes.KaitaikiRunner;
import classes.Passenger;
import classes.SystemRunner;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
//import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hadi
 */
public class KaitekiAirlineGUI extends javax.swing.JFrame {

    /**
     * Creates new form KaitekiAirlineGUI
     */
    //class level variable
    KaitekiAirlineSystem airLine;
//    KaitaikiRunner runner;

    public KaitekiAirlineGUI() {
        initComponents();
        //initiating airline instance
        SystemRunner s = new SystemRunner();
        airLine = new KaitekiAirlineSystem(this);
//        runner = new KaitaikiRunner(this);
        seatChangingPanel.setVisible(false);
        /******************************************************************/
        /****when you add new flight, also add it in FlightList************/
        Flight f1 = new Flight("KA309", "POS", "TAB");
        Flight f2 = new Flight("KA409", "POS", "TAB");
        Flight f3 = new Flight("KA809", "POS", "TAB");

        airLine.setFlights(f1);
        airLine.setFlights(f2);
        airLine.setFlights(f3);
        
        airLine.addPassenger("Kyle", "Abbot", "TA92341");
        airLine.addPassenger("Seth", "Mooreeeee", "TA92342");
        airLine.addPassenger("DJ", "Bravo", "TA92343");
        airLine.addPassenger("Usain", "bolt", "TA92344");
        airLine.addPassenger("Viv", "Richards", "TA92345");
        
        
        for(int i=0;i<airLine.getFlights().size();i++){
            flightList.addItem(airLine.getFlights().get(i).getFlightNumber().toString());
        }
        
        seatMap.setText(airLine.getSeatMap(airLine.getFlights().get(0).getFlightNumber().toString()));
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
        jLabel2 = new javax.swing.JLabel();
        passportNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passengerFirstName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        passengerLastName = new javax.swing.JTextField();
        flightList = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        boardingDetails = new javax.swing.JTextArea();
        findPassengerButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        issueBoardingPass = new javax.swing.JButton();
        addPassengerButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        updateDetailsButton = new javax.swing.JButton();
        findBoaringButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        updateText = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        seatMap = new javax.swing.JTextArea();
        changeSeatVisible = new javax.swing.JCheckBox();
        seatChangingPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        newSeat = new javax.swing.JTextField();
        changeSeatButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kaiteki Airlines");
        setPreferredSize(new java.awt.Dimension(1150, 850));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Passenger Last Name");

        passportNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passportNumberActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Passport Number");

        passengerFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passengerFirstNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Passenger First Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Flight  Number");

        flightList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(passengerFirstName)
                        .addComponent(passportNumber)
                        .addComponent(passengerLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(flightList, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(passengerFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passengerLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passportNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(flightList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        boardingDetails.setEditable(false);
        boardingDetails.setColumns(20);
        boardingDetails.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        boardingDetails.setRows(5);
        jScrollPane1.setViewportView(boardingDetails);

        findPassengerButton.setBackground(new java.awt.Color(255, 255, 255));
        findPassengerButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        findPassengerButton.setText("Find Passenger");
        findPassengerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findPassengerButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Boarding Pass Details ");

        issueBoardingPass.setBackground(new java.awt.Color(255, 255, 255));
        issueBoardingPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        issueBoardingPass.setText("Issue Boarding Pass");
        issueBoardingPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBoardingPassActionPerformed(evt);
            }
        });

        addPassengerButton.setBackground(new java.awt.Color(255, 255, 255));
        addPassengerButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addPassengerButton.setText("Add Passenger");
        addPassengerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPassengerButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(255, 255, 255));
        clearButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        updateDetailsButton.setBackground(new java.awt.Color(255, 255, 255));
        updateDetailsButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        updateDetailsButton.setText("Update Passenger Details");
        updateDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDetailsButtonActionPerformed(evt);
            }
        });

        findBoaringButton.setBackground(new java.awt.Color(255, 255, 255));
        findBoaringButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        findBoaringButton.setText("Find Boarding Pass");
        findBoaringButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBoaringButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addPassengerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(issueBoardingPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(findBoaringButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(updateDetailsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(findPassengerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPassengerButton)
                    .addComponent(updateDetailsButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(issueBoardingPass)
                    .addComponent(findBoaringButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton)
                    .addComponent(findPassengerButton))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Seat Map");

        updateText.setEditable(false);
        updateText.setColumns(20);
        updateText.setRows(5);
        jScrollPane2.setViewportView(updateText);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        seatMap.setEditable(false);
        seatMap.setColumns(20);
        seatMap.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        seatMap.setRows(5);
        jScrollPane5.setViewportView(seatMap);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 173, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(174, 174, 174))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        changeSeatVisible.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        changeSeatVisible.setText("Change Seat");
        changeSeatVisible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeSeatVisibleActionPerformed(evt);
            }
        });

        seatChangingPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("New Seat No.");

        changeSeatButton.setBackground(new java.awt.Color(255, 255, 255));
        changeSeatButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        changeSeatButton.setText("Change Seat");
        changeSeatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeSeatButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout seatChangingPanelLayout = new javax.swing.GroupLayout(seatChangingPanel);
        seatChangingPanel.setLayout(seatChangingPanelLayout);
        seatChangingPanelLayout.setHorizontalGroup(
            seatChangingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seatChangingPanelLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(changeSeatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        seatChangingPanelLayout.setVerticalGroup(
            seatChangingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seatChangingPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(seatChangingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(newSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeSeatButton))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(changeSeatVisible)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seatChangingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(changeSeatVisible)
                        .addGap(18, 18, 18)
                        .addComponent(seatChangingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //checkBox method for making panel visible/invisible 
    private void changeSeatVisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeSeatVisibleActionPerformed
        // TODO add your handling code here:
        if (changeSeatVisible.isSelected()) {
            seatChangingPanel.setVisible(true);
        } else {
            seatChangingPanel.setVisible(false);
        }

    }//GEN-LAST:event_changeSeatVisibleActionPerformed

//button for changing passenger's field
    private void changeSeatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeSeatButtonActionPerformed
        if(airLine.updateSeat(passportNumber.getText(), flightList.getSelectedItem().toString(), newSeat.getText()).equals("Seat is already Booked")){
            updateText.setText("Seat is Already Booked");
            return;
        }
        if(newSeat.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Enter Seat Number");
        }
        else{
            airLine.updateSeat(passportNumber.getText(), flightList.getSelectedItem().toString(), newSeat.getText());
            seatMap.setText(airLine.getSeatMap(flightList.getSelectedItem().toString()));
            updateText.setText("Seat Change Successful");
        }  
    }//GEN-LAST:event_changeSeatButtonActionPerformed

    private void passengerFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passengerFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passengerFirstNameActionPerformed

    private void addPassengerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPassengerButtonActionPerformed
        // TODO add your handling code here:
       
        if (airLine.duplicate_check(passportNumber.getText()) == true) {
            JOptionPane.showMessageDialog(null, "Already Present in System!!");
        } else {
            airLine.addPassenger(passengerFirstName.getText(), passengerLastName.getText(), passportNumber.getText());
            JOptionPane.showMessageDialog(null, "Passenger Added!!");
        }
        passengerFirstName.setText("");
        passengerLastName.setText("");
        passportNumber.setText("");
    }//GEN-LAST:event_addPassengerButtonActionPerformed

    private void passportNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passportNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passportNumberActionPerformed

    private void updateDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDetailsButtonActionPerformed
         if(validation()==true){
            return;
        }
        if( airLine.updatePassenger(passengerFirstName.getText(), passengerLastName.getText(), passportNumber.getText()).equals("Not Found")){
            JOptionPane.showMessageDialog(null, "Passenger Record not Found");
        }
        else{
        airLine.updatePassenger(passengerFirstName.getText(), passengerLastName.getText(), passportNumber.getText());
        JOptionPane.showMessageDialog(null, "Passenger Record Updated");
        System.out.println(airLine.getPassengers().get(0).getPassengerFname());
        passengerFirstName.setText("");
        passengerLastName.setText("");
        }
    }//GEN-LAST:event_updateDetailsButtonActionPerformed

    private void findPassengerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findPassengerButtonActionPerformed
        ArrayList<String> pd=new ArrayList<String>();
        pd=airLine.findPassenger(passportNumber.getText());
        if(pd.get(0).equals("")){
            JOptionPane.showMessageDialog(null, "This Passport Number doesn't match any Passenger");
        }else{
        passengerFirstName.setText(pd.get(0));
        passengerLastName.setText(pd.get(1));
        }
    }//GEN-LAST:event_findPassengerButtonActionPerformed

    private void issueBoardingPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBoardingPassActionPerformed
        // TODO add your handling code here:
        if(airLine.issueBoardingPass(passportNumber.getText(), flightList.getSelectedItem().toString()).equals("S")==true){
               boardingDetails.setText("Already Assign Boarding Pass in this flight");
            return;}
        if(airLine.issueBoardingPass(passportNumber.getText(),flightList.getSelectedItem().toString()).equals("Not Found in System")){
            JOptionPane.showMessageDialog(null, "User not in System");
            boardingDetails.setText("");
        }
        else{
        boardingDetails.setText(airLine.getFlights().get(airLine.searchFlight(flightList.getSelectedItem().toString())).getSeats().get(airLine.getFlights().get(airLine.searchFlight(flightList.getSelectedItem().toString())).getSeats().size()-1).toString());
//        System.out.println(airLine.getFlights().get(0).getSeats().get(airLine.getFlights().get(0).getSeats().size()-1).toString());
        seatMap.setText(airLine.getSeatMap(flightList.getSelectedItem().toString()));
        }
    }//GEN-LAST:event_issueBoardingPassActionPerformed

    private void findBoaringButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBoaringButtonActionPerformed
        boardingDetails.setText("");
        boardingDetails.setText(airLine.getBoardingPass(passportNumber.getText(), flightList.getSelectedItem().toString()));          
    }//GEN-LAST:event_findBoaringButtonActionPerformed

    
    //action performed on clear Button
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        passengerFirstName.setText("");
        passengerLastName.setText("");
        passportNumber.setText("");
        boardingDetails.setText("");
        updateText.setText("");
        newSeat.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void flightListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightListActionPerformed
    
    
    
    boolean validation(){
        if(passengerFirstName.getText().equals("") || passengerLastName.getText().equals("") || passportNumber.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Fields are Empty");
            return true;
        }
      return false;
    }
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPassengerButton;
    private javax.swing.JTextArea boardingDetails;
    private javax.swing.JButton changeSeatButton;
    private javax.swing.JCheckBox changeSeatVisible;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton findBoaringButton;
    private javax.swing.JButton findPassengerButton;
    public javax.swing.JComboBox<String> flightList;
    private javax.swing.JButton issueBoardingPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField newSeat;
    public javax.swing.JTextField passengerFirstName;
    public javax.swing.JTextField passengerLastName;
    public javax.swing.JTextField passportNumber;
    private javax.swing.JPanel seatChangingPanel;
    private javax.swing.JTextArea seatMap;
    private javax.swing.JButton updateDetailsButton;
    private javax.swing.JTextArea updateText;
    // End of variables declaration//GEN-END:variables

}