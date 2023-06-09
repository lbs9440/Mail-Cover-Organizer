/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailcoverorganizer;

import static com.sun.webkit.graphics.WCImage.getImage;
import java.awt.Color;
import java.io.File;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

//File chooser: https://www.youtube.com/watch?v=fHExe2N3Ik0

/**
 *
 * @author spitz
 */
public class AddCoverJFrame extends javax.swing.JFrame {

    
    public MailCoverOrganizer mco;
    
    /**
     * Creates new form AddCoverJFrame
     */
    public AddCoverJFrame(MailCoverOrganizer mco) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addCoverTitleTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addCoverCategoryDropDown = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        uploadImageButtonAddCoverJFrame = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        addCoverLocationTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cancelButtonAddCoverJFrame = new javax.swing.JButton();
        saveButtonAddCoverJFrame = new javax.swing.JButton();
        uploadedImageLabel = new javax.swing.JLabel();
        yearBox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        addCoverDescriptionTextField = new javax.swing.JTextArea();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        jLabel1.setText("Add Cover");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Title");

        jLabel3.setText("Year");

        addCoverTitleTextField.setText("Enter title...");
        addCoverTitleTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCoverTitleTextFieldMouseClicked(evt);
            }
        });
        addCoverTitleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCoverTitleTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Category");

        addCoverCategoryDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a category...", "War", "Earthquake", "Volcanic Eruption", "Weather Disturbance", "Political Disruption", "Unusual Events", "Mail Robbery", "Fraud", "Terrorism", "Fire", "Prevention", "Disease", "Miscellaneous" }));
        addCoverCategoryDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCoverCategoryDropDownActionPerformed(evt);
            }
        });

        jLabel5.setText("Image");

        uploadImageButtonAddCoverJFrame.setText("Upload Image");
        uploadImageButtonAddCoverJFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadImageButtonAddCoverJFrameActionPerformed(evt);
            }
        });

        jLabel6.setText("Location");

        addCoverLocationTextField.setText("Enter location...");
        addCoverLocationTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCoverLocationTextFieldMouseClicked(evt);
            }
        });

        jLabel7.setText("Description");

        cancelButtonAddCoverJFrame.setText("Cancel");
        cancelButtonAddCoverJFrame.setMaximumSize(new java.awt.Dimension(70, 30));
        cancelButtonAddCoverJFrame.setMinimumSize(new java.awt.Dimension(70, 30));
        cancelButtonAddCoverJFrame.setPreferredSize(new java.awt.Dimension(70, 35));
        cancelButtonAddCoverJFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonAddCoverJFrameActionPerformed(evt);
            }
        });

        saveButtonAddCoverJFrame.setText("Save");
        saveButtonAddCoverJFrame.setMaximumSize(new java.awt.Dimension(70, 30));
        saveButtonAddCoverJFrame.setMinimumSize(new java.awt.Dimension(70, 30));
        saveButtonAddCoverJFrame.setPreferredSize(new java.awt.Dimension(70, 35));
        saveButtonAddCoverJFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonAddCoverJFrameActionPerformed(evt);
            }
        });

        uploadedImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uploadedImageLabel.setText("Uploaded Image");

        yearBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select year...", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900", "1899", "1898", "1897", "1896", "1895", "1894", "1893", "1892", "1891", "1890", "1889", "1888", "1887", "1886", "1885", "1884", "1883", "1882", "1881", "1880", "1879", "1878", "1877", "1876", "1875", "1874", "1873", "1872", "1871", "1870", "1869", "1868", "1867", "1866", "1865", "1864", "1863", "1862", "1861", "1860", "1859", "1858", "1857", "1856", "1855", "1854", "1853", "1852", "1851", "1850", "1849", "1848", "1847", "1846", "1845", "1844", "1843", "1842", "1841", "1840", "1839", "1838", "1837", "1836", "1835", "1834", "1833", "1832", "1831", "1830", "1829", "1828", "1827", "1826", "1825", "1824", "1823", "1822", "1821", "1820", "1819", "1818", "1817", "1816", "1815", "1814", "1813", "1812", "1811", "1810", "1809", "1808", "1807", "1806", "1805", "1804", "1803", "1802", "1801", "1800", "1799", "1798", "1797", "1796", "1795", "1794", "1793", "1792", "1791", "1790", "1789", "1788", "1787", "1786", "1785", "1784", "1783", "1782", "1781", "1780", "1779", "1778", "1777", "1776", "1775", "1774", "1773", "1772", "1771", "1770", "1769", "1768", "1767", "1766", "1765", "1764", "1763", "1762", "1761", "1760", "1759", "1758", "1757", "1756", "1755", "1754", "1753", "1752", "1751", "1750", "1749", "1748", "1747", "1746", "1745", "1744", "1743", "1742", "1741", "1740", "1739", "1738", "1737", "1736", "1735", "1734", "1733", "1732", "1731", "1730", "1729", "1728", "1727", "1726", "1725", "1724", "1723", "1722", "1721", "1720", "1719", "1718", "1717", "1716", "1715", "1714", "1713", "1712", "1711", "1710", "1709", "1708", "1707", "1706", "1705", "1704", "1703", "1702", "1701", "1700" }));
        yearBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearBoxActionPerformed(evt);
            }
        });

        addCoverDescriptionTextField.setColumns(20);
        addCoverDescriptionTextField.setLineWrap(true);
        addCoverDescriptionTextField.setRows(5);
        addCoverDescriptionTextField.setWrapStyleWord(true);
        jScrollPane2.setViewportView(addCoverDescriptionTextField);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cancelButtonAddCoverJFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(saveButtonAddCoverJFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(addCoverTitleTextField)
                    .addComponent(jLabel3)
                    .addComponent(addCoverCategoryDropDown, 0, 254, Short.MAX_VALUE)
                    .addComponent(uploadImageButtonAddCoverJFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addCoverLocationTextField)
                    .addComponent(uploadedImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yearBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addCoverTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addCoverCategoryDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(19, 19, 19)
                .addComponent(uploadedImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uploadImageButtonAddCoverJFrame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addCoverLocationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButtonAddCoverJFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButtonAddCoverJFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCoverCategoryDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCoverCategoryDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCoverCategoryDropDownActionPerformed
    
    void fillValues(String title, String date, String category, ImageIcon image, String location, String description)
    {
        addCoverTitleTextField.setText(title);
        yearBox.setSelectedItem(date);
        addCoverCategoryDropDown.setSelectedItem(category);
        uploadedImageLabel.setText("");
        uploadedImageLabel.setIcon(image);
        addCoverLocationTextField.setText(location);
        addCoverDescriptionTextField.setText(description);
        uploadedImageLabel.setForeground(Color.BLACK);
        
        myimage = image;
        
        String p = image.toString();
        uploadedImageLabel.setText("");
        uploadedImageLabel.setIcon(seticon(p,null));
    }
    
    void resetValues(){
        addCoverTitleTextField.setText("Enter title...");
        yearBox.setSelectedItem("Select year...");
        addCoverCategoryDropDown.setSelectedItem("Select a category...");
        uploadedImageLabel.setText("Uploaded Image");
        uploadedImageLabel.setIcon(null);
        addCoverLocationTextField.setText("Enter location...");
        addCoverDescriptionTextField.setText("");
        uploadedImageLabel.setForeground(Color.BLACK);
    }
    
    byte[] image;
    String imagepath = "";
    ImageIcon myimage;
    
    public ImageIcon seticon(String m, byte[] image)
    {
        if(m!=null){
            myimage = new ImageIcon(m);
        } 
        else
        {
            myimage = new ImageIcon(image);
        }
        
        Image img1 = myimage.getImage();
        Image img2 = img1.getScaledInstance(uploadedImageLabel.getWidth(), uploadedImageLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2); 
        return i;
    }

    private void uploadImageButtonAddCoverJFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadImageButtonAddCoverJFrameActionPerformed
       
        //File chooser: https://www.youtube.com/watch?v=fHExe2N3Ik0
        
        //creating the file selector
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File("user.dir"));
        
        //creating the filter for the file selector
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "png","jpg","jpeg", "gif");
        file.addChoosableFileFilter(filter);
        
        int a = file.showSaveDialog(null);
        if (a == JFileChooser.APPROVE_OPTION)
        {
            File f = file.getSelectedFile();
            String p = f.getAbsolutePath();
            uploadedImageLabel.setText("");
            uploadedImageLabel.setIcon(seticon(p,null));
        }
        
    }//GEN-LAST:event_uploadImageButtonAddCoverJFrameActionPerformed

    private void addCoverTitleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCoverTitleTextFieldActionPerformed
        // TODO add your handling code here:
        addCoverTitleTextField.selectAll();
    }//GEN-LAST:event_addCoverTitleTextFieldActionPerformed

    private void cancelButtonAddCoverJFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonAddCoverJFrameActionPerformed
        // TODO add your handling code here:
        mco.switchScreen(MailCoverOrganizer.screen.MENU);
    }//GEN-LAST:event_cancelButtonAddCoverJFrameActionPerformed

    private void saveButtonAddCoverJFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonAddCoverJFrameActionPerformed
        // TODO add your handling code here:
        System.out.println("Value of 'Editing': " + mco.editing);
        if(mco.editing == false)  
        {
            if(uploadedImageLabel.getIcon() != null){
                mco.allCovers.add(new FullCover(addCoverTitleTextField.getText(), 
                        yearBox.getSelectedItem().toString(), addCoverCategoryDropDown.getSelectedItem().toString(), 
                        myimage, addCoverLocationTextField.getText(), addCoverDescriptionTextField.getText()));
                mco.switchScreen(MailCoverOrganizer.screen.MENU);
                mco.searchResultsJFrame.addNewPanel();
                myimage = null;
                System.out.println("Test: " + mco.test);
                //new SearchResultsJFrame().addNewPanel();
            }
            else
            {
                uploadedImageLabel.setForeground(Color.RED);
                uploadedImageLabel.setText("Please Upload an Image");
            }
        }
        
        //starts here
        else{      
            if(mco.allCovers.size()>0 && mco.editing == true){
                mco.allCovers.get(mco.panelToEdit).title = addCoverTitleTextField.getText();
                mco.allCovers.get(mco.panelToEdit).date = yearBox.getSelectedItem().toString();
                mco.allCovers.get(mco.panelToEdit).category = addCoverCategoryDropDown.getSelectedItem().toString();
                mco.allCovers.get(mco.panelToEdit).image = myimage;
                mco.allCovers.get(mco.panelToEdit).location = addCoverLocationTextField.getText();
                mco.allCovers.get(mco.panelToEdit).description = addCoverDescriptionTextField.getText();

                mco.searchResultsJFrame.refresh();

                System.out.println("Save from editing, array list index: " + mco.panelToEdit);
                System.out.println("New Title for Cover ArrayList: " + mco.allCovers.get(mco.panelToEdit).title);

                mco.editing = false;
                mco.panelToEdit = -1;
                mco.switchScreen(MailCoverOrganizer.screen.RESULTS);
            }
        }
        mco.menuJFrame.refresh();
    }//GEN-LAST:event_saveButtonAddCoverJFrameActionPerformed

    private void addCoverTitleTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCoverTitleTextFieldMouseClicked
        // TODO add your handling code here:
        addCoverTitleTextField.selectAll();
    }//GEN-LAST:event_addCoverTitleTextFieldMouseClicked

    private void addCoverLocationTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCoverLocationTextFieldMouseClicked
        // TODO add your handling code here:
        addCoverLocationTextField.selectAll();
    }//GEN-LAST:event_addCoverLocationTextFieldMouseClicked

    private void yearBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearBoxActionPerformed

    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> addCoverCategoryDropDown;
    private javax.swing.JTextArea addCoverDescriptionTextField;
    private javax.swing.JTextField addCoverLocationTextField;
    private javax.swing.JTextField addCoverTitleTextField;
    private javax.swing.JButton cancelButtonAddCoverJFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton saveButtonAddCoverJFrame;
    private javax.swing.JButton uploadImageButtonAddCoverJFrame;
    private javax.swing.JLabel uploadedImageLabel;
    private javax.swing.JComboBox<String> yearBox;
    // End of variables declaration//GEN-END:variables

}
