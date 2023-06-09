package mailcoverorganizer;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author spitz
 */
public class SearchResultsJFrame extends javax.swing.JFrame {

public MailCoverOrganizer mco;
    
String termsSF;
String locationSF;
String yearSF;
String categorySF;

    //creating an array list of the panels
    ArrayList<JPanel> previewPanels = new ArrayList<>();
    GridBagConstraints newPos = new GridBagConstraints();
    
    //JPanel pPanel = new previewJPanel();
 //  previewPanels.add(new previewJPanel("Dummy Preview Panel", "January 1, 2021",));
    /**
     * Creates new form SearchResultsJFrame
     */
    public SearchResultsJFrame(MailCoverOrganizer mco) {
        this.mco = mco;
        newPos.gridx = 0;
        newPos.gridy = 0;
        //Insets(int top, int left, int bottom, int right);
        newPos.insets = new Insets(10,30,10,30);
        initComponents();
    }
    
    void refresh(){
        clearAllOnPage();
        if (mco.nothingChecked == true){
            for (int i = 0; i < mco.allCovers.size(); i++){

                previewPanels.add(new previewJPanel(mco.allCovers.get(i).title, mco.allCovers.get(i).date, mco.allCovers.get(i).category,
                mco.allCovers.get(i).image, mco.allCovers.get(i).location, mco.allCovers.get(i).description, mco));

                scrollablePanel.add(previewPanels.get(i), newPos);
                if(newPos.gridx == 0){
                    newPos.gridx = 1;
                }
                else if(newPos.gridx == 1){
                    newPos.gridy += 1;
                    newPos.gridx = 0;
                }
            }
        }
        if (mco.nothingChecked == false && mco.searchJFrame.coversToSearch.size()>0)
        {
            for (int i = 0; i < mco.searchJFrame.coversToSearch.size(); i++){

                previewPanels.add(new previewJPanel(mco.searchJFrame.coversToSearch.get(i).title, mco.searchJFrame.coversToSearch.get(i).date, mco.searchJFrame.coversToSearch.get(i).category,
                mco.searchJFrame.coversToSearch.get(i).image, mco.searchJFrame.coversToSearch.get(i).location, mco.searchJFrame.coversToSearch.get(i).description, mco));

                scrollablePanel.add(previewPanels.get(i), newPos);
                if(newPos.gridx == 0){
                    newPos.gridx = 1;
                }
                else if(newPos.gridx == 1){
                    newPos.gridy += 1;
                    newPos.gridx = 0;
                }
            } 
        }
        
        mco.editing = false;
        
        //reference for these functions https://stackoverflow.com/questions/17608421/how-to-reload-a-jpanel
        revalidate();
        repaint();
    }
    
    void addNewPanel(){
        previewPanels.add(new previewJPanel(mco.allCovers.get(mco.allCovers.size()-1).title, mco.allCovers.get(mco.allCovers.size()-1).date, mco.allCovers.get(mco.allCovers.size()-1).category,
        mco.allCovers.get(mco.allCovers.size()-1).image, mco.allCovers.get(mco.allCovers.size()-1).location, mco.allCovers.get(mco.allCovers.size()-1).description, mco));
        //scrollablePanel.add(previewPanels.get(previewPanels.size()-1));
        scrollablePanel.add(previewPanels.get(previewPanels.size()-1), newPos);
        if(newPos.gridx == 0){
            newPos.gridx = 1;
        }
        else if(newPos.gridx == 1){
            newPos.gridy += 1;
            newPos.gridx = 0;
        }
        //scrollablePanel.add(pPanel);
        /*mco.test+=1;
        System.out.println("Test: " + mco.test);
        System.out.println("Full List: " + mco.allCovers.size());
        previewPanels.add(previewPanel);
        scrollablePanel.add(previewPanels.get(previewPanels.size()-1));
        makePanelsVisible();
        */
        
    }

    
    void clearAllOnPage(){
        scrollablePanel.removeAll();
        previewPanels.clear();
        newPos.gridx = 0;
        newPos.gridy = 0;
    }
    
