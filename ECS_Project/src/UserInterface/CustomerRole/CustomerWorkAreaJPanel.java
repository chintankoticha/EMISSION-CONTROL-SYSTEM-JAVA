/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import business.EcoSystem;
import business.consumer.Automobile;
import business.enterprise.Enterprise;
import business.organization.CustomerOrganization;
import business.useraccount.UserAccount;
import com.sun.glass.ui.SystemClipboard;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Siddhant
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem system;
    Enterprise enterprise;
    UserAccount userAccount;
    private boolean currentStatus;
    private int co2Value;
    private int nocValue;
    private int pmValue;
    Thread sensorData;
    
    String threadStopName;
    int threadStopAverageSpeed;
    int threadStopTime;
    int threadStopDistance;
    int threadStopNormalEmission;
    int threadStopCurrentEmission;

    /**
     * Creates new form CustomerWorkAreaJPanel
     */
    public CustomerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,
            CustomerOrganization customerOrganization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.system = system;
        this.enterprise = enterprise;
        populateItemOwnedTable();
        // populateAppointmentScheduleTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBookAppointmentWithRetailer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        autoJTable = new javax.swing.JTable();
        btnBookAppointmentForServicing = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        sensorJTable = new javax.swing.JTable();
        StartThreadJBtn = new javax.swing.JButton();
        stopThreadJBtn = new javax.swing.JButton();

        btnBookAppointmentWithRetailer.setText("Book Appointment with Retailer");
        btnBookAppointmentWithRetailer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppointmentWithRetailerActionPerformed(evt);
            }
        });

        autoJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(autoJTable);

        btnBookAppointmentForServicing.setText("Book Appointment for Servicing");
        btnBookAppointmentForServicing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppointmentForServicingActionPerformed(evt);
            }
        });

        sensorJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Speed", "Distance", "Time", "Normal Emission g/km", "Current Emission"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(sensorJTable);

        StartThreadJBtn.setText("Start");
        StartThreadJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartThreadJBtnActionPerformed(evt);
            }
        });

        stopThreadJBtn.setText("Stop");
        stopThreadJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopThreadJBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBookAppointmentWithRetailer)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(btnBookAppointmentForServicing)
                        .addGap(297, 297, 297))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(StartThreadJBtn)
                .addGap(110, 110, 110)
                .addComponent(stopThreadJBtn)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBookAppointmentWithRetailer)
                    .addComponent(btnBookAppointmentForServicing))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StartThreadJBtn)
                    .addComponent(stopThreadJBtn))
                .addContainerGap(233, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateItemOwnedTable() {
        DefaultTableModel dtm = (DefaultTableModel) autoJTable.getModel();

        dtm.setRowCount(0);
        for (Automobile automobile : userAccount.getCustomer().getAutomobileDirectory().getAutomobileList()) {
            Object[] row = new Object[4];
            row[0] = automobile;

            dtm.addRow(row);
        }
    }

    private void btnBookAppointmentWithRetailerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppointmentWithRetailerActionPerformed
        // TODO add your handling code here:
        CustomerOrderSchedulingJPanel customerOrderSchedulingJPanel = new CustomerOrderSchedulingJPanel(userProcessContainer, userAccount, enterprise, system, userAccount.getCustomer());
        userProcessContainer.add("customerOrderSchedulingJPanel", customerOrderSchedulingJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBookAppointmentWithRetailerActionPerformed

    private void btnBookAppointmentForServicingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppointmentForServicingActionPerformed
        // TODO add your handling code here:
        CustomerServiceSchedulingJPanel customerServiceSchedulingJPanel = new CustomerServiceSchedulingJPanel(userProcessContainer, userAccount, enterprise, system, userAccount.getCustomer());
        userProcessContainer.add("customerServiceSchedulingJPanel", customerServiceSchedulingJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBookAppointmentForServicingActionPerformed

    private void StartThreadJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartThreadJBtnActionPerformed

        currentStatus=true;
        startThread();
    }//GEN-LAST:event_StartThreadJBtnActionPerformed

    
    public void startThread()
    {
        DefaultTableModel dtm = (DefaultTableModel) autoJTable.getModel();
        int rowSelected = autoJTable.getSelectedRow();

        if (rowSelected < 0) {
            JOptionPane.showMessageDialog(this, "Select an appliance\\automobile before starting!!");
            return;
        }
        //currentStatus = true;
        final Automobile auto;
        int defaultCO2;
        int defaultNOx;
        int defaultPMs;
        int speed;

        double distance;
        double time;
        try {
            auto = (Automobile) autoJTable.getValueAt(rowSelected, 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "You can be using only one car at a time!!");
            return;
        }

        defaultCO2 = auto.co2Emission(auto.getAutomobileName());
        defaultNOx = auto.noxEmission(auto.getAutomobileName());
        defaultPMs = auto.pmEmission(auto.getAutomobileName());
        
        DefaultTableModel model = (DefaultTableModel) sensorJTable.getModel();
        
        //START OF THREAD
         sensorData = new Thread() {

            int averageSpeed=0;
            int speedStatus[] = new int[20];
            int tempSpeed = 0;
            int countForAverage=0;
            int timeElapsed = 0;
            public void run() {
        
                    Object[] row = new Object[6];
                    model.addRow(row);
                    while (currentStatus) {
                    
                        for (int i = 0; i < 20; i++) {
                            tempSpeed = i * 5;
                            speedStatus[i] = tempSpeed;
                        }
                       // if(currentStatus){
                       // for (;;) {
                            //long tstart = System.currentTimeMillis();
                            
                            int randomIndexArray = new Random().nextInt(speedStatus.length);
                            
                            model.setValueAt(auto.getAutomobileName(), 0, 0);
                            averageSpeed =averageSpeed + speedStatus[randomIndexArray];
                            countForAverage++;
                            model.setValueAt(speedStatus[randomIndexArray],0,1);
                            model.setValueAt(timeElapsed, 0, 3);
                            /*String name = "";
                             //Sensor sensor1 = new Sensor();
                             for (Sensor sensor : auto.getSensorDirectory().getSensorDirectory()) {
                             name = sensor.getSensorName();
                             }
                    
                             Object[] row = new Object[2];
                             row[0] = name;

                             dtm.addRow(row);*/
                        
                            try {
                            Thread.sleep(1000);
                            timeElapsed++;
                            
                       /*     long tend = System.currentTimeMillis();
                            long tElapsed = tend-tstart;
                            double time = tElapsed/1000.0;
                            model.setValueAt(time/1000.0, 0, 3);*/
                            
                        }catch (InterruptedException e) {
                System.out.println("STOP BUTTON PRESSED");
                }  
                   // currentStatus=false;
                    
                                //}
                        
                    }
                        averageSpeed = averageSpeed/countForAverage;
                    threadStopName=auto.getAutomobileName();
                    threadStopAverageSpeed = averageSpeed;
                    threadStopTime=timeElapsed;
                    threadStopDistance=threadStopAverageSpeed*threadStopTime;
                    threadStopNormalEmission=auto.co2Emission(auto.getAutomobileName());
                    threadStopNormalEmission=(threadStopNormalEmission*threadStopDistance)/1000;
                  
                      
                   // DefaultTableModel model = (DefaultTableModel) sensorJTable.getModel();
        model.setRowCount(0);
        //Object[] row = new Object[6];
        row[0]=threadStopName;
        row[1]=threadStopAverageSpeed;
        row[2]=threadStopDistance;
        row[3]=threadStopTime;
        row[4]=threadStopNormalEmission;
        model.addRow(row);
        
                } 
            };
        sensorData.start();
    }
    private void stopThreadJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopThreadJBtnActionPerformed
          // TODO add your handling code here:
        currentStatus=false;
    //   sensorData.stop();
      // sensorData.interrupt();
        
        
        //JOptionPane.showMessageDialog(null, "value false hui");
      //  stopThread();
    }//GEN-LAST:event_stopThreadJBtnActionPerformed

    public void stopThread(){
        currentStatus = false;
                //startThread(currentStatus);
        stopThreadJBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                currentStatus = false;
                //startThread();
               // JOptionPane.showMessageDialog(null, "value false hui");
                
            }
        });
    }
    
    public ArrayList<Integer> selectedCO2Value(String autoName) {
        ArrayList<Integer> co2Emmision = new ArrayList();
        if (autoName.equals("BMW i3")) {
            //int j=4;
            //int co2Emmision[]=new int[17];
            for (int i = 1; i < 16; i++) {
                co2Emmision.add(i);
                //  j++;
            }
        } else if (autoName.equals("BMW X1")) {
            for (int i = 100; i < 114; i++) {
                co2Emmision.add(i);
                //  j++;
            }
//            int j=100;
//            int co2Emmision[]=new int[16];
//            for(int i=0;i<16;i++){
//                co2Emmision[i]=j;
//                j++;
//            }
        } else if (autoName.equals("BMW M4 COUPE")) {

            for (int i = 185; i < 201; i++) {
                co2Emmision.add(i);
            }
            //  j++;
//            }
//            int j=185;
//            int co2Emmision[]=new int[16];
//            for(int i=0;i<16;i++){
//                co2Emmision[i]=j;
//                j++;
//            }
        } else if (autoName.equals("BMW M2 COUPE")) {

            for (int i = 170; i < 191; i++) {
                co2Emmision.add(i);
                //  j++;
            }
//                 }
//             int j=170;
//            int co2Emmision[]=new int[21];
//            for(int i=0;i<21;i++){
//                co2Emmision[i]=j;
//                j++;
//            }
        } else if (autoName.equals("HONDA CIVIC")) {

            for (int i = 85; i < 101; i++) {
                co2Emmision.add(i);
                //  j++;
            }

        } else if (autoName.equals("HONDA CRV")) {
            for (int i = 105; i < 121; i++) {
                co2Emmision.add(i);
                //  j++;
            }

        } else if (autoName.equalsIgnoreCase("HONDA HRV")) {
            for (int i = 95; i < 111; i++) {
                co2Emmision.add(i);
                //  j++;
            }

        } else if (autoName.equals("HONDA JAZZ")) {
            for (int i = 95; i < 111; i++) {
                co2Emmision.add(i);
                //  j++;
            }

        } else if (autoName.equals("RENAULT CAPTUR")) {
            for (int i = 90; i < 101; i++) {
                co2Emmision.add(i);
                //  j++;
            }

        } else if (autoName.equals("RENAULT CLIO")) {
            for (int i = 70; i < 86; i++) {
                co2Emmision.add(i);
                //  j++;
            }

        } else if (autoName.equals("RENAULT MEGANE")) {
            for (int i = 85; i < 101; i++) {
                co2Emmision.add(i);
                //  j++;
            }

        } else if (autoName.equals("RENAULT GRAND SCENIC")) {
            for (int i = 84; i < 96; i++) {
                co2Emmision.add(i);
                //  j++;
            }

        } else if (autoName.equals("TOYOTA PRIUS")) {
            for (int i = 65; i < 76; i++) {
                co2Emmision.add(i);
                //  j++;
            }

        } else if (autoName.equals("TOYOTA LAND CRUISER")) {
            for (int i = 180; i < 196; i++) {
                co2Emmision.add(i);
                //  j++;
            }

        } else if (autoName.equals("TOYOTA VERSO")) {
            for (int i = 110; i < 126; i++) {
                co2Emmision.add(i);
                //  j++;
            }

        } else if (autoName.equals("TOYOTA CAMRY")) {
            for (int i = 70; i < 85; i++) {
                co2Emmision.add(i);
                //  j++;
            }

        }
        return co2Emmision;
    }

    public ArrayList<Integer> selectedNOxValue(String autoName) {
        ArrayList<Integer> NOxEmmision = new ArrayList();
        if (autoName.equals("BMW i3")) {
            //int j=4;
            //int co2Emmision[]=new int[17];
            for (int i = 0; i < 2; i++) {
                NOxEmmision.add(i);
                //  j++;
            }
        } else if (autoName.equals("BMW X1")) {
            for (int i = 25; i < 40; i++) {
                NOxEmmision.add(i);
                //  j++;
            }
//            int j=100;
//            int co2Emmision[]=new int[16];
//            for(int i=0;i<16;i++){
//                co2Emmision[i]=j;
//                j++;
//            }
        } else if (autoName.equals("BMW M4 COUPE")) {

            for (int i = 25; i < 40; i++) {
                NOxEmmision.add(i);
            }
            //  j++;
//            }
//            int j=185;
//            int co2Emmision[]=new int[16];
//            for(int i=0;i<16;i++){
//                co2Emmision[i]=j;
//                j++;
//            }
        } else if (autoName.equals("BMW M2 COUPE")) {

            for (int i = 7; i < 18; i++) {
                NOxEmmision.add(i);
                //  j++;
            }
//                 }
//             int j=170;
//            int co2Emmision[]=new int[21];
//            for(int i=0;i<21;i++){
//                co2Emmision[i]=j;
//                j++;
//            }
        } else if (autoName.equals("HONDA CIVIC")) {

            for (int i = 42; i < 53; i++) {
                NOxEmmision.add(i);
                //  j++;
            }

        } else if (autoName.equals("HONDA CRV")) {
            for (int i = 57; i < 68; i++) {
                NOxEmmision.add(i);
                //  j++;
            }

        } else if (autoName.equals("HONDA HRV")) {
            for (int i = 62; i < 72; i++) {
                NOxEmmision.add(i);
                //  j++;
            }

        } else if (autoName.equals("HONDA JAZZ")) {
            for (int i = 1; i < 4; i++) {
                NOxEmmision.add(i);
                //  j++;
            }

        } else if (autoName.equals("RENAULT CAPTUR")) {
            for (int i = 25; i < 35; i++) {
                NOxEmmision.add(i);
                //  j++;
            }

        } else if (autoName.equals("RENAULT CLIO")) {
            for (int i = 25; i < 35; i++) {
                NOxEmmision.add(i);
                //  j++;
            }

        } else if (autoName.equals("RENAULT MEGANE")) {
            for (int i = 25; i < 38; i++) {
                NOxEmmision.add(i);
                //  j++;
            }

        } else if (autoName.equals("RENAULT GRAND SCENIC")) {
            for (int i = 45; i < 55; i++) {
                NOxEmmision.add(i);
                //  j++;
            }

        } else if (autoName.equals("TOYOTA PRIUS")) {
            for (int i = 10; i < 20; i++) {
                NOxEmmision.add(i);
                //  j++;
            }

        } else if (autoName.equals("TOYOTA LAND CRUISER")) {
            for (int i = 32; i < 45; i++) {
                NOxEmmision.add(i);
                //  j++;
            }

        } else if (autoName.equals("TOYOTA VERSO")) {
            for (int i = 16; i < 28; i++) {
                NOxEmmision.add(i);
                //  j++;
            }

        } else if (autoName.equals("TOYOTA CAMRY")) {
            for (int i = 1; i < 8; i++) {
                NOxEmmision.add(i);
                //  j++;
            }

        }
        return NOxEmmision;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton StartThreadJBtn;
    private javax.swing.JTable autoJTable;
    private javax.swing.JButton btnBookAppointmentForServicing;
    private javax.swing.JButton btnBookAppointmentWithRetailer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable sensorJTable;
    private javax.swing.JButton stopThreadJBtn;
    // End of variables declaration//GEN-END:variables
}