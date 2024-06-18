
package chatapplication.component;

import java.awt.Color;
import javax.swing.Icon;

public class Chat_Left extends javax.swing.JLayeredPane {

    public Chat_Left() {
        initComponents();
        txt.setBackground(new Color(242, 242, 242));
    }
     public void setText(String text) {
        if (text.equals("")) {
            txt.hideText();
        } else {
            txt.setText(text);
        }
        
    }
    public void setImage(Icon... image) {
        txt.setImage(false, image);
    }
    public void setImage(String... image) {
        txt.setImage(false, image);
    }
    
    public void setTime() {
        txt.setTime("10:30 PM");  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new chatapplication.component.Chat_Item();

        txt.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private chatapplication.component.Chat_Item txt;
    // End of variables declaration//GEN-END:variables
}