    public void fillSF(String t, String l, String y, String c){
        termsLabelSearchedForPanel.setText("Terms: " + t);
        locationLabelSearchedForPanel.setText("Location: " + l);
        yearLabelSearchedForPanel.setText("Year: " + y);
        categoryLabelSearchedForPanel.setText("Category: " + c);
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

        headingSearchResultsJFrame = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchForPanel = new javax.swing.JPanel();
        termsLabelSearchedForPanel = new javax.swing.JLabel();
        categoryLabelSearchedForPanel = new javax.swing.JLabel();
        yearLabelSearchedForPanel = new javax.swing.JLabel();
        locationLabelSearchedForPanel = new javax.swing.JLabel();
        headingLabelSearchedForPanel = new javax.swing.JLabel();
        returnHomeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        scrollablePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 520));
        setMinimumSize(new java.awt.Dimension(720, 520));
        setResizable(false);

        headingSearchResultsJFrame.setBackground(new java.awt.Color(153, 153, 255));
        headingSearchResultsJFrame.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        jLabel1.setText("Search Results");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        headingSearchResultsJFrame.add(jLabel1, gridBagConstraints);

        termsLabelSearchedForPanel.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        termsLabelSearchedForPanel.setText("Terms:");

        categoryLabelSearchedForPanel.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        categoryLabelSearchedForPanel.setText("Category:");

        yearLabelSearchedForPanel.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        yearLabelSearchedForPanel.setText("Year:");

        locationLabelSearchedForPanel.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        locationLabelSearchedForPanel.setText("Location:");

        headingLabelSearchedForPanel.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        headingLabelSearchedForPanel.setText("Searched For:");

        returnHomeButton.setText("Return Home");
        returnHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnHomeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchForPanelLayout = new javax.swing.GroupLayout(searchForPanel);
        searchForPanel.setLayout(searchForPanelLayout);
        searchForPanelLayout.setHorizontalGroup(
            searchForPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchForPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(searchForPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchForPanelLayout.createSequentialGroup()
                        .addComponent(headingLabelSearchedForPanel)
                        .addGap(86, 86, 86))
                    .addGroup(searchForPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(searchForPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(termsLabelSearchedForPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearLabelSearchedForPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(searchForPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(categoryLabelSearchedForPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                            .addComponent(locationLabelSearchedForPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6))))
            .addGroup(searchForPanelLayout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(returnHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        searchForPanelLayout.setVerticalGroup(
            searchForPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchForPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headingLabelSearchedForPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchForPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(termsLabelSearchedForPanel)
                    .addComponent(categoryLabelSearchedForPanel))
                .addGap(18, 18, 18)
                .addGroup(searchForPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationLabelSearchedForPanel)
                    .addComponent(yearLabelSearchedForPanel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setPreferredSize(new java.awt.Dimension(100, 100));

        scrollablePanel.setLayout(new java.awt.GridBagLayout());
        jScrollPane1.setViewportView(scrollablePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headingSearchResultsJFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(searchForPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headingSearchResultsJFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchForPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnHomeButtonActionPerformed
        // TODO add your handling code here:
        mco.switchScreen(MailCoverOrganizer.screen.MENU);
    }//GEN-LAST:event_returnHomeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoryLabelSearchedForPanel;
    private javax.swing.JLabel headingLabelSearchedForPanel;
    private javax.swing.JPanel headingSearchResultsJFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel locationLabelSearchedForPanel;
    private javax.swing.JButton returnHomeButton;
    private javax.swing.JPanel scrollablePanel;
    private javax.swing.JPanel searchForPanel;
    private javax.swing.JLabel termsLabelSearchedForPanel;
    private javax.swing.JLabel yearLabelSearchedForPanel;
    // End of variables declaration//GEN-END:variables
}
