
package chatapplication.component;

import chatapplication.model.Model_User_Account;
import java.awt.Color;


public class Chat_Title extends javax.swing.JPanel {
    
 public Model_User_Account getUser() {
        return user;
    }

    private Model_User_Account user;

    public Chat_Title() {
        initComponents();
    }

    public void setUserName(Model_User_Account user) {
        this.user = user;
        lbName.setText(user.getUserName());
        if (user.isStatus()) {
            statusActive();
        } else {
            setStatusText("Offline");
        }
    }

    public void updateUser(Model_User_Account user) {
        if (this.user == user) {
            lbName.setText(user.getUserName());
            if (user.isStatus()) {
                statusActive();
            } else {
                setStatusText("Offline");
            }
        }
    }

    private void statusActive() {
        lbStatus.setText("Active now");
        lbStatus.setForeground(new java.awt.Color(40, 147, 59));
    }

    private void setStatusText(String text) {
        lbStatus.setText(text);
        lbStatus.setForeground(new Color(160, 160, 160));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layer = new javax.swing.JLayeredPane();
        lbName = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();

        layer.setLayout(new java.awt.GridLayout(0, 1));

        lbName.setBackground(new java.awt.Color(58, 55, 55));
        lbName.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbName.setText("Name");
        layer.add(lbName);

        lbStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbStatus.setForeground(new java.awt.Color(0, 153, 0));
        lbStatus.setText("Active Now");
        layer.add(lbStatus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(layer, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(343, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layer, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane layer;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbStatus;
    // End of variables declaration//GEN-END:variables
}
