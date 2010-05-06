package org.openshapa.views;

import java.awt.Frame;

import org.jdesktop.application.Application;
import org.jdesktop.application.ResourceMap;

import org.openshapa.OpenSHAPA;

import org.openshapa.controllers.NewProjectC;

import org.openshapa.models.db.LogicErrorException;
import org.openshapa.models.db.MacshapaDatabase;
import org.openshapa.models.db.SystemErrorException;

import org.openshapa.util.Constants;

import com.usermetrix.jclient.UserMetrix;


/**
 * The dialog for users to create a new project.
 */
public final class NewProjectV extends OpenSHAPADialog {

    /** The logger for this class. */
    private UserMetrix logger = UserMetrix.getInstance(NewProjectV.class);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextArea descriptionField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables

    /**
     * Creates new form NewDatabaseView.
     *
     * @param parent
     *            The parent of this JDialog.
     * @param modal
     *            Is this dialog modal or not?
     */
    public NewProjectV(final Frame parent, final boolean modal) {
        super(parent, modal);
        initComponents();

        // Need to set a unique name so that we save and restore session data
        // i.e. window size, position, etc.
        setName(this.getClass().getSimpleName());
        getRootPane().setDefaultButton(okButton);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed"
    // desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionField = new javax.swing.JTextArea();
        cancelButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        org.jdesktop.application.ResourceMap resourceMap =
            org.jdesktop.application.Application.getInstance(
                org.openshapa.OpenSHAPA.class).getContext().getResourceMap(
                NewProjectV.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        setResizable(false);

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setToolTipText(resourceMap.getString("jLabel1.toolTipText")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setToolTipText(resourceMap.getString("jLabel2.toolTipText")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        nameField.setName("nameField"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        descriptionField.setColumns(20);
        descriptionField.setFont(resourceMap.getFont("descriptionField.font")); // NOI18N
        descriptionField.setRows(5);
        descriptionField.setName("descriptionField"); // NOI18N
        jScrollPane1.setViewportView(descriptionField);

        cancelButton.setText(resourceMap.getString("cancelButton.text")); // NOI18N
        cancelButton.setName("cancelButton"); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(
                    final java.awt.event.ActionEvent evt) {
                    cancelButtonActionPerformed(evt);
                }
            });

        okButton.setText(resourceMap.getString("okButton.text")); // NOI18N
        okButton.setName("okButton"); // NOI18N
        okButton.setPreferredSize(new java.awt.Dimension(65, 23));
        okButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(
                    final java.awt.event.ActionEvent evt) {
                    okButtonActionPerformed(evt);
                }
            });

        org.jdesktop.layout.GroupLayout layout =
            new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(
                org.jdesktop.layout.GroupLayout.LEADING).add(
                layout.createSequentialGroup().addContainerGap().add(
                    layout.createParallelGroup(
                        org.jdesktop.layout.GroupLayout.LEADING).add(
                        layout.createSequentialGroup().add(
                            layout.createParallelGroup(
                                org.jdesktop.layout.GroupLayout.LEADING).add(
                                jLabel2).add(jLabel1)).addPreferredGap(
                            org.jdesktop.layout.LayoutStyle.RELATED).add(
                            layout.createParallelGroup(
                                org.jdesktop.layout.GroupLayout.LEADING).add(
                                jScrollPane1,
                                org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
                                274, Short.MAX_VALUE).add(nameField,
                                org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
                                274, Short.MAX_VALUE))).add(
                        org.jdesktop.layout.GroupLayout.TRAILING,
                        layout.createSequentialGroup().add(okButton,
                            org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
                            org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
                            org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(
                                org.jdesktop.layout.LayoutStyle.RELATED).add(
                            cancelButton))).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(
                org.jdesktop.layout.GroupLayout.LEADING).add(
                layout.createSequentialGroup().addContainerGap().add(
                    layout.createParallelGroup(
                        org.jdesktop.layout.GroupLayout.BASELINE).add(
                        jLabel1).add(nameField,
                        org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
                        org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
                        org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                    .add(
                        layout.createParallelGroup(
                            org.jdesktop.layout.GroupLayout.LEADING).add(
                            jLabel2).add(jScrollPane1,
                            org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111,
                            org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(
                        org.jdesktop.layout.LayoutStyle.UNRELATED).add(
                    layout.createParallelGroup(
                        org.jdesktop.layout.GroupLayout.BASELINE).add(
                        cancelButton).add(okButton,
                        org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
                        org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
                        org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(
                        org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)));

        pack();
    } // </editor-fold>//GEN-END:initComponents

    /**
     * The action to invoke when a user clicks on the CANCEL button.
     *
     * @param evt
     *            The event that triggered this action
     */
    private void cancelButtonActionPerformed(
        final java.awt.event.ActionEvent evt) { // GEN-FIRST:event_cancelButtonActionPerformed

        try {
            dispose();
            finalize();

            // Whoops, unable to destroy dialog correctly.
        } catch (Throwable e) {
            logger.error("Unable to release window NewProjectV.", e);
        }
    } // GEN-LAST:event_cancelButtonActionPerformed

    /**
     * The action to invoke when a user clicks on the OK button.
     *
     * @param evt
     *            The event that triggered this action.
     */
    private void okButtonActionPerformed(final java.awt.event.ActionEvent evt) { // GEN-FIRST:event_okButtonActionPerformed

        ResourceMap r = Application.getInstance(OpenSHAPA.class).getContext()
            .getResourceMap(NewProjectV.class);

        try {
            OpenSHAPAView s = (OpenSHAPAView) OpenSHAPA.getApplication()
                .getMainView();

            // clear the contents of the existing spreadsheet.
            OpenSHAPA.getProjectController().setLastCreatedCellId(0);
            s.clearSpreadsheet();

            if (!isValidProjectName(getProjectName())) {
                throw new LogicErrorException(r.getString("Error.invalidName"));
            }

            // Create a new database and display it.
            MacshapaDatabase database = new MacshapaDatabase(
                    Constants.TICKS_PER_SECOND);
            database.setName(getProjectName());
            database.setDescription(getProjectDescription());

            OpenSHAPA.getProjectController().createNewProject(getProjectName());
            OpenSHAPA.getProjectController().setDatabase(database);
            s.showSpreadsheet();

            // Update the name of the window to include the name we just
            // set in the database.
            OpenSHAPA.getApplication().updateTitle();

            dispose();
            finalize();
        } catch (SystemErrorException ex) {
            logger.error("Unable to create new database", ex);
        } catch (LogicErrorException ex) {
            OpenSHAPA.getApplication().showWarningDialog(ex);
            new NewProjectC();
        } catch (Throwable ex) {
            logger.error("Unable to clean up the new project view.");
        }

        OpenSHAPA.getApplication().resetApp();
    } // GEN-LAST:event_okButtonActionPerformed

    private boolean isValidProjectName(final String name) {

        if (name == null) {
            return false;
        }

        if (name.length() == 0) {
            return false;
        }

        return true;
    }

    /**
     * @return The new name of the database as specified by the user.
     */
    public String getProjectName() {
        return nameField.getText();
    }

    /**
     * @return The new description of the database as specified by the user.
     */
    public String getProjectDescription() {
        return descriptionField.getText();
    }

}
