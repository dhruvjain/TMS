
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
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
public class daydiary extends javax.swing.JFrame {

    /**
     * Creates new form daydiary
     */
    Work[] w;
    Diary dold;
    int date;
    Socket s;
    ObjectOutputStream dos;ObjectInputStream ois;
    public daydiary(int date,int month,int year,Diary diary,Socket s,ObjectOutputStream dos,ObjectInputStream ois) {
        initComponents();
        jTextField1.setEditable(false);
        this.s=s;
        this.dos=dos;
        this.ois=ois;
        jTextField1.setText(String.valueOf(date)+"/"+String.valueOf(month)+"/"+String.valueOf(year));
        dold=diary;
        System.out.println("hereeqwqw");
        
        //System.out.println(dold.getsingleDaytimetable(12)[2].getName());
        
        w=diary.getsingleDaytimetable(date);
        this.date=date;
        if(w[0]!=null)
        jLabel5.setText(w[0].getName());
        else
            jLabel5.setText("OPENSLOT");
        if(w[1]!=null)
        jLabel6.setText(w[1].getName());
        else
            jLabel6.setText("OPENSLOT");
        if(w[2]!=null)
        jLabel7.setText(w[2].getName());
        else
            jLabel7.setText("OPENSLOT");
        if(w[3]!=null)
        jLabel8.setText(w[3].getName());
        else
            jLabel8.setText("OPENSLOT");
        if(w[4]!=null)
        jLabel9.setText(w[4].getName());
        else
            jLabel9.setText("OPENSLOT");       
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
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        timetablecontainer = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabelworkpurpose = new javax.swing.JLabel();
        jLabelpurpose = new javax.swing.JLabel();
        jLabelvenue = new javax.swing.JLabel();
        jLabelname = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setText("DATE:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 130, 30));

        jLabel3.setFont(new java.awt.Font("Trajan Pro", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("DAILY TIMETABLE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 230, 60));

        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 230, 60));

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 230, 50));

        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 230, 50));

        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 230, 60));

        timetablecontainer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/times2.jpg"))); // NOI18N
        timetablecontainer.setText(" ");
        jPanel1.add(timetablecontainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 430, 310));

        jLabel13.setFont(new java.awt.Font("Trajan Pro", 3, 14)); // NOI18N
        jLabel13.setText("DETAILS");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 90, 20));
        jPanel1.add(jLabelworkpurpose, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 120, 20));
        jPanel1.add(jLabelpurpose, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 110, 20));
        jPanel1.add(jLabelvenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 50, 20));
        jPanel1.add(jLabelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 140, 20));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stick.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 250, 240));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.jpg"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plain-brown2.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
  // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
     // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
 if(jLabel5.getText().equals("IMPORTANT JOB"))
      {
      
      changework ch=new changework(dold,date,4,s,dos,ois);
      ch.setVisible(true);
      }
      if(jLabel5.getText().equals("LEAVE"))
      {
       changeleave l=new changeleave(dold,date,s,dos,ois);
      l.setVisible(true);
      }       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        if(w[0]==null)
        jLabelname.setText("OPENSLOT");
        else
        {
        jLabelname.setText(w[0].getName());
        if(w[0].getName().equals("MEETING"))
        {
         jLabelpurpose.setText(w[0].getpurpose());
         Meeting m = (Meeting)w[0];
        
         jLabelvenue.setText(m.getvenue());
        }
        
        if(w[0].getName().equals("IMPORTANT JOB") || w[0].getName().equals("LEAVE")){
           jLabelworkpurpose.setText(w[0].getpurpose());
        }
        }        
         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
      if(jLabel5.getText().equals("IMPORTANT JOB"))
      {
      
      changework ch=new changework(dold,date,0,s,dos,ois);
      this.setVisible(false);
      ch.setVisible(true);
      }
      if(jLabel5.getText().equals("LEAVE"))
      {
       changeleave l=new changeleave(dold,date,s,dos,ois);
       this.setVisible(false);
      l.setVisible(true);
      }// TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        if(w[1]==null)
        jLabelname.setText("OPENSLOT");
        else
        {
            jLabelname.setText(w[1].getName());
        if(w[1].getName().equals("MEETING"))
        {
         jLabelpurpose.setText(w[1].getpurpose());
         Meeting m = (Meeting)w[1];
        
         jLabelvenue.setText(m.getvenue());
        }
        
        if(w[1].getName().equals("IMPORTANT JOB") || w[1].getName().equals("LEAVE")){
           jLabelworkpurpose.setText(w[1].getpurpose());
        }
        } // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
       if(w[2]==null)
        jLabelname.setText("OPENSLOT");
        else
        {
            jLabelname.setText(w[2].getName());
        if(w[2].getName().equals("MEETING"))
        {
         jLabelpurpose.setText(w[2].getpurpose());
         Meeting m = (Meeting)w[2];
        
         jLabelvenue.setText(m.getvenue());
        }
        
        if(w[2].getName().equals("IMPORTANT JOB") || w[2].getName().equals("LEAVE")){
           jLabelworkpurpose.setText(w[2].getpurpose());
        }
        } // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
       if(w[3]==null)
        jLabelname.setText("OPENSLOT");
        else
        {
            jLabelname.setText(w[3].getName());
        if(w[3].getName().equals("MEETING"))
        {
         jLabelpurpose.setText(w[3].getpurpose());
         Meeting m = (Meeting)w[3];
        
         jLabelvenue.setText(m.getvenue());
        }
        
        if(w[3].getName().equals("IMPORTANT JOB") || w[3].getName().equals("LEAVE")){
           jLabelworkpurpose.setText(w[3].getpurpose());
        }
        }// TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
 if(w[4]==null)
        jLabelname.setText("OPENSLOT");
        else
        {
            jLabelname.setText(w[4].getName());
        if(w[4].getName().equals("MEETING"))
        {
         jLabelpurpose.setText(w[4].getpurpose());
         Meeting m = (Meeting)w[4];
        
         jLabelvenue.setText(m.getvenue());
        }
        
        if(w[4].getName().equals("IMPORTANT JOB") || w[4].getName().equals("LEAVE")){
           jLabelworkpurpose.setText(w[4].getpurpose());
        }
        }     // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
 if(jLabel6.getText().equals("IMPORTANT JOB"))
      {
      
      changework ch=new changework(dold,date,1,s,dos,ois);
      ch.setVisible(true);
      }
      if(jLabel6.getText().equals("LEAVE"))
      {
       changeleave l=new changeleave(dold,date,s,dos,ois);
      l.setVisible(true);
      }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
 if(jLabel7.getText().equals("IMPORTANT JOB"))
      {
      
      changework ch=new changework(dold,date,2,s,dos,ois);
      ch.setVisible(true);
      }
      if(jLabel7.getText().equals("LEAVE"))
      {
       changeleave l=new changeleave(dold,date,s,dos,ois);
      l.setVisible(true);
      }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
 if(jLabel8.getText().equals("IMPORTANT JOB"))
      {
      
      changework ch=new changework(dold,date,3,s,dos,ois);
      ch.setVisible(true);
      }
      if(jLabel8.getText().equals("LEAVE"))
      {
       changeleave l=new changeleave(dold,date,s,dos,ois);
      l.setVisible(true);
      }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
       jLabelworkpurpose.setText("");
       jLabelpurpose.setText("");
jLabelvenue.setText("");
jLabelname.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabelworkpurpose.setText("");
       jLabelpurpose.setText("");
jLabelvenue.setText("");
jLabelname.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
       jLabelworkpurpose.setText("");
       jLabelpurpose.setText("");
jLabelvenue.setText("");
jLabelname.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
jLabelworkpurpose.setText("");
       jLabelpurpose.setText("");
jLabelvenue.setText("");
jLabelname.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
jLabelworkpurpose.setText("");
       jLabelpurpose.setText("");
jLabelvenue.setText("");
jLabelname.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseExited

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelname;
    private javax.swing.JLabel jLabelpurpose;
    private javax.swing.JLabel jLabelvenue;
    private javax.swing.JLabel jLabelworkpurpose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel timetablecontainer;
    // End of variables declaration//GEN-END:variables
}
