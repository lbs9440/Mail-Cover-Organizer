/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailcoverorganizer;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JPanel;

/**
 *
 * @author spitz
 */
public class SearchJFrame extends javax.swing.JFrame {

    public MailCoverOrganizer mco;
    
    ArrayList<FullCover> coversToSearch = new ArrayList<>();
    
    /**
     * Creates new form SearchJFrame
     */
    public SearchJFrame(MailCoverOrganizer mco) {
        this.mco = mco;
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        termsField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        categoryField = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        locationField = new javax.swing.JTextField();
        cancelButtonSearchJFrame = new javax.swing.JButton();
        searchButtonSearchJFrame = new javax.swing.JButton();
        termsCB = new javax.swing.JCheckBox();
        yearCB = new javax.swing.JCheckBox();
        locationCB = new javax.swing.JCheckBox();
        categoryCB = new javax.swing.JCheckBox();
        yearDropdown = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        jLabel1.setText("Search for Cover");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Terms");

        jLabel3.setText("Year");

        termsField.setText("Terms separated by spaces...");
        termsField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                termsFieldMouseClicked(evt);
            }
        });

        jLabel4.setText("Category");

        categoryField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a category...", "War", "Earthquake", "Volcanic Eruption", "Weather Disturbance", "Political Disruption", "Unusual Events", "Mail Robbery", "Fraud", "Terrorism", "Fire", "Prevention", "Disease", "Miscellaneous" }));
        categoryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Location");

        locationField.setText("Enter location...");
        locationField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                locationFieldMouseClicked(evt);
            }
        });

        cancelButtonSearchJFrame.setText("Cancel");
        cancelButtonSearchJFrame.setMaximumSize(new java.awt.Dimension(70, 30));
        cancelButtonSearchJFrame.setMinimumSize(new java.awt.Dimension(70, 30));
        cancelButtonSearchJFrame.setPreferredSize(new java.awt.Dimension(70, 35));
        cancelButtonSearchJFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonSearchJFrameActionPerformed(evt);
            }
        });

        searchButtonSearchJFrame.setText("Search");
        searchButtonSearchJFrame.setMaximumSize(new java.awt.Dimension(70, 30));
        searchButtonSearchJFrame.setMinimumSize(new java.awt.Dimension(70, 30));
        searchButtonSearchJFrame.setPreferredSize(new java.awt.Dimension(70, 35));
        searchButtonSearchJFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonSearchJFrameActionPerformed(evt);
            }
        });

        yearDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select approx. year", "2020s", "2010s", "2000s", "1990s", "1980s", "1970s", "1960s", "1950s", "1940s", "1930s", "1920s", "1910s", "1900s", "1890s", "1880s", "1870s", "1860s", "1850s", "1840s", "1830s", "1820s", "1810s", "1800s", "1790s", "1780s", "1770s", "1760s", "1750s", "1740s", "1730s", "1720s", "1710s", "1700s" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelButtonSearchJFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchButtonSearchJFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(termsField)
                    .addComponent(jLabel3)
                    .addComponent(categoryField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(locationField)
                    .addComponent(yearDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(termsCB)
                    .addComponent(yearCB)
                    .addComponent(locationCB)
                    .addComponent(categoryCB))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(termsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(termsCB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yearCB)
                    .addComponent(yearDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryCB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(locationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationCB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButtonSearchJFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButtonSearchJFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void categoryFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryFieldActionPerformed

    private void cancelButtonSearchJFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonSearchJFrameActionPerformed
        // TODO add your handling code here:
        mco.switchScreen(MailCoverOrganizer.screen.MENU);
    }//GEN-LAST:event_cancelButtonSearchJFrameActionPerformed

    private void searchButtonSearchJFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonSearchJFrameActionPerformed
        // TODO add your handling code here:
        mco.searchResultsJFrame.termsSF = "(No Terms Entered)";
        mco.searchResultsJFrame.locationSF = "(No Location Entered)";
        mco.searchResultsJFrame.yearSF = "(No Year Entered)";
        mco.searchResultsJFrame.categorySF = "(No Category Entered)";
        
        performSearch();
        mco.searchResultsJFrame.refresh();
        mco.switchScreen(MailCoverOrganizer.screen.RESULTS);
    }//GEN-LAST:event_searchButtonSearchJFrameActionPerformed

    private void termsFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_termsFieldMouseClicked
        // TODO add your handling code here:
        termsField.selectAll();
    }//GEN-LAST:event_termsFieldMouseClicked

    private void locationFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locationFieldMouseClicked
        // TODO add your handling code here:
        locationField.selectAll();
    }//GEN-LAST:event_locationFieldMouseClicked

    /*
    Everything for the search itself is here
    ----------------------------------------
    
    For the search basically I'm gonna add everything to a new arraylist as it comes up. During a search with more than one selection (including multiple terms),
    check for whether there are elements in the new array list, if there are check that arraylist, if not, check the arraylist will all of the covers
   
    */
    
    
    public void performSearch()
    {
     
        String term = "(No Terms Searched)";
        String loc = "(No Location Searched)";
        String cat = "(No Category Searched)";
        String date = "(No Year Searched)";
        
        coversToSearch.clear();
        boolean elementsInArray = false;
        mco.nothingChecked = true;
        //Reference for splitting strings: https://www.guru99.com/how-to-split-a-string-in-java.htm
        
        if (termsCB.isSelected()){
        
            term = termsField.getText();
            
            String[] termsSplit = termsField.getText().toLowerCase().split(" ");

            for (int i = 0; i < mco.allCovers.size(); i++){
                for (int j = 0; j < termsSplit.length; j++){
                    if (mco.allCovers.get(i).title.toLowerCase().contains(termsSplit[j]) || mco.allCovers.get(i).description.toLowerCase().contains(termsSplit[j])){
                        coversToSearch.add(mco.allCovers.get(i));
                        elementsInArray = true;
                        break;
                    }
                }
                
            }
            System.out.println("Terms is Selected");
            mco.nothingChecked = false;
        }
        if (yearCB.isSelected()){
            
            date = yearDropdown.getSelectedItem().toString();           
            String yearToSearch = yearDropdown.getSelectedItem().toString().substring(0,3);
            
            if (elementsInArray == false){
                for (int i = 0; i < mco.allCovers.size(); i++){
                    if (yearToSearch.equals(mco.allCovers.get(i).date.substring(0,3))){
                        coversToSearch.add(mco.allCovers.get(i));
                        elementsInArray = true;
                    }
                }
            } 
            else if (elementsInArray == true) {
                ArrayList <FullCover> copy = new ArrayList<>();
                for (int i = 0; i < coversToSearch.size(); i++){
                    copy.add(coversToSearch.get(i));
                }
                coversToSearch.clear();
                for (int i = 0; i < copy.size(); i++){
                    if (yearToSearch.equals(copy.get(i).date.substring(0,3))){
                        coversToSearch.add(copy.get(i));
                        elementsInArray = true;
                    }
                } 
            }
            
            System.out.println("Year is Selected");
            mco.nothingChecked = false;
        }
        if (categoryCB.isSelected()){
            
            cat = categoryField.getSelectedItem().toString();
            
            String categoryToSearch = categoryField.getSelectedItem().toString();
            
            if (elementsInArray == false){
                for (int i = 0; i < mco.allCovers.size(); i++){
                    if (categoryToSearch.equals(mco.allCovers.get(i).category)){
                        coversToSearch.add(mco.allCovers.get(i));
                        elementsInArray = true;
                    }
                }
            } 
            else if (elementsInArray == true) {
                System.out.println("we herE");
                ArrayList <FullCover> copy = new ArrayList<>();
                for (int i = 0; i < coversToSearch.size(); i++){
                    copy.add(coversToSearch.get(i));
                }
                coversToSearch.clear();
                for (int i = 0; i < copy.size(); i++){
                    if (categoryToSearch.equals(copy.get(i).category)){
                        System.out.println("Cat. from copy: " + copy.get(i).category);
                        coversToSearch.add(copy.get(i));
                        elementsInArray = true;
                    }
                } 
            }
            
            System.out.println("Category is Selected");
            mco.nothingChecked = false;
        }
        if (locationCB.isSelected()){
            
            loc = locationField.getText();
            
            String[] locationSplit = locationField.getText().toLowerCase().split(" ");
            
            if (elementsInArray == false){
                for (int i = 0; i < mco.allCovers.size(); i++){
                    for (int j = 0; j < locationSplit.length; j++){
                        if (mco.allCovers.get(i).location.toLowerCase().contains(locationSplit[j])){
                            coversToSearch.add(mco.allCovers.get(i));
                            elementsInArray = true;
                            break;
                        }
                    }
                }
            } 
            else if (elementsInArray == true) {
                System.out.println("we herE");
                ArrayList <FullCover> copy = new ArrayList<>();
                for (int i = 0; i < coversToSearch.size(); i++){
                    copy.add(coversToSearch.get(i));
                }
                coversToSearch.clear();
                for (int i = 0; i < copy.size(); i++){
                    for (int j = 0; j < locationSplit.length; j++){
                        if (mco.allCovers.get(i).location.toLowerCase().contains(locationSplit[j])){
                            coversToSearch.add(mco.allCovers.get(i));
                            elementsInArray = true;
                            break;
                        }
                    }
                } 
            }
            
            System.out.println("Location is Selected");
            mco.nothingChecked = false;
        }

        if (mco.nothingChecked){
            System.out.println("Nothing is Checked");
        }
        mco.searchResultsJFrame.fillSF(term, loc, date, cat);
    }
    
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButtonSearchJFrame;
    private javax.swing.JCheckBox categoryCB;
    private javax.swing.JComboBox<String> categoryField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox locationCB;
    private javax.swing.JTextField locationField;
    private javax.swing.JButton searchButtonSearchJFrame;
    private javax.swing.JCheckBox termsCB;
    private javax.swing.JTextField termsField;
    private javax.swing.JCheckBox yearCB;
    private javax.swing.JComboBox<String> yearDropdown;
    // End of variables declaration//GEN-END:variables
}
