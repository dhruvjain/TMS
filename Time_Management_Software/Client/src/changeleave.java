
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DHRUV
 */
public class changeleave extends javax.swing.JFrame {

    /**
     * Creates new form changeleave
     */
    Diary d;int date;
    Socket s;
    
        ObjectOutputStream dos; 
       
        ObjectInputStream ois;
    public changeleave(Diary dold,int olddate,Socket s,ObjectOutputStream dos, ObjectInputStream ois) {
        initComponents();
        this.s=s;
        this.dos=dos;
        this.ois=ois;
        d=dold;
        System.out.println("hereeqwqw");
        //System.out.println(d.getsingleDaytimetable(12)[2].getName());
        //System.out.println(d.getsingleDaytimetable(12)[3].getName());
        //System.out.println(d.getsingleDaytimetable(12)[4].getName());
        date=olddate;
        
        
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
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("CHANGE LEAVE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("SHIFT LEAVE TO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 50, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setText("OR");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        button1.setLabel("SAVE CHANGES");
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 90, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.jpg"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/changeleav.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public List<String> diarytoarray(Diary d)
    {
        List<String> list = new ArrayList<String>();
        list.add(d.getexecuitve_id());
        list.add(String.valueOf(d.getmonth().getmonthint()));
        list.add(String.valueOf(d.getmonth().getyear()));
        Work[] w=new Work[5];
        
        for(int k=1;k<=d.getmonth().getdays();k++){
        list.add(String.valueOf(k));
        w=d.getsingleDaytimetable(k);
        for(int i=0;i<5;i++){
        if(w[i]==null){
        list.add("OPENSLOT");
        }
        else
        {
        list.add(w[i].getName());
        
        if(w[i].getName().equals("MEETING"))
        {
         list.add(w[i].getpurpose());
         Meeting m = (Meeting)w[i];
         list.add(m.getvenue());
         if(m.getcallerexecutive_id()==null)
             list.add("null");
         else list.add(m.getcallerexecutive_id());
         list.add(String.valueOf(m.getnumberofexecutives()));
         for(int j=0;j<m.getnumberofexecutives();j++){
         list.add(m.getExecutiveID(j));
         }
        }
        if(w[i].getName().equals("IMPORTANT JOB"))
        {
         list.add(w[i].getpurpose());
        }
        if(w[i].getName().equals("LEAVE"))
        {
        list.add(w[i].getpurpose());
        }
      }
    }
 }
        return list;
    }
    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_button1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
    this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
int check=d.cancelLeave(date);

if(check==0){
JOptionPane.showMessageDialog(rootPane,"This is Official Holiday,can't Cancel");
}
if(check==1)
JOptionPane.showMessageDialog(rootPane,"Leave cancelled");
 List<String> diarylist = new ArrayList<String>();
        diarylist=diarytoarray(d);
        
        
           try {
              
               dos.writeObject("3");
               dos.writeObject(diarylist);
           } catch (IOException ex) {
               Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
           }
this.setVisible(false);// TODO a// TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        String nedate=(String)jComboBox1.getSelectedItem();
        int newdate=Integer.parseInt(nedate);
        if(newdate<date){
        JOptionPane.showMessageDialog(rootPane, "Enter correct date");
        return;
        }
        int check=d.changeLeaveDate(date, newdate);
        List<String> diarylist = new ArrayList<String>();
        diarylist=diarytoarray(d);
        
        
           try {
               
               
               dos.writeObject("3");
               dos.writeObject(diarylist);
           } catch (IOException ex) {
               Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
           }
        System.out.println(date);
        System.out.println(newdate);
        System.out.println("qwerrtyyui");        
        System.out.println(d.getsingleDaytimetable(9)[2].getName());
        System.out.println(d.getsingleDaytimetable(9)[3].getName());
        System.out.println(d.getsingleDaytimetable(16)[2].getName());
        System.out.println(d.getsingleDaytimetable(16)[4].getName());
        

        if(check==0)
            JOptionPane.showMessageDialog(rootPane,"can't avail leave,rescheduled date has meeting");
        if(check==1)
            JOptionPane.showMessageDialog(rootPane, "Rescheduled date is already a leave");
        if(check==2)
            JOptionPane.showMessageDialog(rootPane, "Leave Date Shifted");
        if(check==3)
            JOptionPane.showMessageDialog(rootPane, "Leave is Official,can't be shifted");// TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
