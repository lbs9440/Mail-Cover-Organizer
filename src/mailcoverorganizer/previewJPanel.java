/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailcoverorganizer;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author spitz
 */
public class previewJPanel extends javax.swing.JPanel {

    String title;
    String date;
    String category;
    ImageIcon image;
    String location;
    String description;
 
    //Reference to https://docs.oracle.com/en/java/javase/11/docs/api/java.desktop/javax/swing/JPopupMenu.html and Professor Saad on YouTube
    //Lambda formatting was done automatically once the action listener code was put in place
    
    JPopupMenu optionsMenu = new JPopupMenu();
    
    JMenuItem editItem = new JMenuItem("Edit");
    JMenuItem deleteItem = new JMenuItem("Delete");
    
    public MailCoverOrganizer mco;
    public previewJPanel(String t, String da, String c, ImageIcon i, String l, String de, MailCoverOrganizer mco){
        initComponents();
        this.mco = mco;
        title = t;
        date = da;
        category = c;
        image = i;
        location = l;
        description = de;
        begin();
    }

    private void begin(){
        if (title.length()<30){
            titleLabel.setText("Title: " + title);
        }
        else 
        {
            titleLabel.setText("Title: " + title.substring(0,26)+"...");
        }
        yearLabel.setText("Date: " + date);
        ImageIcon imageIcon = new ImageIcon(image.getImage().getScaledInstance(150, 150, Image.SCALE_AREA_AVERAGING));
        imageLabel.setIcon(imageIcon);
        optionsMenu.add(editItem);
        optionsMenu.add(deleteItem);
        
        FullCover coverToEdit = new FullCover(this.title, this.date, this.category, this.image, this.location, this.description);
        
        editItem.addActionListener((ActionEvent e) -> {
            
            System.out.println("Edit Item Pressed on " + this.title);
            System.out.println("Check for MCO Working: " + mco.yay);
            mco.switchScreen(MailCoverOrganizer.screen.ADD);
            //System.out.println(this);
            mco.panelToEdit = mco.searchResultsJFrame.previewPanels.indexOf(this);
            mco.editing = true;
            System.out.println("Index: " + mco.panelToEdit);
            mco.addCoverJFrame.fillValues(this.title, this.date, this.category, this.image, this.location, this.description);
            //mco.lastFrame = "previewJPanel";
            //variable for what screen you came from, when save pressed back to that screen
        });
        
        deleteItem.addActionListener((ActionEvent e) -> {
            System.out.println("Delete Item Pressed on " + this.title);
            mco.panelToDelete = mco.searchResultsJFrame.previewPanels.indexOf(this);
            mco.allCovers.remove(mco.panelToDelete);
            mco.panelToDelete = -1;
            mco.searchResultsJFrame.refresh();
        });
    }
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        imageLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        viewButton = new javax.swing.JButton();
        optionsButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        setMaximumSize(new java.awt.Dimension(250, 250));
        setMinimumSize(new java.awt.Dimension(250, 250));
        setPreferredSize(new java.awt.Dimension(250, 250));
        setLayout(new java.awt.GridBagLayout());

        imageLabel.setPreferredSize(new java.awt.Dimension(150, 150));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(imageLabel, gridBagConstraints);

        titleLabel.setText("Title: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(titleLabel, gridBagConstraints);

        yearLabel.setText("Year: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        add(yearLabel, gridBagConstraints);

        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(viewButton, gridBagConstraints);

        optionsButton.setText("Options");
        optionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(optionsButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        JFrame FinalCoverJFrame = new FinalCoverJFrame(title, date, category, image, location, description);
        FinalCoverJFrame.setVisible(true);
    }//GEN-LAST:event_viewButtonActionPerformed

        public void mouseReleased(MouseEvent e){
            optionsMenu.show(e.getComponent(), e.getX(), e.getY());
        }
    
    private void optionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsButtonActionPerformed
        // TODO add your handling code here:
        optionsMenu.show(this, optionsButton.getX(), optionsButton.getY()+optionsButton.getHeight());

    }//GEN-LAST:event_optionsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageLabel;
    private javax.swing.JButton optionsButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton viewButton;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables


}