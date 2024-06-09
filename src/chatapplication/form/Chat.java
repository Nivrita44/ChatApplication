

package chatapplication.form;

public class Chat extends javax.swing.JPanel {

    
    public Chat() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chat_Bottom1 = new chatapplication.component.Chat_Bottom();
        chat_Body1 = new chatapplication.component.Chat_Body();
        chat_Title1 = new chatapplication.component.Chat_Title();

        setBackground(new java.awt.Color(230, 217, 224));

        javax.swing.GroupLayout chat_Bottom1Layout = new javax.swing.GroupLayout(chat_Bottom1);
        chat_Bottom1.setLayout(chat_Bottom1Layout);
        chat_Bottom1Layout.setHorizontalGroup(
            chat_Bottom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        chat_Bottom1Layout.setVerticalGroup(
            chat_Bottom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chat_Body1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
            .addComponent(chat_Bottom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(chat_Title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(chat_Title1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(chat_Body1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(chat_Bottom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private chatapplication.component.Chat_Body chat_Body1;
    private chatapplication.component.Chat_Bottom chat_Bottom1;
    private chatapplication.component.Chat_Title chat_Title1;
    // End of variables declaration//GEN-END:variables

}
